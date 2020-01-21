package typings.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Landmark extends js.Object {
  /** Face landmark position. */
  var position: js.UndefOr[Position] = js.undefined
  /** Face landmark type. */
  var `type`: js.UndefOr[String] = js.undefined
}

object Landmark {
  @scala.inline
  def apply(position: Position = null, `type`: String = null): Landmark = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Landmark]
  }
}

