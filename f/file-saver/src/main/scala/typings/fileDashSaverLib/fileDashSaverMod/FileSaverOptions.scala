package typings
package fileDashSaverLib.fileDashSaverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSaverOptions extends js.Object {
  /**
    * Automatically provide Unicode text encoding hints
    * @default false
    */
  var autoBom: scala.Boolean
}

object FileSaverOptions {
  @scala.inline
  def apply(autoBom: scala.Boolean): FileSaverOptions = {
    val __obj = js.Dynamic.literal(autoBom = autoBom)
  
    __obj.asInstanceOf[FileSaverOptions]
  }
}

