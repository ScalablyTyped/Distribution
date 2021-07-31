package typings.expoAsset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetSourcesMod {
  
  @JSImport("expo-asset/build/AssetSources", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def resolveUri(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveUri")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def selectAssetSource(meta: AssetMetadata): AssetSource = ^.asInstanceOf[js.Dynamic].applyDynamic("selectAssetSource")(meta.asInstanceOf[js.Any]).asInstanceOf[AssetSource]
  
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
    
    @scala.inline
    def apply(hash: String, httpServerLocation: String, name: String, scales: js.Array[Double], `type`: String): AssetMetadata = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], httpServerLocation = httpServerLocation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetMetadata]
    }
    
    @scala.inline
    implicit class AssetMetadataMutableBuilder[Self <: AssetMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileHashes(value: js.Array[String]): Self = StObject.set(x, "fileHashes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileHashesUndefined: Self = StObject.set(x, "fileHashes", js.undefined)
      
      @scala.inline
      def setFileHashesVarargs(value: String*): Self = StObject.set(x, "fileHashes", js.Array(value :_*))
      
      @scala.inline
      def setFileUris(value: js.Array[String]): Self = StObject.set(x, "fileUris", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUrisUndefined: Self = StObject.set(x, "fileUris", js.undefined)
      
      @scala.inline
      def setFileUrisVarargs(value: String*): Self = StObject.set(x, "fileUris", js.Array(value :_*))
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHttpServerLocation(value: String): Self = StObject.set(x, "httpServerLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScales(value: js.Array[Double]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalesVarargs(value: Double*): Self = StObject.set(x, "scales", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait AssetSource extends StObject {
    
    var hash: String
    
    var uri: String
  }
  object AssetSource {
    
    @scala.inline
    def apply(hash: String, uri: String): AssetSource = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetSource]
    }
    
    @scala.inline
    implicit class AssetSourceMutableBuilder[Self <: AssetSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
}
