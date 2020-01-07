package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A PageElement kind representing word art.
  */
@js.native
trait Schema$WordArt extends js.Object {
  /**
    * The text rendered as word art.
    */
  var renderedText: js.UndefOr[String] = js.native
}

object Schema$WordArt {
  @scala.inline
  def apply(renderedText: String = null): Schema$WordArt = {
    val __obj = js.Dynamic.literal()
    if (renderedText != null) __obj.updateDynamic("renderedText")(renderedText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WordArt]
  }
}

