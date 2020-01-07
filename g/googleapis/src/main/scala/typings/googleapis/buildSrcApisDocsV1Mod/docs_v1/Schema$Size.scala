package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A width and height.
  */
@js.native
trait Schema$Size extends js.Object {
  /**
    * The height of the object.
    */
  var height: js.UndefOr[Schema$Dimension] = js.native
  /**
    * The width of the object.
    */
  var width: js.UndefOr[Schema$Dimension] = js.native
}

object Schema$Size {
  @scala.inline
  def apply(height: Schema$Dimension = null, width: Schema$Dimension = null): Schema$Size = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Size]
  }
}

