package typings
package fhirLib.fhirNs

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
  var brand: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Color required
           */
  var color: js.UndefOr[java.lang.String] = js.undefined
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

