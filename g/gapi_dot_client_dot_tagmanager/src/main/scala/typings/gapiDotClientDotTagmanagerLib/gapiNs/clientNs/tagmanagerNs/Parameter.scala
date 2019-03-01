package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameter extends js.Object {
  /** The named key that uniquely identifies a parameter. Required for top-level parameters, as well as map values. Ignored for list values. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** This list parameter's parameters (keys will be ignored). */
  var list: js.UndefOr[js.Array[Parameter]] = js.undefined
  /** This map parameter's parameters (must have keys; keys must be unique). */
  var map: js.UndefOr[js.Array[Parameter]] = js.undefined
  /**
    * The parameter type. Valid values are:
    * - boolean: The value represents a boolean, represented as 'true' or 'false'
    * - integer: The value represents a 64-bit signed integer value, in base 10
    * - list: A list of parameters should be specified
    * - map: A map of parameters should be specified
    * - template: The value represents any text; this can include variable references (even variable references that might return non-string types)
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** A parameter's value (may contain variable references such as "{{myVariable}}") as appropriate to the specified type. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Parameter {
  @scala.inline
  def apply(
    key: java.lang.String = null,
    list: js.Array[Parameter] = null,
    map: js.Array[Parameter] = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): Parameter = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (list != null) __obj.updateDynamic("list")(list)
    if (map != null) __obj.updateDynamic("map")(map)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Parameter]
  }
}

