package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncSearchDelete extends Generic {
  
  var id: String = js.native
}
object AsyncSearchDelete {
  
  @scala.inline
  def apply(id: String): AsyncSearchDelete = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncSearchDelete]
  }
  
  @scala.inline
  implicit class AsyncSearchDeleteMutableBuilder[Self <: AsyncSearchDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
