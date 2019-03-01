package typings
package fineDashUploaderLib.fineDashUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIDragAndDropOptions extends js.Object {
  /**
    * Designate additional drop zones for file input
    *
    * @default `[]`
    */
  var extraDropzones: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Include the path of dropped files (starting with the top-level dropped directory). This value will be sent along with the request as a qqpath parameter
    *
    * @default `false`
    */
  var reportDirectoryPaths: js.UndefOr[scala.Boolean] = js.undefined
}

object UIDragAndDropOptions {
  @scala.inline
  def apply(extraDropzones: js.Array[_] = null, reportDirectoryPaths: js.UndefOr[scala.Boolean] = js.undefined): UIDragAndDropOptions = {
    val __obj = js.Dynamic.literal()
    if (extraDropzones != null) __obj.updateDynamic("extraDropzones")(extraDropzones)
    if (!js.isUndefined(reportDirectoryPaths)) __obj.updateDynamic("reportDirectoryPaths")(reportDirectoryPaths)
    __obj.asInstanceOf[UIDragAndDropOptions]
  }
}

