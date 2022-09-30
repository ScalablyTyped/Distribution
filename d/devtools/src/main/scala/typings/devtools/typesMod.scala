package typings.devtools

import typings.devtools.anon.GoogchromeOptions
import typings.devtools.anon.MsedgeOptions
import typings.puppeteerCore.eventEmitterMod.EventEmitter
import typings.puppeteerCore.mod.BrowserLaunchArgumentOptions
import typings.puppeteerCore.mod.ConnectOptions
import typings.puppeteerCore.mod.LaunchOptions
import typings.wdioProtocols.mod.ProtocolCommandsAsync
import typings.wdioTypes.capabilitiesMod.Capabilities
import typings.wdioTypes.capabilitiesMod.DesiredCapabilities
import typings.wdioTypes.capabilitiesMod.W3CCapabilities
import typings.wdioTypes.optionsMod.WebDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait ActiveListener extends StObject {
    
    /** Event function handler, bound to the context of its class instance. */
    def boundHandler(args: Any*): Any
    
    /** Event Emitter object emitting to the handler. */
    var emitter: EventEmitter
    
    /** Name of the event the handler is attached to. */
    var eventName: String
  }
  object ActiveListener {
    
    inline def apply(boundHandler: /* repeated */ Any => Any, emitter: EventEmitter, eventName: String): ActiveListener = {
      val __obj = js.Dynamic.literal(boundHandler = js.Any.fromFunction1(boundHandler), emitter = emitter.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActiveListener]
    }
    
    extension [Self <: ActiveListener](x: Self) {
      
      inline def setBoundHandler(value: /* repeated */ Any => Any): Self = StObject.set(x, "boundHandler", js.Any.fromFunction1(value))
      
      inline def setEmitter(value: EventEmitter): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
      
      inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    }
  }
  
  trait AttachOptions extends StObject {
    
    var capabilities: GoogchromeOptions | MsedgeOptions
  }
  object AttachOptions {
    
    inline def apply(capabilities: GoogchromeOptions | MsedgeOptions): AttachOptions = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttachOptions]
    }
    
    extension [Self <: AttachOptions](x: Self) {
      
      inline def setCapabilities(value: GoogchromeOptions | MsedgeOptions): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BaseClient
    extends typings.node.eventsMod.EventEmitter {
    
    var capabilities: DesiredCapabilities | W3CCapabilities = js.native
    
    var options: WebDriver = js.native
    
    var requestedCapabilities: DesiredCapabilities | W3CCapabilities = js.native
    
    var sessionId: String = js.native
  }
  
  @js.native
  trait Client
    extends BaseClient
       with ProtocolCommandsAsync
  
  trait DevToolsOptions
    extends StObject
       with LaunchOptions
       with BrowserLaunchArgumentOptions
       with ConnectOptions {
    
    /**
      * If you want to start Google Chrome on a custom port
      */
    var customPort: js.UndefOr[Double] = js.undefined
  }
  object DevToolsOptions {
    
    inline def apply(): DevToolsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DevToolsOptions]
    }
    
    extension [Self <: DevToolsOptions](x: Self) {
      
      inline def setCustomPort(value: Double): Self = StObject.set(x, "customPort", value.asInstanceOf[js.Any])
      
      inline def setCustomPortUndefined: Self = StObject.set(x, "customPort", js.undefined)
    }
  }
  
  trait ExtendedCapabilities
    extends StObject
       with Capabilities
       with WDIODevtoolsOptions
  object ExtendedCapabilities {
    
    inline def apply(): ExtendedCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtendedCapabilities]
    }
  }
  
  trait WDIODevtoolsOptions extends StObject {
    
    @JSName("wdio:devtoolsOptions")
    var wdioColondevtoolsOptions: js.UndefOr[DevToolsOptions] = js.undefined
  }
  object WDIODevtoolsOptions {
    
    inline def apply(): WDIODevtoolsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WDIODevtoolsOptions]
    }
    
    extension [Self <: WDIODevtoolsOptions](x: Self) {
      
      inline def setWdioColondevtoolsOptions(value: DevToolsOptions): Self = StObject.set(x, "wdio:devtoolsOptions", value.asInstanceOf[js.Any])
      
      inline def setWdioColondevtoolsOptionsUndefined: Self = StObject.set(x, "wdio:devtoolsOptions", js.undefined)
    }
  }
}
