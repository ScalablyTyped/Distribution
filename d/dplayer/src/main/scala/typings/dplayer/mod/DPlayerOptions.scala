package typings.dplayer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DPlayerOptions
  extends /* key */ StringDictionary[js.Any] {
  var apiBackend: js.UndefOr[DPlayerAPIBackend] = js.undefined
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var container: HTMLElement | Null
  var contextmenu: js.UndefOr[js.Array[DPlayerContextMenuItem]] = js.undefined
  var danmaku: js.UndefOr[DPlayerDanmaku] = js.undefined
  var highlight: js.UndefOr[js.Array[DPlayerHighLightItem]] = js.undefined
  var hotkey: js.UndefOr[Boolean] = js.undefined
  var lang: js.UndefOr[Lang | String] = js.undefined
  var live: js.UndefOr[Boolean] = js.undefined
  var logo: js.UndefOr[String] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var mutex: js.UndefOr[Boolean] = js.undefined
  var preload: js.UndefOr[Preload] = js.undefined
  var screenshot: js.UndefOr[Boolean] = js.undefined
  var subtitle: js.UndefOr[DPlayerSubTitle] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var video: js.UndefOr[DPlayerVideo] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
}

object DPlayerOptions {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    apiBackend: DPlayerAPIBackend = null,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    container: HTMLElement = null,
    contextmenu: js.Array[DPlayerContextMenuItem] = null,
    danmaku: DPlayerDanmaku = null,
    highlight: js.Array[DPlayerHighLightItem] = null,
    hotkey: js.UndefOr[Boolean] = js.undefined,
    lang: Lang | String = null,
    live: js.UndefOr[Boolean] = js.undefined,
    logo: String = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    mutex: js.UndefOr[Boolean] = js.undefined,
    preload: Preload = null,
    screenshot: js.UndefOr[Boolean] = js.undefined,
    subtitle: DPlayerSubTitle = null,
    theme: String = null,
    video: DPlayerVideo = null,
    volume: js.UndefOr[Double] = js.undefined
  ): DPlayerOptions = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (apiBackend != null) __obj.updateDynamic("apiBackend")(apiBackend.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.get.asInstanceOf[js.Any])
    if (contextmenu != null) __obj.updateDynamic("contextmenu")(contextmenu.asInstanceOf[js.Any])
    if (danmaku != null) __obj.updateDynamic("danmaku")(danmaku.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (!js.isUndefined(hotkey)) __obj.updateDynamic("hotkey")(hotkey.get.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(live)) __obj.updateDynamic("live")(live.get.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mutex)) __obj.updateDynamic("mutex")(mutex.get.asInstanceOf[js.Any])
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (!js.isUndefined(screenshot)) __obj.updateDynamic("screenshot")(screenshot.get.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    if (!js.isUndefined(volume)) __obj.updateDynamic("volume")(volume.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DPlayerOptions]
  }
}

