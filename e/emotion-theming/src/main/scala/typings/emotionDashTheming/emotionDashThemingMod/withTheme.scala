package typings.emotionDashTheming.emotionDashThemingMod

import typings.emotionDashTheming.emotionDashThemingStrings.theme
import typings.emotionDashTheming.typesHelperMod.AddOptionalTo
import typings.emotionDashTheming.typesHelperMod.PropsOf
import typings.react.reactMod.ComponentType
import typings.react.reactMod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emotion-theming", "withTheme")
@js.native
object withTheme extends js.Object {
  def apply[C /* <: ComponentType[_] */](component: C): SFC[AddOptionalTo[PropsOf[C], theme]] = js.native
}

