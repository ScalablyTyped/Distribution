package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.TrackIndexedDBForOriginRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `187` extends StObject {
  
  var paramsType: js.Array[TrackIndexedDBForOriginRequest]
  
  var returnType: Unit
}
object `187` {
  
  @scala.inline
  def apply(paramsType: js.Array[TrackIndexedDBForOriginRequest], returnType: Unit): `187` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`187`]
  }
  
  @scala.inline
  implicit class `187MutableBuilder`[Self <: `187`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[TrackIndexedDBForOriginRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: TrackIndexedDBForOriginRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
