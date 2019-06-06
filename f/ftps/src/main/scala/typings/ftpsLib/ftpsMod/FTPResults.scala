package typings
package ftpsLib.ftpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FTPResults extends js.Object {
  var data: java.lang.String | scala.Null
  var error: stdLib.Error | scala.Null
}

object FTPResults {
  @scala.inline
  def apply(data: java.lang.String = null, error: stdLib.Error = null): FTPResults = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[FTPResults]
  }
}

