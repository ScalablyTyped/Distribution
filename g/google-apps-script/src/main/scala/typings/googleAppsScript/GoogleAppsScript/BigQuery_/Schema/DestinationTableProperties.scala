package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationTableProperties extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var friendlyName: js.UndefOr[String] = js.undefined
  
  var labels: js.UndefOr[js.Object] = js.undefined
}
object DestinationTableProperties {
  
  inline def apply(): DestinationTableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationTableProperties]
  }
  
  extension [Self <: DestinationTableProperties](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    inline def setLabels(value: js.Object): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
