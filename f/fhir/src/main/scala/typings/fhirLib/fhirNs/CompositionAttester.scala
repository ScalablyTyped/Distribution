package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attests to accuracy of composition
  */
trait CompositionAttester extends BackboneElement {
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'time'.
    */
  var _time: js.UndefOr[Element] = js.undefined
  /**
    * personal | professional | legal | official
    */
  var mode: js.Array[code]
  /**
    * Who attested the composition
    */
  var party: js.UndefOr[Reference] = js.undefined
  /**
    * When the composition was attested
    */
  var time: js.UndefOr[dateTime] = js.undefined
}

