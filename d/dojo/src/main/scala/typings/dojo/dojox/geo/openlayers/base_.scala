package typings.dojo.dojox.geo.openlayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/_base.html
  *
  *
  */
trait base_ extends js.Object {
  /**
    * Defines the base layer types to be used at Map construction time or
    * with the setBaseLayerType function.
    *
    */
  var BaseLayerType: js.Object
  /**
    *
    */
  var EPSG4326: js.Object
  /**
    *
    */
  var GreatCircle: js.Object
  /**
    *
    */
  var widget: js.Object
  /**
    *
    */
  def Collection(): Unit
  /**
    *
    */
  def Feature(): Unit
  /**
    *
    */
  def Geometry(): Unit
  /**
    *
    */
  def GeometryFeature(): Unit
  /**
    *
    */
  def GfxLayer(): Unit
  /**
    *
    */
  def JsonImport(): Unit
  /**
    *
    */
  def Layer(): Unit
  /**
    *
    */
  def LineString(): Unit
  /**
    *
    */
  def Map(): Unit
  /**
    *
    */
  def Point(): Unit
  /**
    *
    */
  def TouchInteractionSupport(): Unit
  /**
    *
    */
  def WidgetFeature(): Unit
  /**
    * Parses the specified string and returns degree minute second or decimal degree.
    * Parses the specified string and returns degree minute second or decimal degree.
    *
    * @param v The string to parse
    * @param toDecimal Specifies if the result should be returned in decimal degrees or in an arraycontaining the degrees, minutes, seconds values.
    */
  def parseDMS(v: String, toDecimal: Boolean): Double
}

object base_ {
  @scala.inline
  def apply(
    BaseLayerType: js.Object,
    Collection: () => Unit,
    EPSG4326: js.Object,
    Feature: () => Unit,
    Geometry: () => Unit,
    GeometryFeature: () => Unit,
    GfxLayer: () => Unit,
    GreatCircle: js.Object,
    JsonImport: () => Unit,
    Layer: () => Unit,
    LineString: () => Unit,
    Map: () => Unit,
    Point: () => Unit,
    TouchInteractionSupport: () => Unit,
    WidgetFeature: () => Unit,
    parseDMS: (String, Boolean) => Double,
    widget: js.Object
  ): base_ = {
    val __obj = js.Dynamic.literal(BaseLayerType = BaseLayerType.asInstanceOf[js.Any], Collection = js.Any.fromFunction0(Collection), EPSG4326 = EPSG4326.asInstanceOf[js.Any], Feature = js.Any.fromFunction0(Feature), Geometry = js.Any.fromFunction0(Geometry), GeometryFeature = js.Any.fromFunction0(GeometryFeature), GfxLayer = js.Any.fromFunction0(GfxLayer), GreatCircle = GreatCircle.asInstanceOf[js.Any], JsonImport = js.Any.fromFunction0(JsonImport), Layer = js.Any.fromFunction0(Layer), LineString = js.Any.fromFunction0(LineString), Map = js.Any.fromFunction0(Map), Point = js.Any.fromFunction0(Point), TouchInteractionSupport = js.Any.fromFunction0(TouchInteractionSupport), WidgetFeature = js.Any.fromFunction0(WidgetFeature), parseDMS = js.Any.fromFunction2(parseDMS), widget = widget.asInstanceOf[js.Any])
    __obj.asInstanceOf[base_]
  }
}

