package typings.dojo.dojox.geo.openlayers.base

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/_base.Layer.html
  *
  * Base layer class for dojox.geo.openlayers.Map specific layers extending OpenLayers.Layer class.
  * This layer class accepts Features which encapsulates graphic objects to be added to the map.
  * This layer class encapsulates an OpenLayers.Layer.
  * This class provides Feature management such as add, remove and feature access.
  *
  * @param name The name of the layer.
  * @param options Options passed to the underlying OpenLayers.Layer object.
  */
@JSGlobal("dojox.geo.openlayers._base.Layer")
@js.native
class Layer protected () extends js.Object {
  def this(name: String, options: js.Object) = this()
  /**
    * Add a feature or an array of features to the layer.
    *
    * @param f The Feature or array of features to add.
    */
  def addFeature(f: js.Array[typings.dojo.dojox.geo.openlayers.Feature]): Unit = js.native
  /**
    * Add a feature or an array of features to the layer.
    *
    * @param f The Feature or array of features to add.
    */
  def addFeature(f: typings.dojo.dojox.geo.openlayers.Feature): Unit = js.native
  /**
    * Called when the layer is added to the map
    *
    */
  def added(): Unit = js.native
  /**
    * Removes all the features from this layer.
    *
    */
  def clear(): Unit = js.native
  /**
    *
    */
  def getDojoMap(): js.Any = js.native
  /**
    * Returns the i-th feature of this layer.
    *
    * @param i The index of the feature to return.
    */
  def getFeatureAt(i: Double): js.Any = js.native
  /**
    * Returns the number of the features contained by this layer.
    *
    */
  def getFeatureCount(): js.Any = js.native
  /**
    * Returns the feature hold by this layer.
    *
    */
  def getFeatures(): js.Any = js.native
  /**
    * Called when the layer is panned or zoomed.
    *
    * @param event The event
    */
  def moveTo(event: MouseEvent): Unit = js.native
  /**
    * Redraws this layer
    *
    */
  def redraw(): Unit = js.native
  /**
    * Removes a feature or an array of features from the layer.
    *
    * @param f The Feature or array of features to remove.
    */
  def removeFeature(f: js.Array[typings.dojo.dojox.geo.openlayers.Feature]): Unit = js.native
  /**
    * Removes a feature or an array of features from the layer.
    *
    * @param f The Feature or array of features to remove.
    */
  def removeFeature(f: typings.dojo.dojox.geo.openlayers.Feature): Unit = js.native
  /**
    * Remove the feature at the specified index.
    *
    * @param index The index of the feature to remove.
    */
  def removeFeatureAt(index: Double): Unit = js.native
  /**
    * Called when rendering a feature is necessary.
    *
    * @param f The feature to draw.
    */
  def renderFeature(f: typings.dojo.dojox.geo.openlayers.Feature): Unit = js.native
}

