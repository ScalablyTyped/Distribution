package typings.devextreme.mod.default.viz

import typings.devextreme.mod.DevExpress.viz.chartPointAggregationInfoObject
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "viz.chartPointObject")
@js.native
class chartPointObject ()
  extends typings.devextreme.mod.DevExpress.viz.chartPointObject {
  /** Provides information about the aggregation interval and the data objects that fall within it. */
  /* CompleteClass */
  override var aggregationInfo: chartPointAggregationInfoObject = js.native
  /** Contains the data object that the series point represents. */
  /* CompleteClass */
  override var data: js.Any = js.native
  /** Provides information about the state of the point object. */
  /* CompleteClass */
  override var fullState: Double = js.native
  /** Returns the point's argument value that was set in the data source. */
  /* CompleteClass */
  override var originalArgument: String | Double | Date = js.native
  /** Contains the close value of the point. This field is useful for points belonging to a series of the candle stick or stock type only. */
  /* CompleteClass */
  override var originalCloseValue: Double | String = js.native
  /** Contains the high value of the point. This field is useful for points belonging to a series of the candle stick or stock type only. */
  /* CompleteClass */
  override var originalHighValue: Double | String = js.native
  /** Contains the low value of the point. This field is useful for points belonging to a series of the candle stick or stock type only. */
  /* CompleteClass */
  override var originalLowValue: Double | String = js.native
  /** Contains the first value of the point. This field is useful for points belonging to a series of the range area or range bar type only. */
  /* CompleteClass */
  override var originalMinValue: String | Double | Date = js.native
  /** Contains the open value of the point. This field is useful for points belonging to a series of the candle stick or stock type only. */
  /* CompleteClass */
  override var originalOpenValue: Double | String = js.native
  /** Returns the point's value that was set in the data source. */
  /* CompleteClass */
  override var originalValue: String | Double | Date = js.native
  /** Returns the series object to which the point belongs. */
  /* CompleteClass */
  override var series: js.Any = js.native
  /** Contains the size of the bubble as it was set in the data source. This field is useful for points belonging to a series of the bubble type only. */
  /* CompleteClass */
  override var size: Double | String = js.native
  /** Returns the tag of the point. */
  /* CompleteClass */
  override var tag: js.Any = js.native
  /** Switches the point from the hover state back to normal. */
  /* CompleteClass */
  override def clearHover(): Unit = js.native
  /** Deselects the point. */
  /* CompleteClass */
  override def clearSelection(): Unit = js.native
  /** Gets the parameters of the point's minimum bounding rectangle (MBR). */
  /* CompleteClass */
  override def getBoundingRect(): js.Any = js.native
  /** Gets the color of a particular point. */
  /* CompleteClass */
  override def getColor(): String = js.native
  /** Allows you to obtain the label(s) of the series point. */
  /* CompleteClass */
  override def getLabel(): typings.devextreme.mod.DevExpress.viz.baseLabelObject with js.Array[typings.devextreme.mod.DevExpress.viz.baseLabelObject] = js.native
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
  /** Selects the point. The point is displayed in a 'selected' style until another point is selected or the current point is deselected programmatically. */
  /* CompleteClass */
  override def select(): Unit = js.native
  /** Shows the tooltip of the point. */
  /* CompleteClass */
  override def showTooltip(): Unit = js.native
}

