package typings.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation extends js.Object {
  /** Likelihood of adult content. */
  var adult: js.UndefOr[String] = js.native
  /** Likelihood of medical content. */
  var medical: js.UndefOr[String] = js.native
  /** Likelihood of racy content. */
  var racy: js.UndefOr[String] = js.native
  /**
    * Likelihood that an obvious modification was made to the original
    * version to make it appear funny or offensive.
    */
  var spoof: js.UndefOr[String] = js.native
  /** Video time offset in microseconds. */
  var timeOffset: js.UndefOr[String] = js.native
  /** Likelihood of violent content. */
  var violent: js.UndefOr[String] = js.native
}

object GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation {
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation]
  }
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta1SafeSearchAnnotationOps[Self <: GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation] (val x: Self) extends AnyVal {
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
    def setMedical(value: String): Self = this.set("medical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedical: Self = this.set("medical", js.undefined)
    @scala.inline
    def setRacy(value: String): Self = this.set("racy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRacy: Self = this.set("racy", js.undefined)
    @scala.inline
    def setSpoof(value: String): Self = this.set("spoof", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpoof: Self = this.set("spoof", js.undefined)
    @scala.inline
    def setTimeOffset(value: String): Self = this.set("timeOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeOffset: Self = this.set("timeOffset", js.undefined)
    @scala.inline
    def setViolent(value: String): Self = this.set("violent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViolent: Self = this.set("violent", js.undefined)
  }
  
}

