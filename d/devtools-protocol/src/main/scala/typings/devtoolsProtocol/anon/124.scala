package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.LayerTree.ReleaseSnapshotRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `124` extends StObject {
  
  var paramsType: js.Array[ReleaseSnapshotRequest]
  
  var returnType: Unit
}
object `124` {
  
  inline def apply(paramsType: js.Array[ReleaseSnapshotRequest], returnType: Unit): `124` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`124`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `124`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[ReleaseSnapshotRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ReleaseSnapshotRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
