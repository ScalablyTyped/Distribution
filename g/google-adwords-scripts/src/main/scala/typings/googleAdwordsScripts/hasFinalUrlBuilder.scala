package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait hasFinalUrlBuilder[B] extends js.Object {
  def withFinalUrl(url: String): B = js.native
  def withMobileFinalUrl(url: String): B = js.native
}

object hasFinalUrlBuilder {
  @scala.inline
  def apply[B](withFinalUrl: String => B, withMobileFinalUrl: String => B): hasFinalUrlBuilder[B] = {
    val __obj = js.Dynamic.literal(withFinalUrl = js.Any.fromFunction1(withFinalUrl), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl))
    __obj.asInstanceOf[hasFinalUrlBuilder[B]]
  }
  @scala.inline
  implicit class hasFinalUrlBuilderOps[Self <: hasFinalUrlBuilder[_], B] (val x: Self with hasFinalUrlBuilder[B]) extends AnyVal {
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
    def setWithFinalUrl(value: String => B): Self = this.set("withFinalUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setWithMobileFinalUrl(value: String => B): Self = this.set("withMobileFinalUrl", js.Any.fromFunction1(value))
  }
  
}

