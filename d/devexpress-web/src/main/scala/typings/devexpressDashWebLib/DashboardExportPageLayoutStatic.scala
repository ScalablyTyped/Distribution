package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardExportPageLayoutStatic extends js.Object {
  /**
    * The page orientation used to export a dashboard (dashboard item) is landscape.
    */
  var Landscape: java.lang.String
  /**
    * The page orientation used to export a dashboard (dashboard item) is portrait.
    */
  var Portrait: java.lang.String
}

object DashboardExportPageLayoutStatic {
  @scala.inline
  def apply(Landscape: java.lang.String, Portrait: java.lang.String): DashboardExportPageLayoutStatic = {
    val __obj = js.Dynamic.literal(Landscape = Landscape, Portrait = Portrait)
  
    __obj.asInstanceOf[DashboardExportPageLayoutStatic]
  }
}

