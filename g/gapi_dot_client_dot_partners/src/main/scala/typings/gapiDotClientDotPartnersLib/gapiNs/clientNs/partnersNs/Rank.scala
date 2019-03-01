package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rank extends js.Object {
  /** The type of rank. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** The numerical value of the rank. */
  var value: js.UndefOr[scala.Double] = js.undefined
}

object Rank {
  @scala.inline
  def apply(`type`: java.lang.String = null, value: scala.Int | scala.Double = null): Rank = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rank]
  }
}

