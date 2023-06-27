package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric/fabric-impl", "Shadow")
@js.native
open class Shadow ()
  extends StObject
     with IShadowOptions {
  def this(options: String) = this()
  def this(options: IShadowOptions) = this()
  
  def initialize(): Shadow = js.native
  def initialize(options: String): Shadow = js.native
  def initialize(options: IShadowOptions): Shadow = js.native
  
  /**
    * Returns object representation of a shadow
    * @return {Object} Object representation of a shadow instance
    */
  def toObject(): Any = js.native
  
  /**
    * Returns SVG representation of a shadow
    * @param {fabric.Object} object
    * @return {String} SVG representation of a shadow
    */
  def toSVG(`object`: Object): String = js.native
}
/* static members */
object Shadow {
  
  @JSImport("fabric/fabric-impl", "Shadow")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Regex matching shadow offsetX, offsetY and blur (ex: "2px 2px 10px rgba(0,0,0,0.2)", "rgb(0,255,0) 2px 2px")
    * @static
    * @field
    */
  @JSImport("fabric/fabric-impl", "Shadow.reOffsetsAndBlur")
  @js.native
  def reOffsetsAndBlur: js.RegExp = js.native
  inline def reOffsetsAndBlur_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reOffsetsAndBlur")(x.asInstanceOf[js.Any])
}
