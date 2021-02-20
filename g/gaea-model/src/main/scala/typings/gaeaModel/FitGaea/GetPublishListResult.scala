package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPublishListResult extends StObject {
  
  // 描述
  var description: String = js.native
  
  // 版本
  var version: String = js.native
}
object GetPublishListResult {
  
  @scala.inline
  def apply(description: String, version: String): GetPublishListResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPublishListResult]
  }
  
  @scala.inline
  implicit class GetPublishListResultMutableBuilder[Self <: GetPublishListResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
