package typings.formatjsIntlUtils.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocaleData[T] extends js.Object {
  var availableLocales: js.Array[String] = js.native
  var data: Record[Locale, T] = js.native
}

object LocaleData {
  @scala.inline
  def apply[T](availableLocales: js.Array[String], data: Record[Locale, T]): LocaleData[T] = {
    val __obj = js.Dynamic.literal(availableLocales = availableLocales.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleData[T]]
  }
  @scala.inline
  implicit class LocaleDataOps[Self <: LocaleData[_], T] (val x: Self with LocaleData[T]) extends AnyVal {
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
    def setAvailableLocalesVarargs(value: String*): Self = this.set("availableLocales", js.Array(value :_*))
    @scala.inline
    def setAvailableLocales(value: js.Array[String]): Self = this.set("availableLocales", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: Record[Locale, T]): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

