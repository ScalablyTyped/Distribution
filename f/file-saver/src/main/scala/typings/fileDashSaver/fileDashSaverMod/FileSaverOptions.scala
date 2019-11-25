package typings.fileDashSaver.fileDashSaverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSaverOptions extends js.Object {
  /**
    * Automatically provide Unicode text encoding hints
    * @default false
    */
  var autoBom: Boolean
}

object FileSaverOptions {
  @scala.inline
  def apply(autoBom: Boolean): FileSaverOptions = {
    val __obj = js.Dynamic.literal(autoBom = autoBom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileSaverOptions]
  }
}

