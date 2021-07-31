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
    
    @scala.inline
    def apply(connectionId: String, port: integer): AcceptedEvent = {
      val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[AcceptedEvent]
    }
    
    @scala.inline
    implicit class AcceptedEventMutableBuilder[Self <: AcceptedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionId(value: String): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: integer): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  trait BindRequest extends StObject {
    
    /**
      * Port number to bind.
      */
    var port: integer
  }
  object BindRequest {
    
    @scala.inline
    def apply(port: integer): BindRequest = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[BindRequest]
    }
    
    @scala.inline
    implicit class BindRequestMutableBuilder[Self <: BindRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPort(value: integer): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnbindRequest extends StObject {
    
    /**
      * Port number to unbind.
      */
    var port: integer
  }
  object UnbindRequest {
    
    @scala.inline
    def apply(port: integer): UnbindRequest = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnbindRequest]
    }
    
    @scala.inline
    implicit class UnbindRequestMutableBuilder[Self <: UnbindRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPort(value: integer): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
}
