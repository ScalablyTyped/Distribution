package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric/fabric-impl", "BaseBrush")
@js.native
open class BaseBrush () extends StObject {
  
  /**
    * Color of a brush
    */
  var color: String = js.native
  
  /**
    * Discard points that are less than `decimate` pixel distant from each other
    */
  var decimate: Double = js.native
  
  /**
    * Shadow object representing shadow of this shape.
    * <b>Backwards incompatibility note:</b> This property replaces "shadowColor" (String), "shadowOffsetX" (Number),
    * "shadowOffsetY" (Number) and "shadowBlur" (Number) since v1.2.12
    */
  var shadow: Shadow | String = js.native
  
  /**
    * Stroke Dash Array.
    */
  var strokeDashArray: js.Array[Any] = js.native
  
  /**
    * Line endings style of a brush (one of "butt", "round", "square")
    */
  var strokeLineCap: String = js.native
  
  /**
    * Corner style of a brush (one of "bevil", "round", "miter")
    */
  var strokeLineJoin: String = js.native
  
  /**
    * Width of a brush
    */
  var width: Double = js.native
}
