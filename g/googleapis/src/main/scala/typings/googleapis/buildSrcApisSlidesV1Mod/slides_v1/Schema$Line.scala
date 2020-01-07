package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A PageElement kind representing a non-connector line, straight connector,
  * curved connector, or bent connector.
  */
@js.native
trait Schema$Line extends js.Object {
  /**
    * The category of the line.  It matches the `category` specified in
    * CreateLineRequest, and can be updated with UpdateLineCategoryRequest.
    */
  var lineCategory: js.UndefOr[String] = js.native
  /**
    * The properties of the line.
    */
  var lineProperties: js.UndefOr[Schema$LineProperties] = js.native
  /**
    * The type of the line.
    */
  var lineType: js.UndefOr[String] = js.native
}

object Schema$Line {
  @scala.inline
  def apply(lineCategory: String = null, lineProperties: Schema$LineProperties = null, lineType: String = null): Schema$Line = {
    val __obj = js.Dynamic.literal()
    if (lineCategory != null) __obj.updateDynamic("lineCategory")(lineCategory.asInstanceOf[js.Any])
    if (lineProperties != null) __obj.updateDynamic("lineProperties")(lineProperties.asInstanceOf[js.Any])
    if (lineType != null) __obj.updateDynamic("lineType")(lineType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Line]
  }
}

