package typings.giphyApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslateOptions extends BaseOptions {
  var s: String = js.native
}

object TranslateOptions {
  @scala.inline
  def apply(rating: Rating, s: String): TranslateOptions = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateOptions]
  }
  @scala.inline
  implicit class TranslateOptionsOps[Self <: TranslateOptions] (val x: Self) extends AnyVal {
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
    def setS(value: String): Self = this.set("s", value.asInstanceOf[js.Any])
  }
  
}

