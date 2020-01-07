package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the background of a document.
  */
@js.native
trait Schema$Background extends js.Object {
  /**
    * The background color.
    */
  var color: js.UndefOr[Schema$OptionalColor] = js.native
}

object Schema$Background {
  @scala.inline
  def apply(color: Schema$OptionalColor = null): Schema$Background = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Background]
  }
}

