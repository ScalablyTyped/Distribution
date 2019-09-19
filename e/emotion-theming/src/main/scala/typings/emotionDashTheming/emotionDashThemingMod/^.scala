package typings.emotionDashTheming.emotionDashThemingMod

import typings.emotionDashTheming.emotionDashThemingStrings.theme
import typings.emotionDashTheming.typesHelperMod.AddOptionalTo
import typings.emotionDashTheming.typesHelperMod.PropsOf
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactElement
import typings.react.reactMod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emotion-theming", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def ThemeProvider[Theme](props: ThemeProviderProps[Theme]): ReactElement = js.native
  def useTheme[Theme](): Theme = js.native
  def withTheme[C /* <: ComponentType[_] */](component: C): SFC[AddOptionalTo[PropsOf[C], theme]] = js.native
}

