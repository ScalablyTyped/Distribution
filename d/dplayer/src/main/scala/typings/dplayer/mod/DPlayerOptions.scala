package typings.dplayer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DPlayerOptions
  extends /* key */ StringDictionary[js.Any] {
  
  var apiBackend: js.UndefOr[DPlayerAPIBackend] = js.native
  
  var autoplay: js.UndefOr[Boolean] = js.native
  
  var container: HTMLElement | Null = js.native
  
  var contextmenu: js.UndefOr[js.Array[DPlayerContextMenuItem]] = js.native
  
  var danmaku: js.UndefOr[DPlayerDanmaku] = js.native
  
  var highlight: js.UndefOr[js.Array[DPlayerHighLightItem]] = js.native
  
  var hotkey: js.UndefOr[Boolean] = js.native
  
  var lang: js.UndefOr[Lang | String] = js.native
  
  var live: js.UndefOr[Boolean] = js.native
  
  var logo: js.UndefOr[String] = js.native
  
  var loop: js.UndefOr[Boolean] = js.native
  
  var mutex: js.UndefOr[Boolean] = js.native
  
  var preload: js.UndefOr[Preload] = js.native
  
  var screenshot: js.UndefOr[Boolean] = js.native
  
  var subtitle: js.UndefOr[DPlayerSubTitle] = js.native
  
  var theme: js.UndefOr[String] = js.native
  
  var video: js.UndefOr[DPlayerVideo] = js.native
  
  var volume: js.UndefOr[Double] = js.native
}
object DPlayerOptions {
  
  @scala.inline
  def apply(): DPlayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DPlayerOptions]
  }
  
  @scala.inline
  implicit class DPlayerOptionsOps[Self <: DPlayerOptions] (val x: Self) extends AnyVal {
    
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
    def setApiBackend(value: DPlayerAPIBackend): Self = this.set("apiBackend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiBackend: Self = this.set("apiBackend", js.undefined)
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    
    @scala.inline
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
    
    @scala.inline
    def setContextmenuVarargs(value: DPlayerContextMenuItem*): Self = this.set("contextmenu", js.Array(value :_*))
    
    @scala.inline
    def setContextmenu(value: js.Array[DPlayerContextMenuItem]): Self = this.set("contextmenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextmenu: Self = this.set("contextmenu", js.undefined)
    
    @scala.inline
    def setDanmaku(value: DPlayerDanmaku): Self = this.set("danmaku", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDanmaku: Self = this.set("danmaku", js.undefined)
    
    @scala.inline
    def setHighlightVarargs(value: DPlayerHighLightItem*): Self = this.set("highlight", js.Array(value :_*))
    
    @scala.inline
    def setHighlight(value: js.Array[DPlayerHighLightItem]): Self = this.set("highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    
    @scala.inline
    def setHotkey(value: Boolean): Self = this.set("hotkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHotkey: Self = this.set("hotkey", js.undefined)
    
    @scala.inline
    def setLang(value: Lang | String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setLive(value: Boolean): Self = this.set("live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLive: Self = this.set("live", js.undefined)
    
    @scala.inline
    def setLogo(value: String): Self = this.set("logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogo: Self = this.set("logo", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setMutex(value: Boolean): Self = this.set("mutex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutex: Self = this.set("mutex", js.undefined)
    
    @scala.inline
    def setPreload(value: Preload): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    
    @scala.inline
    def setScreenshot(value: Boolean): Self = this.set("screenshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenshot: Self = this.set("screenshot", js.undefined)
    
    @scala.inline
    def setSubtitle(value: DPlayerSubTitle): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setVideo(value: DPlayerVideo): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
    
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
  }
}
