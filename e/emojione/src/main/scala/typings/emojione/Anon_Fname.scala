package typings.emojione

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fname extends js.Object {
  var fname: String
  var isCanonical: Boolean
  var uc: String
  var unicode: js.Array[String]
}

object Anon_Fname {
  @scala.inline
  def apply(fname: String, isCanonical: Boolean, uc: String, unicode: js.Array[String]): Anon_Fname = {
    val __obj = js.Dynamic.literal(fname = fname.asInstanceOf[js.Any], isCanonical = isCanonical.asInstanceOf[js.Any], uc = uc.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Fname]
  }
}

