package typings
package gapiDotClientDotAdexchangesellerLib.gapiNs.clientNs.adexchangesellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  /** Unique identifier of this account. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Kind of resource this is, in this case adexchangeseller#account. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this account. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Account {
  @scala.inline
  def apply(id: java.lang.String = null, kind: java.lang.String = null, name: java.lang.String = null): Account = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Account]
  }
}

