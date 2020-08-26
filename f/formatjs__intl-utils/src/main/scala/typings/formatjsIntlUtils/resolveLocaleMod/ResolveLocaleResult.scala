package typings.formatjsIntlUtils.resolveLocaleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveLocaleResult
  extends /* k */ StringDictionary[js.Any] {
  var dataLocale: String = js.native
  var locale: String = js.native
}

object ResolveLocaleResult {
  @scala.inline
  def apply(dataLocale: String, locale: String): ResolveLocaleResult = {
    val __obj = js.Dynamic.literal(dataLocale = dataLocale.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveLocaleResult]
  }
  @scala.inline
  implicit class ResolveLocaleResultOps[Self <: ResolveLocaleResult] (val x: Self) extends AnyVal {
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
    def setDataLocale(value: String): Self = this.set("dataLocale", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
  }
  
}

