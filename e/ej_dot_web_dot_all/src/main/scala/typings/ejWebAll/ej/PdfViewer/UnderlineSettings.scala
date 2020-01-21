package typings.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnderlineSettings extends js.Object {
  /** Gets/sets the author of the underline annotation.
    */
  var author: js.UndefOr[String] = js.undefined
  /** Gets/sets the color of the underline annotation.
    */
  var color: js.UndefOr[String] = js.undefined
  /** Gets/sets the locked property of the underline annotation.
    */
  var isLocked: js.UndefOr[Boolean] = js.undefined
  /** Gets/sets the modified Date of the underline annotation.
    */
  var modifiedDate: js.UndefOr[String] = js.undefined
  /** Gets/sets the opacity of the underline annotation.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Gets/sets the subject of the underline annotation.
    */
  var subject: js.UndefOr[String] = js.undefined
}

object UnderlineSettings {
  @scala.inline
  def apply(
    author: String = null,
    color: String = null,
    isLocked: js.UndefOr[Boolean] = js.undefined,
    modifiedDate: String = null,
    opacity: Int | Double = null,
    subject: String = null
  ): UnderlineSettings = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(isLocked)) __obj.updateDynamic("isLocked")(isLocked.asInstanceOf[js.Any])
    if (modifiedDate != null) __obj.updateDynamic("modifiedDate")(modifiedDate.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnderlineSettings]
  }
}

