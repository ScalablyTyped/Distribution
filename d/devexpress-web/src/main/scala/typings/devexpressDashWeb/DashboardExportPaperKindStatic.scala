package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardExportPaperKindStatic extends js.Object {
  /**
    * A3 paper (297 mm by 420 mm).
    */
  var A3: String
  /**
    * A4 paper (210 mm by 297 mm).
    */
  var A4: String
  /**
    * A5 paper (148 mm by 210 mm).
    */
  var A5: String
  /**
    * Executive paper (7.25 in. by 10.5 in.).
    */
  var Executive: String
  /**
    * Legal paper (8.5 in. by 14 in.).
    */
  var Legal: String
  /**
    * Letter paper (8.5 in. by 11 in.).
    */
  var Letter: String
}

object DashboardExportPaperKindStatic {
  @scala.inline
  def apply(A3: String, A4: String, A5: String, Executive: String, Legal: String, Letter: String): DashboardExportPaperKindStatic = {
    val __obj = js.Dynamic.literal(A3 = A3, A4 = A4, A5 = A5, Executive = Executive, Legal = Legal, Letter = Letter)
  
    __obj.asInstanceOf[DashboardExportPaperKindStatic]
  }
}

