package typings
package gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  /** The name of the data source. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this data comes from an official government source. */
  var official: js.UndefOr[scala.Boolean] = js.undefined
}

object Source {
  @scala.inline
  def apply(name: java.lang.String = null, official: js.UndefOr[scala.Boolean] = js.undefined): Source = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(official)) __obj.updateDynamic("official")(official)
    __obj.asInstanceOf[Source]
  }
}

