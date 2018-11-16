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

