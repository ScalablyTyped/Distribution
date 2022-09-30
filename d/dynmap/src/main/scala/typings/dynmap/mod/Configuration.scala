package typings.dynmap.mod

import typings.dynmap.dynmapStrings.`login-required`
import typings.dynmap.dynmapStrings.xCommayCommaz
import typings.dynmap.mod.global.Array
import typings.dynmap.mod.global.JQuery
import typings.leaflet.mod.ControlPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configuration
  extends StObject
     with StandaloneConfiguration {
  
  var allowurlname: js.UndefOr[Boolean] = js.undefined
  
  var allowwebchat: js.UndefOr[Boolean] = js.undefined
  
  var chatlengthlimit: js.UndefOr[Double] = js.undefined
  
  var components: js.UndefOr[Array[ComponentConfiguration]] = js.undefined
  
  var confighash: js.UndefOr[Double] = js.undefined
  
  var container: js.UndefOr[String | JQuery] = js.undefined
  
  var coreversion: js.UndefOr[String] = js.undefined
  
  var cyrillic: js.UndefOr[Boolean] = js.undefined
  
  var defaultmap: js.UndefOr[String] = js.undefined
  
  var defaultworld: js.UndefOr[String] = js.undefined
  
  var dynmapversion: js.UndefOr[String] = js.undefined
  
  var error: js.UndefOr[`login-required` | String] = js.undefined
  
  var grayplayerswhenhidden: js.UndefOr[Boolean] = js.undefined
  
  var hidey: js.UndefOr[Boolean] = js.undefined
  
  var joinmessage: js.UndefOr[String] = js.undefined
  
  var jsonfile: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[String | xCommayCommaz] = js.undefined
  
  var linkurl: js.UndefOr[String] = js.undefined
  
  var `login-enabled`: js.UndefOr[Boolean] = js.undefined
  
  var loginrequired: js.UndefOr[Boolean] = js.undefined
  
  var logourl: js.UndefOr[String] = js.undefined
  
  var maxcount: js.UndefOr[Double] = js.undefined
  
  var `msg-chatnotallowed`: js.UndefOr[String] = js.undefined
  
  var `msg-chatrequireslogin`: js.UndefOr[String] = js.undefined
  
  var `msg-hiddennamejoin`: js.UndefOr[String] = js.undefined
  
  var `msg-hiddennamequit`: js.UndefOr[String] = js.undefined
  
  var `msg-maptypes`: js.UndefOr[String] = js.undefined
  
  var `msg-players`: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[ControlPosition] = js.undefined
  
  var quitmessage: js.UndefOr[String] = js.undefined
  
  var scrollback: js.UndefOr[Boolean] = js.undefined
  
  var showlabel: js.UndefOr[Boolean] = js.undefined
  
  var showlayercontrol: js.UndefOr[SidebarState] = js.undefined
  
  var showmessage: js.UndefOr[Boolean] = js.undefined
  
  var showplayerfacesinmenu: js.UndefOr[Boolean] = js.undefined
  
  var sidebaropened: js.UndefOr[SidebarState] = js.undefined
  
  var spammessage: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var updaterate: js.UndefOr[Double] = js.undefined
  
  var visiblelines: js.UndefOr[Double] = js.undefined
  
  var `webchat-interval`: js.UndefOr[Double] = js.undefined
  
  var `webchat-requires-login`: js.UndefOr[Boolean] = js.undefined
  
  var webprefix: js.UndefOr[String] = js.undefined
  
  var worlds: js.UndefOr[Array[WorldConfiguration]] = js.undefined
}
object Configuration {
  
  inline def apply(url: typings.dynmap.anon.Configuration): Configuration = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  
  extension [Self <: Configuration](x: Self) {
    
    inline def setAllowurlname(value: Boolean): Self = StObject.set(x, "allowurlname", value.asInstanceOf[js.Any])
    
    inline def setAllowurlnameUndefined: Self = StObject.set(x, "allowurlname", js.undefined)
    
    inline def setAllowwebchat(value: Boolean): Self = StObject.set(x, "allowwebchat", value.asInstanceOf[js.Any])
    
    inline def setAllowwebchatUndefined: Self = StObject.set(x, "allowwebchat", js.undefined)
    
    inline def setChatlengthlimit(value: Double): Self = StObject.set(x, "chatlengthlimit", value.asInstanceOf[js.Any])
    
    inline def setChatlengthlimitUndefined: Self = StObject.set(x, "chatlengthlimit", js.undefined)
    
