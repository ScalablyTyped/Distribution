package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * If this describes a specific package/container of the substance
     */

trait SubstanceInstance extends BackboneElement {
  /**
           * Contains extended information for property 'expiry'.
           */
  var _expiry: js.UndefOr[Element] = js.undefined
  /**
           * When no longer valid to use
           */
  var expiry: js.UndefOr[dateTime] = js.undefined
  /**
           * Identifier of the package/container
           */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
           * Amount of substance in the package
           */
  var quantity: js.UndefOr[Quantity] = js.undefined
}

