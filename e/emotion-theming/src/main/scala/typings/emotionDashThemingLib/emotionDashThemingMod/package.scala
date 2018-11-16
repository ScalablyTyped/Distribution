package typings
package emotionDashThemingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object emotionDashThemingMod {
  type BroadcastListener[Theme] = js.Function1[/* state */ Theme, scala.Unit]
  type OptionalThemeProps[Props, Theme] = Props with emotionDashThemingLib.Anon_Theme[Theme]
  type ThemeProviderComponent[Theme] = reactLib.reactMod.ReactNs.ComponentClass[ThemeProviderProps[Theme], reactLib.reactMod.ReactNs.ComponentState]
}
