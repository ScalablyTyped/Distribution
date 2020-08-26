package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait hasSetFinalUrl extends js.Object {
  def setFinalUrl(url: String): Unit = js.native
  def setMobileFinalUrl(url: String): Unit = js.native
}

object hasSetFinalUrl {
  @scala.inline
  def apply(setFinalUrl: String => Unit, setMobileFinalUrl: String => Unit): hasSetFinalUrl = {
    val __obj = js.Dynamic.literal(setFinalUrl = js.Any.fromFunction1(setFinalUrl), setMobileFinalUrl = js.Any.fromFunction1(setMobileFinalUrl))
    __obj.asInstanceOf[hasSetFinalUrl]
  }
  @scala.inline
  implicit class hasSetFinalUrlOps[Self <: hasSetFinalUrl] (val x: Self) extends AnyVal {
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
    def setSetFinalUrl(value: String => Unit): Self = this.set("setFinalUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMobileFinalUrl(value: String => Unit): Self = this.set("setMobileFinalUrl", js.Any.fromFunction1(value))
  }
  
}

