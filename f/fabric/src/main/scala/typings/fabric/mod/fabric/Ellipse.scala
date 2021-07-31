package typings.fabric.mod.fabric

import typings.fabric.fabricImplMod.IEllipseOptions
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Ellipse")
@js.native
class Ellipse ()
  extends typings.fabric.fabricImplMod.Ellipse {
  def this(options: IEllipseOptions) = this()
}
/* static members */
object Ellipse {
  
  @JSImport("fabric", "fabric.Ellipse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * List of attribute names to account for when parsing SVG element (used by {@link fabric.Ellipse.fromElement})
    */
  @JSImport("fabric", "fabric.Ellipse.ATTRIBUTE_NAMES")
  @js.native
  def ATTRIBUTE_NAMES: js.Array[String] = js.native
  @scala.inline
  def ATTRIBUTE_NAMES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_NAMES")(x.asInstanceOf[js.Any])
  
  /**
    * Returns Ellipse instance from an SVG element
    * @param element Element to parse
    * @param [options] Options object
    */
  @scala.inline
  def fromElement(element: SVGElement): typings.fabric.fabricImplMod.Ellipse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any]).asInstanceOf[typings.fabric.fabricImplMod.Ellipse]
  @scala.inline
  def fromElement(element: SVGElement, options: IEllipseOptions): typings.fabric.fabricImplMod.Ellipse = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fabric.fabricImplMod.Ellipse]
  
  /**
    * Returns Ellipse instance from an object representation
    * @param object Object to create an instance from
    */
  @scala.inline
  def fromObject(`object`: js.Any): typings.fabric.fabricImplMod.Ellipse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.fabric.fabricImplMod.Ellipse]
}
