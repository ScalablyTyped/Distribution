package typings
package ejDotWebDotAllLib.ejNs.PdfViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightSettings extends js.Object {
  /** Gets/sets the author of the highlight annotation.
    */
  var author: js.UndefOr[java.lang.String] = js.undefined
  /** Gets/sets the color of the highlight  annotation.
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Gets/sets the locked property of the highlight annotation.
    */
  var isLocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets/sets the modified Date of the highlight annotation.
    */
  var modifiedDate: js.UndefOr[java.lang.String] = js.undefined
  /** Gets/sets the opacity of the highlight annotation.
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Gets/sets the subject of the highlight annotation.
    */
  var subject: js.UndefOr[java.lang.String] = js.undefined
}

object HighlightSettings {
  @scala.inline
  def apply(
    author: java.lang.String = null,
    color: java.lang.String = null,
    isLocked: js.UndefOr[scala.Boolean] = js.undefined,
    modifiedDate: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    subject: java.lang.String = null
  ): HighlightSettings = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(isLocked)) __obj.updateDynamic("isLocked")(isLocked)
    if (modifiedDate != null) __obj.updateDynamic("modifiedDate")(modifiedDate)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[HighlightSettings]
  }
}

