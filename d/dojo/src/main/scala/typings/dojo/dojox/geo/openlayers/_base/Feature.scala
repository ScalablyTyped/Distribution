package typings.dojo.dojox.geo.openlayers._base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/_base.Feature.html
  *
  * A Feature encapsulates an item so that it can be added to a Layer.
  * This class is not attended to be used as it, but serve as a base class
  * for specific features such as GeometryFeature which can display georeferenced
  * geometries and WidgetFeature which can display georeferenced widgets.
  *
  */
@JSGlobal("dojox.geo.openlayers._base.Feature")
@js.native
class Feature () extends js.Object {
  /**
    * Returns the coordinate system in which coordinates of this feature are expressed.
    *
    */
  def getCoordinateSystem(): js.Any = js.native
  /**
    * Returns the Layer to which this feature belongs.
    *
    */
  def getLayer(): js.Any = js.native
  /**
    * Subclasses implements specific behavior.
    * Called when removed from the layer.
    *
    */
  def remove(): Unit = js.native
  /**
    * subclasses implements drawing specific behavior.
    *
    */
  def render(): Unit = js.native
  /**
    * Set the coordinate system in which coordinates of this feature are expressed.
    *
    * @param cs The coordinate system in which coordinates of this feature are expressed.
    */
  def setCoordinateSystem(cs: js.Object): Unit = js.native
}

