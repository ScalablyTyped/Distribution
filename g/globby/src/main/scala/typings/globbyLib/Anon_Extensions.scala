package typings
package globbyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Extensions extends js.Object {
  var extensions: js.Array[java.lang.String]
  var files: js.Array[java.lang.String]
}

object Anon_Extensions {
  @scala.inline
  def apply(extensions: js.Array[java.lang.String], files: js.Array[java.lang.String]): Anon_Extensions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extensions")(extensions)
    __obj.updateDynamic("files")(files)
    __obj.asInstanceOf[Anon_Extensions]
  }
}

