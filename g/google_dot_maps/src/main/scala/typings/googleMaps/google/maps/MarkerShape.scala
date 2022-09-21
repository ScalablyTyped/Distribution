package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object defines the clickable region of a marker image. The shape
  * consists of two properties &mdash; <code>type</code> and <code>coord</code>
  * &mdash; which define the non-transparent region of an image.
  */
trait MarkerShape extends StObject {
  
  /**
    * The format of this attribute depends on the value of the
    * <code>type</code> and follows the w3 AREA <code>coords</code>
    * specification found at <a
    * href="http://www.w3.org/TR/REC-html40/struct/objects.html#adef-coords">
    * http://www.w3.org/TR/REC-html40/struct/objects.html#adef-coords</a>.
    * <br>The <code>coords</code> attribute is an array of integers that
    * specify the pixel position of the shape relative to the top-left corner
    * of the target image. The coordinates depend on the value of
    * <code>type</code> as follows: <br>&nbsp;&nbsp;- <code>circle</code>:
    * coords is <code>[x1,y1,r]</code> where x1,y2 are the coordinates of the
    * center of the circle, and r is the radius of the circle.
    * <br>&nbsp;&nbsp;- <code>poly</code>: coords is
    * <code>[x1,y1,x2,y2...xn,yn]</code> where each x,y pair contains the
    * coordinates of one vertex of the polygon. <br>&nbsp;&nbsp;-
    * <code>rect</code>: coords is <code>[x1,y1,x2,y2]</code> where x1,y1 are
    * the coordinates of the upper-left corner of the rectangle and x2,y2 are
    * the coordinates of the lower-right coordinates of the rectangle.
    */
  var coords: js.Array[Double] | Null
  
  /**
    * Describes the shape&#39;s type and can be <code>circle</code>,
    * <code>poly</code> or <code>rect</code>.
    */
  var `type`: String
}
object MarkerShape {
  
  inline def apply(`type`: String): MarkerShape = {
    val __obj = js.Dynamic.literal(coords = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerShape]
  }
  
  extension [Self <: MarkerShape](x: Self) {
    
    inline def setCoords(value: js.Array[Double]): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setCoordsNull: Self = StObject.set(x, "coords", null)
    
    inline def setCoordsVarargs(value: Double*): Self = StObject.set(x, "coords", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
