package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlagsListResponse extends js.Object {
  /** List of flags. */
  var items: js.UndefOr[js.Array[Flag]] = js.undefined
  /** This is always sql#flagsList. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object FlagsListResponse {
  @scala.inline
  def apply(items: js.Array[Flag] = null, kind: java.lang.String = null): FlagsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[FlagsListResponse]
  }
}

