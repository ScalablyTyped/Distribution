package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrPutAutoFollowPattern[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var name: String
}
object CcrPutAutoFollowPattern {
  
  @scala.inline
  def apply[T](body: T, name: String): CcrPutAutoFollowPattern[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrPutAutoFollowPattern[T]]
  }
  
  @scala.inline
  implicit class CcrPutAutoFollowPatternMutableBuilder[Self <: CcrPutAutoFollowPattern[?], T] (val x: Self & CcrPutAutoFollowPattern[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
