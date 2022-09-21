package typings.expoAsset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetSourcesMod {
  
  @JSImport("expo-asset/build/AssetSources", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveUri(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveUri")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def selectAssetSource(meta: AssetMetadata): AssetSource = ^.asInstanceOf[js.Dynamic].applyDynamic("selectAssetSource")(meta.asInstanceOf[js.Any]).asInstanceOf[AssetSource]
  
  trait AssetMetadata extends StObject {
    
    var fileHashes: js.UndefOr[js.Array[String]] = js.undefined
    
    var fileUris: js.UndefOr[js.Array[String]] = js.undefined
    
    var hash: String
    
    var height: js.UndefOr[Double] = js.undefined
    
    var httpServerLocation: String
    
    var name: String
    
    var scales: js.Array[Double]
    
    var `type`: String
    
    var uri: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object AssetMetadata {
    
    inline def apply(hash: String, httpServerLocation: String, name: String, scales: js.Array[Double], `type`: String): AssetMetadata = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], httpServerLocation = httpServerLocation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetMetadata]
    }
    
    extension [Self <: AssetMetadata](x: Self) {
      
      inline def setFileHashes(value: js.Array[String]): Self = StObject.set(x, "fileHashes", value.asInstanceOf[js.Any])
      
      inline def setFileHashesUndefined: Self = StObject.set(x, "fileHashes", js.undefined)
      
      inline def setFileHashesVarargs(value: String*): Self = StObject.set(x, "fileHashes", js.Array(value*))
      
      inline def setFileUris(value: js.Array[String]): Self = StObject.set(x, "fileUris", value.asInstanceOf[js.Any])
      
      inline def setFileUrisUndefined: Self = StObject.set(x, "fileUris", js.undefined)
      
      inline def setFileUrisVarargs(value: String*): Self = StObject.set(x, "fileUris", js.Array(value*))
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHttpServerLocation(value: String): Self = StObject.set(x, "httpServerLocation", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setScales(value: js.Array[Double]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
      
      inline def setScalesVarargs(value: Double*): Self = StObject.set(x, "scales", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait AssetSource extends StObject {
    
    var hash: String
    
    var uri: String
  }
  object AssetSource {
    
    inline def apply(hash: String, uri: String): AssetSource = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetSource]
    }
    
    extension [Self <: AssetSource](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
}
