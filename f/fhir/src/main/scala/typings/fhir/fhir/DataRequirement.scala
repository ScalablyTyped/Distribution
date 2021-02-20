package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a required data item
  */
@js.native
trait DataRequirement extends Element {
  
  /**
    * Contains extended information for property 'mustSupport'.
    */
  var _mustSupport: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'profile'.
    */
  var _profile: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  
  /**
    * What codes are expected
    */
  var codeFilter: js.UndefOr[js.Array[DataRequirementCodeFilter]] = js.native
  
  /**
    * What dates/date ranges are expected
    */
  var dateFilter: js.UndefOr[js.Array[DataRequirementDateFilter]] = js.native
  
  /**
    * Indicates that specific structure elements are referenced by the knowledge module
    */
  var mustSupport: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The profile of the required data
    */
  var profile: js.UndefOr[js.Array[uri]] = js.native
  
  /**
    * The type of the required data
    */
  var `type`: code = js.native
}
object DataRequirement {
  
  @scala.inline
  def apply(`type`: code): DataRequirement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRequirement]
  }
  
  @scala.inline
  implicit class DataRequirementMutableBuilder[Self <: DataRequirement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeFilter(value: js.Array[DataRequirementCodeFilter]): Self = StObject.set(x, "codeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeFilterUndefined: Self = StObject.set(x, "codeFilter", js.undefined)
    
    @scala.inline
    def setCodeFilterVarargs(value: DataRequirementCodeFilter*): Self = StObject.set(x, "codeFilter", js.Array(value :_*))
    
    @scala.inline
    def setDateFilter(value: js.Array[DataRequirementDateFilter]): Self = StObject.set(x, "dateFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFilterUndefined: Self = StObject.set(x, "dateFilter", js.undefined)
    
    @scala.inline
    def setDateFilterVarargs(value: DataRequirementDateFilter*): Self = StObject.set(x, "dateFilter", js.Array(value :_*))
    
    @scala.inline
    def setMustSupport(value: js.Array[String]): Self = StObject.set(x, "mustSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMustSupportUndefined: Self = StObject.set(x, "mustSupport", js.undefined)
    
    @scala.inline
    def setMustSupportVarargs(value: String*): Self = StObject.set(x, "mustSupport", js.Array(value :_*))
    
    @scala.inline
    def setProfile(value: js.Array[uri]): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    @scala.inline
    def setProfileVarargs(value: uri*): Self = StObject.set(x, "profile", js.Array(value :_*))
    
    @scala.inline
    def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_mustSupport(value: js.Array[Element]): Self = StObject.set(x, "_mustSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_mustSupportUndefined: Self = StObject.set(x, "_mustSupport", js.undefined)
    
    @scala.inline
    def set_mustSupportVarargs(value: Element*): Self = StObject.set(x, "_mustSupport", js.Array(value :_*))
    
    @scala.inline
    def set_profile(value: js.Array[Element]): Self = StObject.set(x, "_profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_profileUndefined: Self = StObject.set(x, "_profile", js.undefined)
    
    @scala.inline
    def set_profileVarargs(value: Element*): Self = StObject.set(x, "_profile", js.Array(value :_*))
    
    @scala.inline
    def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
