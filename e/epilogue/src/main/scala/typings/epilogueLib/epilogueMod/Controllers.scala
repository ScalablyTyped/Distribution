package typings
package epilogueLib.epilogueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Controllers extends js.Object {
  var base: BaseController
  var create: CreateController
  var delete: DeleteController
  var list: ListController
  var read: ReadController
  var update: UpdateController
}

object Controllers {
  @scala.inline
  def apply(
    base: BaseController,
    create: CreateController,
    delete: DeleteController,
    list: ListController,
    read: ReadController,
    update: UpdateController
  ): Controllers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("base")(base)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("read")(read)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[Controllers]
  }
}

