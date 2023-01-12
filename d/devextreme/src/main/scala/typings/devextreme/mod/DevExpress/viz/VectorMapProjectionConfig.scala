package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorMapProjectionConfig extends StObject {
  
  /**
    * Specifies the projection&apos;s ratio of the width to the height.
    */
  var aspectRatio: js.UndefOr[Double] = js.undefined
  
  /**
    * Converts coordinates from [x, y] to [lon, lat].
    */
  var from: js.UndefOr[js.Function1[/* coordinates */ js.Array[Double], js.Array[Double]]] = js.undefined
  
  /**
    * Converts coordinates from [lon, lat] to [x, y].
    */
  var to: js.UndefOr[js.Function1[/* coordinates */ js.Array[Double], js.Array[Double]]] = js.undefined
}
object VectorMapProjectionConfig {
  
  inline def apply(): VectorMapProjectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VectorMapProjectionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VectorMapProjectionConfig] (val x: Self) extends AnyVal {
    
    inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    inline def setFrom(value: /* coordinates */ js.Array[Double] => js.Array[Double]): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setTo(value: /* coordinates */ js.Array[Double] => js.Array[Double]): Self = StObject.set(x, "to", js.Any.fromFunction1(value))
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
