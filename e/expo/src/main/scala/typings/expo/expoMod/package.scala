package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expoMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.expo.Anon_Data
  import typings.expo.expoStrings.contain
  import typings.expo.expoStrings.cover
  import typings.expo.expoStrings.stretch
  import typings.reactDashNative.reactDashNativeMod.ImageRequireSource
  import typings.reactDashNative.reactDashNativeMod.ImageURISource

  type Axis = Double
  type BarCodeScannedCallback = js.Function1[/* result */ Anon_Data, Unit]
  type HashMap = StringDictionary[js.Any]
  type Md5 = String
  /* Rewritten from type alias, can be one of: 
    - typings.expo.expoMod.RequireSource
    - typings.expo.Anon_Uri
    - typings.expo.expoMod.Asset
  */
  type PlaybackSource = _PlaybackSource | RequireSource
  type RequireSource = ImageRequireSource
  type ResizeModeContain = contain
  type ResizeModeCover = cover
  type ResizeModeStretch = stretch
  type StringHashMap = StringDictionary[String]
  type URISource = ImageURISource
}
