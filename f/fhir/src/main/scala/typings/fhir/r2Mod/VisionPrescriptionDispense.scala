package typings.fhir.r2Mod

import typings.fhir.fhirStrings.down
import typings.fhir.fhirStrings.in
import typings.fhir.fhirStrings.left
import typings.fhir.fhirStrings.out
import typings.fhir.fhirStrings.right
import typings.fhir.fhirStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisionPrescriptionDispense
  extends StObject
     with BackboneElement {
  
  var _base: js.UndefOr[Element] = js.undefined
  
  var _brand: js.UndefOr[Element] = js.undefined
  
  var _color: js.UndefOr[Element] = js.undefined
  
  var _eye: js.UndefOr[Element] = js.undefined
  
  var _notes: js.UndefOr[Element] = js.undefined
  
  /**
    * Power adjustment for multifocal lenses measured in diopters (0.25 units).
    */
  var add: js.UndefOr[Double] = js.undefined
  
  /**
    * Adjustment for astigmatism measured in integer degrees.
    */
  var axis: js.UndefOr[Double] = js.undefined
  
  /**
    * Back curvature measured in millimeters.
    */
  var backCurve: js.UndefOr[Double] = js.undefined
  
  /**
    * The relative base, or reference lens edge, for the prism.
    */
  var base: js.UndefOr[up | down | in | out] = js.undefined
  
  /**
    * Brand recommendations or restrictions.
    */
  var brand: js.UndefOr[String] = js.undefined
  
  /**
    * Special color or pattern.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Power adjustment for astigmatism measured in diopters (0.25 units).
    */
  var cylinder: js.UndefOr[Double] = js.undefined
  
  /**
    * Contact lens diameter measured in millimeters.
    */
  var diameter: js.UndefOr[Double] = js.undefined
  
  /**
    * The recommended maximum wear period for the lens.
    */
  var duration: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The eye for which the lens applies.
    */
  var eye: js.UndefOr[right | left] = js.undefined
  
  /**
    * Notes for special requirements such as coatings and lens materials.
    */
  var notes: js.UndefOr[String] = js.undefined
  
  /**
    * Contact lens power measured in diopters (0.25 units).
    */
  var power: js.UndefOr[Double] = js.undefined
  
  /**
    * Amount of prism to compensate for eye alignment in fractional units.
    */
  var prism: js.UndefOr[Double] = js.undefined
  
  /**
    * Identifies the type of vision correction product which is required for the patient.
    */
  var product: Coding
  
  /**
    * Lens power measured in diopters (0.25 units).
    */
  var sphere: js.UndefOr[Double] = js.undefined
}
object VisionPrescriptionDispense {
  
  inline def apply(product: Coding): VisionPrescriptionDispense = {
    val __obj = js.Dynamic.literal(product = product.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisionPrescriptionDispense]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisionPrescriptionDispense] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: Double): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setBackCurve(value: Double): Self = StObject.set(x, "backCurve", value.asInstanceOf[js.Any])
    
    inline def setBackCurveUndefined: Self = StObject.set(x, "backCurve", js.undefined)
    
    inline def setBase(value: up | down | in | out): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
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
    
    inline def setEyeUndefined: Self = StObject.set(x, "eye", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    inline def setPowerUndefined: Self = StObject.set(x, "power", js.undefined)
    
    inline def setPrism(value: Double): Self = StObject.set(x, "prism", value.asInstanceOf[js.Any])
    
    inline def setPrismUndefined: Self = StObject.set(x, "prism", js.undefined)
    
    inline def setProduct(value: Coding): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setSphere(value: Double): Self = StObject.set(x, "sphere", value.asInstanceOf[js.Any])
    
    inline def setSphereUndefined: Self = StObject.set(x, "sphere", js.undefined)
    
    inline def set_base(value: Element): Self = StObject.set(x, "_base", value.asInstanceOf[js.Any])
    
    inline def set_baseUndefined: Self = StObject.set(x, "_base", js.undefined)
    
    inline def set_brand(value: Element): Self = StObject.set(x, "_brand", value.asInstanceOf[js.Any])
    
    inline def set_brandUndefined: Self = StObject.set(x, "_brand", js.undefined)
    
    inline def set_color(value: Element): Self = StObject.set(x, "_color", value.asInstanceOf[js.Any])
    
    inline def set_colorUndefined: Self = StObject.set(x, "_color", js.undefined)
    
    inline def set_eye(value: Element): Self = StObject.set(x, "_eye", value.asInstanceOf[js.Any])
    
    inline def set_eyeUndefined: Self = StObject.set(x, "_eye", js.undefined)
    
    inline def set_notes(value: Element): Self = StObject.set(x, "_notes", value.asInstanceOf[js.Any])
    
    inline def set_notesUndefined: Self = StObject.set(x, "_notes", js.undefined)
  }
}
