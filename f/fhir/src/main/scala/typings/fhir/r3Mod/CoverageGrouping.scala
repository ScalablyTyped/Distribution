package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageGrouping
  extends StObject
     with BackboneElement {
  
  var _class: js.UndefOr[Element] = js.undefined
  
  var _classDisplay: js.UndefOr[Element] = js.undefined
  
  var _group: js.UndefOr[Element] = js.undefined
  
  var _groupDisplay: js.UndefOr[Element] = js.undefined
  
  var _plan: js.UndefOr[Element] = js.undefined
  
  var _planDisplay: js.UndefOr[Element] = js.undefined
  
  var _subClass: js.UndefOr[Element] = js.undefined
  
  var _subClassDisplay: js.UndefOr[Element] = js.undefined
  
  var _subGroup: js.UndefOr[Element] = js.undefined
  
  var _subGroupDisplay: js.UndefOr[Element] = js.undefined
  
  var _subPlan: js.UndefOr[Element] = js.undefined
  
  var _subPlanDisplay: js.UndefOr[Element] = js.undefined
  
  /**
    * Identifies a style or collective of coverage issues by the underwriter, for example may be used to identify a class of coverage such as a level of deductables or co-payment.
    */
  var `class`: js.UndefOr[String] = js.undefined
  
  /**
    * A short description for the class.
    */
  var classDisplay: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies a style or collective of coverage issued by the underwriter, for example may be used to identify an employer group. May also be referred to as a Policy or Group ID.
    */
  var group: js.UndefOr[String] = js.undefined
  
  /**
    * A short description for the group.
    */
  var groupDisplay: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies a style or collective of coverage issued by the underwriter, for example may be used to identify a collection of benefits provided to employees. May be referred to as a Section or Division ID.
    */
  var plan: js.UndefOr[String] = js.undefined
  
  /**
    * A short description for the plan.
    */
  var planDisplay: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies a sub-style or sub-collective of coverage issues by the underwriter, for example may be used to identify a subclass of coverage such as a sub-level of deductables or co-payment.
    */
  var subClass: js.UndefOr[String] = js.undefined
  
  /**
    * A short description for the subclass.
    */
  var subClassDisplay: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies a style or collective of coverage issued by the underwriter, for example may be used to identify a subset of an employer group.
    */
  var subGroup: js.UndefOr[String] = js.undefined
  
  /**
    * A short description for the subgroup.
    */
  var subGroupDisplay: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies a sub-style or sub-collective of coverage issued by the underwriter, for example may be used to identify a subset of a collection of benefits provided to employees.
    */
  var subPlan: js.UndefOr[String] = js.undefined
  
  /**
    * A short description for the subplan.
    */
  var subPlanDisplay: js.UndefOr[String] = js.undefined
}
object CoverageGrouping {
  
