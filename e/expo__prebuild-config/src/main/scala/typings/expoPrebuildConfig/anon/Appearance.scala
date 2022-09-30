package typings.expoPrebuildConfig.anon

import typings.expoPrebuildConfig.expoPrebuildConfigStrings.light
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.portrait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Appearance extends StObject {
  
  var appearance: String | light
  
  var id: String
  
  var orientation: String | portrait
}
object Appearance {
  
  inline def apply(appearance: String | light, id: String, orientation: String | portrait): Appearance = {
    val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appearance]
  }
  
  extension [Self <: Appearance](x: Self) {
    
    inline def setAppearance(value: String | light): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: String | portrait): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
  }
}
