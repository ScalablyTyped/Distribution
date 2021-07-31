package typings.devtoolsProtocol.mod.Protocol

import typings.devtoolsProtocol.devtoolsProtocolStrings.debug
import typings.devtoolsProtocol.devtoolsProtocolStrings.error
import typings.devtoolsProtocol.devtoolsProtocolStrings.info
import typings.devtoolsProtocol.devtoolsProtocolStrings.media_error
import typings.devtoolsProtocol.devtoolsProtocolStrings.pipeline_error
import typings.devtoolsProtocol.devtoolsProtocolStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Media {
  
  trait PlayerError extends StObject {
    
    /**
      * When this switches to using media::Status instead of PipelineStatus
      * we can remove "errorCode" and replace it with the fields from
      * a Status instance. This also seems like a duplicate of the error
      * level enum - there is a todo bug to have that level removed and
      * use this instead. (crbug.com/1068454)
      */
    var errorCode: String
    
    /**
      *  (PlayerErrorType enum)
      */
    var `type`: pipeline_error | media_error
  }
  object PlayerError {
    
    @scala.inline
    def apply(errorCode: String, `type`: pipeline_error | media_error): PlayerError = {
      val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerError]
    }
    
    @scala.inline
    implicit class PlayerErrorMutableBuilder[Self <: PlayerError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: pipeline_error | media_error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.pipeline_error
    - typings.devtoolsProtocol.devtoolsProtocolStrings.media_error
  */
  trait PlayerErrorType extends StObject
  object PlayerErrorType {
    
    @scala.inline
    def Media_error: media_error = "media_error".asInstanceOf[media_error]
    
    @scala.inline
    def Pipeline_error: pipeline_error = "pipeline_error".asInstanceOf[pipeline_error]
  }
  
  trait PlayerErrorsRaisedEvent extends StObject {
    
    var errors: js.Array[PlayerError]
    
    var playerId: PlayerId
  }
  object PlayerErrorsRaisedEvent {
    
    @scala.inline
    def apply(errors: js.Array[PlayerError], playerId: PlayerId): PlayerErrorsRaisedEvent = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], playerId = playerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerErrorsRaisedEvent]
    }
    
    @scala.inline
    implicit class PlayerErrorsRaisedEventMutableBuilder[Self <: PlayerErrorsRaisedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[PlayerError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: PlayerError*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setPlayerId(value: PlayerId): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlayerEvent extends StObject {
    
    var timestamp: Timestamp
    
    var value: String
  }
  object PlayerEvent {
    
    @scala.inline
    def apply(timestamp: Timestamp, value: String): PlayerEvent = {
      val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerEvent]
    }
    
    @scala.inline
    implicit class PlayerEventMutableBuilder[Self <: PlayerEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimestamp(value: Timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlayerEventsAddedEvent extends StObject {
    
    var events: js.Array[PlayerEvent]
    
    var playerId: PlayerId
  }
  object PlayerEventsAddedEvent {
    
    @scala.inline
    def apply(events: js.Array[PlayerEvent], playerId: PlayerId): PlayerEventsAddedEvent = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], playerId = playerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerEventsAddedEvent]
    }
    
    @scala.inline
    implicit class PlayerEventsAddedEventMutableBuilder[Self <: PlayerEventsAddedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvents(value: js.Array[PlayerEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsVarargs(value: PlayerEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      @scala.inline
      def setPlayerId(value: PlayerId): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(level: error | warning | info | debug, message: String): PlayerMessage = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerMessage]
    }
    
    @scala.inline
    implicit class PlayerMessageMutableBuilder[Self <: PlayerMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: error | warning | info | debug): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def Debug: debug = "debug".asInstanceOf[debug]
    
    @scala.inline
    def Error: error = "error".asInstanceOf[error]
    
    @scala.inline
    def Info: info = "info".asInstanceOf[info]
    
    @scala.inline
    def Warning: warning = "warning".asInstanceOf[warning]
  }
  
  trait PlayerMessagesLoggedEvent extends StObject {
    
    var messages: js.Array[PlayerMessage]
    
    var playerId: PlayerId
  }
  object PlayerMessagesLoggedEvent {
    
    @scala.inline
    def apply(messages: js.Array[PlayerMessage], playerId: PlayerId): PlayerMessagesLoggedEvent = {
      val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], playerId = playerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerMessagesLoggedEvent]
    }
    
    @scala.inline
    implicit class PlayerMessagesLoggedEventMutableBuilder[Self <: PlayerMessagesLoggedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessages(value: js.Array[PlayerMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesVarargs(value: PlayerMessage*): Self = StObject.set(x, "messages", js.Array(value :_*))
      
      @scala.inline
      def setPlayerId(value: PlayerId): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlayerPropertiesChangedEvent extends StObject {
    
    var playerId: PlayerId
    
    var properties: js.Array[PlayerProperty]
  }
  object PlayerPropertiesChangedEvent {
    
    @scala.inline
    def apply(playerId: PlayerId, properties: js.Array[PlayerProperty]): PlayerPropertiesChangedEvent = {
      val __obj = js.Dynamic.literal(playerId = playerId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerPropertiesChangedEvent]
    }
    
    @scala.inline
    implicit class PlayerPropertiesChangedEventMutableBuilder[Self <: PlayerPropertiesChangedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlayerId(value: PlayerId): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: js.Array[PlayerProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesVarargs(value: PlayerProperty*): Self = StObject.set(x, "properties", js.Array(value :_*))
    }
  }
  
  trait PlayerProperty extends StObject {
    
    var name: String
    
    var value: String
  }
  object PlayerProperty {
    
    @scala.inline
    def apply(name: String, value: String): PlayerProperty = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerProperty]
    }
    
    @scala.inline
    implicit class PlayerPropertyMutableBuilder[Self <: PlayerProperty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlayersCreatedEvent extends StObject {
    
    var players: js.Array[PlayerId]
  }
  object PlayersCreatedEvent {
    
    @scala.inline
    def apply(players: js.Array[PlayerId]): PlayersCreatedEvent = {
      val __obj = js.Dynamic.literal(players = players.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayersCreatedEvent]
    }
    
    @scala.inline
    implicit class PlayersCreatedEventMutableBuilder[Self <: PlayersCreatedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlayers(value: js.Array[PlayerId]): Self = StObject.set(x, "players", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayersVarargs(value: PlayerId*): Self = StObject.set(x, "players", js.Array(value :_*))
    }
  }
  
  type Timestamp = Double
}
