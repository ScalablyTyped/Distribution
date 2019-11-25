package typings.dojo.dojox.widget

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/DailyCalendar.html
  *
  * A calendar with only a daily view.
  *
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dojox.widget._CalendarDay because Inheritance from two classes. Inlined parent */ @JSGlobal("dojox.widget.DailyCalendar")
@js.native
class DailyCalendar () extends _CalendarBase {
  /**
    *
    */
  var parent: js.Object = js.native
  @JSName("get")
  def get_parent(property: parent): js.Object = js.native
  @JSName("set")
  def set_parent(property: parent, value: js.Object): Unit = js.native
  @JSName("watch")
  def watch_parent(
    property: parent,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

