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
  
  @scala.inline
  def apply[T](): ScriptsPainlessExecute[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptsPainlessExecute[T]]
  }
  
  @scala.inline
  implicit class ScriptsPainlessExecuteMutableBuilder[Self <: ScriptsPainlessExecute[?], T] (val x: Self & ScriptsPainlessExecute[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
