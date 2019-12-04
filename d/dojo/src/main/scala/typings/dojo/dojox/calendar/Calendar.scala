package typings.dojo.dojox.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/calendar/Calendar.html
  *
  *
  * @param args
  */
@JSGlobal("dojox.calendar.Calendar")
@js.native
class Calendar protected () extends CalendarBase {
  def this(args: js.Object) = this()
  /**
    * Installs the default actions on newly created default views.
    * By default this action is registering:
    * - the matrixViewRowHeaderClick method on the rowHeaderClick event of the matrix view.
    * - the columnViewColumnHeaderClick method on the columnHeaderClick event of the column view.
    *
    * @param views
    */
  def installDefaultViewsActions(views: js.Any): Unit = js.native
}

