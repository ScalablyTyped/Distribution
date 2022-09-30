package typings.editly.anon

import org.scalablytyped.runtime.Instantiable0
import typings.fabric.fabricImplMod.ILineOptions
import typings.fabric.mod.fabric.Line
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofLine
  extends StObject
     with Instantiable0[Line] {
  
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  
  /**
    * Returns fabric.Line instance from an SVG element
    * @static
    * @memberOf fabric.Line
    * @param {SVGElement} element Element to parse
    * @param {Object} [options] Options object
    * @param {Function} [callback] callback function invoked after parsing
    */
  def fromElement(element: SVGElement): typings.fabric.fabricImplMod.Line = js.native
  def fromElement(element: SVGElement, callback: js.Function): typings.fabric.fabricImplMod.Line = js.native
  def fromElement(element: SVGElement, callback: js.Function, options: ILineOptions): typings.fabric.fabricImplMod.Line = js.native
  def fromElement(element: SVGElement, callback: Unit, options: ILineOptions): typings.fabric.fabricImplMod.Line = js.native
  
  /**
    * Returns fabric.Line instance from an object representation
    * @param object Object to create an instance from
    */
  def fromObject(`object`: Any): typings.fabric.fabricImplMod.Line = js.native
}
