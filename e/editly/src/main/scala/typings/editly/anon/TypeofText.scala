package typings.editly.anon

import org.scalablytyped.runtime.Instantiable1
import typings.fabric.fabricImplMod.TextOptions
import typings.fabric.mod.fabric.Text
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofText
  extends StObject
     with Instantiable1[/* text */ String, Text] {
  
  var DEFAULT_SVG_FONT_SIZE: Double = js.native
  
  /**
    * Returns fabric.Text instance from an SVG element (<b>not yet implemented</b>)
    * @static
    * @memberOf fabric.Text
    * @param {SVGElement} element Element to parse
    * @param {Function} callback callback function invoked after parsing
    * @param {Object} [options] Options object
    */
  def fromElement(element: SVGElement): typings.fabric.fabricImplMod.Text = js.native
  def fromElement(element: SVGElement, callback: js.Function): typings.fabric.fabricImplMod.Text = js.native
  def fromElement(element: SVGElement, callback: js.Function, options: TextOptions): typings.fabric.fabricImplMod.Text = js.native
  def fromElement(element: SVGElement, callback: Unit, options: TextOptions): typings.fabric.fabricImplMod.Text = js.native
  
  /**
    * Returns fabric.Text instance from an object representation
    * @static
    * @memberOf fabric.Text
    * @param {Object} object Object to create an instance from
    * @param {Function} [callback] Callback to invoke when an fabric.Text instance is created
    */
  def fromObject(`object`: Any): typings.fabric.fabricImplMod.Text = js.native
  def fromObject(`object`: Any, callback: js.Function): typings.fabric.fabricImplMod.Text = js.native
}
