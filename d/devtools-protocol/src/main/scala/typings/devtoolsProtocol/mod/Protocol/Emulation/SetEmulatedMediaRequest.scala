package typings.devtoolsProtocol.mod.Protocol.Emulation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetEmulatedMediaRequest extends js.Object {
  /**
    * Media features to emulate.
    */
  var features: js.UndefOr[js.Array[MediaFeature]] = js.native
  /**
    * Media type to emulate. Empty string disables the override.
    */
  var media: js.UndefOr[String] = js.native
}

object SetEmulatedMediaRequest {
  @scala.inline
  def apply(): SetEmulatedMediaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetEmulatedMediaRequest]
  }
  @scala.inline
  implicit class SetEmulatedMediaRequestOps[Self <: SetEmulatedMediaRequest] (val x: Self) extends AnyVal {
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
    def setFeaturesVarargs(value: MediaFeature*): Self = this.set("features", js.Array(value :_*))
    @scala.inline
    def setFeatures(value: js.Array[MediaFeature]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    @scala.inline
    def setMedia(value: String): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
  }
  
}

