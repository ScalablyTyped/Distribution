package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stratification results
  */
@js.native
trait MeasureReportGroupStratifier extends BackboneElement {
  
  /**
    * What stratifier of the group
    */
  var identifier: js.UndefOr[Identifier] = js.native
  
  /**
    * Stratum results, one for each unique value in the stratifier
    */
  var stratum: js.UndefOr[js.Array[MeasureReportGroupStratifierStratum]] = js.native
}
object MeasureReportGroupStratifier {
  
  @scala.inline
  def apply(): MeasureReportGroupStratifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureReportGroupStratifier]
  }
  
  @scala.inline
  implicit class MeasureReportGroupStratifierMutableBuilder[Self <: MeasureReportGroupStratifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setStratum(value: js.Array[MeasureReportGroupStratifierStratum]): Self = StObject.set(x, "stratum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStratumUndefined: Self = StObject.set(x, "stratum", js.undefined)
    
    @scala.inline
    def setStratumVarargs(value: MeasureReportGroupStratifierStratum*): Self = StObject.set(x, "stratum", js.Array(value :_*))
  }
}
