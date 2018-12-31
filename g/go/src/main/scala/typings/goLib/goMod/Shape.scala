package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Shape is a GraphObject that shows a geometric figure.
  * The Geometry determines what is drawn;
  * the properties .fill and .stroke
  * (and other stroke properties) determine how it is drawn.
  */
@JSImport("go", "Shape")
@js.native
/**
  * A newly constructed Shape has a default .figure of "None", which constructs a rectangular geometry, and is filled and stroked with a black brush.
  */
class Shape ()
  extends goLib.goMod.goNs.Shape

/**
  * A Shape is a GraphObject that shows a geometric figure.
  * The Geometry determines what is drawn;
  * the properties .fill and .stroke
  * (and other stroke properties) determine how it is drawn.
  */
@JSImport("go", "Shape")
@js.native
object Shape extends js.Object {
  /**
    * This static function defines a named arrowhead geometry.
    * @param {string} name the new arrowhead name must start with an uppercase letter, and must not be "None"
    * @param {Geometry} geo the Geometry for the arrowhead
    */
  def defineArrowheadGeometry(name: java.lang.String, geo: goLib.goMod.goNs.Geometry): scala.Unit = js.native
  /**
    * This static function defines a named arrowhead geometry.
    * @param {string} name the new arrowhead name must start with an uppercase letter, and must not be "None"
    * @param {string} pathstr a geometry path string that will be passed to Geometry.parse
    */
  def defineArrowheadGeometry(name: java.lang.String, pathstr: java.lang.String): scala.Unit = js.native
  /**
    * This static function defines a named figure geometry generator for Shapes.
    * @param {string} name new figure name must start with an uppercase letter, and must not be "None"
    * @param {function(Shape, number, number):Geometry} func returns a Geometry for the given Shape, width, and height
    */
  def defineFigureGenerator(
    name: java.lang.String,
    func: js.Function3[
      /* shape */ this.type, 
      /* width */ scala.Double, 
      /* height */ scala.Double, 
      goLib.goMod.goNs.Geometry
    ]
  ): scala.Unit = js.native
  /**
    * This static function defines a synonym for a named figure geometry generator.
    * @param {string} name the new figure name must start with an uppercase letter, and must not be "None"
    * @param {string} synonym an existing figure name
    */
  def defineFigureGenerator(name: java.lang.String, synonym: java.lang.String): scala.Unit = js.native
  /**
    * This static function returns a read-only Map of named arrowhead geometries.
    * @return {Map} the keys are arrowhead names; the values are Geometry objects
    */
  def getArrowheadGeometries(): goLib.goMod.goNs.Map[java.lang.String, goLib.goMod.goNs.Geometry] = js.native
  /**
    * This static function returns a read-only Map of named geometry generators.
    * @return {Map} the keys are figure names; the values are either synonymed names or generator functions
    */
  def getFigureGenerators(): goLib.goMod.goNs.Map[
    java.lang.String, 
    js.Function3[
      /* shape */ this.type, 
      /* width */ scala.Double, 
      /* height */ scala.Double, 
      goLib.goMod.goNs.Geometry
    ]
  ] = js.native
}

