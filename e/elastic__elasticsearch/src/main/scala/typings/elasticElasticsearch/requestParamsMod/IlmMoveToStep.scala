package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IlmMoveToStep[T] extends Generic {
  
  var body: js.UndefOr[T] = js.native
  
  var index: String = js.native
}
object IlmMoveToStep {
  
  @scala.inline
  def apply[T](index: String): IlmMoveToStep[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmMoveToStep[T]]
  }
  
  @scala.inline
  implicit class IlmMoveToStepMutableBuilder[Self <: IlmMoveToStep[_], T] (val x: Self with IlmMoveToStep[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
