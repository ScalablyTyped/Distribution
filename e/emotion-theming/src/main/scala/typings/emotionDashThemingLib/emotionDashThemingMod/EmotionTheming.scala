package typings
package emotionDashThemingLib.emotionDashThemingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmotionTheming[Theme] extends js.Object {
  def ThemeProvider(props: ThemeProviderProps[Theme]): reactLib.reactMod.ReactNs.ReactElement
  def withTheme[C /* <: reactLib.reactMod.ReactNs.ComponentType[_] */](component: C): reactLib.reactMod.ReactNs.SFC[
    emotionDashThemingLib.typesHelperMod.AddOptionalTo[
      emotionDashThemingLib.typesHelperMod.PropsOf[C], 
      emotionDashThemingLib.emotionDashThemingLibStrings.theme
    ]
  ]
}

