package typings
package gapiDotClientDotFirebaserulesLib.gapiNs.clientNs.firebaserulesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  /** Textual Content. */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /** Fingerprint (e.g. github sha) associated with the `File`. */
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  /** File name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object File {
  @scala.inline
  def apply(
    content: java.lang.String = null,
    fingerprint: java.lang.String = null,
    name: java.lang.String = null
  ): File = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[File]
  }
}

