package typings.elkjs.libElkApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElkLayoutAlgorithmDescription
  extends StObject
     with ElkCommonDescription {
  
  var category: js.UndefOr[String] = js.undefined
  
  var knownOptions: js.UndefOr[js.Array[String]] = js.undefined
  
  var supportedFeatures: js.UndefOr[js.Array[String]] = js.undefined
}
object ElkLayoutAlgorithmDescription {
  
  inline def apply(): ElkLayoutAlgorithmDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElkLayoutAlgorithmDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElkLayoutAlgorithmDescription] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setKnownOptions(value: js.Array[String]): Self = StObject.set(x, "knownOptions", value.asInstanceOf[js.Any])
    
    inline def setKnownOptionsUndefined: Self = StObject.set(x, "knownOptions", js.undefined)
    
    inline def setKnownOptionsVarargs(value: String*): Self = StObject.set(x, "knownOptions", js.Array(value*))
    
    inline def setSupportedFeatures(value: js.Array[String]): Self = StObject.set(x, "supportedFeatures", value.asInstanceOf[js.Any])
    
    inline def setSupportedFeaturesUndefined: Self = StObject.set(x, "supportedFeatures", js.undefined)
    
    inline def setSupportedFeaturesVarargs(value: String*): Self = StObject.set(x, "supportedFeatures", js.Array(value*))
  }
}
