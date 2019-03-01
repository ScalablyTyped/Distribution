package typings
package gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeRequest extends js.Object {
  /** Properties of the resulting object. */
  var destination: js.UndefOr[Object] = js.undefined
  /** The kind of item this is. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The list of source objects that will be concatenated into a single object. */
  var sourceObjects: js.UndefOr[js.Array[gapiDotClientDotStorageLib.Anon_Generation]] = js.undefined
}

object ComposeRequest {
  @scala.inline
  def apply(
    destination: Object = null,
    kind: java.lang.String = null,
    sourceObjects: js.Array[gapiDotClientDotStorageLib.Anon_Generation] = null
  ): ComposeRequest = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (sourceObjects != null) __obj.updateDynamic("sourceObjects")(sourceObjects)
    __obj.asInstanceOf[ComposeRequest]
  }
}

