package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLicenseCodeLicenseAlias extends js.Object {
  /**
    * [Output Only] Description of this License Code.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] URL of license corresponding to this License Code.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object SchemaLicenseCodeLicenseAlias {
  @scala.inline
  def apply(description: String = null, selfLink: String = null): SchemaLicenseCodeLicenseAlias = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLicenseCodeLicenseAlias]
  }
}

