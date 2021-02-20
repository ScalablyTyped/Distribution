package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutTemplateParams extends GenericParams {
  
  var id: String = js.native
}
object PutTemplateParams {
  
  @scala.inline
  def apply(id: String): PutTemplateParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutTemplateParams]
  }
  
  @scala.inline
  implicit class PutTemplateParamsMutableBuilder[Self <: PutTemplateParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
