package typings.epilogue.mod

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
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Controllers]
  }
}

