package typings.dojo.dojox.geo.charting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/charting/Feature.html
  *
  * A class to encapsulate a map element.
  *
  * @param parent
  * @param name
  * @param shapeData
  */
@JSGlobal("dojox.geo.charting.Feature")
@js.native
class Feature protected () extends js.Object {
  def this(parent: js.Any, name: js.Any, shapeData: js.Any) = this()
  /**
    *
    */
  var isSelected: Boolean = js.native
  /**
    *
    */
  var markerText: js.Object = js.native
  /**
    * Initializes this feature.
    *
    */
  def init(): Unit = js.native
  /**
    * Sets the selected state of this feature to the given value.
    *
    * @param selected A Boolean value indicating the selected state.
    */
  def select(selected: Boolean): Unit = js.native
  /**
    * sets a numeric value on this Feature object (used together with series to apply a color).
    *
    * @param value A numeric value.
    */
  def setValue(value: Double): Unit = js.native
  /**
    * clears the colors on this Feature object.
    *
    */
  def unsetColor(): Unit = js.native
  /**
    * clears the numeric value on this Feature object (removes color).
    *
    */
  def unsetValue(): Unit = js.native
}

