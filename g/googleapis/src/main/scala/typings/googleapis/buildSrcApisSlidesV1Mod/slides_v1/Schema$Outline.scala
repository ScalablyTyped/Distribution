package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The outline of a PageElement.  If these fields are unset, they may be
  * inherited from a parent placeholder if it exists. If there is no parent,
  * the fields will default to the value used for new page elements created in
  * the Slides editor, which may depend on the page element kind.
  */
@js.native
trait Schema$Outline extends js.Object {
  /**
    * The dash style of the outline.
    */
  var dashStyle: js.UndefOr[String] = js.native
  /**
    * The fill of the outline.
    */
  var outlineFill: js.UndefOr[Schema$OutlineFill] = js.native
  /**
    * The outline property state.  Updating the outline on a page element will
    * implicitly update this field to `RENDERED`, unless another value is
    * specified in the same request. To have no outline on a page element, set
    * this field to `NOT_RENDERED`. In this case, any other outline fields set
    * in the same request will be ignored.
    */
  var propertyState: js.UndefOr[String] = js.native
  /**
    * The thickness of the outline.
    */
  var weight: js.UndefOr[Schema$Dimension] = js.native
}

object Schema$Outline {
  @scala.inline
  def apply(
    dashStyle: String = null,
    outlineFill: Schema$OutlineFill = null,
    propertyState: String = null,
    weight: Schema$Dimension = null
  ): Schema$Outline = {
    val __obj = js.Dynamic.literal()
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (outlineFill != null) __obj.updateDynamic("outlineFill")(outlineFill.asInstanceOf[js.Any])
    if (propertyState != null) __obj.updateDynamic("propertyState")(propertyState.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Outline]
  }
}

