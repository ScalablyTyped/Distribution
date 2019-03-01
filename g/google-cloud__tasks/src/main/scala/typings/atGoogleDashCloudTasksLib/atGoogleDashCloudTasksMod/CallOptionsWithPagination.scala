package typings
package atGoogleDashCloudTasksLib.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait CallOptionsWithPagination extends js.Object {
  var autoPaginate: atGoogleDashCloudTasksLib.atGoogleDashCloudTasksLibNumbers.`false`
}

object CallOptionsWithPagination {
  @scala.inline
  def apply(autoPaginate: atGoogleDashCloudTasksLib.atGoogleDashCloudTasksLibNumbers.`false`): CallOptionsWithPagination = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoPaginate")(autoPaginate)
    __obj.asInstanceOf[CallOptionsWithPagination]
  }
}

