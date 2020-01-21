package typings.fundamentalReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImageLabel extends js.Object {
  /* Aria-label in <div> element for image. */
  var imageLabel: String
}

object AnonImageLabel {
  @scala.inline
  def apply(imageLabel: String): AnonImageLabel = {
    val __obj = js.Dynamic.literal(imageLabel = imageLabel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonImageLabel]
  }
}

