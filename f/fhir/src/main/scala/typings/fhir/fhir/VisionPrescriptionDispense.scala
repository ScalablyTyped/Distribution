package typings.fhir.fhir

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
  implicit class VisionPrescriptionDispenseOps[Self <: VisionPrescriptionDispense] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_add(value: Element): Self = this.set("_add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_add: Self = this.set("_add", js.undefined)
    
    @scala.inline
    def set_axis(value: Element): Self = this.set("_axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_axis: Self = this.set("_axis", js.undefined)
    
    @scala.inline
    def set_backCurve(value: Element): Self = this.set("_backCurve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_backCurve: Self = this.set("_backCurve", js.undefined)
    
    @scala.inline
    def set_base(value: Element): Self = this.set("_base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_base: Self = this.set("_base", js.undefined)
    
    @scala.inline
    def set_brand(value: Element): Self = this.set("_brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_brand: Self = this.set("_brand", js.undefined)
    
    @scala.inline
    def set_color(value: Element): Self = this.set("_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_color: Self = this.set("_color", js.undefined)
    
    @scala.inline
    def set_cylinder(value: Element): Self = this.set("_cylinder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_cylinder: Self = this.set("_cylinder", js.undefined)
    
    @scala.inline
    def set_diameter(value: Element): Self = this.set("_diameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_diameter: Self = this.set("_diameter", js.undefined)
    
    @scala.inline
    def set_eye(value: Element): Self = this.set("_eye", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_eye: Self = this.set("_eye", js.undefined)
    
    @scala.inline
    def set_power(value: Element): Self = this.set("_power", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_power: Self = this.set("_power", js.undefined)
    
    @scala.inline
    def set_prism(value: Element): Self = this.set("_prism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_prism: Self = this.set("_prism", js.undefined)
    
    @scala.inline
    def set_sphere(value: Element): Self = this.set("_sphere", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_sphere: Self = this.set("_sphere", js.undefined)
    
    @scala.inline
    def setAdd(value: decimal): Self = this.set("add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    
    @scala.inline
    def setAxis(value: integer): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setBackCurve(value: decimal): Self = this.set("backCurve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackCurve: Self = this.set("backCurve", js.undefined)
    
    @scala.inline
    def setBase(value: code): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    
    @scala.inline
    def setBrand(value: String): Self = this.set("brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrand: Self = this.set("brand", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCylinder(value: decimal): Self = this.set("cylinder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCylinder: Self = this.set("cylinder", js.undefined)
    
    @scala.inline
    def setDiameter(value: decimal): Self = this.set("diameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiameter: Self = this.set("diameter", js.undefined)
    
    @scala.inline
    def setDuration(value: Quantity): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEye(value: code): Self = this.set("eye", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEye: Self = this.set("eye", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = this.set("note", js.Array(value :_*))
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = this.set("note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    
    @scala.inline
    def setPower(value: decimal): Self = this.set("power", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePower: Self = this.set("power", js.undefined)
    
    @scala.inline
    def setPrism(value: decimal): Self = this.set("prism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrism: Self = this.set("prism", js.undefined)
    
    @scala.inline
    def setProduct(value: CodeableConcept): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    
    @scala.inline
    def setSphere(value: decimal): Self = this.set("sphere", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSphere: Self = this.set("sphere", js.undefined)
  }
}
