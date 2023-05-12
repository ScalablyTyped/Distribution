package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionRuleData
  extends StObject
     with BackboneElement {
  
  /**
    * Used when other data selection elements are insufficient.
    */
  var expression: js.UndefOr[Expression] = js.undefined
  
  /**
    * This has a different sense to the .validity.
    */
  var period: js.UndefOr[js.Array[Period]] = js.undefined
  
  /**
    * Explicit FHIR Resource references.
    */
  var resource: js.UndefOr[js.Array[PermissionRuleDataResource]] = js.undefined
  
  /**
    * Note the ConfidentialityCode vocabulary indicates the highest value, thus a security label of "R" then it applies to all resources that are labeled "R" or lower. E.g. for Confidentiality, it's a high water mark. For other kinds of security labels, subsumption logic applies. When the purpose of use tag is on the data, access request purpose of use shall not conflict.
    */
  var security: js.UndefOr[js.Array[Coding]] = js.undefined
}
object PermissionRuleData {
  
  inline def apply(): PermissionRuleData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionRuleData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PermissionRuleData] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setPeriod(value: js.Array[Period]): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPeriodVarargs(value: Period*): Self = StObject.set(x, "period", js.Array(value*))
    
    inline def setResource(value: js.Array[PermissionRuleDataResource]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResourceVarargs(value: PermissionRuleDataResource*): Self = StObject.set(x, "resource", js.Array(value*))
    
    inline def setSecurity(value: js.Array[Coding]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def setSecurityVarargs(value: Coding*): Self = StObject.set(x, "security", js.Array(value*))
  }
}
