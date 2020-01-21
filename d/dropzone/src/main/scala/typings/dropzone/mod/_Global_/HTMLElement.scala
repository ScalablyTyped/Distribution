package typings.dropzone.mod._Global_

import typings.dropzone.mod.Dropzone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLElement extends js.Object {
  var dropzone: Dropzone
}

object HTMLElement {
  @scala.inline
  def apply(dropzone: Dropzone): HTMLElement = {
    val __obj = js.Dynamic.literal(dropzone = dropzone.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HTMLElement]
  }
}

