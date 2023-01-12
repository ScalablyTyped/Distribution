package typings.fhir.r4Mod

import typings.fhir.fhirStrings.left
import typings.fhir.fhirStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisionPrescriptionLensSpecification
  extends StObject
     with BackboneElement {
  
  var _brand: js.UndefOr[Element] = js.undefined
  
  var _color: js.UndefOr[Element] = js.undefined
  
  var _eye: js.UndefOr[Element] = js.undefined
  
  /**
    * Power adjustment for multifocal lenses measured in dioptres (0.25 units).
    */
  var add: js.UndefOr[Double] = js.undefined
  
  /**
    * The limits are +180 and -180 degrees.
    */
  var axis: js.UndefOr[Double] = js.undefined
  
  /**
    * Back curvature measured in millimetres.
    */
  var backCurve: js.UndefOr[Double] = js.undefined
  
  /**
    * Brand recommendations or restrictions.
    */
  var brand: js.UndefOr[String] = js.undefined
  
  /**
    * Special color or pattern.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Power adjustment for astigmatism measured in dioptres (0.25 units).
    */
  var cylinder: js.UndefOr[Double] = js.undefined
  
  /**
    * Contact lens diameter measured in millimetres.
    */
  var diameter: js.UndefOr[Double] = js.undefined
  
  /**
    * The recommended maximum wear period for the lens.
    */
  var duration: js.UndefOr[Quantity] = js.undefined
  
  /**
    * May also appear as OD (oculus dexter) for the right eye and OS (oculus siniter) for the left eye.
    */
  var eye: right | left
  
  /**
    * Notes for special requirements such as coatings and lens materials.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Contact lens power measured in dioptres (0.25 units).
    */
  var power: js.UndefOr[Double] = js.undefined
  
  /**
    * Allows for adjustment on two axis.
    */
  var prism: js.UndefOr[js.Array[VisionPrescriptionLensSpecificationPrism]] = js.undefined
  
  /**
    * Identifies the type of vision correction product which is required for the patient.
    */
  var product: CodeableConcept
  
  /**
    * The value is negative for near-sighted and positive for far sighted.
    * Often insurance will not cover a lens with power between +75 and -75.
    */
  var sphere: js.UndefOr[Double] = js.undefined
}
object VisionPrescriptionLensSpecification {
  
  inline def apply(eye: right | left, product: CodeableConcept): VisionPrescriptionLensSpecification = {
    val __obj = js.Dynamic.literal(eye = eye.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisionPrescriptionLensSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisionPrescriptionLensSpecification] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: Double): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setBackCurve(value: Double): Self = StObject.set(x, "backCurve", value.asInstanceOf[js.Any])
    
    inline def setBackCurveUndefined: Self = StObject.set(x, "backCurve", js.undefined)
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCylinder(value: Double): Self = StObject.set(x, "cylinder", value.asInstanceOf[js.Any])
    
    inline def setCylinderUndefined: Self = StObject.set(x, "cylinder", js.undefined)
    
    inline def setDiameter(value: Double): Self = StObject.set(x, "diameter", value.asInstanceOf[js.Any])
    
    inline def setDiameterUndefined: Self = StObject.set(x, "diameter", js.undefined)
    
    inline def setDuration(value: Quantity): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEye(value: right | left): Self = StObject.set(x, "eye", value.asInstanceOf[js.Any])
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    inline def setPowerUndefined: Self = StObject.set(x, "power", js.undefined)
    
    inline def setPrism(value: js.Array[VisionPrescriptionLensSpecificationPrism]): Self = StObject.set(x, "prism", value.asInstanceOf[js.Any])
    
    inline def setPrismUndefined: Self = StObject.set(x, "prism", js.undefined)
    
    inline def setPrismVarargs(value: VisionPrescriptionLensSpecificationPrism*): Self = StObject.set(x, "prism", js.Array(value*))
    
    inline def setProduct(value: CodeableConcept): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setSphere(value: Double): Self = StObject.set(x, "sphere", value.asInstanceOf[js.Any])
    
    inline def setSphereUndefined: Self = StObject.set(x, "sphere", js.undefined)
    
    inline def set_brand(value: Element): Self = StObject.set(x, "_brand", value.asInstanceOf[js.Any])
    
    inline def set_brandUndefined: Self = StObject.set(x, "_brand", js.undefined)
    
    inline def set_color(value: Element): Self = StObject.set(x, "_color", value.asInstanceOf[js.Any])
    
    inline def set_colorUndefined: Self = StObject.set(x, "_color", js.undefined)
    
    inline def set_eye(value: Element): Self = StObject.set(x, "_eye", value.asInstanceOf[js.Any])
    
    inline def set_eyeUndefined: Self = StObject.set(x, "_eye", js.undefined)
  }
}
