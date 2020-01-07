package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The page background fill.
  */
@js.native
trait Schema$PageBackgroundFill extends js.Object {
  /**
    * The background fill property state.  Updating the fill on a page will
    * implicitly update this field to `RENDERED`, unless another value is
    * specified in the same request. To have no fill on a page, set this field
    * to `NOT_RENDERED`. In this case, any other fill fields set in the same
    * request will be ignored.
    */
  var propertyState: js.UndefOr[String] = js.native
  /**
    * Solid color fill.
    */
  var solidFill: js.UndefOr[Schema$SolidFill] = js.native
  /**
    * Stretched picture fill.
    */
  var stretchedPictureFill: js.UndefOr[Schema$StretchedPictureFill] = js.native
}

object Schema$PageBackgroundFill {
  @scala.inline
  def apply(
    propertyState: String = null,
    solidFill: Schema$SolidFill = null,
    stretchedPictureFill: Schema$StretchedPictureFill = null
  ): Schema$PageBackgroundFill = {
    val __obj = js.Dynamic.literal()
    if (propertyState != null) __obj.updateDynamic("propertyState")(propertyState.asInstanceOf[js.Any])
    if (solidFill != null) __obj.updateDynamic("solidFill")(solidFill.asInstanceOf[js.Any])
    if (stretchedPictureFill != null) __obj.updateDynamic("stretchedPictureFill")(stretchedPictureFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PageBackgroundFill]
  }
}

