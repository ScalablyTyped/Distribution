package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultKmsKeyName extends StObject {
  
  var defaultKmsKeyName: js.UndefOr[String] = js.undefined
}
object DefaultKmsKeyName {
  
  inline def apply(): DefaultKmsKeyName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultKmsKeyName]
  }
  
  extension [Self <: DefaultKmsKeyName](x: Self) {
    
    inline def setDefaultKmsKeyName(value: String): Self = StObject.set(x, "defaultKmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setDefaultKmsKeyNameUndefined: Self = StObject.set(x, "defaultKmsKeyName", js.undefined)
  }
}
