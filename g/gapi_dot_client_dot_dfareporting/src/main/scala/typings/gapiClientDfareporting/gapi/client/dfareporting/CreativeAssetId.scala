package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeAssetId extends js.Object {
  /**
    * Name of the creative asset. This is a required field while inserting an asset. After insertion, this assetIdentifier is used to identify the uploaded
    * asset. Characters in the name must be alphanumeric or one of the following: ".-_ ". Spaces are allowed.
    */
  var name: js.UndefOr[String] = js.native
  /** Type of asset to upload. This is a required field. FLASH and IMAGE are no longer supported for new uploads. All image assets should use HTML_IMAGE. */
  var `type`: js.UndefOr[String] = js.native
}

object CreativeAssetId {
  @scala.inline
  def apply(): CreativeAssetId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeAssetId]
  }
  @scala.inline
  implicit class CreativeAssetIdOps[Self <: CreativeAssetId] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

