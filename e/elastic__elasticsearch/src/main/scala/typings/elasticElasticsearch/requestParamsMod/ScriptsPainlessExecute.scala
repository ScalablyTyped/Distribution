package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptsPainlessExecute[T]
  extends StObject
     with Generic {
  
  var body: js.UndefOr[T] = js.undefined
}
object ScriptsPainlessExecute {
  
  inline def apply[T](): ScriptsPainlessExecute[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptsPainlessExecute[T]]
  }
  
  extension [Self <: ScriptsPainlessExecute[?], T](x: Self & ScriptsPainlessExecute[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
