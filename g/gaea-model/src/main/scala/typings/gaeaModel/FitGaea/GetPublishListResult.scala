package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPublishListResult extends StObject {
  
  // 描述
  var description: String
  
  // 版本
  var version: String
}
object GetPublishListResult {
  
  inline def apply(description: String, version: String): GetPublishListResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPublishListResult]
  }
  
  extension [Self <: GetPublishListResult](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
