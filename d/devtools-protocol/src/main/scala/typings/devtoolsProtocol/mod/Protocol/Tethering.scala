package typings.devtoolsProtocol.mod.Protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tethering {
  
  trait AcceptedEvent extends StObject {
    
    /**
      * Connection id to be used.
      */
    var connectionId: String
    
    /**
      * Port number that was successfully bound.
      */
    var port: integer
  }
  object AcceptedEvent {
    
    inline def apply(connectionId: String, port: integer): AcceptedEvent = {
      val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[AcceptedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AcceptedEvent] (val x: Self) extends AnyVal {
      
      inline def setConnectionId(value: String): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
      
      inline def setPort(value: integer): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  trait BindRequest extends StObject {
    
    /**
      * Port number to bind.
      */
    var port: integer
  }
  object BindRequest {
    
    inline def apply(port: integer): BindRequest = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[BindRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BindRequest] (val x: Self) extends AnyVal {
      
      inline def setPort(value: integer): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnbindRequest extends StObject {
    
    /**
      * Port number to unbind.
      */
    var port: integer
  }
  object UnbindRequest {
    
    inline def apply(port: integer): UnbindRequest = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnbindRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnbindRequest] (val x: Self) extends AnyVal {
      
      inline def setPort(value: integer): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
}
