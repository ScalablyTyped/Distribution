package typings.fhir.r4bMod

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
    * Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data. Each code filter defines an additional constraint on the data, i.e. code filters are AND'ed, not OR'ed.
    */
  var codeFilter: js.UndefOr[js.Array[DataRequirementCodeFilter]] = js.undefined
  
  /**
    * Date filters specify additional constraints on the data in terms of the applicable date range for specific elements. Each date filter specifies an additional constraint on the data, i.e. date filters are AND'ed, not OR'ed.
    */
  var dateFilter: js.UndefOr[js.Array[DataRequirementDateFilter]] = js.undefined
  
  /**
    * This element can be used in combination with the sort element to specify quota requirements such as "the most recent 5" or "the highest 5".
    */
  var limit: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available.
    * The value of mustSupport SHALL be a FHIRPath resolveable on the type of the DataRequirement. The path SHALL consist only of identifiers, constant indexers, and .resolve() (see the [Simple FHIRPath Profile](fhirpath.html#simple) for full details).
    */
  var mustSupport: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The profile of the required data, specified as the uri of the profile definition.
    */
  var profile: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * This element can be used in combination with the sort element to specify quota requirements such as "the most recent 5" or "the highest 5". When multiple sorts are specified, they are applied in the order they appear in the resource.
    */
  var sort: js.UndefOr[js.Array[DataRequirementSort]] = js.undefined
  
  /**
    * The subject of a data requirement is critical, as the data being specified is determined with respect to a particular subject. This corresponds roughly to the notion of a Compartment in that it limits what data is available based on its relationship to the subject. In CQL, this corresponds to the context declaration.
    */
  var subjectCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The subject of a data requirement is critical, as the data being specified is determined with respect to a particular subject. This corresponds roughly to the notion of a Compartment in that it limits what data is available based on its relationship to the subject. In CQL, this corresponds to the context declaration.
    */
  var subjectReference: js.UndefOr[Reference] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataRequirement] (val x: Self) extends AnyVal {
    
    inline def setCodeFilter(value: js.Array[DataRequirementCodeFilter]): Self = StObject.set(x, "codeFilter", value.asInstanceOf[js.Any])
    
    inline def setCodeFilterUndefined: Self = StObject.set(x, "codeFilter", js.undefined)
    
    inline def setCodeFilterVarargs(value: DataRequirementCodeFilter*): Self = StObject.set(x, "codeFilter", js.Array(value*))
    
    inline def setDateFilter(value: js.Array[DataRequirementDateFilter]): Self = StObject.set(x, "dateFilter", value.asInstanceOf[js.Any])
    
    inline def setDateFilterUndefined: Self = StObject.set(x, "dateFilter", js.undefined)
    
    inline def setDateFilterVarargs(value: DataRequirementDateFilter*): Self = StObject.set(x, "dateFilter", js.Array(value*))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMustSupport(value: js.Array[String]): Self = StObject.set(x, "mustSupport", value.asInstanceOf[js.Any])
    
    inline def setMustSupportUndefined: Self = StObject.set(x, "mustSupport", js.undefined)
    
    inline def setMustSupportVarargs(value: String*): Self = StObject.set(x, "mustSupport", js.Array(value*))
    
    inline def setProfile(value: js.Array[String]): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setProfileVarargs(value: String*): Self = StObject.set(x, "profile", js.Array(value*))
    
    inline def setSort(value: js.Array[DataRequirementSort]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: DataRequirementSort*): Self = StObject.set(x, "sort", js.Array(value*))
    
    inline def setSubjectCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "subjectCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setSubjectCodeableConceptUndefined: Self = StObject.set(x, "subjectCodeableConcept", js.undefined)
    
    inline def setSubjectReference(value: Reference): Self = StObject.set(x, "subjectReference", value.asInstanceOf[js.Any])
    
    inline def setSubjectReferenceUndefined: Self = StObject.set(x, "subjectReference", js.undefined)
    
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
