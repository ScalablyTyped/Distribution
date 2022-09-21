package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportingRule extends StObject {
  
  /**
    * Any other associated alert details, for example, AlertConfiguration.
    */
  var alertDetails: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Rule name
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Alert Rule query Sample Query query { condition { filter { expected_application_id: 777491262838 expected_event_name: "indexable_content_change" filter_op: IN \} \} conjunction_operator: OR \}
    */
  var query: js.UndefOr[String | Null] = js.undefined
}
object SchemaReportingRule {
  
  inline def apply(): SchemaReportingRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportingRule]
  }
  
  extension [Self <: SchemaReportingRule](x: Self) {
    
    inline def setAlertDetails(value: String): Self = StObject.set(x, "alertDetails", value.asInstanceOf[js.Any])
    
    inline def setAlertDetailsNull: Self = StObject.set(x, "alertDetails", null)
    
    inline def setAlertDetailsUndefined: Self = StObject.set(x, "alertDetails", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryNull: Self = StObject.set(x, "query", null)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
