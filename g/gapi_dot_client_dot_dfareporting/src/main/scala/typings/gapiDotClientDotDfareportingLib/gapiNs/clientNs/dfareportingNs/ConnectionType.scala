package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionType extends js.Object {
  /** ID of this connection type. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#connectionType". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this connection type. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object ConnectionType {
  @scala.inline
  def apply(id: java.lang.String = null, kind: java.lang.String = null, name: java.lang.String = null): ConnectionType = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ConnectionType]
  }
}

