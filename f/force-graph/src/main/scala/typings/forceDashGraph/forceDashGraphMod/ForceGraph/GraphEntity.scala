package typings.forceDashGraph.forceDashGraphMod.ForceGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphEntity extends js.Object {
  var id: js.UndefOr[String] = js.undefined
}

object GraphEntity {
  @scala.inline
  def apply(id: String = null): GraphEntity = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[GraphEntity]
  }
}

