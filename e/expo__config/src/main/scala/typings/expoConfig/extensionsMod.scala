package typings.expoConfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extensionsMod {
  
  @JSImport("@expo/config/build/paths/extensions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBareExtensions(platforms: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBareExtensions")(platforms.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def getBareExtensions(platforms: js.Array[String], languageOptions: LanguageOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBareExtensions")(platforms.asInstanceOf[js.Any], languageOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def getExtensions(platforms: js.Array[String], extensions: js.Array[String], workflows: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getExtensions")(platforms.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], workflows.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def getLanguageExtensionsInOrder(hasIsTSIsModernIsReact: LanguageOptions): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguageExtensionsInOrder")(hasIsTSIsModernIsReact.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getManagedExtensions(platforms: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getManagedExtensions")(platforms.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def getManagedExtensions(platforms: js.Array[String], languageOptions: LanguageOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getManagedExtensions")(platforms.asInstanceOf[js.Any], languageOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  trait LanguageOptions extends StObject {
    
    var isModern: Boolean
    
    var isReact: Boolean
    
    var isTS: Boolean
  }
  object LanguageOptions {
    
    inline def apply(isModern: Boolean, isReact: Boolean, isTS: Boolean): LanguageOptions = {
      val __obj = js.Dynamic.literal(isModern = isModern.asInstanceOf[js.Any], isReact = isReact.asInstanceOf[js.Any], isTS = isTS.asInstanceOf[js.Any])
      __obj.asInstanceOf[LanguageOptions]
    }
    
    extension [Self <: LanguageOptions](x: Self) {
      
      inline def setIsModern(value: Boolean): Self = StObject.set(x, "isModern", value.asInstanceOf[js.Any])
      
      inline def setIsReact(value: Boolean): Self = StObject.set(x, "isReact", value.asInstanceOf[js.Any])
      
      inline def setIsTS(value: Boolean): Self = StObject.set(x, "isTS", value.asInstanceOf[js.Any])
    }
  }
}
