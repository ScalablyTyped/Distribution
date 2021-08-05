package typings.devtoolsProtocol.mod.Protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cast {
  
  trait EnableRequest extends StObject {
    
    var presentationUrl: js.UndefOr[String] = js.undefined
  }
  object EnableRequest {
    
    inline def apply(): EnableRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnableRequest]
    }
    
    extension [Self <: EnableRequest](x: Self) {
      
      inline def setPresentationUrl(value: String): Self = StObject.set(x, "presentationUrl", value.asInstanceOf[js.Any])
      
      inline def setPresentationUrlUndefined: Self = StObject.set(x, "presentationUrl", js.undefined)
    }
  }
  
  trait IssueUpdatedEvent extends StObject {
    
    var issueMessage: String
  }
  object IssueUpdatedEvent {
    
    inline def apply(issueMessage: String): IssueUpdatedEvent = {
      val __obj = js.Dynamic.literal(issueMessage = issueMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssueUpdatedEvent]
    }
    
    extension [Self <: IssueUpdatedEvent](x: Self) {
      
      inline def setIssueMessage(value: String): Self = StObject.set(x, "issueMessage", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetSinkToUseRequest extends StObject {
    
    var sinkName: String
  }
  object SetSinkToUseRequest {
    
    inline def apply(sinkName: String): SetSinkToUseRequest = {
      val __obj = js.Dynamic.literal(sinkName = sinkName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetSinkToUseRequest]
    }
    
    extension [Self <: SetSinkToUseRequest](x: Self) {
      
      inline def setSinkName(value: String): Self = StObject.set(x, "sinkName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Sink extends StObject {
    
    var id: String
    
    var name: String
    
    /**
      * Text describing the current session. Present only if there is an active
      * session on the sink.
      */
    var session: js.UndefOr[String] = js.undefined
  }
  object Sink {
    
    inline def apply(id: String, name: String): Sink = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sink]
    }
    
    extension [Self <: Sink](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    }
  }
  
  trait SinksUpdatedEvent extends StObject {
    
    var sinks: js.Array[Sink]
  }
  object SinksUpdatedEvent {
    
    inline def apply(sinks: js.Array[Sink]): SinksUpdatedEvent = {
      val __obj = js.Dynamic.literal(sinks = sinks.asInstanceOf[js.Any])
      __obj.asInstanceOf[SinksUpdatedEvent]
    }
    
    extension [Self <: SinksUpdatedEvent](x: Self) {
      
      inline def setSinks(value: js.Array[Sink]): Self = StObject.set(x, "sinks", value.asInstanceOf[js.Any])
      
      inline def setSinksVarargs(value: Sink*): Self = StObject.set(x, "sinks", js.Array(value :_*))
    }
  }
  
  trait StartTabMirroringRequest extends StObject {
    
    var sinkName: String
  }
  object StartTabMirroringRequest {
    
    inline def apply(sinkName: String): StartTabMirroringRequest = {
      val __obj = js.Dynamic.literal(sinkName = sinkName.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartTabMirroringRequest]
    }
    
    extension [Self <: StartTabMirroringRequest](x: Self) {
      
      inline def setSinkName(value: String): Self = StObject.set(x, "sinkName", value.asInstanceOf[js.Any])
    }
  }
  
  trait StopCastingRequest extends StObject {
    
    var sinkName: String
  }
  object StopCastingRequest {
    
    inline def apply(sinkName: String): StopCastingRequest = {
      val __obj = js.Dynamic.literal(sinkName = sinkName.asInstanceOf[js.Any])
      __obj.asInstanceOf[StopCastingRequest]
    }
    
    extension [Self <: StopCastingRequest](x: Self) {
      
      inline def setSinkName(value: String): Self = StObject.set(x, "sinkName", value.asInstanceOf[js.Any])
    }
  }
}
