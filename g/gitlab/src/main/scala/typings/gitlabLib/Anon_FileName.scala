package typings
package gitlabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FileName extends js.Object {
  var fileName: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_FileName {
  @scala.inline
  def apply(fileName: java.lang.String = null): Anon_FileName = {
    val __obj = js.Dynamic.literal()
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    __obj.asInstanceOf[Anon_FileName]
  }
}

