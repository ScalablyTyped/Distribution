package typings.emotionTheming.mod

import typings.emotionTheming.emotionThemingStrings.theme
import typings.emotionTheming.helperMod.AddOptionalTo
import typings.emotionTheming.helperMod.PropsOf
import typings.react.mod.ComponentType
import typings.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emotion-theming", "withTheme")
@js.native
object withTheme extends js.Object {
  def apply[C /* <: ComponentType[_] */](component: C): SFC[AddOptionalTo[PropsOf[C], theme]] = js.native
}

