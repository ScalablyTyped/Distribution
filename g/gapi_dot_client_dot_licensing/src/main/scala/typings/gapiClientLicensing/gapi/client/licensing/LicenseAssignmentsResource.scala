package typings.gapiClientLicensing.gapi.client.licensing

import typings.gapiClient.gapi.client.Request
import typings.gapiClientLicensing.anon.Alt
import typings.gapiClientLicensing.anon.CustomerId
import typings.gapiClientLicensing.anon.Fields
import typings.gapiClientLicensing.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicenseAssignmentsResource extends js.Object {
  /** Revoke License. */
  def delete(request: Alt): Request[Unit] = js.native
  /** Get license assignment of a particular product and sku for a user */
  def get(request: Alt): Request[LicenseAssignment] = js.native
  /** Assign License. */
  def insert(request: Fields): Request[LicenseAssignment] = js.native
  /** List license assignments for given product of the customer. */
  def listForProduct(request: CustomerId): Request[LicenseAssignmentList] = js.native
  /** List license assignments for given product and sku of the customer. */
  def listForProductAndSku(request: Key): Request[LicenseAssignmentList] = js.native
  /** Assign License. This method supports patch semantics. */
  def patch(request: Alt): Request[LicenseAssignment] = js.native
  /** Assign License. */
  def update(request: Alt): Request[LicenseAssignment] = js.native
}

object LicenseAssignmentsResource {
  @scala.inline
  def apply(
    delete: Alt => Request[Unit],
    get: Alt => Request[LicenseAssignment],
    insert: Fields => Request[LicenseAssignment],
    listForProduct: CustomerId => Request[LicenseAssignmentList],
    listForProductAndSku: Key => Request[LicenseAssignmentList],
    patch: Alt => Request[LicenseAssignment],
    update: Alt => Request[LicenseAssignment]
  ): LicenseAssignmentsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), listForProduct = js.Any.fromFunction1(listForProduct), listForProductAndSku = js.Any.fromFunction1(listForProductAndSku), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[LicenseAssignmentsResource]
  }
  @scala.inline
  implicit class LicenseAssignmentsResourceOps[Self <: LicenseAssignmentsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: Alt => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Alt => Request[LicenseAssignment]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Fields => Request[LicenseAssignment]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setListForProduct(value: CustomerId => Request[LicenseAssignmentList]): Self = this.set("listForProduct", js.Any.fromFunction1(value))
    @scala.inline
    def setListForProductAndSku(value: Key => Request[LicenseAssignmentList]): Self = this.set("listForProductAndSku", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Alt => Request[LicenseAssignment]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Alt => Request[LicenseAssignment]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

