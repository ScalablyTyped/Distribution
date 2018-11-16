package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This element is sliced - slices follow
     */

trait ElementDefinitionSlicing extends Element {
  /**
           * Contains extended information for property 'description'.
           */
  var _description: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'ordered'.
           */
  var _ordered: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'rules'.
           */
  var _rules: js.UndefOr[Element] = js.undefined
  /**
           * Text description of how slicing works (or not)
           */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Element values that are used to distinguish the slices
           */
  var discriminator: js.UndefOr[js.Array[ElementDefinitionSlicingDiscriminator]] = js.undefined
  /**
           * If elements must be in same order as slices
           */
  var ordered: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * closed | open | openAtEnd
           */
  var rules: code
}

