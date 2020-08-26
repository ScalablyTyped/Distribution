package typings.emotionStyledBase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeT[T] extends js.Object {
  var theme: T = js.native
}

object ThemeT {
  @scala.inline
  def apply[T](theme: T): ThemeT[T] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeT[T]]
  }
  @scala.inline
  implicit class ThemeTOps[Self <: ThemeT[_], T] (val x: Self with ThemeT[T]) extends AnyVal {
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
    def setTheme(value: T): Self = this.set("theme", value.asInstanceOf[js.Any])
  }
  
}

