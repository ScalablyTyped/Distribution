package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlOpenJobResponse extends StObject {
  
  var opened: Boolean
}
object MlOpenJobResponse {
  
  inline def apply(opened: Boolean): MlOpenJobResponse = {
    val __obj = js.Dynamic.literal(opened = opened.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlOpenJobResponse]
  }
  
  extension [Self <: MlOpenJobResponse](x: Self) {
    
    inline def setOpened(value: Boolean): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
  }
}
