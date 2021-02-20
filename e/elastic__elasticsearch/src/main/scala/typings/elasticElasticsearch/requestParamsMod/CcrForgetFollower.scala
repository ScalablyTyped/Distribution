package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CcrForgetFollower[T] extends Generic {
  
  var body: T = js.native
  
  var index: String = js.native
}
object CcrForgetFollower {
  
  @scala.inline
  def apply[T](body: T, index: String): CcrForgetFollower[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrForgetFollower[T]]
  }
  
  @scala.inline
  implicit class CcrForgetFollowerMutableBuilder[Self <: CcrForgetFollower[_], T] (val x: Self with CcrForgetFollower[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
