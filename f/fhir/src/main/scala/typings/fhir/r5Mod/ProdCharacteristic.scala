package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProdCharacteristic
  extends StObject
     with BackboneType {
  
  var _color: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _imprint: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _shape: js.UndefOr[Element] = js.undefined
  
  /**
    * Where applicable, the color can be specified An appropriate controlled vocabulary shall be used The term and the term identifier shall be used.
    */
  var color: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Where applicable, the depth can be specified using a numerical value and its unit of measurement The unit of measurement shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be used.
    */
  var depth: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Where applicable, the external diameter can be specified using a numerical value and its unit of measurement The unit of measurement shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be used.
    */
  var externalDiameter: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Where applicable, the height can be specified using a numerical value and its unit of measurement The unit of measurement shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be used.
    */
  var height: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Where applicable, the image can be provided The format of the image attachment shall be specified by regional implementations.
    */
  var image: js.UndefOr[js.Array[Attachment]] = js.undefined
  
  /**
    * Where applicable, the imprint can be specified as text.
    */
  var imprint: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Where applicable, the nominal volume can be specified using a numerical value and its unit of measurement The unit of measurement shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be used.
    */
  var nominalVolume: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Where applicable, the scoring can be specified An appropriate controlled vocabulary shall be used The term and the term identifier shall be used.
    */
  var scoring: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Where applicable, the shape can be specified An appropriate controlled vocabulary shall be used The term and the term identifier shall be used.
    */
  var shape: js.UndefOr[String] = js.undefined
  
  /**
    * Where applicable, the weight can be specified using a numerical value and its unit of measurement The unit of measurement shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be used.
    */
  var weight: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Where applicable, the width can be specified using a numerical value and its unit of measurement The unit of measurement shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be used.
    */
  var width: js.UndefOr[Quantity] = js.undefined
}
object ProdCharacteristic {
  
  inline def apply(): ProdCharacteristic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProdCharacteristic]
  }
  
  extension [Self <: ProdCharacteristic](x: Self) {
    
    inline def setColor(value: js.Array[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setDepth(value: Quantity): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setExternalDiameter(value: Quantity): Self = StObject.set(x, "externalDiameter", value.asInstanceOf[js.Any])
    
    inline def setExternalDiameterUndefined: Self = StObject.set(x, "externalDiameter", js.undefined)
    
    inline def setHeight(value: Quantity): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setImage(value: js.Array[Attachment]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setImageVarargs(value: Attachment*): Self = StObject.set(x, "image", js.Array(value*))
    
    inline def setImprint(value: js.Array[String]): Self = StObject.set(x, "imprint", value.asInstanceOf[js.Any])
    
    inline def setImprintUndefined: Self = StObject.set(x, "imprint", js.undefined)
    
    inline def setImprintVarargs(value: String*): Self = StObject.set(x, "imprint", js.Array(value*))
    
    inline def setNominalVolume(value: Quantity): Self = StObject.set(x, "nominalVolume", value.asInstanceOf[js.Any])
    
    inline def setNominalVolumeUndefined: Self = StObject.set(x, "nominalVolume", js.undefined)
    
    inline def setScoring(value: CodeableConcept): Self = StObject.set(x, "scoring", value.asInstanceOf[js.Any])
    
    inline def setScoringUndefined: Self = StObject.set(x, "scoring", js.undefined)
    
    inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setWeight(value: Quantity): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    
    inline def setWidth(value: Quantity): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def set_color(value: js.Array[Element]): Self = StObject.set(x, "_color", value.asInstanceOf[js.Any])
    
    inline def set_colorUndefined: Self = StObject.set(x, "_color", js.undefined)
    
    inline def set_colorVarargs(value: Element*): Self = StObject.set(x, "_color", js.Array(value*))
    
    inline def set_imprint(value: js.Array[Element]): Self = StObject.set(x, "_imprint", value.asInstanceOf[js.Any])
    
    inline def set_imprintUndefined: Self = StObject.set(x, "_imprint", js.undefined)
    
    inline def set_imprintVarargs(value: Element*): Self = StObject.set(x, "_imprint", js.Array(value*))
    
    inline def set_shape(value: Element): Self = StObject.set(x, "_shape", value.asInstanceOf[js.Any])
    
    inline def set_shapeUndefined: Self = StObject.set(x, "_shape", js.undefined)
  }
}
