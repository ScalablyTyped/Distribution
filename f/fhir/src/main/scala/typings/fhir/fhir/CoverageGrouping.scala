package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional coverage classifications
  */
@js.native
trait CoverageGrouping extends BackboneElement {
  
  /**
    * Contains extended information for property 'class'.
    */
  var _class: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'classDisplay'.
    */
  var _classDisplay: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'group'.
    */
  var _group: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'groupDisplay'.
    */
  var _groupDisplay: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'plan'.
    */
  var _plan: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'planDisplay'.
    */
  var _planDisplay: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'subClass'.
    */
  var _subClass: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'subClassDisplay'.
    */
  var _subClassDisplay: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'subGroup'.
    */
  var _subGroup: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'subGroupDisplay'.
    */
  var _subGroupDisplay: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'subPlan'.
    */
  var _subPlan: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'subPlanDisplay'.
    */
  var _subPlanDisplay: js.UndefOr[Element] = js.native
  
  /**
    * An identifier for the class
    */
  var `class`: js.UndefOr[String] = js.native
  
  /**
    * Display text for the class
    */
  var classDisplay: js.UndefOr[String] = js.native
  
  /**
    * An identifier for the group
    */
  var group: js.UndefOr[String] = js.native
  
  /**
    * Display text for an identifier for the group
    */
  var groupDisplay: js.UndefOr[String] = js.native
  
  /**
    * An identifier for the plan
    */
  var plan: js.UndefOr[String] = js.native
  
  /**
    * Display text for the plan
    */
  var planDisplay: js.UndefOr[String] = js.native
  
  /**
    * An identifier for the subsection of the class
    */
  var subClass: js.UndefOr[String] = js.native
  
  /**
    * Display text for the subsection of the subclass
    */
  var subClassDisplay: js.UndefOr[String] = js.native
  
  /**
    * An identifier for the subsection of the group
    */
  var subGroup: js.UndefOr[String] = js.native
  
  /**
    * Display text for the subsection of the group
    */
  var subGroupDisplay: js.UndefOr[String] = js.native
  
  /**
    * An identifier for the subsection of the plan
    */
  var subPlan: js.UndefOr[String] = js.native
  
  /**
    * Display text for the subsection of the plan
    */
  var subPlanDisplay: js.UndefOr[String] = js.native
}
object CoverageGrouping {
  
  @scala.inline
  def apply(): CoverageGrouping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageGrouping]
  }
  
  @scala.inline
  implicit class CoverageGroupingMutableBuilder[Self <: CoverageGrouping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassDisplay(value: String): Self = StObject.set(x, "classDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassDisplayUndefined: Self = StObject.set(x, "classDisplay", js.undefined)
    
    @scala.inline
    def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupDisplay(value: String): Self = StObject.set(x, "groupDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupDisplayUndefined: Self = StObject.set(x, "groupDisplay", js.undefined)
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanDisplay(value: String): Self = StObject.set(x, "planDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanDisplayUndefined: Self = StObject.set(x, "planDisplay", js.undefined)
    
    @scala.inline
    def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    @scala.inline
    def setSubClass(value: String): Self = StObject.set(x, "subClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubClassDisplay(value: String): Self = StObject.set(x, "subClassDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubClassDisplayUndefined: Self = StObject.set(x, "subClassDisplay", js.undefined)
    
    @scala.inline
    def setSubClassUndefined: Self = StObject.set(x, "subClass", js.undefined)
    
    @scala.inline
    def setSubGroup(value: String): Self = StObject.set(x, "subGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubGroupDisplay(value: String): Self = StObject.set(x, "subGroupDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubGroupDisplayUndefined: Self = StObject.set(x, "subGroupDisplay", js.undefined)
    
    @scala.inline
    def setSubGroupUndefined: Self = StObject.set(x, "subGroup", js.undefined)
    
    @scala.inline
    def setSubPlan(value: String): Self = StObject.set(x, "subPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubPlanDisplay(value: String): Self = StObject.set(x, "subPlanDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubPlanDisplayUndefined: Self = StObject.set(x, "subPlanDisplay", js.undefined)
    
    @scala.inline
    def setSubPlanUndefined: Self = StObject.set(x, "subPlan", js.undefined)
    
    @scala.inline
    def set_class(value: Element): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_classDisplay(value: Element): Self = StObject.set(x, "_classDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_classDisplayUndefined: Self = StObject.set(x, "_classDisplay", js.undefined)
    
    @scala.inline
    def set_classUndefined: Self = StObject.set(x, "_class", js.undefined)
    
    @scala.inline
    def set_group(value: Element): Self = StObject.set(x, "_group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_groupDisplay(value: Element): Self = StObject.set(x, "_groupDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_groupDisplayUndefined: Self = StObject.set(x, "_groupDisplay", js.undefined)
    
    @scala.inline
    def set_groupUndefined: Self = StObject.set(x, "_group", js.undefined)
    
    @scala.inline
    def set_plan(value: Element): Self = StObject.set(x, "_plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_planDisplay(value: Element): Self = StObject.set(x, "_planDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_planDisplayUndefined: Self = StObject.set(x, "_planDisplay", js.undefined)
    
    @scala.inline
    def set_planUndefined: Self = StObject.set(x, "_plan", js.undefined)
    
    @scala.inline
    def set_subClass(value: Element): Self = StObject.set(x, "_subClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_subClassDisplay(value: Element): Self = StObject.set(x, "_subClassDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_subClassDisplayUndefined: Self = StObject.set(x, "_subClassDisplay", js.undefined)
    
    @scala.inline
    def set_subClassUndefined: Self = StObject.set(x, "_subClass", js.undefined)
    
    @scala.inline
    def set_subGroup(value: Element): Self = StObject.set(x, "_subGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_subGroupDisplay(value: Element): Self = StObject.set(x, "_subGroupDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_subGroupDisplayUndefined: Self = StObject.set(x, "_subGroupDisplay", js.undefined)
    
    @scala.inline
    def set_subGroupUndefined: Self = StObject.set(x, "_subGroup", js.undefined)
    
    @scala.inline
    def set_subPlan(value: Element): Self = StObject.set(x, "_subPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_subPlanDisplay(value: Element): Self = StObject.set(x, "_subPlanDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_subPlanDisplayUndefined: Self = StObject.set(x, "_subPlanDisplay", js.undefined)
    
    @scala.inline
    def set_subPlanUndefined: Self = StObject.set(x, "_subPlan", js.undefined)
  }
}
