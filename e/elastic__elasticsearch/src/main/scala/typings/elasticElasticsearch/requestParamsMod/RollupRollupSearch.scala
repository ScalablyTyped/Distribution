package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupRollupSearch[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var index: String | js.Array[String]
  
  var rest_total_hits_as_int: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var typed_keys: js.UndefOr[Boolean] = js.undefined
}
object RollupRollupSearch {
  
  @scala.inline
  def apply[T](body: T, index: String | js.Array[String]): RollupRollupSearch[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupRollupSearch[T]]
  }
  
  @scala.inline
  implicit class RollupRollupSearchMutableBuilder[Self <: RollupRollupSearch[?], T] (val x: Self & RollupRollupSearch[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: String | js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    @scala.inline
    def setRest_total_hits_as_int(value: Boolean): Self = StObject.set(x, "rest_total_hits_as_int", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRest_total_hits_as_intUndefined: Self = StObject.set(x, "rest_total_hits_as_int", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTyped_keys(value: Boolean): Self = StObject.set(x, "typed_keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTyped_keysUndefined: Self = StObject.set(x, "typed_keys", js.undefined)
  }
}
