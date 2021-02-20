package typings.devtoolsProtocol.mod.Protocol.LayerTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotCommandLogResponse extends StObject {
  
  /**
    * The array of canvas function calls.
    */
  var commandLog: js.Array[_] = js.native
}
object SnapshotCommandLogResponse {
  
  @scala.inline
  def apply(commandLog: js.Array[_]): SnapshotCommandLogResponse = {
    val __obj = js.Dynamic.literal(commandLog = commandLog.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCommandLogResponse]
  }
  
  @scala.inline
  implicit class SnapshotCommandLogResponseMutableBuilder[Self <: SnapshotCommandLogResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommandLog(value: js.Array[_]): Self = StObject.set(x, "commandLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandLogVarargs(value: js.Any*): Self = StObject.set(x, "commandLog", js.Array(value :_*))
  }
}
