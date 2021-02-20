package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.ScrollIntoViewIfNeededRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `49` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[ScrollIntoViewIfNeededRequest]] = js.native
  
  var returnType: Unit = js.native
}
object `49` {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[ScrollIntoViewIfNeededRequest]], returnType: Unit): `49` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`49`]
  }
  
  @scala.inline
  implicit class `49MutableBuilder`[Self <: `49`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[ScrollIntoViewIfNeededRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[ScrollIntoViewIfNeededRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
