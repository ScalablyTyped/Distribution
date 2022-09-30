package typings.editly.anon

import org.scalablytyped.runtime.Instantiable1
import typings.fabric.anon.ColorStops
import typings.fabric.fabricImplMod.Object
import typings.fabric.mod.fabric.Gradient
import typings.std.SVGGradientElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofGradient
  extends StObject
     with Instantiable1[/* options */ ColorStops, Gradient] {
  
  /**
    * Returns {@link fabric.Gradient} instance from an SVG element
    * @static
    * @memberOf fabric.Gradient
    * @param {SVGGradientElement} el SVG gradient element
    * @param {fabric.Object} instance
    * @return {fabric.Gradient} Gradient instance
    * @see http://www.w3.org/TR/SVG/pservers.html#LinearGradientElement
    * @see http://www.w3.org/TR/SVG/pservers.html#RadialGradientElement
    */
  def fromElement(el: SVGGradientElement, instance: Object): typings.fabric.fabricImplMod.Gradient = js.native
}
