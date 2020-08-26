package typings.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafeSearchAnnotation extends js.Object {
  /**
    * Represents the adult content likelihood for the image. Adult content may
    * contain elements such as nudity, pornographic images or cartoons, or
    * sexual activities.
    */
  var adult: js.UndefOr[String] = js.native
  /** Likelihood that this is a medical image. */
  var medical: js.UndefOr[String] = js.native
  /**
    * Spoof likelihood. The likelihood that an modification
    * was made to the image's canonical version to make it appear
    * funny or offensive.
    */
  var spoof: js.UndefOr[String] = js.native
  /** Likelihood that this image contains violent content. */
  var violence: js.UndefOr[String] = js.native
}

object SafeSearchAnnotation {
  @scala.inline
  def apply(): SafeSearchAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeSearchAnnotation]
  }
  @scala.inline
  implicit class SafeSearchAnnotationOps[Self <: SafeSearchAnnotation] (val x: Self) extends AnyVal {
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
    def setSpoof(value: String): Self = this.set("spoof", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpoof: Self = this.set("spoof", js.undefined)
    @scala.inline
    def setViolence(value: String): Self = this.set("violence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViolence: Self = this.set("violence", js.undefined)
  }
  
}

