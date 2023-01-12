package typings.expoPrebuildConfig.anon

import typings.expoPrebuildConfig.expoPrebuildConfigStrings.HelveticaNeue
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.UICTFontTextStyleBody
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.UICTFontTextStyleCallout
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.`Helvetica Neue`
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.boldSystem
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.system
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Family extends StObject {
  
  var family: js.UndefOr[(`Helvetica Neue`) | String] = js.undefined
  
  /** @example `fontDescription` */
  var key: String
  
  /** Custom font */
  var name: js.UndefOr[HelveticaNeue | String] = js.undefined
  
  /** Font size */
  var pointSize: Double
  
  /** Built-in font */
  var `type`: js.UndefOr[system | boldSystem | UICTFontTextStyleCallout | UICTFontTextStyleBody | String] = js.undefined
}
object Family {
  
  inline def apply(key: String, pointSize: Double): Family = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], pointSize = pointSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Family]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Family] (val x: Self) extends AnyVal {
    
    inline def setFamily(value: (`Helvetica Neue`) | String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setName(value: HelveticaNeue | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPointSize(value: Double): Self = StObject.set(x, "pointSize", value.asInstanceOf[js.Any])
    
    inline def setType(value: system | boldSystem | UICTFontTextStyleCallout | UICTFontTextStyleBody | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
