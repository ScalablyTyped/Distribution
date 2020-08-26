package typings.googleTranslateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DidYouMean extends js.Object {
  var didYouMean: Boolean = js.native
  var iso: String = js.native
}

object DidYouMean {
  @scala.inline
  def apply(didYouMean: Boolean, iso: String): DidYouMean = {
    val __obj = js.Dynamic.literal(didYouMean = didYouMean.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidYouMean]
  }
  @scala.inline
  implicit class DidYouMeanOps[Self <: DidYouMean] (val x: Self) extends AnyVal {
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
    def setDidYouMean(value: Boolean): Self = this.set("didYouMean", value.asInstanceOf[js.Any])
    @scala.inline
    def setIso(value: String): Self = this.set("iso", value.asInstanceOf[js.Any])
  }
  
}

