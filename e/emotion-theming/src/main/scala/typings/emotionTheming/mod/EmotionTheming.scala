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

@js.native
trait EmotionTheming[Theme] extends js.Object {
  def ThemeProvider(props: ThemeProviderProps[Theme]): ReactElement = js.native
  def withTheme[C /* <: ComponentType[_] */](component: C): SFC[AddOptionalTo[PropsOf[C], theme]] = js.native
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
  @scala.inline
  implicit class EmotionThemingOps[Self <: EmotionTheming[_], Theme] (val x: Self with EmotionTheming[Theme]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setThemeProvider(value: ThemeProviderProps[Theme] => ReactElement): Self = this.set("ThemeProvider", js.Any.fromFunction1(value))
    @scala.inline
    def setWithTheme(value: js.Any => SFC[AddOptionalTo[PropsOf[js.Any], theme]]): Self = this.set("withTheme", js.Any.fromFunction1(value))
  }
  
}

