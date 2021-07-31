package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.LayerTree.ReleaseSnapshotRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `106` extends StObject {
  
  var paramsType: js.Array[ReleaseSnapshotRequest]
  
  var returnType: Unit
}
object `106` {
  
  @scala.inline
  def apply(paramsType: js.Array[ReleaseSnapshotRequest], returnType: Unit): `106` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`106`]
  }
  
  @scala.inline
  implicit class `106MutableBuilder`[Self <: `106`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[ReleaseSnapshotRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: ReleaseSnapshotRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
