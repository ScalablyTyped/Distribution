package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTemplateParams extends GenericParams {
  
  var id: String = js.native
}
object DeleteTemplateParams {
  
  @scala.inline
  def apply(id: String): DeleteTemplateParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTemplateParams]
  }
  
  @scala.inline
  implicit class DeleteTemplateParamsMutableBuilder[Self <: DeleteTemplateParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
