package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutProperties extends js.Object {
  /** The human-readable name of the layout. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The object ID of the master that this layout is based on. */
  var masterObjectId: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the layout. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object LayoutProperties {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    masterObjectId: java.lang.String = null,
    name: java.lang.String = null
  ): LayoutProperties = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (masterObjectId != null) __obj.updateDynamic("masterObjectId")(masterObjectId)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[LayoutProperties]
  }
}

