package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardSelectionModeStatic extends js.Object {
  var Multiple: String
  var None: String
  var Single: String
}

object DashboardSelectionModeStatic {
  @scala.inline
  def apply(Multiple: String, None: String, Single: String): DashboardSelectionModeStatic = {
    val __obj = js.Dynamic.literal(Multiple = Multiple, None = None, Single = Single)
  
    __obj.asInstanceOf[DashboardSelectionModeStatic]
  }
}

