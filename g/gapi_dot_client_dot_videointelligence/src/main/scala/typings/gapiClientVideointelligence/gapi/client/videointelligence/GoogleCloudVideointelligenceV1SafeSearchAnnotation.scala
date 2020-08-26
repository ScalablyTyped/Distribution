package typings.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudVideointelligenceV1SafeSearchAnnotation extends js.Object {
  /** Likelihood of adult content. */
  var adult: js.UndefOr[String] = js.native
  /**
    * Time-offset, relative to the beginning of the video,
    * corresponding to the video frame for this annotation.
    */
  var time: js.UndefOr[String] = js.native
}

object GoogleCloudVideointelligenceV1SafeSearchAnnotation {
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1SafeSearchAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1SafeSearchAnnotation]
  }
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1SafeSearchAnnotationOps[Self <: GoogleCloudVideointelligenceV1SafeSearchAnnotation] (val x: Self) extends AnyVal {
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
    def setAdult(value: String): Self = this.set("adult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdult: Self = this.set("adult", js.undefined)
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
  
}

