package typings.diagnosticChannelPublishers

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Args extends StObject {
    
    var args: js.Array[js.Any]
    
    var text: String
  }
  object Args {
    
    inline def apply(args: js.Array[js.Any], text: String): Args = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    extension [Self <: Args](x: Self) {
      
      inline def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Command extends StObject {
    
    var command: js.UndefOr[js.Any] = js.undefined
    
    var databaseName: js.UndefOr[String] = js.undefined
    
    var time: Date
  }
  object Command {
    
    inline def apply(time: Date): Command = {
      val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Command]
    }
    
    extension [Self <: Command](x: Self) {
      
      inline def setCommand(value: js.Any): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      inline def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
      
      inline def setDatabaseNameUndefined: Self = StObject.set(x, "databaseName", js.undefined)
      
      inline def setTime(value: Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommandName extends StObject {
    
    var commandName: js.UndefOr[String] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var failure: js.UndefOr[String] = js.undefined
    
    var reply: js.UndefOr[js.Any] = js.undefined
  }
  object CommandName {
    
    inline def apply(): CommandName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandName]
    }
    
    extension [Self <: CommandName](x: Self) {
      
      inline def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
      
      inline def setCommandNameUndefined: Self = StObject.set(x, "commandName", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setFailure(value: String): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
      
      inline def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
      
      inline def setReply(value: js.Any): Self = StObject.set(x, "reply", value.asInstanceOf[js.Any])
      
      inline def setReplyUndefined: Self = StObject.set(x, "reply", js.undefined)
    }
  }
  
  trait Config extends StObject {
    
    var config: js.UndefOr[Host] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setConfig(value: Host): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    }
  }
  
  trait Connection extends StObject {
    
    var _connection: js.UndefOr[Config] = js.undefined
    
    var sql: js.UndefOr[String] = js.undefined
  }
  object Connection {
    
    inline def apply(): Connection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Connection]
    }
    
    extension [Self <: Connection](x: Self) {
      
      inline def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
      
      inline def setSqlUndefined: Self = StObject.set(x, "sql", js.undefined)
      
      inline def set_connection(value: Config): Self = StObject.set(x, "_connection", value.asInstanceOf[js.Any])
      
      inline def set_connectionUndefined: Self = StObject.set(x, "_connection", js.undefined)
    }
  }
  
  trait Host extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var socketPath: js.UndefOr[String] = js.undefined
  }
  object Host {
    
    inline def apply(): Host = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Host]
    }
    
    extension [Self <: Host](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
    }
  }
  
  trait Plan extends StObject {
    
    var plan: js.UndefOr[String] = js.undefined
    
    var preparable: js.UndefOr[Args] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object Plan {
    
    inline def apply(): Plan = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Plan]
    }
    
    extension [Self <: Plan](x: Self) {
      
      inline def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
      
      inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
      
      inline def setPreparable(value: Args): Self = StObject.set(x, "preparable", value.asInstanceOf[js.Any])
      
      inline def setPreparableUndefined: Self = StObject.set(x, "preparable", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait Port extends StObject {
    
    var host: String
    
    var port: String
  }
  object Port {
    
    inline def apply(host: String, port: String): Port = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Port]
    }
    
    extension [Self <: Port](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
}
