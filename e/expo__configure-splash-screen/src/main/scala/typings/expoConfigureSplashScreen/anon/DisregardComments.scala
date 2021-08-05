package typings.expoConfigureSplashScreen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisregardComments extends StObject {
  
  var disregardComments: js.UndefOr[Boolean] = js.undefined
}
object DisregardComments {
  
  inline def apply(): DisregardComments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisregardComments]
  }
  
  extension [Self <: DisregardComments](x: Self) {
    
    inline def setDisregardComments(value: Boolean): Self = StObject.set(x, "disregardComments", value.asInstanceOf[js.Any])
    
    inline def setDisregardCommentsUndefined: Self = StObject.set(x, "disregardComments", js.undefined)
  }
}
