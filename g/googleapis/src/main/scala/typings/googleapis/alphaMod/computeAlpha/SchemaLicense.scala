package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A license resource.
  */
@js.native
trait SchemaLicense extends js.Object {
  /**
    * [Output Only] Deprecated. This field no longer reflects whether a license
    * charges a usage fee.
    */
  var chargesUseFee: js.UndefOr[Boolean] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * An optional textual description of the resource; provided by the client
    * when the resource is created.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of resource. Always compute#license for licenses.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique code used to attach this license to images,
    * snapshots, and disks.
    */
  var licenseCode: js.UndefOr[String] = js.native
  /**
    * Name of the resource. The name must be 1-63 characters long and comply
    * with RFC1035.
    */
  var name: js.UndefOr[String] = js.native
  var resourceRequirements: js.UndefOr[SchemaLicenseResourceRequirements] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  /**
    * If false, licenses will not be copied from the source resource when
    * creating an image from a disk, disk from snapshot, or snapshot from disk.
    */
  var transferable: js.UndefOr[Boolean] = js.native
}

object SchemaLicense {
  @scala.inline
  def apply(): SchemaLicense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLicense]
  }
  @scala.inline
  implicit class SchemaLicenseOps[Self <: SchemaLicense] (val x: Self) extends AnyVal {
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
    def setChargesUseFee(value: Boolean): Self = this.set("chargesUseFee", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChargesUseFee: Self = this.set("chargesUseFee", js.undefined)
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLicenseCode(value: String): Self = this.set("licenseCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseCode: Self = this.set("licenseCode", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setResourceRequirements(value: SchemaLicenseResourceRequirements): Self = this.set("resourceRequirements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceRequirements: Self = this.set("resourceRequirements", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setSelfLinkWithId(value: String): Self = this.set("selfLinkWithId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLinkWithId: Self = this.set("selfLinkWithId", js.undefined)
    @scala.inline
    def setTransferable(value: Boolean): Self = this.set("transferable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferable: Self = this.set("transferable", js.undefined)
  }
  
}

