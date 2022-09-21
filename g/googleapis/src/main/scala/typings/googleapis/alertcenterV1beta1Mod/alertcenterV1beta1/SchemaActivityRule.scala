package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaActivityRule extends StObject {
  
  /**
    * List of action names associated with the rule threshold.
    */
  var actionNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Rule create timestamp.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Description of the rule.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Alert display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Rule name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Query that is used to get the data from the associated source.
    */
  var query: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of alert IDs superseded by this alert. It is used to indicate that this alert is essentially extension of superseded alerts and we found the relationship after creating these alerts.
    */
  var supersededAlerts: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Alert ID superseding this alert. It is used to indicate that superseding alert is essentially extension of this alert and we found the relationship after creating both alerts.
    */
  var supersedingAlert: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Alert threshold is for example “COUNT \> 5”.
    */
  var threshold: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The trigger sources for this rule. * GMAIL_EVENTS * DEVICE_EVENTS * USER_EVENTS
    */
  var triggerSource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timestamp of the last update to the rule.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Rule window size. Possible values are 1 hour or 24 hours.
    */
  var windowSize: js.UndefOr[String | Null] = js.undefined
}
object SchemaActivityRule {
  
  inline def apply(): SchemaActivityRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivityRule]
  }
  
  extension [Self <: SchemaActivityRule](x: Self) {
    
    inline def setActionNames(value: js.Array[String]): Self = StObject.set(x, "actionNames", value.asInstanceOf[js.Any])
    
    inline def setActionNamesNull: Self = StObject.set(x, "actionNames", null)
    
    inline def setActionNamesUndefined: Self = StObject.set(x, "actionNames", js.undefined)
    
    inline def setActionNamesVarargs(value: String*): Self = StObject.set(x, "actionNames", js.Array(value*))
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryNull: Self = StObject.set(x, "query", null)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setSupersededAlerts(value: js.Array[String]): Self = StObject.set(x, "supersededAlerts", value.asInstanceOf[js.Any])
    
    inline def setSupersededAlertsNull: Self = StObject.set(x, "supersededAlerts", null)
    
    inline def setSupersededAlertsUndefined: Self = StObject.set(x, "supersededAlerts", js.undefined)
    
    inline def setSupersededAlertsVarargs(value: String*): Self = StObject.set(x, "supersededAlerts", js.Array(value*))
    
    inline def setSupersedingAlert(value: String): Self = StObject.set(x, "supersedingAlert", value.asInstanceOf[js.Any])
    
    inline def setSupersedingAlertNull: Self = StObject.set(x, "supersedingAlert", null)
    
    inline def setSupersedingAlertUndefined: Self = StObject.set(x, "supersedingAlert", js.undefined)
    
    inline def setThreshold(value: String): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdNull: Self = StObject.set(x, "threshold", null)
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    inline def setTriggerSource(value: String): Self = StObject.set(x, "triggerSource", value.asInstanceOf[js.Any])
    
    inline def setTriggerSourceNull: Self = StObject.set(x, "triggerSource", null)
    
    inline def setTriggerSourceUndefined: Self = StObject.set(x, "triggerSource", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setWindowSize(value: String): Self = StObject.set(x, "windowSize", value.asInstanceOf[js.Any])
    
    inline def setWindowSizeNull: Self = StObject.set(x, "windowSize", null)
    
    inline def setWindowSizeUndefined: Self = StObject.set(x, "windowSize", js.undefined)
  }
}
