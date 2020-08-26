package typings.gapiClientConsumersurveys.gapi.client.consumersurveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurveyQuestionImage extends js.Object {
  var altText: js.UndefOr[String] = js.native
  var data: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object SurveyQuestionImage {
  @scala.inline
  def apply(): SurveyQuestionImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SurveyQuestionImage]
  }
  @scala.inline
  implicit class SurveyQuestionImageOps[Self <: SurveyQuestionImage] (val x: Self) extends AnyVal {
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
    def setAltText(value: String): Self = this.set("altText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltText: Self = this.set("altText", js.undefined)
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

