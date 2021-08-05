package typings.devtoolsProtocol.mod.Protocol.LayerTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotCommandLogResponse extends StObject {
  
  /**
    * The array of canvas function calls.
    */
  var commandLog: js.Array[js.Any]
}
object SnapshotCommandLogResponse {
  
  inline def apply(commandLog: js.Array[js.Any]): SnapshotCommandLogResponse = {
    val __obj = js.Dynamic.literal(commandLog = commandLog.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCommandLogResponse]
  }
  
  extension [Self <: SnapshotCommandLogResponse](x: Self) {
    
    inline def setCommandLog(value: js.Array[js.Any]): Self = StObject.set(x, "commandLog", value.asInstanceOf[js.Any])
    
    inline def setCommandLogVarargs(value: js.Any*): Self = StObject.set(x, "commandLog", js.Array(value :_*))
  }
}
