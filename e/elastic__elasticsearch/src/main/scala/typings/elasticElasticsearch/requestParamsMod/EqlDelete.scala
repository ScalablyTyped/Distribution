package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EqlDelete extends Generic {
  
  var id: String = js.native
}
object EqlDelete {
  
  @scala.inline
  def apply(id: String): EqlDelete = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EqlDelete]
  }
  
  @scala.inline
  implicit class EqlDeleteMutableBuilder[Self <: EqlDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
