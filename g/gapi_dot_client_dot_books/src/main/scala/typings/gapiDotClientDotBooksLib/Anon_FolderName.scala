package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FolderName extends js.Object {
  var folderName: js.UndefOr[java.lang.String] = js.undefined
  var isEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_FolderName {
  @scala.inline
  def apply(folderName: java.lang.String = null, isEnabled: js.UndefOr[scala.Boolean] = js.undefined): Anon_FolderName = {
    val __obj = js.Dynamic.literal()
    if (folderName != null) __obj.updateDynamic("folderName")(folderName)
    if (!js.isUndefined(isEnabled)) __obj.updateDynamic("isEnabled")(isEnabled)
    __obj.asInstanceOf[Anon_FolderName]
  }
}

