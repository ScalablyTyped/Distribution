package typings.firebase.anon

import typings.firebase.mod.firebase.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Args extends StObject {
  
  /**
    * The raw arguments passed to the log call.
    */
  var args: js.Array[js.Any]
  
  /**
    * Level of event logged.
    */
  var level: LogLevel
  
  /**
    * Any text from logged arguments joined into one string.
    */
  var message: String
  
  /**
    * A string indicating the name of the package that made the log call,
    * such as `@firebase/firestore`.
    */
  var `type`: String
}
object Args {
  
  inline def apply(args: js.Array[js.Any], level: LogLevel, message: String, `type`: String): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  
  extension [Self <: Args](x: Self) {
    
    inline def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
