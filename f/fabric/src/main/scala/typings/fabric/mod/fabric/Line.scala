package typings.fabric.mod.fabric

import typings.fabric.fabricImplMod.ILineOptions
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Line")
@js.native
/**
  * Constructor
  * @param [points] Array of points
  * @param [options] Options object
  */
open class Line ()
  extends typings.fabric.fabricImplMod.Line {
  def this(points: js.Array[Double]) = this()
  def this(points: js.Array[Double], objObjects: ILineOptions) = this()
  def this(points: Unit, objObjects: ILineOptions) = this()
}
/* static members */
object Line {
  
  @JSImport("fabric", "fabric.Line")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fabric", "fabric.Line.ATTRIBUTE_NAMES")
  @js.native
  def ATTRIBUTE_NAMES: js.Array[String] = js.native
  inline def ATTRIBUTE_NAMES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_NAMES")(x.asInstanceOf[js.Any])
  
  /**
    * Returns fabric.Line instance from an SVG element
    * @static
    * @param {SVGElement} element Element to parse
    * @param {Object} [options] Options object
    * @param {Function} [callback] callback function invoked after parsing
    */
  inline def fromElement(element: SVGElement): typings.fabric.fabricImplMod.Line = ^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any]).asInstanceOf[typings.fabric.fabricImplMod.Line]
  inline def fromElement(element: SVGElement, callback: js.Function): typings.fabric.fabricImplMod.Line = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.fabric.fabricImplMod.Line]
  inline def fromElement(element: SVGElement, callback: js.Function, options: ILineOptions): typings.fabric.fabricImplMod.Line = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fabric.fabricImplMod.Line]
  inline def fromElement(element: SVGElement, callback: Unit, options: ILineOptions): typings.fabric.fabricImplMod.Line = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fabric.fabricImplMod.Line]
  
  /**
    * Returns fabric.Line instance from an object representation
    * @param object Object to create an instance from
    */
  inline def fromObject(`object`: Any): typings.fabric.fabricImplMod.Line = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.fabric.fabricImplMod.Line]
}
