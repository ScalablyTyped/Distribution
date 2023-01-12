package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitationClassification
  extends StObject
     with BackboneElement {
  
  /**
    * The specific classification value.
    */
  var classifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The kind of classifier (e.g. publication type, keyword).
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object CitationClassification {
  
  inline def apply(): CitationClassification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CitationClassification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CitationClassification] (val x: Self) extends AnyVal {
    
    inline def setClassifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "classifier", value.asInstanceOf[js.Any])
    
    inline def setClassifierUndefined: Self = StObject.set(x, "classifier", js.undefined)
    
    inline def setClassifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "classifier", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
