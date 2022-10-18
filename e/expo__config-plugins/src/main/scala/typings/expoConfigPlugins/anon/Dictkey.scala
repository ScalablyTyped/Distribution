package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* key */ StringDictionary[js.UndefOr[String]] {
  
  @JSName("package")
  var _package: js.UndefOr[String] = js.undefined
  
  @JSName("xmlns:android")
  var xmlnsColonandroid: String
  
  @JSName("xmlns:tools")
  var xmlnsColontools: js.UndefOr[String] = js.undefined
}
object Dictkey {
  
  inline def apply(xmlnsColonandroid: String): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("xmlns:android")(xmlnsColonandroid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  extension [Self <: Dictkey](x: Self) {
    
    inline def setXmlnsColonandroid(value: String): Self = StObject.set(x, "xmlns:android", value.asInstanceOf[js.Any])
    
    inline def setXmlnsColontools(value: String): Self = StObject.set(x, "xmlns:tools", value.asInstanceOf[js.Any])
    
    inline def setXmlnsColontoolsUndefined: Self = StObject.set(x, "xmlns:tools", js.undefined)
    
    inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
