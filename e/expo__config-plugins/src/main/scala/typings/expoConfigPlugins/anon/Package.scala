package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Package
  extends StObject
     with /* key */ StringDictionary[js.UndefOr[String]] {
  
  @JSName("package")
  var _package: js.UndefOr[String] = js.undefined
  
  @JSName("xmlns:android")
  var xmlnsColonandroid: String
  
  @JSName("xmlns:tools")
  var xmlnsColontools: js.UndefOr[String] = js.undefined
}
object Package {
  
  inline def apply(xmlnsColonandroid: String): Package = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("xmlns:android")(xmlnsColonandroid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Package]
  }
  
  extension [Self <: Package](x: Self) {
    
    inline def setXmlnsColonandroid(value: String): Self = StObject.set(x, "xmlns:android", value.asInstanceOf[js.Any])
    
    inline def setXmlnsColontools(value: String): Self = StObject.set(x, "xmlns:tools", value.asInstanceOf[js.Any])
    
    inline def setXmlnsColontoolsUndefined: Self = StObject.set(x, "xmlns:tools", js.undefined)
    
    inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
