package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Common properties for a page element.  Note: When you initially create a
  * PageElement, the API may modify the values of both `size` and `transform`,
  * but the visual size will be unchanged.
  */
@js.native
trait Schema$PageElementProperties extends js.Object {
  /**
    * The object ID of the page where the element is located.
    */
  var pageObjectId: js.UndefOr[String] = js.native
  /**
    * The size of the element.
    */
  var size: js.UndefOr[Schema$Size] = js.native
  /**
    * The transform for the element.
    */
  var transform: js.UndefOr[Schema$AffineTransform] = js.native
}

object Schema$PageElementProperties {
  @scala.inline
  def apply(pageObjectId: String = null, size: Schema$Size = null, transform: Schema$AffineTransform = null): Schema$PageElementProperties = {
    val __obj = js.Dynamic.literal()
    if (pageObjectId != null) __obj.updateDynamic("pageObjectId")(pageObjectId.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PageElementProperties]
  }
}

