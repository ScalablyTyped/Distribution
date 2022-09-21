package typings.fast9

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast9", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def detect(im: js.typedarray.Uint8Array, width: Double, height: Double, threshold: Double, nonmax: Boolean): js.Array[Corner] = (^.asInstanceOf[js.Dynamic].applyDynamic("detect")(im.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], nonmax.asInstanceOf[js.Any])).asInstanceOf[js.Array[Corner]]
  
  inline def fast9Detect(im: js.typedarray.Uint8Array, xsize: Double, ysize: Double, b: Double): js.Array[Corner] = (^.asInstanceOf[js.Dynamic].applyDynamic("fast9_detect")(im.asInstanceOf[js.Any], xsize.asInstanceOf[js.Any], ysize.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Corner]]
  
  inline def fast9Score(im: js.typedarray.Uint8Array, xsize: Double, ysize: Double, corners: js.Array[Corner], b: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("fast9_score")(im.asInstanceOf[js.Any], xsize.asInstanceOf[js.Any], ysize.asInstanceOf[js.Any], corners.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def nonmaxSuppression(corners: js.Array[Corner], scores: js.Array[Double]): js.Array[Corner] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonmax_suppression")(corners.asInstanceOf[js.Any], scores.asInstanceOf[js.Any])).asInstanceOf[js.Array[Corner]]
  
  trait Corner extends StObject {
    
    var score: Double
    
    var x: Double
    
    var y: Double
  }
  object Corner {
    
    inline def apply(score: Double, x: Double, y: Double): Corner = {
      val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Corner]
    }
    
    extension [Self <: Corner](x: Self) {
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
