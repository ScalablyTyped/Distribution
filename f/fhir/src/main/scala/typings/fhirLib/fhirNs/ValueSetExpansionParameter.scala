package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Parameter that controlled the expansion process
     */

trait ValueSetExpansionParameter extends BackboneElement {
  /**
           * Contains extended information for property 'name'.
           */
  var _name: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'valueBoolean'.
           */
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'valueCode'.
           */
  var _valueCode: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'valueDecimal'.
           */
  var _valueDecimal: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'valueInteger'.
           */
  var _valueInteger: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'valueString'.
           */
  var _valueString: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'valueUri'.
           */
  var _valueUri: js.UndefOr[Element] = js.undefined
  /**
           * Name as assigned by the server
           */
  var name: java.lang.String
  /**
           * Value of the named parameter
           */
  var valueBoolean: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Value of the named parameter
           */
  var valueCode: js.UndefOr[code] = js.undefined
  /**
           * Value of the named parameter
           */
  var valueDecimal: js.UndefOr[decimal] = js.undefined
  /**
           * Value of the named parameter
           */
  var valueInteger: js.UndefOr[integer] = js.undefined
  /**
           * Value of the named parameter
           */
  var valueString: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Value of the named parameter
           */
  var valueUri: js.UndefOr[uri] = js.undefined
}

