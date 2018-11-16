package typings
package emotionDashThemingLib.emotionDashThemingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmotionThemingModule[Theme] extends js.Object {
  var ThemeProvider: ThemeProviderComponent[Theme] = js.native
  def withTheme[Props](
    component: reactLib.reactMod.ReactNs.ComponentClass[Props, reactLib.reactMod.ReactNs.ComponentState]
  ): reactLib.reactMod.ReactNs.ComponentClass[OptionalThemeProps[Props, Theme], reactLib.reactMod.ReactNs.ComponentState] = js.native
  def withTheme[Props](component: reactLib.reactMod.ReactNs.SFC[Props]): reactLib.reactMod.ReactNs.ComponentClass[OptionalThemeProps[Props, Theme], reactLib.reactMod.ReactNs.ComponentState] = js.native
}

