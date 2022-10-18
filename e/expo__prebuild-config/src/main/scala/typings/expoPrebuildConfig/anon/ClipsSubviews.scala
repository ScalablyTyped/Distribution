package typings.expoPrebuildConfig.anon

import typings.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenInterfaceBuilderMod.IBBoolean
import typings.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenInterfaceBuilderMod.IBContentMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClipsSubviews extends StObject {
  
  var clipsSubviews: js.UndefOr[IBBoolean] = js.undefined
  
  var contentMode: IBContentMode
  
  var horizontalHuggingPriority: Double
  
  var id: String
  
  var image: String
  
  var insetsLayoutMarginsFromSafeArea: js.UndefOr[IBBoolean] = js.undefined
  
  var translatesAutoresizingMaskIntoConstraints: js.UndefOr[IBBoolean] = js.undefined
  
  var userInteractionEnabled: IBBoolean
  
  var userLabel: String
  
  var verticalHuggingPriority: Double
}
object ClipsSubviews {
  
  inline def apply(
    contentMode: IBContentMode,
    horizontalHuggingPriority: Double,
    id: String,
    image: String,
    userInteractionEnabled: IBBoolean,
    userLabel: String,
    verticalHuggingPriority: Double
  ): ClipsSubviews = {
    val __obj = js.Dynamic.literal(contentMode = contentMode.asInstanceOf[js.Any], horizontalHuggingPriority = horizontalHuggingPriority.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], userInteractionEnabled = userInteractionEnabled.asInstanceOf[js.Any], userLabel = userLabel.asInstanceOf[js.Any], verticalHuggingPriority = verticalHuggingPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipsSubviews]
  }
  
  extension [Self <: ClipsSubviews](x: Self) {
    
    inline def setClipsSubviews(value: IBBoolean): Self = StObject.set(x, "clipsSubviews", value.asInstanceOf[js.Any])
    
    inline def setClipsSubviewsUndefined: Self = StObject.set(x, "clipsSubviews", js.undefined)
    
    inline def setContentMode(value: IBContentMode): Self = StObject.set(x, "contentMode", value.asInstanceOf[js.Any])
    
    inline def setHorizontalHuggingPriority(value: Double): Self = StObject.set(x, "horizontalHuggingPriority", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setInsetsLayoutMarginsFromSafeArea(value: IBBoolean): Self = StObject.set(x, "insetsLayoutMarginsFromSafeArea", value.asInstanceOf[js.Any])
    
    inline def setInsetsLayoutMarginsFromSafeAreaUndefined: Self = StObject.set(x, "insetsLayoutMarginsFromSafeArea", js.undefined)
    
    inline def setTranslatesAutoresizingMaskIntoConstraints(value: IBBoolean): Self = StObject.set(x, "translatesAutoresizingMaskIntoConstraints", value.asInstanceOf[js.Any])
    
    inline def setTranslatesAutoresizingMaskIntoConstraintsUndefined: Self = StObject.set(x, "translatesAutoresizingMaskIntoConstraints", js.undefined)
    
    inline def setUserInteractionEnabled(value: IBBoolean): Self = StObject.set(x, "userInteractionEnabled", value.asInstanceOf[js.Any])
    
    inline def setUserLabel(value: String): Self = StObject.set(x, "userLabel", value.asInstanceOf[js.Any])
    
    inline def setVerticalHuggingPriority(value: Double): Self = StObject.set(x, "verticalHuggingPriority", value.asInstanceOf[js.Any])
  }
}
