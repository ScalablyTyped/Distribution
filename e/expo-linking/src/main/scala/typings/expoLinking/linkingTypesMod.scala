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
    
    @scala.inline
    def apply(url: String): EventType = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventType]
    }
    
    @scala.inline
    implicit class EventTypeMutableBuilder[Self <: EventType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNativeEvent(value: MessageEvent[js.Any]): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeEventUndefined: Self = StObject.set(x, "nativeEvent", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(): ParsedURL = {
      val __obj = js.Dynamic.literal(hostname = null, path = null, queryParams = null, scheme = null)
      __obj.asInstanceOf[ParsedURL]
    }
    
    @scala.inline
    implicit class ParsedURLMutableBuilder[Self <: ParsedURL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathNull: Self = StObject.set(x, "path", null)
      
      @scala.inline
      def setQueryParams(value: QueryParams): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsNull: Self = StObject.set(x, "queryParams", null)
      
      @scala.inline
      def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemeNull: Self = StObject.set(x, "scheme", null)
    }
  }
  
  type QueryParams = StringDictionary[js.UndefOr[String]]
  
  type URLListener = js.Function1[/* event */ EventType, Unit]
}
