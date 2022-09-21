package typings.expoConfigPlugins.manifestMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestApplication extends StObject {
  
  @JSName("$")
  var $: ManifestApplicationAttributes
  
  var activity: js.UndefOr[js.Array[ManifestActivity]] = js.undefined
  
  var `meta-data`: js.UndefOr[js.Array[ManifestMetaData]] = js.undefined
  
  var receiver: js.UndefOr[js.Array[ManifestReceiver]] = js.undefined
  
  var service: js.UndefOr[js.Array[ManifestService]] = js.undefined
  
  var `uses-library`: js.UndefOr[js.Array[ManifestUsesLibrary]] = js.undefined
}
object ManifestApplication {
  
  inline def apply($: ManifestApplicationAttributes): ManifestApplication = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestApplication]
  }
  
  extension [Self <: ManifestApplication](x: Self) {
    
    inline def set$(value: ManifestApplicationAttributes): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
    
    inline def setActivity(value: js.Array[ManifestActivity]): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    inline def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
    
    inline def setActivityVarargs(value: ManifestActivity*): Self = StObject.set(x, "activity", js.Array(value*))
    
    inline def `setMeta-data`(value: js.Array[ManifestMetaData]): Self = StObject.set(x, "meta-data", value.asInstanceOf[js.Any])
    
    inline def `setMeta-dataUndefined`: Self = StObject.set(x, "meta-data", js.undefined)
    
    inline def `setMeta-dataVarargs`(value: ManifestMetaData*): Self = StObject.set(x, "meta-data", js.Array(value*))
    
    inline def setReceiver(value: js.Array[ManifestReceiver]): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    inline def setReceiverUndefined: Self = StObject.set(x, "receiver", js.undefined)
    
    inline def setReceiverVarargs(value: ManifestReceiver*): Self = StObject.set(x, "receiver", js.Array(value*))
    
    inline def setService(value: js.Array[ManifestService]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setServiceVarargs(value: ManifestService*): Self = StObject.set(x, "service", js.Array(value*))
    
    inline def `setUses-library`(value: js.Array[ManifestUsesLibrary]): Self = StObject.set(x, "uses-library", value.asInstanceOf[js.Any])
    
    inline def `setUses-libraryUndefined`: Self = StObject.set(x, "uses-library", js.undefined)
    
    inline def `setUses-libraryVarargs`(value: ManifestUsesLibrary*): Self = StObject.set(x, "uses-library", js.Array(value*))
  }
}
