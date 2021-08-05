package typings.expoConfigureSplashScreen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletionFlag extends StObject {
  
  var deletionFlag: js.UndefOr[Boolean] = js.undefined
}
object DeletionFlag {
  
  inline def apply(): DeletionFlag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletionFlag]
  }
  
  extension [Self <: DeletionFlag](x: Self) {
    
    inline def setDeletionFlag(value: Boolean): Self = StObject.set(x, "deletionFlag", value.asInstanceOf[js.Any])
    
    inline def setDeletionFlagUndefined: Self = StObject.set(x, "deletionFlag", js.undefined)
  }
}
