package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RollupPutJob[T] extends Generic {
  
  var body: T = js.native
  
  var id: String = js.native
}
object RollupPutJob {
  
  @scala.inline
  def apply[T](body: T, id: String): RollupPutJob[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupPutJob[T]]
  }
  
  @scala.inline
  implicit class RollupPutJobMutableBuilder[Self <: RollupPutJob[_], T] (val x: Self with RollupPutJob[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
