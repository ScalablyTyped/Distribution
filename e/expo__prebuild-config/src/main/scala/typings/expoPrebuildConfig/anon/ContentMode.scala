package typings.expoPrebuildConfig.anon

import typings.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenInterfaceBuilderMod.IBBoolean
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.scaleToFill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentMode extends StObject {
  
  var contentMode: String | scaleToFill
  
  var id: String
  
  var insetsLayoutMarginsFromSafeArea: IBBoolean
  
  var key: String
  
  var userInteractionEnabled: IBBoolean
  
  var userLabel: String
}
object ContentMode {
  
  inline def apply(
    contentMode: String | scaleToFill,
    id: String,
    insetsLayoutMarginsFromSafeArea: IBBoolean,
    key: String,
    userInteractionEnabled: IBBoolean,
    userLabel: String
  ): ContentMode = {
    val __obj = js.Dynamic.literal(contentMode = contentMode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], insetsLayoutMarginsFromSafeArea = insetsLayoutMarginsFromSafeArea.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], userInteractionEnabled = userInteractionEnabled.asInstanceOf[js.Any], userLabel = userLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentMode]
  }
  
  extension [Self <: ContentMode](x: Self) {
    
    inline def setContentMode(value: String | scaleToFill): Self = StObject.set(x, "contentMode", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInsetsLayoutMarginsFromSafeArea(value: IBBoolean): Self = StObject.set(x, "insetsLayoutMarginsFromSafeArea", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setUserInteractionEnabled(value: IBBoolean): Self = StObject.set(x, "userInteractionEnabled", value.asInstanceOf[js.Any])
    
    inline def setUserLabel(value: String): Self = StObject.set(x, "userLabel", value.asInstanceOf[js.Any])
  }
}
