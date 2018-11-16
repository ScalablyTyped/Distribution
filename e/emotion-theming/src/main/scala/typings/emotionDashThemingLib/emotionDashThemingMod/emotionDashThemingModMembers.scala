package typings
package emotionDashThemingLib.emotionDashThemingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emotion-theming", JSImport.Namespace)
@js.native
object emotionDashThemingModMembers extends js.Object {
  val ThemeProvider: ThemeProviderComponent[js.Object] = js.native
  val channel: emotionDashThemingLib.emotionDashThemingLibStrings.`__EMOTION_THEMING__` = js.native
  def createBroadcast[Theme](initialState: Theme): Broadcast[Theme] = js.native
  def withTheme[Props, Theme](
    component: reactLib.reactMod.ReactNs.ComponentClass[Props, reactLib.reactMod.ReactNs.ComponentState]
  ): reactLib.reactMod.ReactNs.ComponentClass[OptionalThemeProps[Props, Theme], reactLib.reactMod.ReactNs.ComponentState] = js.native
  def withTheme[Props, Theme](component: reactLib.reactMod.ReactNs.SFC[Props]): reactLib.reactMod.ReactNs.ComponentClass[OptionalThemeProps[Props, Theme], reactLib.reactMod.ReactNs.ComponentState] = js.native
}

