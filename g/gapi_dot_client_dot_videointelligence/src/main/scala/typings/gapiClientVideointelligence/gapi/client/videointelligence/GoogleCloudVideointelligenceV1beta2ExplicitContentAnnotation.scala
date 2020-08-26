package typings.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation extends js.Object {
  /** All video frames where explicit content was detected. */
  var frames: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2ExplicitContentFrame]] = js.native
}

object GoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation {
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation]
  }
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta2ExplicitContentAnnotationOps[Self <: GoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation] (val x: Self) extends AnyVal {
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
    def setFramesVarargs(value: GoogleCloudVideointelligenceV1beta2ExplicitContentFrame*): Self = this.set("frames", js.Array(value :_*))
    @scala.inline
    def setFrames(value: js.Array[GoogleCloudVideointelligenceV1beta2ExplicitContentFrame]): Self = this.set("frames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrames: Self = this.set("frames", js.undefined)
  }
  
}

