package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Slide layout reference. This may reference either:  - A predefined layout -
  * One of the layouts in the presentation.
  */
@js.native
trait Schema$LayoutReference extends js.Object {
  /**
    * Layout ID: the object ID of one of the layouts in the presentation.
    */
  var layoutId: js.UndefOr[String] = js.native
  /**
    * Predefined layout.
    */
  var predefinedLayout: js.UndefOr[String] = js.native
}

object Schema$LayoutReference {
  @scala.inline
  def apply(layoutId: String = null, predefinedLayout: String = null): Schema$LayoutReference = {
    val __obj = js.Dynamic.literal()
    if (layoutId != null) __obj.updateDynamic("layoutId")(layoutId.asInstanceOf[js.Any])
    if (predefinedLayout != null) __obj.updateDynamic("predefinedLayout")(predefinedLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LayoutReference]
  }
}

