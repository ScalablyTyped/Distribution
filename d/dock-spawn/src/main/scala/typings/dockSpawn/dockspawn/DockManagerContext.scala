package typings.dockSpawn.dockspawn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DockManagerContext extends js.Object {
  var dockManager: DockManager
  var documentManagerView: DocumentManagerContainer
  var model: DockModel
}

object DockManagerContext {
  @scala.inline
  def apply(dockManager: DockManager, documentManagerView: DocumentManagerContainer, model: DockModel): DockManagerContext = {
    val __obj = js.Dynamic.literal(dockManager = dockManager.asInstanceOf[js.Any], documentManagerView = documentManagerView.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockManagerContext]
  }
}

