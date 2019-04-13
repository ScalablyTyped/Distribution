package typings
package fileDashSaverLib.fileDashSaverMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var saveAs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FileSaver.saveAs */ js.Any
}

object Window {
  @scala.inline
  def apply(
    saveAs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FileSaver.saveAs */ js.Any
  ): Window = {
    val __obj = js.Dynamic.literal(saveAs = saveAs)
  
    __obj.asInstanceOf[Window]
  }
}

