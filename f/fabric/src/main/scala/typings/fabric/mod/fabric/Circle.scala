package typings.fabric.mod.fabric

import typings.fabric.fabricImplMod.ICircleOptions
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Circle")
@js.native
class Circle ()
  extends typings.fabric.fabricImplMod.Circle {
  def this(options: ICircleOptions) = this()
}
/* static members */
object Circle {
  
  @JSImport("fabric", "fabric.Circle")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * List of attribute names to account for when parsing SVG element (used by {@link fabric.Circle.fromElement})
    */
  @JSImport("fabric", "fabric.Circle.ATTRIBUTE_NAMES")
  @js.native
  def ATTRIBUTE_NAMES: js.Array[String] = js.native
  inline def ATTRIBUTE_NAMES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_NAMES")(x.asInstanceOf[js.Any])
  
  /**
    * Returns Circle instance from an SVG element
    * @param element Element to parse
    * @param [options] Options object
    */
  inline def fromElement(element: SVGElement, options: ICircleOptions): typings.fabric.fabricImplMod.Circle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fabric.fabricImplMod.Circle]
  
  /**
    * Returns Circle instance from an object representation
    * @param object Object to create an instance from
    */
  inline def fromObject(`object`: js.Any): typings.fabric.fabricImplMod.Circle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.fabric.fabricImplMod.Circle]
}
