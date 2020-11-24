package typings.fhir.fhir

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
  implicit class CoverageGroupingOps[Self <: CoverageGrouping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_class(value: Element): Self = this.set("_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_class: Self = this.set("_class", js.undefined)
    
    @scala.inline
    def set_classDisplay(value: Element): Self = this.set("_classDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_classDisplay: Self = this.set("_classDisplay", js.undefined)
    
    @scala.inline
    def set_group(value: Element): Self = this.set("_group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_group: Self = this.set("_group", js.undefined)
    
    @scala.inline
    def set_groupDisplay(value: Element): Self = this.set("_groupDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_groupDisplay: Self = this.set("_groupDisplay", js.undefined)
    
    @scala.inline
    def set_plan(value: Element): Self = this.set("_plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_plan: Self = this.set("_plan", js.undefined)
    
    @scala.inline
    def set_planDisplay(value: Element): Self = this.set("_planDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_planDisplay: Self = this.set("_planDisplay", js.undefined)
    
    @scala.inline
    def set_subClass(value: Element): Self = this.set("_subClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_subClass: Self = this.set("_subClass", js.undefined)
    
    @scala.inline
    def set_subClassDisplay(value: Element): Self = this.set("_subClassDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_subClassDisplay: Self = this.set("_subClassDisplay", js.undefined)
    
    @scala.inline
    def set_subGroup(value: Element): Self = this.set("_subGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_subGroup: Self = this.set("_subGroup", js.undefined)
    
    @scala.inline
    def set_subGroupDisplay(value: Element): Self = this.set("_subGroupDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_subGroupDisplay: Self = this.set("_subGroupDisplay", js.undefined)
    
    @scala.inline
    def set_subPlan(value: Element): Self = this.set("_subPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_subPlan: Self = this.set("_subPlan", js.undefined)
    
    @scala.inline
    def set_subPlanDisplay(value: Element): Self = this.set("_subPlanDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_subPlanDisplay: Self = this.set("_subPlanDisplay", js.undefined)
    
    @scala.inline
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    
    @scala.inline
    def setClassDisplay(value: String): Self = this.set("classDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassDisplay: Self = this.set("classDisplay", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setGroupDisplay(value: String): Self = this.set("groupDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupDisplay: Self = this.set("groupDisplay", js.undefined)
    
    @scala.inline
    def setPlan(value: String): Self = this.set("plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlan: Self = this.set("plan", js.undefined)
    
    @scala.inline
    def setPlanDisplay(value: String): Self = this.set("planDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanDisplay: Self = this.set("planDisplay", js.undefined)
    
    @scala.inline
    def setSubClass(value: String): Self = this.set("subClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubClass: Self = this.set("subClass", js.undefined)
    
    @scala.inline
    def setSubClassDisplay(value: String): Self = this.set("subClassDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubClassDisplay: Self = this.set("subClassDisplay", js.undefined)
    
    @scala.inline
    def setSubGroup(value: String): Self = this.set("subGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubGroup: Self = this.set("subGroup", js.undefined)
    
    @scala.inline
    def setSubGroupDisplay(value: String): Self = this.set("subGroupDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubGroupDisplay: Self = this.set("subGroupDisplay", js.undefined)
    
    @scala.inline
    def setSubPlan(value: String): Self = this.set("subPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubPlan: Self = this.set("subPlan", js.undefined)
    
    @scala.inline
    def setSubPlanDisplay(value: String): Self = this.set("subPlanDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubPlanDisplay: Self = this.set("subPlanDisplay", js.undefined)
  }
}
