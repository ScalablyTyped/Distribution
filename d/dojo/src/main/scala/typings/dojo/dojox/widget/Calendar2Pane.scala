package typings.dojo.dojox.widget

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/Calendar2Pane.html
  *
  * A Calendar with two panes, the second one containing both month and year
  *
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dojox.widget.CalendarMonthYear because Inheritance from two classes. Inlined 
- typings.dojo.dojox.widget.CalendarDay because Inheritance from two classes. Inlined parent */ @JSGlobal("dojox.widget.Calendar2Pane")
@js.native
class Calendar2Pane () extends CalendarBase {
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
  ): AnonUnwatch = js.native
}

