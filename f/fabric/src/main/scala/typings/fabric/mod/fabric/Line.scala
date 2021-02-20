package typings.fabric.mod.fabric

import typings.fabric.fabricImplMod.ILineOptions
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Line")
@js.native
/**
  * Constructor
  * @param [points] Array of points
  * @param [options] Options object
  */
class Line ()
  extends typings.fabric.fabricImplMod.Line {
  def this(points: js.Array[Double]) = this()
  def this(points: js.UndefOr[scala.Nothing], objObjects: ILineOptions) = this()
  def this(points: js.Array[Double], objObjects: ILineOptions) = this()
}
/* static members */
object Line {
  
  @JSImport("fabric", "fabric.Line")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fabric", "fabric.Line.ATTRIBUTE_NAMES")
  @js.native
  def ATTRIBUTE_NAMES: js.Array[String] = js.native
  @scala.inline
  def ATTRIBUTE_NAMES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_NAMES")(x.asInstanceOf[js.Any])
  
  /**
    * Returns fabric.Line instance from an SVG element
    * @static
    * @memberOf fabric.Line
    * @param {SVGElement} element Element to parse
    * @param {Object} [options] Options object
    * @param {Function} [callback] callback function invoked after parsing
    */
  @JSImport("fabric", "fabric.Line.fromElement")
  @js.native
  def fromElement(element: SVGElement): typings.fabric.fabricImplMod.Line = js.native
  @JSImport("fabric", "fabric.Line.fromElement")
  @js.native
  def fromElement(element: SVGElement, callback: js.UndefOr[scala.Nothing], options: ILineOptions): typings.fabric.fabricImplMod.Line = js.native
  @JSImport("fabric", "fabric.Line.fromElement")
  @js.native
  def fromElement(element: SVGElement, callback: js.Function): typings.fabric.fabricImplMod.Line = js.native
  @JSImport("fabric", "fabric.Line.fromElement")
  @js.native
  def fromElement(element: SVGElement, callback: js.Function, options: ILineOptions): typings.fabric.fabricImplMod.Line = js.native
  
  /**
    * Returns fabric.Line instance from an object representation
    * @param object Object to create an instance from
    */
  @JSImport("fabric", "fabric.Line.fromObject")
  @js.native
  def fromObject(`object`: js.Any): typings.fabric.fabricImplMod.Line = js.native
}
