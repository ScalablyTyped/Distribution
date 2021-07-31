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
  
  @scala.inline
  def apply(): DestinationTableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationTableProperties]
  }
  
  @scala.inline
  implicit class DestinationTablePropertiesMutableBuilder[Self <: DestinationTableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    @scala.inline
    def setLabels(value: js.Object): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
