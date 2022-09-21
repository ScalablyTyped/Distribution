package typings.fbWatchman

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fb-watchman", "Client")
  @js.native
  open class Client () extends EventEmitter {
    def this(options: ClientOptions) = this()
    
    def cancelCommands(why: String): Unit = js.native
    
    def capabilityCheck(caps: Capabilities, done: doneCallback): Unit = js.native
    
    def command(args: Any, done: doneCallback): Unit = js.native
    
    def connect(): Unit = js.native
    
    def end(): Unit = js.native
    
    def sendNextCommand(): Unit = js.native
  }
  
  trait Capabilities extends StObject {
    
    var optional: js.Array[Any]
    
    var required: js.Array[Any]
  }
  object Capabilities {
    
    inline def apply(optional: js.Array[Any], required: js.Array[Any]): Capabilities = {
      val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
      __obj.asInstanceOf[Capabilities]
    }
    
    extension [Self <: Capabilities](x: Self) {
      
      inline def setOptional(value: js.Array[Any]): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalVarargs(value: Any*): Self = StObject.set(x, "optional", js.Array(value*))
      
      inline def setRequired(value: js.Array[Any]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredVarargs(value: Any*): Self = StObject.set(x, "required", js.Array(value*))
    }
  }
  
  trait ClientOptions extends StObject {
    
    /**
      * Absolute path to the watchman binary.
      * If not provided, the Client locates the binary using the PATH specified
      * by the node child_process's default env.
      */
    var watchmanBinaryPath: js.UndefOr[String] = js.undefined
  }
  object ClientOptions {
    
    inline def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    extension [Self <: ClientOptions](x: Self) {
      
      inline def setWatchmanBinaryPath(value: String): Self = StObject.set(x, "watchmanBinaryPath", value.asInstanceOf[js.Any])
      
      inline def setWatchmanBinaryPathUndefined: Self = StObject.set(x, "watchmanBinaryPath", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fbWatchman.fbWatchmanStrings.unilateralTags
    - typings.fbWatchman.fbWatchmanStrings.log
  */
  trait UnilateralTags extends StObject
  object UnilateralTags {
    
    inline def log: typings.fbWatchman.fbWatchmanStrings.log = "log".asInstanceOf[typings.fbWatchman.fbWatchmanStrings.log]
    
    inline def unilateralTags: typings.fbWatchman.fbWatchmanStrings.unilateralTags = "unilateralTags".asInstanceOf[typings.fbWatchman.fbWatchmanStrings.unilateralTags]
  }
  
  type doneCallback = js.Function2[/* error */ js.UndefOr[js.Error | Null], /* resp */ js.UndefOr[Any], Any]
}
