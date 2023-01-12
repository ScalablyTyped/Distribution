package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DowngradeBillingPlanInformation extends StObject {
  
  var downgradeEventType: js.UndefOr[String] = js.undefined
  
  /**
    * An object used to identify the features and attributes of the account being created.
    */
  var planInformation: js.UndefOr[
    /* An object used to identify the features and attributes of the account being created. */ PlanInformation
  ] = js.undefined
}
object DowngradeBillingPlanInformation {
  
  inline def apply(): DowngradeBillingPlanInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DowngradeBillingPlanInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DowngradeBillingPlanInformation] (val x: Self) extends AnyVal {
    
    inline def setDowngradeEventType(value: String): Self = StObject.set(x, "downgradeEventType", value.asInstanceOf[js.Any])
    
    inline def setDowngradeEventTypeUndefined: Self = StObject.set(x, "downgradeEventType", js.undefined)
    
    inline def setPlanInformation(
      value: /* An object used to identify the features and attributes of the account being created. */ PlanInformation
    ): Self = StObject.set(x, "planInformation", value.asInstanceOf[js.Any])
    
    inline def setPlanInformationUndefined: Self = StObject.set(x, "planInformation", js.undefined)
  }
}
