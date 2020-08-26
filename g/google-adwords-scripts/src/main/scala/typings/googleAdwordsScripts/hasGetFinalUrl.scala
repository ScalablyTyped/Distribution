package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait hasGetFinalUrl extends js.Object {
  def getFinalUrl(): String = js.native
  def getMobileFinalUrl(): String = js.native
}

object hasGetFinalUrl {
  @scala.inline
  def apply(getFinalUrl: () => String, getMobileFinalUrl: () => String): hasGetFinalUrl = {
    val __obj = js.Dynamic.literal(getFinalUrl = js.Any.fromFunction0(getFinalUrl), getMobileFinalUrl = js.Any.fromFunction0(getMobileFinalUrl))
    __obj.asInstanceOf[hasGetFinalUrl]
  }
  @scala.inline
  implicit class hasGetFinalUrlOps[Self <: hasGetFinalUrl] (val x: Self) extends AnyVal {
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
    def setGetFinalUrl(value: () => String): Self = this.set("getFinalUrl", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMobileFinalUrl(value: () => String): Self = this.set("getMobileFinalUrl", js.Any.fromFunction0(value))
  }
  
}

