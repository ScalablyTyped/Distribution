package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flag extends js.Object {
  /** For STRING flags, a list of strings that the value can be set to. */
  var allowedStringValues: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The database version this flag applies to. Can be MYSQL_5_5, MYSQL_5_6, or MYSQL_5_7. MYSQL_5_7 is applicable only to Second Generation instances. */
  var appliesTo: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** This is always sql#flag. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** For INTEGER flags, the maximum allowed value. */
  var maxValue: js.UndefOr[java.lang.String] = js.undefined
  /** For INTEGER flags, the minimum allowed value. */
  var minValue: js.UndefOr[java.lang.String] = js.undefined
  /** This is the name of the flag. Flag names always use underscores, not hyphens, e.g. max_allowed_packet */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether changing this flag will trigger a database restart. Only applicable to Second Generation instances. */
  var requiresRestart: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The type of the flag. Flags are typed to being BOOLEAN, STRING, INTEGER or NONE. NONE is used for flags which do not take a value, such as
    * skip_grant_tables.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Flag {
  @scala.inline
  def apply(
    allowedStringValues: js.Array[java.lang.String] = null,
    appliesTo: js.Array[java.lang.String] = null,
    kind: java.lang.String = null,
    maxValue: java.lang.String = null,
    minValue: java.lang.String = null,
    name: java.lang.String = null,
    requiresRestart: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): Flag = {
    val __obj = js.Dynamic.literal()
    if (allowedStringValues != null) __obj.updateDynamic("allowedStringValues")(allowedStringValues)
    if (appliesTo != null) __obj.updateDynamic("appliesTo")(appliesTo)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue)
    if (minValue != null) __obj.updateDynamic("minValue")(minValue)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(requiresRestart)) __obj.updateDynamic("requiresRestart")(requiresRestart)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Flag]
  }
}

