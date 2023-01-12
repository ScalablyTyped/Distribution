package typings.dynogels

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Name extends StObject {
    
    var name: String
  }
  object Name {
    
    inline def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait PollingInterval extends StObject {
    
    var pollingInterval: Double
  }
  object PollingInterval {
    
    inline def apply(pollingInterval: Double): PollingInterval = {
      val __obj = js.Dynamic.literal(pollingInterval = pollingInterval.asInstanceOf[js.Any])
      __obj.asInstanceOf[PollingInterval]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PollingInterval] (val x: Self) extends AnyVal {
      
      inline def setPollingInterval(value: Double): Self = StObject.set(x, "pollingInterval", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamEnabled extends StObject {
    
    var streamEnabled: Boolean
    
    var streamViewType: String
  }
  object StreamEnabled {
    
    inline def apply(streamEnabled: Boolean, streamViewType: String): StreamEnabled = {
      val __obj = js.Dynamic.literal(streamEnabled = streamEnabled.asInstanceOf[js.Any], streamViewType = streamViewType.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamEnabled]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamEnabled] (val x: Self) extends AnyVal {
      
      inline def setStreamEnabled(value: Boolean): Self = StObject.set(x, "streamEnabled", value.asInstanceOf[js.Any])
      
      inline def setStreamViewType(value: String): Self = StObject.set(x, "streamViewType", value.asInstanceOf[js.Any])
    }
  }
}
