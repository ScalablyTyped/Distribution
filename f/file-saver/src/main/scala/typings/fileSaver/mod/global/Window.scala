package typings.fileSaver.mod.global

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
    val __obj = js.Dynamic.literal(saveAs = saveAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

