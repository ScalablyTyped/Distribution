package typings.devtoolsProtocol.mod.Protocol

import typings.devtoolsProtocol.devtoolsProtocolStrings.debug
import typings.devtoolsProtocol.devtoolsProtocolStrings.error
import typings.devtoolsProtocol.devtoolsProtocolStrings.info
import typings.devtoolsProtocol.devtoolsProtocolStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Media {
  
  trait PlayerError extends StObject {
    
    /**
      * Errors potentially have a root cause error, ie, a DecoderError might be
      * caused by an WindowsError
      */
    var cause: js.Array[PlayerError]
    
    /**
      * Code is the numeric enum entry for a specific set of error codes, such
      * as PipelineStatusCodes in media/base/pipeline_status.h
      */
    var code: integer
    
    /**
      * Extra data attached to an error, such as an HRESULT, Video Codec, etc.
      */
    var data: Any
    
    var errorType: String
    
    /**
      * A trace of where this error was caused / where it passed through.
      */
    var stack: js.Array[PlayerErrorSourceLocation]
  }
  object PlayerError {
    
    inline def apply(
      cause: js.Array[PlayerError],
      code: integer,
      data: Any,
      errorType: String,
      stack: js.Array[PlayerErrorSourceLocation]
    ): PlayerError = {
      val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], errorType = errorType.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerError]
    }
    
    extension [Self <: PlayerError](x: Self) {
      
      inline def setCause(value: js.Array[PlayerError]): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCauseVarargs(value: PlayerError*): Self = StObject.set(x, "cause", js.Array(value*))
      
      inline def setCode(value: integer): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
      
      inline def setStack(value: js.Array[PlayerErrorSourceLocation]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackVarargs(value: PlayerErrorSourceLocation*): Self = StObject.set(x, "stack", js.Array(value*))
    }
  }
  
  trait PlayerErrorSourceLocation extends StObject {
    
    var file: String
    
    var line: integer
  }
  object PlayerErrorSourceLocation {
    
    inline def apply(file: String, line: integer): PlayerErrorSourceLocation = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerErrorSourceLocation]
    }
    
    extension [Self <: PlayerErrorSourceLocation](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setLine(value: integer): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlayerErrorsRaisedEvent extends StObject {
    
    var errors: js.Array[PlayerError]
    
    var playerId: PlayerId
  }
  object PlayerErrorsRaisedEvent {
    
    inline def apply(errors: js.Array[PlayerError], playerId: PlayerId): PlayerErrorsRaisedEvent = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], playerId = playerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerErrorsRaisedEvent]
    }
    
    extension [Self <: PlayerErrorsRaisedEvent](x: Self) {
      
      inline def setErrors(value: js.Array[PlayerError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: PlayerError*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setPlayerId(value: PlayerId): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlayerEvent extends StObject {
    
    var timestamp: Timestamp
    
    var value: String
  }
  object PlayerEvent {
    
    inline def apply(timestamp: Timestamp, value: String): PlayerEvent = {
      val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerEvent]
    }
    
    extension [Self <: PlayerEvent](x: Self) {
      
      inline def setTimestamp(value: Timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlayerEventsAddedEvent extends StObject {
    
    var events: js.Array[PlayerEvent]
    
    var playerId: PlayerId
  }
  object PlayerEventsAddedEvent {
    
    inline def apply(events: js.Array[PlayerEvent], playerId: PlayerId): PlayerEventsAddedEvent = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], playerId = playerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerEventsAddedEvent]
    }
    
    extension [Self <: PlayerEventsAddedEvent](x: Self) {
      
      inline def setEvents(value: js.Array[PlayerEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(value: PlayerEvent*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setPlayerId(value: PlayerId): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
    }
  }
  
  type PlayerId = String
  
  trait PlayerMessage extends StObject {
    
    /**
      * Keep in sync with MediaLogMessageLevel
      * We are currently keeping the message level 'error' separate from the
      * PlayerError type because right now they represent different things,
      * this one being a DVLOG(ERROR) style log message that gets printed
      * based on what log level is selected in the UI, and the other is a
      * representation of a media::PipelineStatus object. Soon however we're
      * going to be moving away from using PipelineStatus for errors and
      * introducing a new error type which should hopefully let us integrate
      * the error log level into the PlayerError type. (PlayerMessageLevel enum)
      */
    var level: error | warning | info | debug
    
    var message: String
  }
  object PlayerMessage {
    
    inline def apply(level: error | warning | info | debug, message: String): PlayerMessage = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerMessage]
    }
    
    extension [Self <: PlayerMessage](x: Self) {
      
      inline def setLevel(value: error | warning | info | debug): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.error
    - typings.devtoolsProtocol.devtoolsProtocolStrings.warning
    - typings.devtoolsProtocol.devtoolsProtocolStrings.info
    - typings.devtoolsProtocol.devtoolsProtocolStrings.debug
  */
  trait PlayerMessageLevel extends StObject
  object PlayerMessageLevel {
    
    inline def Debug: debug = "debug".asInstanceOf[debug]
    
    inline def Error: error = "error".asInstanceOf[error]
    
    inline def Info: info = "info".asInstanceOf[info]
    
    inline def Warning: warning = "warning".asInstanceOf[warning]
  }
  
  trait PlayerMessagesLoggedEvent extends StObject {
    
    var messages: js.Array[PlayerMessage]
    
    var playerId: PlayerId
  }
  object PlayerMessagesLoggedEvent {
    
    inline def apply(messages: js.Array[PlayerMessage], playerId: PlayerId): PlayerMessagesLoggedEvent = {
      val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], playerId = playerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerMessagesLoggedEvent]
    }
    
    extension [Self <: PlayerMessagesLoggedEvent](x: Self) {
      
      inline def setMessages(value: js.Array[PlayerMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesVarargs(value: PlayerMessage*): Self = StObject.set(x, "messages", js.Array(value*))
      
      inline def setPlayerId(value: PlayerId): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlayerPropertiesChangedEvent extends StObject {
    
    var playerId: PlayerId
    
    var properties: js.Array[PlayerProperty]
  }
  object PlayerPropertiesChangedEvent {
    
    inline def apply(playerId: PlayerId, properties: js.Array[PlayerProperty]): PlayerPropertiesChangedEvent = {
      val __obj = js.Dynamic.literal(playerId = playerId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerPropertiesChangedEvent]
    }
    
    extension [Self <: PlayerPropertiesChangedEvent](x: Self) {
      
      inline def setPlayerId(value: PlayerId): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: js.Array[PlayerProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesVarargs(value: PlayerProperty*): Self = StObject.set(x, "properties", js.Array(value*))
    }
  }
  
  trait PlayerProperty extends StObject {
    
    var name: String
    
    var value: String
  }
  object PlayerProperty {
    
    inline def apply(name: String, value: String): PlayerProperty = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerProperty]
    }
    
    extension [Self <: PlayerProperty](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlayersCreatedEvent extends StObject {
    
    var players: js.Array[PlayerId]
  }
  object PlayersCreatedEvent {
    
    inline def apply(players: js.Array[PlayerId]): PlayersCreatedEvent = {
      val __obj = js.Dynamic.literal(players = players.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayersCreatedEvent]
    }
    
    extension [Self <: PlayersCreatedEvent](x: Self) {
      
      inline def setPlayers(value: js.Array[PlayerId]): Self = StObject.set(x, "players", value.asInstanceOf[js.Any])
      
      inline def setPlayersVarargs(value: PlayerId*): Self = StObject.set(x, "players", js.Array(value*))
    }
  }
  
  type Timestamp = Double
}
