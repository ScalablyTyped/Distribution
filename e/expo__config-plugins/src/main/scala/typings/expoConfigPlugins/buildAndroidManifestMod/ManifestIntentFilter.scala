package typings.expoConfigPlugins.buildAndroidManifestMod

import typings.expoConfigPlugins.anon.AndroidautoVerify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestIntentFilter extends StObject {
  
  @JSName("$")
  var $: js.UndefOr[AndroidautoVerify] = js.undefined
  
  var action: js.UndefOr[js.Array[ManifestAction]] = js.undefined
  
  var category: js.UndefOr[js.Array[ManifestCategory]] = js.undefined
  
  var data: js.UndefOr[js.Array[ManifestData]] = js.undefined
}
object ManifestIntentFilter {
  
  inline def apply(): ManifestIntentFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManifestIntentFilter]
  }
  
  extension [Self <: ManifestIntentFilter](x: Self) {
    
    inline def set$(value: AndroidautoVerify): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
    
    inline def set$Undefined: Self = StObject.set(x, "$", js.undefined)
    
    inline def setAction(value: js.Array[ManifestAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActionVarargs(value: ManifestAction*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setCategory(value: js.Array[ManifestCategory]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: ManifestCategory*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setData(value: js.Array[ManifestData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: ManifestData*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
