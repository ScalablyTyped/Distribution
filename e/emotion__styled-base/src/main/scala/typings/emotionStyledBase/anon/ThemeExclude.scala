package typings.emotionStyledBase.anon

import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeExclude extends js.Object {
  var theme: Exclude[_, js.UndefOr[scala.Nothing]]
}

object ThemeExclude {
  @scala.inline
  def apply(theme: Exclude[_, js.UndefOr[scala.Nothing]]): ThemeExclude = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeExclude]
  }
}

