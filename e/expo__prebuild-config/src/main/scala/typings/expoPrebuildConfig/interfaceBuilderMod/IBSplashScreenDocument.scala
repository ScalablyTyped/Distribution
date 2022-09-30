package typings.expoPrebuildConfig.interfaceBuilderMod

import typings.expoPrebuildConfig.anon.IBItemtypecomappleInterfa
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBSplashScreenDocument extends StObject {
  
  var document: IBItemtypecomappleInterfa
}
object IBSplashScreenDocument {
  
  inline def apply(document: IBItemtypecomappleInterfa): IBSplashScreenDocument = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBSplashScreenDocument]
  }
  
  extension [Self <: IBSplashScreenDocument](x: Self) {
    
    inline def setDocument(value: IBItemtypecomappleInterfa): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
  }
}
