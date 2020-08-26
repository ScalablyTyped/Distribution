package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SitelinkUrls
  extends AdWordsUrls
     with hasSetTrackingTemplate
     with hasGetFinalUrl
     with hasSetFinalUrl {
  def clearMobileFinalUrl(): Unit = js.native
}

object SitelinkUrls {
  @scala.inline
  def apply(
    clearMobileFinalUrl: () => Unit,
    getCustomParameters: () => js.Object,
    getFinalUrl: () => String,
    getMobileFinalUrl: () => String,
    getTrackingTemplate: () => String,
    setCustomParameters: js.Object => Unit,
    setFinalUrl: String => Unit,
    setMobileFinalUrl: String => Unit,
    setTrackingTemplate: String => Unit
  ): SitelinkUrls = {
    val __obj = js.Dynamic.literal(clearMobileFinalUrl = js.Any.fromFunction0(clearMobileFinalUrl), getCustomParameters = js.Any.fromFunction0(getCustomParameters), getFinalUrl = js.Any.fromFunction0(getFinalUrl), getMobileFinalUrl = js.Any.fromFunction0(getMobileFinalUrl), getTrackingTemplate = js.Any.fromFunction0(getTrackingTemplate), setCustomParameters = js.Any.fromFunction1(setCustomParameters), setFinalUrl = js.Any.fromFunction1(setFinalUrl), setMobileFinalUrl = js.Any.fromFunction1(setMobileFinalUrl), setTrackingTemplate = js.Any.fromFunction1(setTrackingTemplate))
    __obj.asInstanceOf[SitelinkUrls]
  }
  @scala.inline
  implicit class SitelinkUrlsOps[Self <: SitelinkUrls] (val x: Self) extends AnyVal {
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
    def setClearMobileFinalUrl(value: () => Unit): Self = this.set("clearMobileFinalUrl", js.Any.fromFunction0(value))
  }
  
}

