package typings.fabric.mod.fabric

import typings.fabric.fabricImplMod.TextOptions
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Text")
@js.native
open class Text protected ()
  extends typings.fabric.fabricImplMod.Text {
  /**
    * Constructor
    * @param text Text string
    * @param [options] Options object
    */
  def this(text: String) = this()
  def this(text: String, options: TextOptions) = this()
}
/* static members */
object Text {
  
  @JSImport("fabric", "fabric.Text")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fabric", "fabric.Text.DEFAULT_SVG_FONT_SIZE")
  @js.native
  def DEFAULT_SVG_FONT_SIZE: Double = js.native
  inline def DEFAULT_SVG_FONT_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_SVG_FONT_SIZE")(x.asInstanceOf[js.Any])
  
  /**
    * Returns fabric.Text instance from an SVG element (<b>not yet implemented</b>)
    * @static
    * @memberOf fabric.Text
    * @param {SVGElement} element Element to parse
    * @param {Function} callback callback function invoked after parsing
    * @param {Object} [options] Options object
    */
  inline def fromElement(element: SVGElement): typings.fabric.fabricImplMod.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any]).asInstanceOf[typings.fabric.fabricImplMod.Text]
  inline def fromElement(element: SVGElement, callback: js.Function): typings.fabric.fabricImplMod.Text = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.fabric.fabricImplMod.Text]
  inline def fromElement(element: SVGElement, callback: js.Function, options: TextOptions): typings.fabric.fabricImplMod.Text = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fabric.fabricImplMod.Text]
  inline def fromElement(element: SVGElement, callback: Unit, options: TextOptions): typings.fabric.fabricImplMod.Text = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fabric.fabricImplMod.Text]
  
  /**
    * Returns fabric.Text instance from an object representation
    * @static
    * @memberOf fabric.Text
    * @param {Object} object Object to create an instance from
    * @param {Function} [callback] Callback to invoke when an fabric.Text instance is created
    */
  inline def fromObject(`object`: Any): typings.fabric.fabricImplMod.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.fabric.fabricImplMod.Text]
  inline def fromObject(`object`: Any, callback: js.Function): typings.fabric.fabricImplMod.Text = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.fabric.fabricImplMod.Text]
}
