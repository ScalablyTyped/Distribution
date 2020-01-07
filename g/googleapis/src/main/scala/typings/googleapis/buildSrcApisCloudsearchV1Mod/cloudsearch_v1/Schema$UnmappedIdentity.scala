package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$UnmappedIdentity extends js.Object {
  /**
    * The resource name for an external user.
    */
  var externalIdentity: js.UndefOr[Schema$Principal] = js.native
  /**
    * The resolution status for the external identity.
    */
  var resolutionStatusCode: js.UndefOr[String] = js.native
}

object Schema$UnmappedIdentity {
  @scala.inline
  def apply(externalIdentity: Schema$Principal = null, resolutionStatusCode: String = null): Schema$UnmappedIdentity = {
    val __obj = js.Dynamic.literal()
    if (externalIdentity != null) __obj.updateDynamic("externalIdentity")(externalIdentity.asInstanceOf[js.Any])
    if (resolutionStatusCode != null) __obj.updateDynamic("resolutionStatusCode")(resolutionStatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UnmappedIdentity]
  }
}

