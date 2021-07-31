package typings.devtoolsProtocol.mod.Protocol.LayerTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileSnapshotResponse extends StObject {
  
  /**
    * The array of paint profiles, one per run.
    */
  var timings: js.Array[PaintProfile]
}
object ProfileSnapshotResponse {
  
  @scala.inline
  def apply(timings: js.Array[PaintProfile]): ProfileSnapshotResponse = {
    val __obj = js.Dynamic.literal(timings = timings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileSnapshotResponse]
  }
  
  @scala.inline
  implicit class ProfileSnapshotResponseMutableBuilder[Self <: ProfileSnapshotResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimings(value: js.Array[PaintProfile]): Self = StObject.set(x, "timings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingsVarargs(value: PaintProfile*): Self = StObject.set(x, "timings", js.Array(value :_*))
  }
}
