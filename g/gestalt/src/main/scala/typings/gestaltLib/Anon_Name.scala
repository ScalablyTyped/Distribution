package typings
package gestaltLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: java.lang.String
  var src: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String, src: java.lang.String = null): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name)
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[Anon_Name]
  }
}

