package typings.gapiDotClientDotSlides.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutProperties extends js.Object {
  /** The human-readable name of the layout. */
  var displayName: js.UndefOr[String] = js.undefined
  /** The object ID of the master that this layout is based on. */
  var masterObjectId: js.UndefOr[String] = js.undefined
  /** The name of the layout. */
  var name: js.UndefOr[String] = js.undefined
}

object LayoutProperties {
  @scala.inline
  def apply(displayName: String = null, masterObjectId: String = null, name: String = null): LayoutProperties = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (masterObjectId != null) __obj.updateDynamic("masterObjectId")(masterObjectId)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[LayoutProperties]
  }
}

