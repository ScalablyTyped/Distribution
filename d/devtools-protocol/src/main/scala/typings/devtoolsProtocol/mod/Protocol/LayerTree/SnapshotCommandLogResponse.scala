package typings.devtoolsProtocol.mod.Protocol.LayerTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotCommandLogResponse extends StObject {
  
  /**
    * The array of canvas function calls.
    */
  var commandLog: js.Array[Any]
}
object SnapshotCommandLogResponse {
  
  inline def apply(commandLog: js.Array[Any]): SnapshotCommandLogResponse = {
    val __obj = js.Dynamic.literal(commandLog = commandLog.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCommandLogResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapshotCommandLogResponse] (val x: Self) extends AnyVal {
    
    inline def setCommandLog(value: js.Array[Any]): Self = StObject.set(x, "commandLog", value.asInstanceOf[js.Any])
    
    inline def setCommandLogVarargs(value: Any*): Self = StObject.set(x, "commandLog", js.Array(value*))
  }
}
