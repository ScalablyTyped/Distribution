package typings.devtoolsProtocol.mod.Protocol.LayerTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotCommandLogResponse extends js.Object {
  
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
  implicit class SnapshotCommandLogResponseOps[Self <: SnapshotCommandLogResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommandLogVarargs(value: js.Any*): Self = this.set("commandLog", js.Array(value :_*))
    
    @scala.inline
    def setCommandLog(value: js.Array[_]): Self = this.set("commandLog", value.asInstanceOf[js.Any])
  }
}
