package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardExportPageLayoutStatic extends js.Object {
  /**
    * The page orientation used to export a dashboard (dashboard item) is landscape.
    */
  var Landscape: String
  /**
    * The page orientation used to export a dashboard (dashboard item) is portrait.
    */
  var Portrait: String
}

object DashboardExportPageLayoutStatic {
  @scala.inline
  def apply(Landscape: String, Portrait: String): DashboardExportPageLayoutStatic = {
    val __obj = js.Dynamic.literal(Landscape = Landscape, Portrait = Portrait)
  
    __obj.asInstanceOf[DashboardExportPageLayoutStatic]
  }
}

