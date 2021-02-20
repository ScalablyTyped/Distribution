package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Vision supply authorization
  */
@js.native
trait VisionPrescriptionDispense extends BackboneElement {
  
  /**
    * Contains extended information for property 'add'.
    */
  var _add: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'axis'.
    */
  var _axis: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'backCurve'.
    */
  var _backCurve: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'base'.
    */
  var _base: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'brand'.
    */
  var _brand: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'color'.
    */
  var _color: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'cylinder'.
    */
  var _cylinder: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'diameter'.
    */
  var _diameter: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'eye'.
    */
  var _eye: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'power'.
    */
  var _power: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'prism'.
    */
  var _prism: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'sphere'.
    */
  var _sphere: js.UndefOr[Element] = js.native
  
  /**
    * Lens add
    */
  var add: js.UndefOr[decimal] = js.native
  
  /**
    * Lens axis
    */
  var axis: js.UndefOr[integer] = js.native
  
  /**
    * Contact lens back curvature
    */
  var backCurve: js.UndefOr[decimal] = js.native
  
  /**
    * up | down | in | out
    */
  var base: js.UndefOr[code] = js.native
  
  /**
    * Brand required
    */
  var brand: js.UndefOr[String] = js.native
  
  /**
    * Color required
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * Lens cylinder
    */
  var cylinder: js.UndefOr[decimal] = js.native
  
  /**
    * Contact lens diameter
    */
  var diameter: js.UndefOr[decimal] = js.native
  
  /**
    * Lens wear duration
    */
  var duration: js.UndefOr[Quantity] = js.native
  
  /**
    * right | left
    */
  var eye: js.UndefOr[code] = js.native
  
  /**
    * Notes for coatings
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  
  /**
    * Contact lens power
    */
  var power: js.UndefOr[decimal] = js.native
  
  /**
    * Lens prism
    */
  var prism: js.UndefOr[decimal] = js.native
  
  /**
    * Product to be supplied
    */
  var product: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Lens sphere
    */
  var sphere: js.UndefOr[decimal] = js.native
}
object VisionPrescriptionDispense {
  
  @scala.inline
  def apply(): VisionPrescriptionDispense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisionPrescriptionDispense]
  }
  
  @scala.inline
  implicit class VisionPrescriptionDispenseMutableBuilder[Self <: VisionPrescriptionDispense] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: decimal): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setAxis(value: integer): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setBackCurve(value: decimal): Self = StObject.set(x, "backCurve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackCurveUndefined: Self = StObject.set(x, "backCurve", js.undefined)
    
    @scala.inline
    def setBase(value: code): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    @scala.inline
    def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCylinder(value: decimal): Self = StObject.set(x, "cylinder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCylinderUndefined: Self = StObject.set(x, "cylinder", js.undefined)
    
    @scala.inline
    def setDiameter(value: decimal): Self = StObject.set(x, "diameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiameterUndefined: Self = StObject.set(x, "diameter", js.undefined)
    
    @scala.inline
    def setDuration(value: Quantity): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEye(value: code): Self = StObject.set(x, "eye", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEyeUndefined: Self = StObject.set(x, "eye", js.undefined)
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    @scala.inline
    def setPower(value: decimal): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerUndefined: Self = StObject.set(x, "power", js.undefined)
    
    @scala.inline
    def setPrism(value: decimal): Self = StObject.set(x, "prism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrismUndefined: Self = StObject.set(x, "prism", js.undefined)
    
    @scala.inline
    def setProduct(value: CodeableConcept): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    @scala.inline
    def setSphere(value: decimal): Self = StObject.set(x, "sphere", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSphereUndefined: Self = StObject.set(x, "sphere", js.undefined)
    
    @scala.inline
    def set_add(value: Element): Self = StObject.set(x, "_add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_addUndefined: Self = StObject.set(x, "_add", js.undefined)
    
    @scala.inline
    def set_axis(value: Element): Self = StObject.set(x, "_axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_axisUndefined: Self = StObject.set(x, "_axis", js.undefined)
    
    @scala.inline
    def set_backCurve(value: Element): Self = StObject.set(x, "_backCurve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_backCurveUndefined: Self = StObject.set(x, "_backCurve", js.undefined)
    
    @scala.inline
    def set_base(value: Element): Self = StObject.set(x, "_base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_baseUndefined: Self = StObject.set(x, "_base", js.undefined)
    
    @scala.inline
    def set_brand(value: Element): Self = StObject.set(x, "_brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_brandUndefined: Self = StObject.set(x, "_brand", js.undefined)
    
    @scala.inline
    def set_color(value: Element): Self = StObject.set(x, "_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_colorUndefined: Self = StObject.set(x, "_color", js.undefined)
    
    @scala.inline
    def set_cylinder(value: Element): Self = StObject.set(x, "_cylinder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_cylinderUndefined: Self = StObject.set(x, "_cylinder", js.undefined)
    
    @scala.inline
    def set_diameter(value: Element): Self = StObject.set(x, "_diameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_diameterUndefined: Self = StObject.set(x, "_diameter", js.undefined)
    
    @scala.inline
    def set_eye(value: Element): Self = StObject.set(x, "_eye", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_eyeUndefined: Self = StObject.set(x, "_eye", js.undefined)
    
    @scala.inline
    def set_power(value: Element): Self = StObject.set(x, "_power", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_powerUndefined: Self = StObject.set(x, "_power", js.undefined)
    
    @scala.inline
    def set_prism(value: Element): Self = StObject.set(x, "_prism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_prismUndefined: Self = StObject.set(x, "_prism", js.undefined)
    
    @scala.inline
    def set_sphere(value: Element): Self = StObject.set(x, "_sphere", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sphereUndefined: Self = StObject.set(x, "_sphere", js.undefined)
  }
}
