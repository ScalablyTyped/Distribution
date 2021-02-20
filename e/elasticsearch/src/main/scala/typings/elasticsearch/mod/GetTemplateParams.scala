package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTemplateParams extends GenericParams {
  
  var id: String = js.native
}
object GetTemplateParams {
  
  @scala.inline
  def apply(id: String): GetTemplateParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTemplateParams]
  }
  
  @scala.inline
  implicit class GetTemplateParamsMutableBuilder[Self <: GetTemplateParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
