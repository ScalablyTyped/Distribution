package typings
package dplayerLib.dplayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DPlayerOptions
  extends /* key */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  var apiBackend: js.UndefOr[DPlayerAPIBackend] = js.undefined
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  var container: stdLib.HTMLElement | scala.Null
  var contextmenu: js.UndefOr[js.Array[DPlayerContextMenuItem]] = js.undefined
  var danmaku: js.UndefOr[DPlayerDanmaku] = js.undefined
  var highlight: js.UndefOr[js.Array[DPlayerHighLightItem]] = js.undefined
  var hotkey: js.UndefOr[scala.Boolean] = js.undefined
  var lang: js.UndefOr[Lang | java.lang.String] = js.undefined
  var live: js.UndefOr[scala.Boolean] = js.undefined
  var logo: js.UndefOr[java.lang.String] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var mutex: js.UndefOr[scala.Boolean] = js.undefined
  var preload: js.UndefOr[Preload] = js.undefined
  var screenshot: js.UndefOr[scala.Boolean] = js.undefined
  var subtitle: js.UndefOr[DPlayerSubTitle] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
  var video: js.UndefOr[DPlayerVideo] = js.undefined
  var volume: js.UndefOr[scala.Double] = js.undefined
}

