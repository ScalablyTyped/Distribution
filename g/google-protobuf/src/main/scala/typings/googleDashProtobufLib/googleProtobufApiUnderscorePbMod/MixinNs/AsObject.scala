package typings
package googleDashProtobufLib.googleProtobufApiUnderscorePbMod.MixinNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var name: java.lang.String
  var root: java.lang.String
}

object AsObject {
  @scala.inline
  def apply(name: java.lang.String, root: java.lang.String): AsObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[AsObject]
  }
}