    inline def setComponents(value: Array[ComponentConfiguration]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setConfighash(value: Double): Self = StObject.set(x, "confighash", value.asInstanceOf[js.Any])
    
    inline def setConfighashUndefined: Self = StObject.set(x, "confighash", js.undefined)
    
    inline def setContainer(value: String | JQuery): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCoreversion(value: String): Self = StObject.set(x, "coreversion", value.asInstanceOf[js.Any])
    
    inline def setCoreversionUndefined: Self = StObject.set(x, "coreversion", js.undefined)
    
    inline def setCyrillic(value: Boolean): Self = StObject.set(x, "cyrillic", value.asInstanceOf[js.Any])
    
    inline def setCyrillicUndefined: Self = StObject.set(x, "cyrillic", js.undefined)
    
    inline def setDefaultmap(value: String): Self = StObject.set(x, "defaultmap", value.asInstanceOf[js.Any])
    
    inline def setDefaultmapUndefined: Self = StObject.set(x, "defaultmap", js.undefined)
    
    inline def setDefaultworld(value: String): Self = StObject.set(x, "defaultworld", value.asInstanceOf[js.Any])
    
    inline def setDefaultworldUndefined: Self = StObject.set(x, "defaultworld", js.undefined)
    
    inline def setDynmapversion(value: String): Self = StObject.set(x, "dynmapversion", value.asInstanceOf[js.Any])
    
    inline def setDynmapversionUndefined: Self = StObject.set(x, "dynmapversion", js.undefined)
    
    inline def setError(value: `login-required` | String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setGrayplayerswhenhidden(value: Boolean): Self = StObject.set(x, "grayplayerswhenhidden", value.asInstanceOf[js.Any])
    
    inline def setGrayplayerswhenhiddenUndefined: Self = StObject.set(x, "grayplayerswhenhidden", js.undefined)
    
    inline def setHidey(value: Boolean): Self = StObject.set(x, "hidey", value.asInstanceOf[js.Any])
    
    inline def setHideyUndefined: Self = StObject.set(x, "hidey", js.undefined)
    
    inline def setJoinmessage(value: String): Self = StObject.set(x, "joinmessage", value.asInstanceOf[js.Any])
    
    inline def setJoinmessageUndefined: Self = StObject.set(x, "joinmessage", js.undefined)
    
    inline def setJsonfile(value: Boolean): Self = StObject.set(x, "jsonfile", value.asInstanceOf[js.Any])
    
    inline def setJsonfileUndefined: Self = StObject.set(x, "jsonfile", js.undefined)
    
    inline def setLabel(value: String | xCommayCommaz): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLinkurl(value: String): Self = StObject.set(x, "linkurl", value.asInstanceOf[js.Any])
    
    inline def setLinkurlUndefined: Self = StObject.set(x, "linkurl", js.undefined)
    
    inline def `setLogin-enabled`(value: Boolean): Self = StObject.set(x, "login-enabled", value.asInstanceOf[js.Any])
    
    inline def `setLogin-enabledUndefined`: Self = StObject.set(x, "login-enabled", js.undefined)
    
    inline def setLoginrequired(value: Boolean): Self = StObject.set(x, "loginrequired", value.asInstanceOf[js.Any])
    
    inline def setLoginrequiredUndefined: Self = StObject.set(x, "loginrequired", js.undefined)
    
    inline def setLogourl(value: String): Self = StObject.set(x, "logourl", value.asInstanceOf[js.Any])
    
    inline def setLogourlUndefined: Self = StObject.set(x, "logourl", js.undefined)
    
    inline def setMaxcount(value: Double): Self = StObject.set(x, "maxcount", value.asInstanceOf[js.Any])
    
    inline def setMaxcountUndefined: Self = StObject.set(x, "maxcount", js.undefined)
    
    inline def `setMsg-chatnotallowed`(value: String): Self = StObject.set(x, "msg-chatnotallowed", value.asInstanceOf[js.Any])
    
    inline def `setMsg-chatnotallowedUndefined`: Self = StObject.set(x, "msg-chatnotallowed", js.undefined)
    
    inline def `setMsg-chatrequireslogin`(value: String): Self = StObject.set(x, "msg-chatrequireslogin", value.asInstanceOf[js.Any])
    
    inline def `setMsg-chatrequiresloginUndefined`: Self = StObject.set(x, "msg-chatrequireslogin", js.undefined)
    
    inline def `setMsg-hiddennamejoin`(value: String): Self = StObject.set(x, "msg-hiddennamejoin", value.asInstanceOf[js.Any])
    
    inline def `setMsg-hiddennamejoinUndefined`: Self = StObject.set(x, "msg-hiddennamejoin", js.undefined)
    
    inline def `setMsg-hiddennamequit`(value: String): Self = StObject.set(x, "msg-hiddennamequit", value.asInstanceOf[js.Any])
    
    inline def `setMsg-hiddennamequitUndefined`: Self = StObject.set(x, "msg-hiddennamequit", js.undefined)
    
    inline def `setMsg-maptypes`(value: String): Self = StObject.set(x, "msg-maptypes", value.asInstanceOf[js.Any])
    
    inline def `setMsg-maptypesUndefined`: Self = StObject.set(x, "msg-maptypes", js.undefined)
    
    inline def `setMsg-players`(value: String): Self = StObject.set(x, "msg-players", value.asInstanceOf[js.Any])
    
    inline def `setMsg-playersUndefined`: Self = StObject.set(x, "msg-players", js.undefined)
    
    inline def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setQuitmessage(value: String): Self = StObject.set(x, "quitmessage", value.asInstanceOf[js.Any])
    
    inline def setQuitmessageUndefined: Self = StObject.set(x, "quitmessage", js.undefined)
    
    inline def setScrollback(value: Boolean): Self = StObject.set(x, "scrollback", value.asInstanceOf[js.Any])
    
    inline def setScrollbackUndefined: Self = StObject.set(x, "scrollback", js.undefined)
    
    inline def setShowlabel(value: Boolean): Self = StObject.set(x, "showlabel", value.asInstanceOf[js.Any])
    
    inline def setShowlabelUndefined: Self = StObject.set(x, "showlabel", js.undefined)
    
    inline def setShowlayercontrol(value: SidebarState): Self = StObject.set(x, "showlayercontrol", value.asInstanceOf[js.Any])
    
    inline def setShowlayercontrolUndefined: Self = StObject.set(x, "showlayercontrol", js.undefined)
    
    inline def setShowmessage(value: Boolean): Self = StObject.set(x, "showmessage", value.asInstanceOf[js.Any])
    
    inline def setShowmessageUndefined: Self = StObject.set(x, "showmessage", js.undefined)
    
    inline def setShowplayerfacesinmenu(value: Boolean): Self = StObject.set(x, "showplayerfacesinmenu", value.asInstanceOf[js.Any])
    
    inline def setShowplayerfacesinmenuUndefined: Self = StObject.set(x, "showplayerfacesinmenu", js.undefined)
    
    inline def setSidebaropened(value: SidebarState): Self = StObject.set(x, "sidebaropened", value.asInstanceOf[js.Any])
    
    inline def setSidebaropenedUndefined: Self = StObject.set(x, "sidebaropened", js.undefined)
    
    inline def setSpammessage(value: String): Self = StObject.set(x, "spammessage", value.asInstanceOf[js.Any])
    
    inline def setSpammessageUndefined: Self = StObject.set(x, "spammessage", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdaterate(value: Double): Self = StObject.set(x, "updaterate", value.asInstanceOf[js.Any])
    
    inline def setUpdaterateUndefined: Self = StObject.set(x, "updaterate", js.undefined)
    
    inline def setVisiblelines(value: Double): Self = StObject.set(x, "visiblelines", value.asInstanceOf[js.Any])
    
    inline def setVisiblelinesUndefined: Self = StObject.set(x, "visiblelines", js.undefined)
    
    inline def `setWebchat-interval`(value: Double): Self = StObject.set(x, "webchat-interval", value.asInstanceOf[js.Any])
    
    inline def `setWebchat-intervalUndefined`: Self = StObject.set(x, "webchat-interval", js.undefined)
    
    inline def `setWebchat-requires-login`(value: Boolean): Self = StObject.set(x, "webchat-requires-login", value.asInstanceOf[js.Any])
    
    inline def `setWebchat-requires-loginUndefined`: Self = StObject.set(x, "webchat-requires-login", js.undefined)
    
    inline def setWebprefix(value: String): Self = StObject.set(x, "webprefix", value.asInstanceOf[js.Any])
    
    inline def setWebprefixUndefined: Self = StObject.set(x, "webprefix", js.undefined)
    
    inline def setWorlds(value: Array[WorldConfiguration]): Self = StObject.set(x, "worlds", value.asInstanceOf[js.Any])
    
    inline def setWorldsUndefined: Self = StObject.set(x, "worlds", js.undefined)
  }
}
