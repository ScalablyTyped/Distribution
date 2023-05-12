package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureReportGroup
  extends StObject
     with BackboneElement {
  
  var _linkId: js.UndefOr[Element] = js.undefined
  
  var _measureScoreDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * The meaning of the population group as defined in the measure definition.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The group from the Measure that corresponds to this group in the MeasureReport resource.
    */
  var linkId: js.UndefOr[String] = js.undefined
  
  /**
    * The measure score for this population group, calculated as appropriate for the measure type and scoring method, and based on the contents of the populations defined in the group.
    */
  var measureScoreCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The measure score for this population group, calculated as appropriate for the measure type and scoring method, and based on the contents of the populations defined in the group.
    */
  var measureScoreDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The measure score for this population group, calculated as appropriate for the measure type and scoring method, and based on the contents of the populations defined in the group.
    */
  var measureScoreDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * The measure score for this population group, calculated as appropriate for the measure type and scoring method, and based on the contents of the populations defined in the group.
    */
  var measureScorePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The measure score for this population group, calculated as appropriate for the measure type and scoring method, and based on the contents of the populations defined in the group.
    */
  var measureScoreQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The measure score for this population group, calculated as appropriate for the measure type and scoring method, and based on the contents of the populations defined in the group.
    */
  var measureScoreRange: js.UndefOr[Range] = js.undefined
  
  /**
    * The populations that make up the population group, one for each type of population appropriate for the measure.
    */
  var population: js.UndefOr[js.Array[MeasureReportGroupPopulation]] = js.undefined
  
  /**
    * When a measure includes multiple stratifiers, there will be a stratifier group for each stratifier defined by the measure.
    */
  var stratifier: js.UndefOr[js.Array[MeasureReportGroupStratifier]] = js.undefined
  
  /**
    * Optional subject identifying the individual or individuals the report is for.
    */
  var subject: js.UndefOr[Reference] = js.undefined
}
object MeasureReportGroup {
  
  inline def apply(): MeasureReportGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureReportGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeasureReportGroup] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setLinkId(value: String): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "linkId", js.undefined)
    
    inline def setMeasureScoreCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "measureScoreCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setMeasureScoreCodeableConceptUndefined: Self = StObject.set(x, "measureScoreCodeableConcept", js.undefined)
    
    inline def setMeasureScoreDateTime(value: String): Self = StObject.set(x, "measureScoreDateTime", value.asInstanceOf[js.Any])
    
    inline def setMeasureScoreDateTimeUndefined: Self = StObject.set(x, "measureScoreDateTime", js.undefined)
    
    inline def setMeasureScoreDuration(value: Duration): Self = StObject.set(x, "measureScoreDuration", value.asInstanceOf[js.Any])
    
    inline def setMeasureScoreDurationUndefined: Self = StObject.set(x, "measureScoreDuration", js.undefined)
    
    inline def setMeasureScorePeriod(value: Period): Self = StObject.set(x, "measureScorePeriod", value.asInstanceOf[js.Any])
    
    inline def setMeasureScorePeriodUndefined: Self = StObject.set(x, "measureScorePeriod", js.undefined)
    
    inline def setMeasureScoreQuantity(value: Quantity): Self = StObject.set(x, "measureScoreQuantity", value.asInstanceOf[js.Any])
    
    inline def setMeasureScoreQuantityUndefined: Self = StObject.set(x, "measureScoreQuantity", js.undefined)
    
    inline def setMeasureScoreRange(value: Range): Self = StObject.set(x, "measureScoreRange", value.asInstanceOf[js.Any])
    
    inline def setMeasureScoreRangeUndefined: Self = StObject.set(x, "measureScoreRange", js.undefined)
    
    inline def setPopulation(value: js.Array[MeasureReportGroupPopulation]): Self = StObject.set(x, "population", value.asInstanceOf[js.Any])
    
    inline def setPopulationUndefined: Self = StObject.set(x, "population", js.undefined)
    
    inline def setPopulationVarargs(value: MeasureReportGroupPopulation*): Self = StObject.set(x, "population", js.Array(value*))
    
    inline def setStratifier(value: js.Array[MeasureReportGroupStratifier]): Self = StObject.set(x, "stratifier", value.asInstanceOf[js.Any])
    
    inline def setStratifierUndefined: Self = StObject.set(x, "stratifier", js.undefined)
    
    inline def setStratifierVarargs(value: MeasureReportGroupStratifier*): Self = StObject.set(x, "stratifier", js.Array(value*))
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def set_linkId(value: Element): Self = StObject.set(x, "_linkId", value.asInstanceOf[js.Any])
    
    inline def set_linkIdUndefined: Self = StObject.set(x, "_linkId", js.undefined)
    
    inline def set_measureScoreDateTime(value: Element): Self = StObject.set(x, "_measureScoreDateTime", value.asInstanceOf[js.Any])
    
    inline def set_measureScoreDateTimeUndefined: Self = StObject.set(x, "_measureScoreDateTime", js.undefined)
  }
}
