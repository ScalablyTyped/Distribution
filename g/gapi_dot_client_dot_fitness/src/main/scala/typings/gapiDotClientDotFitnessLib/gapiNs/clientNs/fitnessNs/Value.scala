package typings
package gapiDotClientDotFitnessLib.gapiNs.clientNs.fitnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  /** Floating point value. When this is set, other values must not be set. */
  var fpVal: js.UndefOr[scala.Double] = js.undefined
  /** Integer value. When this is set, other values must not be set. */
  var intVal: js.UndefOr[scala.Double] = js.undefined
  /**
    * Map value. The valid key space and units for the corresponding value of each entry should be documented as part of the data type definition. Keys
    * should be kept small whenever possible. Data streams with large keys and high data frequency may be down sampled.
    */
  var mapVal: js.UndefOr[js.Array[ValueMapValEntry]] = js.undefined
  /**
    * String value. When this is set, other values must not be set. Strings should be kept small whenever possible. Data streams with large string values and
    * high data frequency may be down sampled.
    */
  var stringVal: js.UndefOr[java.lang.String] = js.undefined
}

object Value {
  @scala.inline
  def apply(
    fpVal: scala.Int | scala.Double = null,
    intVal: scala.Int | scala.Double = null,
    mapVal: js.Array[ValueMapValEntry] = null,
    stringVal: java.lang.String = null
  ): Value = {
    val __obj = js.Dynamic.literal()
    if (fpVal != null) __obj.updateDynamic("fpVal")(fpVal.asInstanceOf[js.Any])
    if (intVal != null) __obj.updateDynamic("intVal")(intVal.asInstanceOf[js.Any])
    if (mapVal != null) __obj.updateDynamic("mapVal")(mapVal)
    if (stringVal != null) __obj.updateDynamic("stringVal")(stringVal)
    __obj.asInstanceOf[Value]
  }
}

