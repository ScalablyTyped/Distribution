package typings.docxTemplates.typesMod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePars extends js.Object {
  var alt: js.UndefOr[String] = js.undefined
  var data: ArrayBuffer | String
  var extension: js.UndefOr[String] = js.undefined
  var height: Double
  var width: Double
}

object ImagePars {
  @scala.inline
  def apply(
    data: ArrayBuffer | String,
    height: Double,
    width: Double,
    alt: String = null,
    extension: String = null
  ): ImagePars = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePars]
  }
}

