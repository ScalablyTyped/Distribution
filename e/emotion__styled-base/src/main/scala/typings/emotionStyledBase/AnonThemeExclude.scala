package typings.emotionStyledBase

import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonThemeExclude extends js.Object {
  var theme: Exclude[_, js.UndefOr[scala.Nothing]]
}

object AnonThemeExclude {
  @scala.inline
  def apply(theme: Exclude[_, js.UndefOr[scala.Nothing]]): AnonThemeExclude = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonThemeExclude]
  }
}

