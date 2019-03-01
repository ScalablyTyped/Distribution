package typings
package gapiDotClientDotDoubleclicksearchLib.gapiNs.clientNs.doubleclicksearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedColumn extends js.Object {
  /** Identifies this as a SavedColumn resource. Value: the fixed string doubleclicksearch#savedColumn. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the saved column. */
  var savedColumnName: js.UndefOr[java.lang.String] = js.undefined
  /** The type of data this saved column will produce. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object SavedColumn {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    savedColumnName: java.lang.String = null,
    `type`: java.lang.String = null
  ): SavedColumn = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (savedColumnName != null) __obj.updateDynamic("savedColumnName")(savedColumnName)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SavedColumn]
  }
}

