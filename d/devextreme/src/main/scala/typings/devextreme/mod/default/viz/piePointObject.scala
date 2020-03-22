package typings.devextreme.mod.default.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "viz.piePointObject")
@js.native
class piePointObject ()
  extends typings.devextreme.mod.DevExpress.viz.piePointObject {
  /** Contains the data object that the series point represents. */
  /* CompleteClass */
  override var data: js.Any = js.native
  /** Provides information about the state of the point object. */
  /* CompleteClass */
  override var fullState: Double = js.native
  /** Returns the point's argument value that was set in the data source. */
  /* CompleteClass */
  override var originalArgument: String | Double | Date = js.native
  /** Returns the point's value that was set in the data source. */
  /* CompleteClass */
  override var originalValue: String | Double | Date = js.native
  /** Gets the percentage value of the specific point. */
  /* CompleteClass */
  override var percent: String | Double | Date = js.native
  /** Returns the series object to which the point belongs. */
  /* CompleteClass */
  override var series: js.Any = js.native
  /** Returns the tag of the point. */
  /* CompleteClass */
  override var tag: js.Any = js.native
  /** Switches the point from the hover state back to normal. */
  /* CompleteClass */
  override def clearHover(): Unit = js.native
  /** Deselects the point. */
  /* CompleteClass */
  override def clearSelection(): Unit = js.native
  /** Gets the color of a particular point. */
  /* CompleteClass */
  override def getColor(): String = js.native
  /** Allows you to obtain the label(s) of the series point. */
  /* CompleteClass */
  override def getLabel(): typings.devextreme.mod.DevExpress.viz.baseLabelObject with js.Array[typings.devextreme.mod.DevExpress.viz.baseLabelObject] = js.native
  /** Hides a specific point. */
  /* CompleteClass */
  override def hide(): Unit = js.native
  /** Hides the tooltip of the point. */
  /* CompleteClass */
  override def hideTooltip(): Unit = js.native
  /** Switches the point into the hover state, the same as when a user places the mouse pointer on it. */
  /* CompleteClass */
  override def hover(): Unit = js.native
  /** Provides information about the hover state of a point. */
  /* CompleteClass */
  override def isHovered(): Boolean = js.native
  /** Provides information about the selection state of a point. */
  /* CompleteClass */
  override def isSelected(): Boolean = js.native
  /** Provides information about the visibility state of a point. */
  /* CompleteClass */
  override def isVisible(): Boolean = js.native
  /** Selects the point. The point is displayed in a 'selected' style until another point is selected or the current point is deselected programmatically. */
  /* CompleteClass */
  override def select(): Unit = js.native
  /** Makes a specific point visible. */
  /* CompleteClass */
  override def show(): Unit = js.native
  /** Shows the tooltip of the point. */
  /* CompleteClass */
  override def showTooltip(): Unit = js.native
}

