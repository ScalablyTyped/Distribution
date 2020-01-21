package typings.emojione

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFname extends js.Object {
  var fname: String
  var isCanonical: Boolean
  var uc: String
  var unicode: js.Array[String]
}

object AnonFname {
  @scala.inline
  def apply(fname: String, isCanonical: Boolean, uc: String, unicode: js.Array[String]): AnonFname = {
    val __obj = js.Dynamic.literal(fname = fname.asInstanceOf[js.Any], isCanonical = isCanonical.asInstanceOf[js.Any], uc = uc.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFname]
  }
}

