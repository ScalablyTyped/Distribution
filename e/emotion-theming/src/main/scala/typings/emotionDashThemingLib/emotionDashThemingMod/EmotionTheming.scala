package typings
package emotionDashThemingLib.emotionDashThemingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmotionTheming[Theme] extends js.Object {
  def ThemeProvider(props: ThemeProviderProps[Theme]): reactLib.reactMod.ReactElement[_]
  def withTheme[C /* <: reactLib.reactMod.ComponentType[_] */](component: C): reactLib.reactMod.SFC[
    emotionDashThemingLib.typesHelperMod.AddOptionalTo[
      emotionDashThemingLib.typesHelperMod.PropsOf[C], 
      emotionDashThemingLib.emotionDashThemingLibStrings.theme
    ]
  ]
}

object EmotionTheming {
  @scala.inline
  def apply[Theme](
    ThemeProvider: ThemeProviderProps[Theme] => reactLib.reactMod.ReactElement[_],
    withTheme: js.Any => reactLib.reactMod.SFC[
      emotionDashThemingLib.typesHelperMod.AddOptionalTo[
        emotionDashThemingLib.typesHelperMod.PropsOf[js.Any], 
        emotionDashThemingLib.emotionDashThemingLibStrings.theme
      ]
    ]
  ): EmotionTheming[Theme] = {
    val __obj = js.Dynamic.literal(ThemeProvider = js.Any.fromFunction1(ThemeProvider), withTheme = js.Any.fromFunction1(withTheme))
  
    __obj.asInstanceOf[EmotionTheming[Theme]]
  }
}

