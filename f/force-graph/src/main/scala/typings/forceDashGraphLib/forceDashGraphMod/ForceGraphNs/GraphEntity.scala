package typings
package forceDashGraphLib.forceDashGraphMod.ForceGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphEntity extends js.Object {
  var id: java.lang.String
}

object GraphEntity {
  @scala.inline
  def apply(id: java.lang.String): GraphEntity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[GraphEntity]
  }
}

