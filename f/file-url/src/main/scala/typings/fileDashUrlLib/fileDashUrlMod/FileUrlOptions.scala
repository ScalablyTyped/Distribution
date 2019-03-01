package typings
package fileDashUrlLib.fileDashUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUrlOptions extends js.Object {
  /**
    * Passing false will make it not call path.resolve() on the path.
    */
  var resolve: js.UndefOr[scala.Boolean] = js.undefined
}

object FileUrlOptions {
  @scala.inline
  def apply(resolve: js.UndefOr[scala.Boolean] = js.undefined): FileUrlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(resolve)) __obj.updateDynamic("resolve")(resolve)
    __obj.asInstanceOf[FileUrlOptions]
  }
}

