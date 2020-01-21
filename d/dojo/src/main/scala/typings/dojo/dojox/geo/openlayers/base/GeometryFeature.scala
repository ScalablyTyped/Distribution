package typings.dojo.dojox.geo.openlayers.base

import typings.dojo.dojox.gfx.Surface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/_base.GeometryFeature.html
  *
  * A Feature encapsulating a geometry.
  * This Feature renders a geometry such as a Point or LineString geometry. This Feature
  * is responsible for reprojecting the geometry before creating a gfx shape to display it.
  * By default the shape created is a circle for a Point geometry and a polyline for a
  * LineString geometry. User can change these behavior by overriding the createShape
  * method to create the desired shape.
  *
  * @param geometry The geometry to render.
  */
@JSGlobal("dojox.geo.openlayers._base.GeometryFeature")
@js.native
class GeometryFeature protected ()
  extends typings.dojo.dojox.geo.openlayers.Feature {
  def this(geometry: typings.dojo.dojox.geo.openlayers.Geometry) = this()
  /**
    * Called when the shape rendering the geometry has to be created.
    * This default implementation creates a circle for a point geometry, a polyline for
    * a LineString geometry and is recursively called when creating a collection.
    * User may replace this method to produce a custom shape.
    *
    * @param s The surface on which the method create the shapes.
    * @param g               OptionalThe reference geometry
    */
  def createShape(s: Surface, g: typings.dojo.dojox.geo.openlayers.Geometry): js.Any = js.native
  /**
    * Returns the fill style
    *
    */
  def getFill(): js.Any = js.native
  /**
    * Returns the shape rendering the geometry
    *
    */
  def getShape(): js.Any = js.native
  /**
    * Returns the shape properties.
    *
    */
  def getShapeProperties(): js.Any = js.native
  /**
    * Returns the stroke style
    *
    */
  def getStroke(): js.Any = js.native
  def render(g: typings.dojo.dojox.geo.openlayers.Geometry): Unit = js.native
  /**
    * Renders a geometry collection.
    *
    * @param g               OptionalThe geometry to render.
    */
  def renderCollection(g: typings.dojo.dojox.geo.openlayers.Geometry): Unit = js.native
  /**
    * Renders a line string geometry.
    *
    * @param g               OptionalThe geometry to render.
    */
  def renderLineString(g: typings.dojo.dojox.geo.openlayers.Geometry): Unit = js.native
  /**
    * Renders a point geometry.
    *
    * @param g               OptionalThe geometry to render, or the current instance geometry if not specified.
    */
  def renderPoint(g: typings.dojo.dojox.geo.openlayers.Point): Unit = js.native
  /**
    * Set the fill style to be applied on the rendered shape.
    *
    * @param f The fill style
    */
  def setFill(f: js.Object): js.Function = js.native
  /**
    * Sets the shape properties.
    *
    * @param s The shape properties to set.
    */
  def setShapeProperties(s: js.Object): js.Function = js.native
  /**
    * Set the stroke style to be applied on the rendered shape.
    *
    * @param s The stroke style
    */
  def setStroke(s: js.Object): js.Function = js.native
}

