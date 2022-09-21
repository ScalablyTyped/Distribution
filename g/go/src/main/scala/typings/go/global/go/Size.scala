package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Size describes a width and a height in two-dimensional coordinates.
  * The width and height must both be non-negative.
  */
@JSGlobal("go.Size")
@js.native
/**
  * The default constructor produces the Size(0,0).
  */
open class Size ()
  extends typings.go.mod.Size {
  /**
    * The two-argument constructor produces the Size(w,h).
    * @param {number} w this number must not be negative.
    * @param {number} h this number must not be negative.
    */
  def this(w: Double, h: Double) = this()
}
object Size {
  
  @JSGlobal("go.Size")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This static function can be used to read in a Size from a string that was produced by Size.stringify.
    * @param {string} str
    */
  /* static member */
  inline def parse(str: String): typings.go.mod.Size = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[typings.go.mod.Size]
  
  /**
    * This static function can be used to write out a Size as a string that can be read by Size.parse.
    * @param {Size} val
    */
  /* static member */
  inline def stringify(`val`: typings.go.mod.Size): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
}
