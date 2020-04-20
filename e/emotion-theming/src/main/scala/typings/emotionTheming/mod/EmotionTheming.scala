package typings.emotionTheming.mod

import typings.emotionTheming.emotionThemingStrings.theme
import typings.emotionTheming.helperMod.AddOptionalTo
import typings.emotionTheming.helperMod.PropsOf
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmotionTheming[Theme] extends js.Object {
  def ThemeProvider(props: ThemeProviderProps[Theme]): ReactElement
  def withTheme[C /* <: ComponentType[_] */](component: C): SFC[AddOptionalTo[PropsOf[C], theme]]
}

object EmotionTheming {
  @scala.inline
  def apply[Theme](
    ThemeProvider: ThemeProviderProps[Theme] => ReactElement,
    withTheme: js.Any => SFC[AddOptionalTo[PropsOf[js.Any], theme]]
  ): EmotionTheming[Theme] = {
    val __obj = js.Dynamic.literal(ThemeProvider = js.Any.fromFunction1(ThemeProvider), withTheme = js.Any.fromFunction1(withTheme))
    __obj.asInstanceOf[EmotionTheming[Theme]]
  }
}

