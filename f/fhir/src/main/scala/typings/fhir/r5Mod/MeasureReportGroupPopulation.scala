package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureReportGroupPopulation
  extends StObject
     with BackboneElement {
  
  var _linkId: js.UndefOr[Element] = js.undefined
  
  /**
    * The type of the population.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The number of members of the population.
    */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * The population from the Measure that corresponds to this population in the MeasureReport resource.
    */
  var linkId: js.UndefOr[String] = js.undefined
  
  /**
    * This element SHALL NOT be used in with subjectResults, either systems provide results as a List of MeasureReport, or as references to individual MeasureReports. Note that using this element introduces a constraint on the size of the subject-list MeasureReport; implementations would be free to return a TOO-COSTLY response if a request is made for a subject-list report with too many subjects.
    */
  var subjectReport: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This element refers to a List of individual level MeasureReport resources, one for each subject in this population.
    */
  var subjectResults: js.UndefOr[Reference] = js.undefined
  
  /**
    * Note that this element can only be used for summary and subject-list reports where the basis is of the same type as the populations (e.g. a Patient-based measure, rather than an Encounter-based measure). In addition, the referenced Group resource SHALL be an actual (as opposed to a definitional) group.
    */
  var subjects: js.UndefOr[Reference] = js.undefined
}
object MeasureReportGroupPopulation {
  
  inline def apply(): MeasureReportGroupPopulation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureReportGroupPopulation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeasureReportGroupPopulation] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setLinkId(value: String): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "linkId", js.undefined)
    
    inline def setSubjectReport(value: js.Array[Reference]): Self = StObject.set(x, "subjectReport", value.asInstanceOf[js.Any])
    
    inline def setSubjectReportUndefined: Self = StObject.set(x, "subjectReport", js.undefined)
    
    inline def setSubjectReportVarargs(value: Reference*): Self = StObject.set(x, "subjectReport", js.Array(value*))
    
    inline def setSubjectResults(value: Reference): Self = StObject.set(x, "subjectResults", value.asInstanceOf[js.Any])
    
    inline def setSubjectResultsUndefined: Self = StObject.set(x, "subjectResults", js.undefined)
    
    inline def setSubjects(value: Reference): Self = StObject.set(x, "subjects", value.asInstanceOf[js.Any])
    
    inline def setSubjectsUndefined: Self = StObject.set(x, "subjects", js.undefined)
    
    inline def set_linkId(value: Element): Self = StObject.set(x, "_linkId", value.asInstanceOf[js.Any])
    
    inline def set_linkIdUndefined: Self = StObject.set(x, "_linkId", js.undefined)
  }
}
