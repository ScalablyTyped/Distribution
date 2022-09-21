package typings.firemonkeyBrowser

import typings.firemonkeyBrowser.GM.BrowserInfo
import typings.firemonkeyBrowser.GM.PlatformInfo
import typings.firemonkeyBrowser.GM.ScriptInfo
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.`panel-bottom`
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.`panel-left`
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.`panel-right`
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.`panel-top`
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.`slide-bottom`
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.`slide-left`
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.`slide-right`
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.`slide-top`
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.center
import typings.std.Blob
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddStyle extends StObject {
    
    /** Can be used to add style to the popup */
    def addStyle(css: String): Unit
    
    /** Can be used to add multiple HTML element(s) to the popup */
    def append(data: HTMLElement*): Unit
    
    var close: HTMLElement
    
    var content: HTMLElement
    
    def hide(): Unit
    
    var host: HTMLElement
    
    def remove(): Unit
    
    def show(): Unit
    
    var style: HTMLElement
  }
  object AddStyle {
    
    inline def apply(
      addStyle: String => Unit,
      append: /* repeated */ HTMLElement => Unit,
      close: HTMLElement,
      content: HTMLElement,
      hide: () => Unit,
      host: HTMLElement,
      remove: () => Unit,
      show: () => Unit,
      style: HTMLElement
    ): AddStyle = {
      val __obj = js.Dynamic.literal(addStyle = js.Any.fromFunction1(addStyle), append = js.Any.fromFunction1(append), close = close.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), host = host.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), show = js.Any.fromFunction0(show), style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddStyle]
    }
    
    extension [Self <: AddStyle](x: Self) {
      
      inline def setAddStyle(value: String => Unit): Self = StObject.set(x, "addStyle", js.Any.fromFunction1(value))
      
      inline def setAppend(value: /* repeated */ HTMLElement => Unit): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
      
      inline def setClose(value: HTMLElement): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setContent(value: HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      inline def setStyle(value: HTMLElement): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait Browser extends StObject {
    
    /** An object containing data about the currently running browser */
    var browser: BrowserInfo
    
    /** An object containing data about the currently running platform */
    var platform: PlatformInfo
    
    /** An object containing data about the currently running script */
    var script: ScriptInfo
    
    /**
      * The name of the user script engine handling this script's execution.
      * The string `FireMonkey`
      */
    var scriptHandler: String
    
    /**
      * A string, the entire literal Metadata Block (without the delimiters)
      * for the currently running script
      * In FireMonkey it's always null
      */
    var scriptMetaStr: String | Null
    
    /** The version of FireMonkey, a string e.g. `2.60` */
    var version: String
  }
  object Browser {
    
    inline def apply(
      browser: BrowserInfo,
      platform: PlatformInfo,
      script: ScriptInfo,
      scriptHandler: String,
      version: String
    ): Browser = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], scriptHandler = scriptHandler.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], scriptMetaStr = null)
      __obj.asInstanceOf[Browser]
    }
    
    extension [Self <: Browser](x: Self) {
      
      inline def setBrowser(value: BrowserInfo): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: PlatformInfo): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setScript(value: ScriptInfo): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptHandler(value: String): Self = StObject.set(x, "scriptHandler", value.asInstanceOf[js.Any])
      
      inline def setScriptMetaStr(value: String): Self = StObject.set(x, "scriptMetaStr", value.asInstanceOf[js.Any])
      
      inline def setScriptMetaStrNull: Self = StObject.set(x, "scriptMetaStr", null)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Image extends StObject {
    
    var image: js.UndefOr[Blob | String] = js.undefined
    
    var text: String
  }
  object Image {
    
    inline def apply(text: String): Image = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    extension [Self <: Image](x: Self) {
      
      inline def setImage(value: Blob | String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Mimetype extends StObject {
    
    var mimetype: String
    
    var name: String
    
    var url: String
  }
  object Mimetype {
    
    inline def apply(mimetype: String, name: String, url: String): Mimetype = {
      val __obj = js.Dynamic.literal(mimetype = mimetype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mimetype]
    }
    
    extension [Self <: Mimetype](x: Self) {
      
      inline def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Modal extends StObject {
    
    var modal: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[
        center | `slide-left` | `slide-right` | `slide-top` | `slide-bottom` | `panel-left` | `panel-right` | `panel-top` | `panel-bottom`
      ] = js.undefined
  }
  object Modal {
    
    inline def apply(): Modal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Modal]
    }
    
    extension [Self <: Modal](x: Self) {
      
      inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      inline def setType(
        value: center | `slide-left` | `slide-right` | `slide-top` | `slide-bottom` | `panel-left` | `panel-right` | `panel-top` | `panel-bottom`
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
