package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.TrackComputedStyleUpdatesRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `40` extends StObject {
  
  var paramsType: js.Array[TrackComputedStyleUpdatesRequest] = js.native
  
  var returnType: Unit = js.native
}
object `40` {
  
  @scala.inline
  def apply(paramsType: js.Array[TrackComputedStyleUpdatesRequest], returnType: Unit): `40` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`40`]
  }
  
  @scala.inline
  implicit class `40MutableBuilder`[Self <: `40`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[TrackComputedStyleUpdatesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: TrackComputedStyleUpdatesRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
