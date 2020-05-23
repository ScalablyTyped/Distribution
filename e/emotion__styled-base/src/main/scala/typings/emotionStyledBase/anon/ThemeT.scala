package typings.emotionStyledBase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeT[T] extends js.Object {
  var theme: T
}

object ThemeT {
  @scala.inline
  def apply[T](theme: T): ThemeT[T] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeT[T]]
  }
}

