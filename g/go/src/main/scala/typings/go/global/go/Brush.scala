package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Brush holds color information and describes how to draw the inside
  * of a Shape or the stroke of a shape or a TextBlock or the
  * background of any GraphObject.
  * A Brush must not be modified once it has been assigned to a GraphObject,
  * such as the Shape.fill or TextBlock.stroke
  * or GraphObject.background.
  * However, a Brush may be shared by multiple GraphObjects.
  */
@JSGlobal("go.Brush")
@js.native
/**
  * Construct a solid color Brush that holds the given color information.
  * @param {string=} color a well-formed CSS string describing a solid color brush; if not supplied uses 'black'.
  */
open class Brush ()
  extends typings.go.mod.Brush {
  def this(color: String) = this()
  /**
    * Construct a Brush class of a given type.
    * @param {EnumValue} type one of the values  Brush.Solid, Brush.Linear, Brush.Radial, Brush.Pattern.
    */
  def this(`type`: typings.go.mod.EnumValue) = this()
}
object Brush {
  
  @JSGlobal("go.Brush")
  @js.native
  val ^ : js.Any = js.native
  
  /**For linear gradient brushes, used as the value for Brush.type.*/
  /* static member */
  @JSGlobal("go.Brush.Linear")
  @js.native
  def Linear: typings.go.mod.EnumValue = js.native
  inline def Linear_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Linear")(x.asInstanceOf[js.Any])
  
  /**For pattern brushes, used as the value for Brush.type.*/
  /* static member */
  @JSGlobal("go.Brush.Pattern")
  @js.native
  def Pattern: typings.go.mod.EnumValue = js.native
  inline def Pattern_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pattern")(x.asInstanceOf[js.Any])
  
  /**For radial gradient brushes, used as the value for Brush.type.*/
  /* static member */
  @JSGlobal("go.Brush.Radial")
  @js.native
  def Radial: typings.go.mod.EnumValue = js.native
  inline def Radial_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Radial")(x.asInstanceOf[js.Any])
  
  /**For simple, solid color brushes, used as the value for Brush.type.*/
  /* static member */
  @JSGlobal("go.Brush.Solid")
  @js.native
  def Solid: typings.go.mod.EnumValue = js.native
  inline def Solid_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Solid")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def isValidColor(color: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidColor")(color.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * This static function can be used to generate a random color string.
    * @param {number=} min a number between zero and 255, defaults to 128.
    * @param {number=} max a number between zero and 255, defaults to 255.
    */
  /* static member */
  inline def randomColor(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomColor")().asInstanceOf[String]
  inline def randomColor(min: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomColor")(min.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def randomColor(min: Double, max: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("randomColor")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def randomColor(min: Unit, max: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("randomColor")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[String]
}