  inline def apply(): CoverageGrouping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageGrouping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageGrouping] (val x: Self) extends AnyVal {
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassDisplay(value: String): Self = StObject.set(x, "classDisplay", value.asInstanceOf[js.Any])
    
    inline def setClassDisplayUndefined: Self = StObject.set(x, "classDisplay", js.undefined)
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupDisplay(value: String): Self = StObject.set(x, "groupDisplay", value.asInstanceOf[js.Any])
    
    inline def setGroupDisplayUndefined: Self = StObject.set(x, "groupDisplay", js.undefined)
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setPlanDisplay(value: String): Self = StObject.set(x, "planDisplay", value.asInstanceOf[js.Any])
    
    inline def setPlanDisplayUndefined: Self = StObject.set(x, "planDisplay", js.undefined)
    
    inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    inline def setSubClass(value: String): Self = StObject.set(x, "subClass", value.asInstanceOf[js.Any])
    
    inline def setSubClassDisplay(value: String): Self = StObject.set(x, "subClassDisplay", value.asInstanceOf[js.Any])
    
    inline def setSubClassDisplayUndefined: Self = StObject.set(x, "subClassDisplay", js.undefined)
    
    inline def setSubClassUndefined: Self = StObject.set(x, "subClass", js.undefined)
    
    inline def setSubGroup(value: String): Self = StObject.set(x, "subGroup", value.asInstanceOf[js.Any])
    
    inline def setSubGroupDisplay(value: String): Self = StObject.set(x, "subGroupDisplay", value.asInstanceOf[js.Any])
    
    inline def setSubGroupDisplayUndefined: Self = StObject.set(x, "subGroupDisplay", js.undefined)
    
    inline def setSubGroupUndefined: Self = StObject.set(x, "subGroup", js.undefined)
    
    inline def setSubPlan(value: String): Self = StObject.set(x, "subPlan", value.asInstanceOf[js.Any])
    
    inline def setSubPlanDisplay(value: String): Self = StObject.set(x, "subPlanDisplay", value.asInstanceOf[js.Any])
    
    inline def setSubPlanDisplayUndefined: Self = StObject.set(x, "subPlanDisplay", js.undefined)
    
    inline def setSubPlanUndefined: Self = StObject.set(x, "subPlan", js.undefined)
    
    inline def set_class(value: Element): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
    
    inline def set_classDisplay(value: Element): Self = StObject.set(x, "_classDisplay", value.asInstanceOf[js.Any])
    
    inline def set_classDisplayUndefined: Self = StObject.set(x, "_classDisplay", js.undefined)
    
    inline def set_classUndefined: Self = StObject.set(x, "_class", js.undefined)
    
    inline def set_group(value: Element): Self = StObject.set(x, "_group", value.asInstanceOf[js.Any])
    
    inline def set_groupDisplay(value: Element): Self = StObject.set(x, "_groupDisplay", value.asInstanceOf[js.Any])
    
    inline def set_groupDisplayUndefined: Self = StObject.set(x, "_groupDisplay", js.undefined)
    
    inline def set_groupUndefined: Self = StObject.set(x, "_group", js.undefined)
    
    inline def set_plan(value: Element): Self = StObject.set(x, "_plan", value.asInstanceOf[js.Any])
    
    inline def set_planDisplay(value: Element): Self = StObject.set(x, "_planDisplay", value.asInstanceOf[js.Any])
    
    inline def set_planDisplayUndefined: Self = StObject.set(x, "_planDisplay", js.undefined)
    
    inline def set_planUndefined: Self = StObject.set(x, "_plan", js.undefined)
    
    inline def set_subClass(value: Element): Self = StObject.set(x, "_subClass", value.asInstanceOf[js.Any])
    
    inline def set_subClassDisplay(value: Element): Self = StObject.set(x, "_subClassDisplay", value.asInstanceOf[js.Any])
    
    inline def set_subClassDisplayUndefined: Self = StObject.set(x, "_subClassDisplay", js.undefined)
    
    inline def set_subClassUndefined: Self = StObject.set(x, "_subClass", js.undefined)
    
    inline def set_subGroup(value: Element): Self = StObject.set(x, "_subGroup", value.asInstanceOf[js.Any])
    
    inline def set_subGroupDisplay(value: Element): Self = StObject.set(x, "_subGroupDisplay", value.asInstanceOf[js.Any])
    
    inline def set_subGroupDisplayUndefined: Self = StObject.set(x, "_subGroupDisplay", js.undefined)
    
    inline def set_subGroupUndefined: Self = StObject.set(x, "_subGroup", js.undefined)
    
    inline def set_subPlan(value: Element): Self = StObject.set(x, "_subPlan", value.asInstanceOf[js.Any])
    
    inline def set_subPlanDisplay(value: Element): Self = StObject.set(x, "_subPlanDisplay", value.asInstanceOf[js.Any])
    
    inline def set_subPlanDisplayUndefined: Self = StObject.set(x, "_subPlanDisplay", js.undefined)
    
    inline def set_subPlanUndefined: Self = StObject.set(x, "_subPlan", js.undefined)
  }
}
