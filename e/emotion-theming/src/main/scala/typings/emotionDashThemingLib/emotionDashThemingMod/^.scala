package typings
package emotionDashThemingLib.emotionDashThemingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emotion-theming", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def ThemeProvider[Theme](props: ThemeProviderProps[Theme]): reactLib.reactMod.ReactElement[_] = js.native
  def withTheme[C /* <: reactLib.reactMod.ComponentType[_] */](component: C): reactLib.reactMod.SFC[
    emotionDashThemingLib.typesHelperMod.AddOptionalTo[
      emotionDashThemingLib.typesHelperMod.PropsOf[C], 
      emotionDashThemingLib.emotionDashThemingLibStrings.theme
    ]
  ] = js.native
}

