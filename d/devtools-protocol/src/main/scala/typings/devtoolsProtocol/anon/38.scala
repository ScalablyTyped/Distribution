package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Browser.SetDockTileRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `38` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[SetDockTileRequest]]
  
  var returnType: Unit
}
object `38` {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[SetDockTileRequest]], returnType: Unit): `38` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`38`]
  }
  
  @scala.inline
  implicit class `38MutableBuilder`[Self <: `38`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[SetDockTileRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[SetDockTileRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
