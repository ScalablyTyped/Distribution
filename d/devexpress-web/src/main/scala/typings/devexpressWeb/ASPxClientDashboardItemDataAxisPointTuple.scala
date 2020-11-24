package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a tuple of axis points.
  */
@js.native
trait ASPxClientDashboardItemDataAxisPointTuple extends js.Object {
  
  /**
    * Returns the axis point belonging to the default data axis. An ASPxClientDashboardItemDataAxisPoint object that is the axis point.
    */
  def GetAxisPoint(): ASPxClientDashboardItemDataAxisPoint = js.native
  def GetAxisPoint(axisName: String): ASPxClientDashboardItemDataAxisPoint = js.native
}
