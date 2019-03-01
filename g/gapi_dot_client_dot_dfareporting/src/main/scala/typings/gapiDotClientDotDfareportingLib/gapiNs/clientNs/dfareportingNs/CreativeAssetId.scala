package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeAssetId extends js.Object {
  /**
    * Name of the creative asset. This is a required field while inserting an asset. After insertion, this assetIdentifier is used to identify the uploaded
    * asset. Characters in the name must be alphanumeric or one of the following: ".-_ ". Spaces are allowed.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Type of asset to upload. This is a required field. FLASH and IMAGE are no longer supported for new uploads. All image assets should use HTML_IMAGE. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object CreativeAssetId {
  @scala.inline
  def apply(name: java.lang.String = null, `type`: java.lang.String = null): CreativeAssetId = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CreativeAssetId]
  }
}

