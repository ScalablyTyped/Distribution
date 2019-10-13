package typings.dropzone.dropzoneMod._Global_

import typings.dropzone.dropzoneMod.Dropzone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLElement extends js.Object {
  var dropzone: Dropzone
}

object HTMLElement {
  @scala.inline
  def apply(dropzone: Dropzone): HTMLElement = {
    val __obj = js.Dynamic.literal(dropzone = dropzone)
  
    __obj.asInstanceOf[HTMLElement]
  }
}

