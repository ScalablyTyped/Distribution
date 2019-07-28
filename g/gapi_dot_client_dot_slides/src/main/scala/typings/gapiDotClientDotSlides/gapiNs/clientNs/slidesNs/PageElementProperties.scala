package typings.gapiDotClientDotSlides.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageElementProperties extends js.Object {
  /** The object ID of the page where the element is located. */
  var pageObjectId: js.UndefOr[String] = js.undefined
  /** The size of the element. */
  var size: js.UndefOr[Size] = js.undefined
  /** The transform for the element. */
  var transform: js.UndefOr[AffineTransform] = js.undefined
}

object PageElementProperties {
  @scala.inline
  def apply(pageObjectId: String = null, size: Size = null, transform: AffineTransform = null): PageElementProperties = {
    val __obj = js.Dynamic.literal()
    if (pageObjectId != null) __obj.updateDynamic("pageObjectId")(pageObjectId)
    if (size != null) __obj.updateDynamic("size")(size)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[PageElementProperties]
  }
}

