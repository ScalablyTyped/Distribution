package typings.fabric.mod.fabric

import typings.fabric.fabricImplMod.TextOptions
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Text")
@js.native
class Text protected ()
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
  @scala.inline
  def DEFAULT_SVG_FONT_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_SVG_FONT_SIZE")(x.asInstanceOf[js.Any])
  
  /**
    * Returns fabric.Text instance from an SVG element (<b>not yet implemented</b>)
    * @static
    * @memberOf fabric.Text
    * @param {SVGElement} element Element to parse
    * @param {Function} callback callback function invoked after parsing
    * @param {Object} [options] Options object
    */
  @JSImport("fabric", "fabric.Text.fromElement")
  @js.native
  def fromElement(element: SVGElement): typings.fabric.fabricImplMod.Text = js.native
  @JSImport("fabric", "fabric.Text.fromElement")
  @js.native
  def fromElement(element: SVGElement, callback: js.UndefOr[scala.Nothing], options: TextOptions): typings.fabric.fabricImplMod.Text = js.native
  @JSImport("fabric", "fabric.Text.fromElement")
  @js.native
  def fromElement(element: SVGElement, callback: js.Function): typings.fabric.fabricImplMod.Text = js.native
  @JSImport("fabric", "fabric.Text.fromElement")
  @js.native
  def fromElement(element: SVGElement, callback: js.Function, options: TextOptions): typings.fabric.fabricImplMod.Text = js.native
  
  /**
    * Returns fabric.Text instance from an object representation
    * @static
    * @memberOf fabric.Text
    * @param {Object} object Object to create an instance from
    * @param {Function} [callback] Callback to invoke when an fabric.Text instance is created
    */
  @JSImport("fabric", "fabric.Text.fromObject")
  @js.native
  def fromObject(`object`: js.Any): typings.fabric.fabricImplMod.Text = js.native
  @JSImport("fabric", "fabric.Text.fromObject")
  @js.native
  def fromObject(`object`: js.Any, callback: js.Function): typings.fabric.fabricImplMod.Text = js.native
}
