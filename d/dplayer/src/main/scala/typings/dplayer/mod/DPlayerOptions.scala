package typings.dplayer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DPlayerOptions
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
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
  
  inline def apply(): DPlayerOptions = {
    val __obj = js.Dynamic.literal(container = null)
    __obj.asInstanceOf[DPlayerOptions]
  }
  
  extension [Self <: DPlayerOptions](x: Self) {
    
    inline def setApiBackend(value: DPlayerAPIBackend): Self = StObject.set(x, "apiBackend", value.asInstanceOf[js.Any])
    
    inline def setApiBackendUndefined: Self = StObject.set(x, "apiBackend", js.undefined)
    
    inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerNull: Self = StObject.set(x, "container", null)
    
    inline def setContextmenu(value: js.Array[DPlayerContextMenuItem]): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
    
    inline def setContextmenuUndefined: Self = StObject.set(x, "contextmenu", js.undefined)
    
    inline def setContextmenuVarargs(value: DPlayerContextMenuItem*): Self = StObject.set(x, "contextmenu", js.Array(value :_*))
    
    inline def setDanmaku(value: DPlayerDanmaku): Self = StObject.set(x, "danmaku", value.asInstanceOf[js.Any])
    
    inline def setDanmakuUndefined: Self = StObject.set(x, "danmaku", js.undefined)
    
    inline def setHighlight(value: js.Array[DPlayerHighLightItem]): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    inline def setHighlightVarargs(value: DPlayerHighLightItem*): Self = StObject.set(x, "highlight", js.Array(value :_*))
    
    inline def setHotkey(value: Boolean): Self = StObject.set(x, "hotkey", value.asInstanceOf[js.Any])
    
    inline def setHotkeyUndefined: Self = StObject.set(x, "hotkey", js.undefined)
    
    inline def setLang(value: Lang | String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setLive(value: Boolean): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
    
    inline def setLiveUndefined: Self = StObject.set(x, "live", js.undefined)
    
    inline def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setMutex(value: Boolean): Self = StObject.set(x, "mutex", value.asInstanceOf[js.Any])
    
    inline def setMutexUndefined: Self = StObject.set(x, "mutex", js.undefined)
    
    inline def setPreload(value: Preload): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setScreenshot(value: Boolean): Self = StObject.set(x, "screenshot", value.asInstanceOf[js.Any])
    
    inline def setScreenshotUndefined: Self = StObject.set(x, "screenshot", js.undefined)
    
    inline def setSubtitle(value: DPlayerSubTitle): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setVideo(value: DPlayerVideo): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
