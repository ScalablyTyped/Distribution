package typings.gapiDotClientDotPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rank extends js.Object {
  /** The type of rank. */
  var `type`: js.UndefOr[String] = js.undefined
  /** The numerical value of the rank. */
  var value: js.UndefOr[Double] = js.undefined
}

object Rank {
  @scala.inline
  def apply(`type`: String = null, value: Int | Double = null): Rank = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rank]
  }
}

