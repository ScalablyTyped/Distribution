package typings.dojo.dojox.calendar

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.headerPadding
import typings.dojo.dojoStrings.secondarySheetProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/calendar/ColumnView.html
  *
  * This class defines a simple column view that also uses a secondary
  * sheet to display long or all day events.
  * By default an dojox.calendar.ColumnViewSecondarySheet instance is created.
  * Set the secondarySheetClass property to define the class to instantiate,
  * for example to mix the default class with Mouse, Keyboard or Touch plugins.
  *
  */
@JSGlobal("dojox.calendar.ColumnView")
@js.native
class ColumnView () extends SimpleColumnView {
  /**
    * Padding between the header (composed of the secondary sheet and the column header)
    * and the primary sheet.
    *
    */
  var headerPadding: Double = js.native
  /**
    * Secondary sheet constructor parameters.
    *
    */
  var secondarySheetProps: js.Object = js.native
  /**
    * Returns the secondary sheet
    *
    */
  def getSecondarySheet(): js.Any = js.native
  @JSName("get")
  def get_headerPadding(property: headerPadding): Double = js.native
  @JSName("get")
  def get_secondarySheetProps(property: secondarySheetProps): js.Object = js.native
  /**
    * Event dispatched when the row header cell of the secondary sheet is clicked.
    *
    * @param e
    */
  def onRowHeaderClick(e: js.Any): Unit = js.native
  /**
    * Resizes the secondary sheet header and relayout the other sub components according this new height.
    * Warning: this method is only available for the default template and default CSS.
    *
    * @param height The new height in pixels.
    */
  def resizeSecondarySheet(height: Double): Unit = js.native
  /**
    * The secondary sheet class, by default dojox.calendar.ColumnViewSecondarySheet.
    *
    */
  def secondarySheetClass(): Unit = js.native
  @JSName("set")
  def set_headerPadding(property: headerPadding, value: Double): Unit = js.native
  @JSName("set")
  def set_secondarySheetProps(property: secondarySheetProps, value: js.Object): Unit = js.native
  /**
    *
    * @param obj
    * @param stateOnly
    */
  def updateRenderers(obj: js.Any, stateOnly: js.Any): Unit = js.native
  @JSName("watch")
  def watch_headerPadding(
    property: headerPadding,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_secondarySheetProps(
    property: secondarySheetProps,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

