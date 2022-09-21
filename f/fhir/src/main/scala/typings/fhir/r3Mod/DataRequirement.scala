package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRequirement
  extends StObject
     with Element {
  
  var _mustSupport: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _profile: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data.
    */
  var codeFilter: js.UndefOr[js.Array[DataRequirementCodeFilter]] = js.undefined
  
  /**
    * Date filters specify additional constraints on the data in terms of the applicable date range for specific elements.
    */
  var dateFilter: js.UndefOr[js.Array[DataRequirementDateFilter]] = js.undefined
  
  /**
    * Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available. Note that the value for this element can be a path to allow references to nested elements. In that case, all the elements along the path must be supported.
    */
  var mustSupport: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The profile of the required data, specified as the uri of the profile definition.
    */
  var profile: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The type of the required data, specified as the type name of a resource. For profiles, this value is set to the type of the base resource of the profile.
    */
  var `type`: String
}
object DataRequirement {
  
  inline def apply(`type`: String): DataRequirement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRequirement]
  }
  
  extension [Self <: DataRequirement](x: Self) {
    
    inline def setCodeFilter(value: js.Array[DataRequirementCodeFilter]): Self = StObject.set(x, "codeFilter", value.asInstanceOf[js.Any])
    
    inline def setCodeFilterUndefined: Self = StObject.set(x, "codeFilter", js.undefined)
    
    inline def setCodeFilterVarargs(value: DataRequirementCodeFilter*): Self = StObject.set(x, "codeFilter", js.Array(value*))
    
    inline def setDateFilter(value: js.Array[DataRequirementDateFilter]): Self = StObject.set(x, "dateFilter", value.asInstanceOf[js.Any])
    
    inline def setDateFilterUndefined: Self = StObject.set(x, "dateFilter", js.undefined)
    
    inline def setDateFilterVarargs(value: DataRequirementDateFilter*): Self = StObject.set(x, "dateFilter", js.Array(value*))
    
    inline def setMustSupport(value: js.Array[String]): Self = StObject.set(x, "mustSupport", value.asInstanceOf[js.Any])
    
    inline def setMustSupportUndefined: Self = StObject.set(x, "mustSupport", js.undefined)
    
    inline def setMustSupportVarargs(value: String*): Self = StObject.set(x, "mustSupport", js.Array(value*))
    
    inline def setProfile(value: js.Array[String]): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setProfileVarargs(value: String*): Self = StObject.set(x, "profile", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_mustSupport(value: js.Array[Element]): Self = StObject.set(x, "_mustSupport", value.asInstanceOf[js.Any])
    
    inline def set_mustSupportUndefined: Self = StObject.set(x, "_mustSupport", js.undefined)
    
    inline def set_mustSupportVarargs(value: Element*): Self = StObject.set(x, "_mustSupport", js.Array(value*))
    
    inline def set_profile(value: js.Array[Element]): Self = StObject.set(x, "_profile", value.asInstanceOf[js.Any])
    
    inline def set_profileUndefined: Self = StObject.set(x, "_profile", js.undefined)
    
    inline def set_profileVarargs(value: Element*): Self = StObject.set(x, "_profile", js.Array(value*))
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
