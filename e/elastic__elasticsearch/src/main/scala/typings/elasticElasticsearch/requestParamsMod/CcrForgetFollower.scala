package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrForgetFollower[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var index: String
}
object CcrForgetFollower {
  
  @scala.inline
  def apply[T](body: T, index: String): CcrForgetFollower[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrForgetFollower[T]]
  }
  
  @scala.inline
  implicit class CcrForgetFollowerMutableBuilder[Self <: CcrForgetFollower[?], T] (val x: Self & CcrForgetFollower[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
