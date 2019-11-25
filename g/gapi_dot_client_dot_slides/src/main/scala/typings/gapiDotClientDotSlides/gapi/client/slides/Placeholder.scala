package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Placeholder extends js.Object {
  /**
    * The index of the placeholder. If the same placeholder types are present in
    * the same page, they would have different index values.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * The object ID of this shape's parent placeholder.
    * If unset, the parent placeholder shape does not exist, so the shape does
    * not inherit properties from any other shape.
    */
  var parentObjectId: js.UndefOr[String] = js.undefined
  /** The type of the placeholder. */
  var `type`: js.UndefOr[String] = js.undefined
}

object Placeholder {
  @scala.inline
  def apply(index: Int | Double = null, parentObjectId: String = null, `type`: String = null): Placeholder = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (parentObjectId != null) __obj.updateDynamic("parentObjectId")(parentObjectId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placeholder]
  }
}

