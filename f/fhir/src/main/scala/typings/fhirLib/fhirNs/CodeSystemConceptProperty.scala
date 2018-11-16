package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Property value for the concept
     */

trait CodeSystemConceptProperty extends BackboneElement {
  /**
           * Contains extended information for property 'code'.
           */
  var _code: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'valueBoolean'.
           */
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'valueCode'.
           */
  var _valueCode: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'valueDateTime'.
           */
  var _valueDateTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'valueInteger'.
           */
  var _valueInteger: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'valueString'.
           */
  var _valueString: js.UndefOr[Element] = js.undefined
  /**
           * Reference to CodeSystem.property.code
           */
  var code: code
  /**
           * Value of the property for this concept
           */
  var valueBoolean: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Value of the property for this concept
           */
  var valueCode: js.UndefOr[code] = js.undefined
  /**
           * Value of the property for this concept
           */
  var valueCoding: js.UndefOr[Coding] = js.undefined
  /**
           * Value of the property for this concept
           */
  var valueDateTime: js.UndefOr[dateTime] = js.undefined
  /**
           * Value of the property for this concept
           */
  var valueInteger: js.UndefOr[integer] = js.undefined
  /**
           * Value of the property for this concept
           */
  var valueString: js.UndefOr[java.lang.String] = js.undefined
}

