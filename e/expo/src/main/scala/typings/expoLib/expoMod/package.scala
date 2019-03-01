package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expoMod {
  type Axis = scala.Double
  type BarCodeScannedCallback = js.Function1[/* result */ expoLib.Anon_Data, scala.Unit]
  type Md5 = java.lang.String
  type PlaybackSource = _PlaybackSource | RequireSource
  type RequireSource = reactDashNativeLib.reactDashNativeMod.ImageRequireSource
  type ResizeModeContain = expoLib.expoLibStrings.contain
  type ResizeModeCover = expoLib.expoLibStrings.cover
  type ResizeModeStretch = expoLib.expoLibStrings.stretch
  type URISource = reactDashNativeLib.reactDashNativeMod.ImageURISource
}
