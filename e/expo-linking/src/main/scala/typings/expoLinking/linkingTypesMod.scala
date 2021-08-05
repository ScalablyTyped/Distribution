package typings.expoLinking

import org.scalablytyped.runtime.StringDictionary
import typings.std.MessageEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkingTypesMod {
  
  trait EventType extends StObject {
    
    var nativeEvent: js.UndefOr[MessageEvent[js.Any]] = js.undefined
    
    var url: String
  }
  object EventType {
    
    inline def apply(url: String): EventType = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventType]
    }
    
    extension [Self <: EventType](x: Self) {
      
      inline def setNativeEvent(value: MessageEvent[js.Any]): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      inline def setNativeEventUndefined: Self = StObject.set(x, "nativeEvent", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type NativeURLListener = js.Function1[/* nativeEvent */ MessageEvent[js.Any], Unit]
  
  trait ParsedURL extends StObject {
    
    var hostname: String | Null
    
    var path: String | Null
    
    var queryParams: QueryParams | Null
    
    var scheme: String | Null
  }
  object ParsedURL {
    
    inline def apply(): ParsedURL = {
      val __obj = js.Dynamic.literal(hostname = null, path = null, queryParams = null, scheme = null)
      __obj.asInstanceOf[ParsedURL]
    }
    
    extension [Self <: ParsedURL](x: Self) {
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathNull: Self = StObject.set(x, "path", null)
      
      inline def setQueryParams(value: QueryParams): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsNull: Self = StObject.set(x, "queryParams", null)
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeNull: Self = StObject.set(x, "scheme", null)
    }
  }
  
  type QueryParams = StringDictionary[js.UndefOr[String]]
  
  type URLListener = js.Function1[/* event */ EventType, Unit]
}
