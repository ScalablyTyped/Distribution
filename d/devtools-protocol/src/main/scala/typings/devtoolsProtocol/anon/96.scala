package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.IndexedDB.DeleteObjectStoreEntriesRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `96` extends StObject {
  
  var paramsType: js.Array[DeleteObjectStoreEntriesRequest] = js.native
  
  var returnType: Unit = js.native
}
object `96` {
  
  @scala.inline
  def apply(paramsType: js.Array[DeleteObjectStoreEntriesRequest], returnType: Unit): `96` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`96`]
  }
  
  @scala.inline
  implicit class `96MutableBuilder`[Self <: `96`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[DeleteObjectStoreEntriesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: DeleteObjectStoreEntriesRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
