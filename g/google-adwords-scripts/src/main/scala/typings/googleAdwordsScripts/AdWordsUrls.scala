package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdWordsUrls extends js.Object {
  def getCustomParameters(): js.Object = js.native
  def getTrackingTemplate(): String = js.native
}

object AdWordsUrls {
  @scala.inline
  def apply(getCustomParameters: () => js.Object, getTrackingTemplate: () => String): AdWordsUrls = {
    val __obj = js.Dynamic.literal(getCustomParameters = js.Any.fromFunction0(getCustomParameters), getTrackingTemplate = js.Any.fromFunction0(getTrackingTemplate))
    __obj.asInstanceOf[AdWordsUrls]
  }
  @scala.inline
  implicit class AdWordsUrlsOps[Self <: AdWordsUrls] (val x: Self) extends AnyVal {
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
    def setGetCustomParameters(value: () => js.Object): Self = this.set("getCustomParameters", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTrackingTemplate(value: () => String): Self = this.set("getTrackingTemplate", js.Any.fromFunction0(value))
  }
  
}

