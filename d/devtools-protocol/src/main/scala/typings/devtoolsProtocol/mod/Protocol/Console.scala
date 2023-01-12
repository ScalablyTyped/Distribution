package typings.devtoolsProtocol.mod.Protocol

import typings.devtoolsProtocol.devtoolsProtocolStrings.`console-api`
import typings.devtoolsProtocol.devtoolsProtocolStrings.appcache
import typings.devtoolsProtocol.devtoolsProtocolStrings.debug
import typings.devtoolsProtocol.devtoolsProtocolStrings.deprecation
import typings.devtoolsProtocol.devtoolsProtocolStrings.error
import typings.devtoolsProtocol.devtoolsProtocolStrings.info
import typings.devtoolsProtocol.devtoolsProtocolStrings.javascript_
import typings.devtoolsProtocol.devtoolsProtocolStrings.log
import typings.devtoolsProtocol.devtoolsProtocolStrings.network
import typings.devtoolsProtocol.devtoolsProtocolStrings.other_
import typings.devtoolsProtocol.devtoolsProtocolStrings.rendering
import typings.devtoolsProtocol.devtoolsProtocolStrings.security
import typings.devtoolsProtocol.devtoolsProtocolStrings.storage
import typings.devtoolsProtocol.devtoolsProtocolStrings.warning
import typings.devtoolsProtocol.devtoolsProtocolStrings.worker_
import typings.devtoolsProtocol.devtoolsProtocolStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Console {
  
  trait ConsoleMessage extends StObject {
    
    /**
      * Column number in the resource that generated this message (1-based).
      */
    var column: js.UndefOr[integer] = js.undefined
    
    /**
      * Message severity. (ConsoleMessageLevel enum)
      */
    var level: log | warning | error | debug | info
    
    /**
      * Line number in the resource that generated this message (1-based).
      */
    var line: js.UndefOr[integer] = js.undefined
    
    /**
      * Message source. (ConsoleMessageSource enum)
      */
    var source: xml | javascript_ | network | `console-api` | storage | appcache | rendering | security | other_ | deprecation | worker_
    
    /**
      * Message text.
      */
    var text: String
    
    /**
      * URL of the message origin.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object ConsoleMessage {
    
    inline def apply(
      level: log | warning | error | debug | info,
      source: xml | javascript_ | network | `console-api` | storage | appcache | rendering | security | other_ | deprecation | worker_,
      text: String
    ): ConsoleMessage = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConsoleMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConsoleMessage] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: integer): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setLevel(value: log | warning | error | debug | info): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLine(value: integer): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setSource(
        value: xml | javascript_ | network | `console-api` | storage | appcache | rendering | security | other_ | deprecation | worker_
      ): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.log
    - typings.devtoolsProtocol.devtoolsProtocolStrings.warning
    - typings.devtoolsProtocol.devtoolsProtocolStrings.error
    - typings.devtoolsProtocol.devtoolsProtocolStrings.debug
    - typings.devtoolsProtocol.devtoolsProtocolStrings.info
  */
  trait ConsoleMessageLevel extends StObject
  object ConsoleMessageLevel {
    
    inline def Debug: debug = "debug".asInstanceOf[debug]
    
    inline def Error: error = "error".asInstanceOf[error]
    
    inline def Info: info = "info".asInstanceOf[info]
    
    inline def Log: log = "log".asInstanceOf[log]
    
    inline def Warning: warning = "warning".asInstanceOf[warning]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.xml
    - typings.devtoolsProtocol.devtoolsProtocolStrings.javascript_
    - typings.devtoolsProtocol.devtoolsProtocolStrings.network
    - typings.devtoolsProtocol.devtoolsProtocolStrings.`console-api`
    - typings.devtoolsProtocol.devtoolsProtocolStrings.storage
    - typings.devtoolsProtocol.devtoolsProtocolStrings.appcache
    - typings.devtoolsProtocol.devtoolsProtocolStrings.rendering
    - typings.devtoolsProtocol.devtoolsProtocolStrings.security
    - typings.devtoolsProtocol.devtoolsProtocolStrings.other_
    - typings.devtoolsProtocol.devtoolsProtocolStrings.deprecation
    - typings.devtoolsProtocol.devtoolsProtocolStrings.worker_
  */
  trait ConsoleMessageSource extends StObject
  object ConsoleMessageSource {
    
    inline def Appcache: appcache = "appcache".asInstanceOf[appcache]
    
    inline def ConsoleAPI: `console-api` = "console-api".asInstanceOf[`console-api`]
    
    inline def Deprecation: deprecation = "deprecation".asInstanceOf[deprecation]
    
    inline def Javascript: javascript_ = "javascript".asInstanceOf[javascript_]
    
    inline def Network: network = "network".asInstanceOf[network]
    
    inline def Other: other_ = "other".asInstanceOf[other_]
    
    inline def Rendering: rendering = "rendering".asInstanceOf[rendering]
    
    inline def Security: security = "security".asInstanceOf[security]
    
    inline def Storage: storage = "storage".asInstanceOf[storage]
    
    inline def Worker: worker_ = "worker".asInstanceOf[worker_]
    
    inline def XML: xml = "xml".asInstanceOf[xml]
  }
  
  trait MessageAddedEvent extends StObject {
    
    /**
      * Console message that has been added.
      */
    var message: ConsoleMessage
  }
  object MessageAddedEvent {
    
    inline def apply(message: ConsoleMessage): MessageAddedEvent = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageAddedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageAddedEvent] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: ConsoleMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
