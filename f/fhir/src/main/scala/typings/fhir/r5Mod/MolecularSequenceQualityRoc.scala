package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MolecularSequenceQualityRoc
  extends StObject
     with BackboneElement {
  
  /**
    * Calculated fScore if the GQ score threshold was set to "score" field value.
    */
  var fMeasure: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The number of false negatives if the GQ score threshold was set to "score" field value.
    */
  var numFN: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The number of false positives if the GQ score threshold was set to "score" field value.
    */
  var numFP: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The number of true positives if the GQ score threshold was set to "score" field value.
    */
  var numTP: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Calculated precision if the GQ score threshold was set to "score" field value.
    */
  var precision: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Invidual data point representing the GQ (genotype quality) score threshold.
    */
  var score: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Calculated sensitivity if the GQ score threshold was set to "score" field value.
    */
  var sensitivity: js.UndefOr[js.Array[Double]] = js.undefined
}
object MolecularSequenceQualityRoc {
  
  inline def apply(): MolecularSequenceQualityRoc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MolecularSequenceQualityRoc]
  }
  
  extension [Self <: MolecularSequenceQualityRoc](x: Self) {
    
    inline def setFMeasure(value: js.Array[Double]): Self = StObject.set(x, "fMeasure", value.asInstanceOf[js.Any])
    
    inline def setFMeasureUndefined: Self = StObject.set(x, "fMeasure", js.undefined)
    
    inline def setFMeasureVarargs(value: Double*): Self = StObject.set(x, "fMeasure", js.Array(value*))
    
    inline def setNumFN(value: js.Array[Double]): Self = StObject.set(x, "numFN", value.asInstanceOf[js.Any])
    
    inline def setNumFNUndefined: Self = StObject.set(x, "numFN", js.undefined)
    
    inline def setNumFNVarargs(value: Double*): Self = StObject.set(x, "numFN", js.Array(value*))
    
    inline def setNumFP(value: js.Array[Double]): Self = StObject.set(x, "numFP", value.asInstanceOf[js.Any])
    
    inline def setNumFPUndefined: Self = StObject.set(x, "numFP", js.undefined)
    
    inline def setNumFPVarargs(value: Double*): Self = StObject.set(x, "numFP", js.Array(value*))
    
    inline def setNumTP(value: js.Array[Double]): Self = StObject.set(x, "numTP", value.asInstanceOf[js.Any])
    
    inline def setNumTPUndefined: Self = StObject.set(x, "numTP", js.undefined)
    
    inline def setNumTPVarargs(value: Double*): Self = StObject.set(x, "numTP", js.Array(value*))
    
    inline def setPrecision(value: js.Array[Double]): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setPrecisionVarargs(value: Double*): Self = StObject.set(x, "precision", js.Array(value*))
    
    inline def setScore(value: js.Array[Double]): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setScoreVarargs(value: Double*): Self = StObject.set(x, "score", js.Array(value*))
    
    inline def setSensitivity(value: js.Array[Double]): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
    
    inline def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
    
    inline def setSensitivityVarargs(value: Double*): Self = StObject.set(x, "sensitivity", js.Array(value*))
  }
}
