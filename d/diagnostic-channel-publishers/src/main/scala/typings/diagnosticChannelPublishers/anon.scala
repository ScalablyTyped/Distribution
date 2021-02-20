package typings.diagnosticChannelPublishers

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Args extends StObject {
    
    var args: js.Array[_] = js.native
    
    var text: String = js.native
  }
  object Args {
    
    @scala.inline
    def apply(args: js.Array[_], text: String): Args = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    @scala.inline
    implicit class ArgsMutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Command extends StObject {
    
    var command: js.UndefOr[js.Any] = js.native
    
    var databaseName: js.UndefOr[String] = js.native
    
    var time: Date = js.native
  }
  object Command {
    
    @scala.inline
    def apply(time: Date): Command = {
      val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Command]
    }
    
    @scala.inline
    implicit class CommandMutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommand(value: js.Any): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      @scala.inline
      def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseNameUndefined: Self = StObject.set(x, "databaseName", js.undefined)
      
      @scala.inline
      def setTime(value: Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CommandName extends StObject {
    
    var commandName: js.UndefOr[String] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var failure: js.UndefOr[String] = js.native
    
    var reply: js.UndefOr[js.Any] = js.native
  }
  object CommandName {
    
    @scala.inline
    def apply(): CommandName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandName]
    }
    
    @scala.inline
    implicit class CommandNameMutableBuilder[Self <: CommandName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandNameUndefined: Self = StObject.set(x, "commandName", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setFailure(value: String): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
      
      @scala.inline
      def setReply(value: js.Any): Self = StObject.set(x, "reply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplyUndefined: Self = StObject.set(x, "reply", js.undefined)
    }
  }
  
  @js.native
  trait Config extends StObject {
    
    var config: js.UndefOr[Host] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: Host): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    }
  }
  
  @js.native
  trait Connection extends StObject {
    
    var _connection: js.UndefOr[Config] = js.native
    
    var sql: js.UndefOr[String] = js.native
  }
  object Connection {
    
    @scala.inline
    def apply(): Connection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Connection]
    }
    
    @scala.inline
    implicit class ConnectionMutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSqlUndefined: Self = StObject.set(x, "sql", js.undefined)
      
      @scala.inline
      def set_connection(value: Config): Self = StObject.set(x, "_connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_connectionUndefined: Self = StObject.set(x, "_connection", js.undefined)
    }
  }
  
  @js.native
  trait Host extends StObject {
    
    var host: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var socketPath: js.UndefOr[String] = js.native
  }
  object Host {
    
    @scala.inline
    def apply(): Host = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
    }
  }
  
  @js.native
  trait Plan extends StObject {
    
    var plan: js.UndefOr[String] = js.native
    
    var preparable: js.UndefOr[Args] = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  object Plan {
    
    @scala.inline
    def apply(): Plan = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Plan]
    }
    
    @scala.inline
    implicit class PlanMutableBuilder[Self <: Plan] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
      
      @scala.inline
      def setPreparable(value: Args): Self = StObject.set(x, "preparable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreparableUndefined: Self = StObject.set(x, "preparable", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait Port extends StObject {
    
    var host: String = js.native
    
    var port: String = js.native
  }
  object Port {
    
    @scala.inline
    def apply(host: String, port: String): Port = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Port]
    }
    
    @scala.inline
    implicit class PortMutableBuilder[Self <: Port] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
}
