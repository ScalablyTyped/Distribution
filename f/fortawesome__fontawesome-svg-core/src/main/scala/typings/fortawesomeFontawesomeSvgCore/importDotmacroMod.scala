package typings.fortawesomeFontawesomeSvgCore

import typings.fortawesomeFontawesomeCommonTypes.mod.IconDefinition
import typings.fortawesomeFontawesomeCommonTypes.mod.IconFamily
import typings.fortawesomeFontawesomeCommonTypes.mod.IconName
import typings.fortawesomeFontawesomeCommonTypes.mod.IconStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object importDotmacroMod {
  
  @JSImport("@fortawesome/fontawesome-svg-core/import.macro", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def brands(iconName: IconName): IconDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("brands")(iconName.asInstanceOf[js.Any]).asInstanceOf[IconDefinition]
  
  inline def duotone(iconName: IconName): IconDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("duotone")(iconName.asInstanceOf[js.Any]).asInstanceOf[IconDefinition]
  
  inline def icon(params: IconMacroParams): IconDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("icon")(params.asInstanceOf[js.Any]).asInstanceOf[IconDefinition]
  
  inline def light(iconName: IconName): IconDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("light")(iconName.asInstanceOf[js.Any]).asInstanceOf[IconDefinition]
  
  inline def regular(iconName: IconName): IconDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("regular")(iconName.asInstanceOf[js.Any]).asInstanceOf[IconDefinition]
  
  inline def solid(iconName: IconName): IconDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("solid")(iconName.asInstanceOf[js.Any]).asInstanceOf[IconDefinition]
  
  inline def thin(iconName: IconName): IconDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("thin")(iconName.asInstanceOf[js.Any]).asInstanceOf[IconDefinition]
  
  trait IconMacroParams extends StObject {
    
    var family: js.UndefOr[IconFamily] = js.undefined
    
    var name: IconName
    
    var style: js.UndefOr[IconStyle] = js.undefined
  }
  object IconMacroParams {
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconMacroParams] (val x: Self) extends AnyVal {
      
      inline def setFamily(value: IconFamily): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setName(value: IconName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: IconStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
