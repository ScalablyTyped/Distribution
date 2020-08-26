package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdGroupUrls
  extends AdWordsUrls
     with hasSetTrackingTemplate {
  def clearTrackingTemplate(): Unit = js.native
}

object AdGroupUrls {
  @scala.inline
  def apply(
    clearTrackingTemplate: () => Unit,
    getCustomParameters: () => js.Object,
    getTrackingTemplate: () => String,
    setCustomParameters: js.Object => Unit,
    setTrackingTemplate: String => Unit
  ): AdGroupUrls = {
    val __obj = js.Dynamic.literal(clearTrackingTemplate = js.Any.fromFunction0(clearTrackingTemplate), getCustomParameters = js.Any.fromFunction0(getCustomParameters), getTrackingTemplate = js.Any.fromFunction0(getTrackingTemplate), setCustomParameters = js.Any.fromFunction1(setCustomParameters), setTrackingTemplate = js.Any.fromFunction1(setTrackingTemplate))
    __obj.asInstanceOf[AdGroupUrls]
  }
  @scala.inline
  implicit class AdGroupUrlsOps[Self <: AdGroupUrls] (val x: Self) extends AnyVal {
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
    def setClearTrackingTemplate(value: () => Unit): Self = this.set("clearTrackingTemplate", js.Any.fromFunction0(value))
  }
  
}

