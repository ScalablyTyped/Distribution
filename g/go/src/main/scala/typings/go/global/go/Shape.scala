package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Shape is a GraphObject that shows a geometric figure.
  * The Geometry determines what is drawn;
  * the properties .fill and .stroke
  * (and other stroke properties) determine how it is drawn.
  */
@JSGlobal("go.Shape")
@js.native
/**
  * A newly constructed Shape has a default .figure of "None", which constructs a rectangular geometry, and is filled and stroked with a black brush.
  */
open class Shape ()
  extends typings.go.mod.Shape
object Shape {
  
  @JSGlobal("go.Shape")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This static function defines a named arrowhead geometry.
    * @param {string} name the new arrowhead name must start with an uppercase letter, and must not be "None"
    * @param {Geometry} geo the Geometry for the arrowhead
    */
  /* static member */
  inline def defineArrowheadGeometry(name: String, geo: typings.go.mod.Geometry): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineArrowheadGeometry")(name.asInstanceOf[js.Any], geo.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * This static function defines a named arrowhead geometry.
    * @param {string} name the new arrowhead name must start with an uppercase letter, and must not be "None"
    * @param {string} pathstr a geometry path string that will be passed to Geometry.parse
    */
  /* static member */
  inline def defineArrowheadGeometry(name: String, pathstr: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineArrowheadGeometry")(name.asInstanceOf[js.Any], pathstr.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * This static function defines a named figure geometry generator for Shapes.
    * @param {string} name new figure name must start with an uppercase letter, and must not be "None"
    * @param {function(Shape, number, number):Geometry} func returns a Geometry for the given Shape, width, and height
    */
  /* static member */
  inline def defineFigureGenerator(
    name: String,
    func: js.Function3[
      /* shape */ typings.go.mod.Shape, 
      /* width */ Double, 
      /* height */ Double, 
      typings.go.mod.Geometry
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineFigureGenerator")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * This static function defines a synonym for a named figure geometry generator.
    * @param {string} name the new figure name must start with an uppercase letter, and must not be "None"
    * @param {string} synonym an existing figure name
    */
  /* static member */
  inline def defineFigureGenerator(name: String, synonym: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineFigureGenerator")(name.asInstanceOf[js.Any], synonym.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * This static function returns a read-only Map of named arrowhead geometries.
    * @return {Map} the keys are arrowhead names; the values are Geometry objects
    */
  /* static member */
  inline def getArrowheadGeometries(): typings.go.mod.Map[String, typings.go.mod.Geometry] = ^.asInstanceOf[js.Dynamic].applyDynamic("getArrowheadGeometries")().asInstanceOf[typings.go.mod.Map[String, typings.go.mod.Geometry]]
  
  /**
    * This static function returns a read-only Map of named geometry generators.
    * @return {Map} the keys are figure names; the values are either synonymed names or generator functions
    */
  /* static member */
  inline def getFigureGenerators(): typings.go.mod.Map[
    String, 
    js.Function3[
      /* shape */ typings.go.mod.Shape, 
      /* width */ Double, 
      /* height */ Double, 
      typings.go.mod.Geometry
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFigureGenerators")().asInstanceOf[typings.go.mod.Map[
    String, 
    js.Function3[
      /* shape */ typings.go.mod.Shape, 
      /* width */ Double, 
      /* height */ Double, 
      typings.go.mod.Geometry
    ]
  ]]
}
