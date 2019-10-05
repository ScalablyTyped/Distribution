package typings.dojo.dojox.widget

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.dojoStrings.parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/Calendar.html
  *
  * The standard Calendar. It includes day and month/year views.
  * No visual effects are included.
  *
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dojox.widget._CalendarMonthYear because Inheritance from two classes. Inlined 
- typings.dojo.dojox.widget._CalendarDay because Inheritance from two classes. Inlined parent */ @JSGlobal("dojox.widget.Calendar")
@js.native
class Calendar () extends _CalendarBase {
  /**
    *
    */
  var parent: js.Object = js.native
  @JSName("get")
  def get_parent(property: parent): js.Object = js.native
  @JSName("set")
  def set_parent(property: parent, value: js.Object): Unit = js.native
  @JSName("watch")
  def watch_parent(property: parent, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
}

