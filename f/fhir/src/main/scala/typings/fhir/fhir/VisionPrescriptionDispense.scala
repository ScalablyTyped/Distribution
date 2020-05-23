package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Vision supply authorization
  */
trait VisionPrescriptionDispense extends BackboneElement {
  /**
    * Contains extended information for property 'add'.
    */
  var _add: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'axis'.
    */
  var _axis: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'backCurve'.
    */
  var _backCurve: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'base'.
    */
  var _base: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'brand'.
    */
  var _brand: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'color'.
    */
  var _color: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'cylinder'.
    */
  var _cylinder: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'diameter'.
    */
  var _diameter: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'eye'.
    */
  var _eye: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'power'.
    */
  var _power: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'prism'.
    */
  var _prism: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'sphere'.
    */
  var _sphere: js.UndefOr[Element] = js.undefined
  /**
    * Lens add
    */
  var add: js.UndefOr[decimal] = js.undefined
  /**
    * Lens axis
    */
  var axis: js.UndefOr[integer] = js.undefined
  /**
    * Contact lens back curvature
    */
  var backCurve: js.UndefOr[decimal] = js.undefined
  /**
    * up | down | in | out
    */
  var base: js.UndefOr[code] = js.undefined
  /**
    * Brand required
    */
  var brand: js.UndefOr[String] = js.undefined
  /**
    * Color required
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Lens cylinder
    */
  var cylinder: js.UndefOr[decimal] = js.undefined
  /**
    * Contact lens diameter
    */
  var diameter: js.UndefOr[decimal] = js.undefined
  /**
    * Lens wear duration
    */
  var duration: js.UndefOr[Quantity] = js.undefined
  /**
    * right | left
    */
  var eye: js.UndefOr[code] = js.undefined
  /**
    * Notes for coatings
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * Contact lens power
    */
  var power: js.UndefOr[decimal] = js.undefined
  /**
    * Lens prism
    */
  var prism: js.UndefOr[decimal] = js.undefined
  /**
    * Product to be supplied
    */
  var product: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Lens sphere
    */
  var sphere: js.UndefOr[decimal] = js.undefined
}

object VisionPrescriptionDispense {
  @scala.inline
  def apply(
    _add: Element = null,
    _axis: Element = null,
    _backCurve: Element = null,
    _base: Element = null,
    _brand: Element = null,
    _color: Element = null,
    _cylinder: Element = null,
    _diameter: Element = null,
    _eye: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _power: Element = null,
    _prism: Element = null,
    _sphere: Element = null,
    add: js.UndefOr[decimal] = js.undefined,
    axis: js.UndefOr[integer] = js.undefined,
    backCurve: js.UndefOr[decimal] = js.undefined,
    base: code = null,
    brand: String = null,
    color: String = null,
    cylinder: js.UndefOr[decimal] = js.undefined,
    diameter: js.UndefOr[decimal] = js.undefined,
    duration: Quantity = null,
    extension: js.Array[Extension] = null,
    eye: code = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    power: js.UndefOr[decimal] = js.undefined,
    prism: js.UndefOr[decimal] = js.undefined,
    product: CodeableConcept = null,
    sphere: js.UndefOr[decimal] = js.undefined
  ): VisionPrescriptionDispense = {
    val __obj = js.Dynamic.literal()
    if (_add != null) __obj.updateDynamic("_add")(_add.asInstanceOf[js.Any])
    if (_axis != null) __obj.updateDynamic("_axis")(_axis.asInstanceOf[js.Any])
    if (_backCurve != null) __obj.updateDynamic("_backCurve")(_backCurve.asInstanceOf[js.Any])
    if (_base != null) __obj.updateDynamic("_base")(_base.asInstanceOf[js.Any])
    if (_brand != null) __obj.updateDynamic("_brand")(_brand.asInstanceOf[js.Any])
    if (_color != null) __obj.updateDynamic("_color")(_color.asInstanceOf[js.Any])
    if (_cylinder != null) __obj.updateDynamic("_cylinder")(_cylinder.asInstanceOf[js.Any])
    if (_diameter != null) __obj.updateDynamic("_diameter")(_diameter.asInstanceOf[js.Any])
    if (_eye != null) __obj.updateDynamic("_eye")(_eye.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_power != null) __obj.updateDynamic("_power")(_power.asInstanceOf[js.Any])
    if (_prism != null) __obj.updateDynamic("_prism")(_prism.asInstanceOf[js.Any])
    if (_sphere != null) __obj.updateDynamic("_sphere")(_sphere.asInstanceOf[js.Any])
    if (!js.isUndefined(add)) __obj.updateDynamic("add")(add.get.asInstanceOf[js.Any])
    if (!js.isUndefined(axis)) __obj.updateDynamic("axis")(axis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(backCurve)) __obj.updateDynamic("backCurve")(backCurve.get.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (brand != null) __obj.updateDynamic("brand")(brand.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(cylinder)) __obj.updateDynamic("cylinder")(cylinder.get.asInstanceOf[js.Any])
    if (!js.isUndefined(diameter)) __obj.updateDynamic("diameter")(diameter.get.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (eye != null) __obj.updateDynamic("eye")(eye.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (!js.isUndefined(power)) __obj.updateDynamic("power")(power.get.asInstanceOf[js.Any])
    if (!js.isUndefined(prism)) __obj.updateDynamic("prism")(prism.get.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (!js.isUndefined(sphere)) __obj.updateDynamic("sphere")(sphere.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisionPrescriptionDispense]
  }
}

