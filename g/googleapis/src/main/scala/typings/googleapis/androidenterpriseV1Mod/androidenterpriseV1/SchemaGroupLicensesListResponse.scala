package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The grouplicense resources for the enterprise.
  */
@js.native
trait SchemaGroupLicensesListResponse extends js.Object {
  /**
    * A group license for a product approved for use in the enterprise.
    */
  var groupLicense: js.UndefOr[js.Array[SchemaGroupLicense]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#groupLicensesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaGroupLicensesListResponse {
  @scala.inline
  def apply(): SchemaGroupLicensesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupLicensesListResponse]
  }
  @scala.inline
  implicit class SchemaGroupLicensesListResponseOps[Self <: SchemaGroupLicensesListResponse] (val x: Self) extends AnyVal {
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
    def setGroupLicenseVarargs(value: SchemaGroupLicense*): Self = this.set("groupLicense", js.Array(value :_*))
    @scala.inline
    def setGroupLicense(value: js.Array[SchemaGroupLicense]): Self = this.set("groupLicense", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupLicense: Self = this.set("groupLicense", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

