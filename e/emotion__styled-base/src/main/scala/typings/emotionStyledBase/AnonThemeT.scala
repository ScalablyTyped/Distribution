package typings.emotionStyledBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonThemeT[T] extends js.Object {
  var theme: T
}

object AnonThemeT {
  @scala.inline
  def apply[T](theme: T): AnonThemeT[T] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonThemeT[T]]
  }
}

