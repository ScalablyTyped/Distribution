package typings.echarts.echarts

import typings.zrender.zrender.LinearGradient
import typings.zrender.zrender.graphic.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Graphic extends StObject {
  
  /**
    * x, y, x2, y2 are all percent from 0 to 1
    */
  var LinearGradient: typings.zrender.zrender.LinearGradient
  
  /**
    * Clip the given points by the given rectangular.
    *
    * @param {number[][]} points The points to be clipped,
    *     like [[23, 44], [12, 15], ...].
    * @param {ERectangle} rect The rectangular that is used to clip points.
    */
  def clipPointsByRect(points: js.Array[js.Array[Double]], rect: ERectangle): js.Array[js.Array[Double]]
  
  /**
    * Clip the first input rectangular by the second input rectangular.
    *
    * @param {ERectangle} targetRect The rectangular to be clipped.
    * @param {ERectangle} rect The rectangular that is used to clip
    *     targetRect.
    */
  def clipRectByRect(targetRect: ERectangle, rect: ERectangle): ERectangle
  
  /**
    * Create a new shape class.
    *
    * @param {number[][]} opt
    * @return {zrender.graphic.Path}
    */
  def extendShape(opt: Path): Path
  
  /**
    * Get the registered shape class.
    *
    * @param {string} name
    * @return {zrender.graphic.Path}
    */
  def getShapeClass(name: String): Path
  
  /**
    * Register a user defined shape.
    *
    * @param {string} name
    * @param {zrender.graphic.Path} ShapeClass
    */
  def registerShape(name: String, ShapeClass: Path): Unit
}
object Graphic {
  
  inline def apply(
    LinearGradient: LinearGradient,
    clipPointsByRect: (js.Array[js.Array[Double]], ERectangle) => js.Array[js.Array[Double]],
    clipRectByRect: (ERectangle, ERectangle) => ERectangle,
    extendShape: Path => Path,
    getShapeClass: String => Path,
    registerShape: (String, Path) => Unit
  ): Graphic = {
    val __obj = js.Dynamic.literal(LinearGradient = LinearGradient.asInstanceOf[js.Any], clipPointsByRect = js.Any.fromFunction2(clipPointsByRect), clipRectByRect = js.Any.fromFunction2(clipRectByRect), extendShape = js.Any.fromFunction1(extendShape), getShapeClass = js.Any.fromFunction1(getShapeClass), registerShape = js.Any.fromFunction2(registerShape))
    __obj.asInstanceOf[Graphic]
  }
  
  extension [Self <: Graphic](x: Self) {
    
    inline def setClipPointsByRect(value: (js.Array[js.Array[Double]], ERectangle) => js.Array[js.Array[Double]]): Self = StObject.set(x, "clipPointsByRect", js.Any.fromFunction2(value))
    
    inline def setClipRectByRect(value: (ERectangle, ERectangle) => ERectangle): Self = StObject.set(x, "clipRectByRect", js.Any.fromFunction2(value))
    
    inline def setExtendShape(value: Path => Path): Self = StObject.set(x, "extendShape", js.Any.fromFunction1(value))
    
    inline def setGetShapeClass(value: String => Path): Self = StObject.set(x, "getShapeClass", js.Any.fromFunction1(value))
    
    inline def setLinearGradient(value: LinearGradient): Self = StObject.set(x, "LinearGradient", value.asInstanceOf[js.Any])
    
    inline def setRegisterShape(value: (String, Path) => Unit): Self = StObject.set(x, "registerShape", js.Any.fromFunction2(value))
  }
}
