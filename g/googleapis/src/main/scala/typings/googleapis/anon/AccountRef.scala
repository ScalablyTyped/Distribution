package typings.googleapis.anon

import typings.googleapis.v3Mod.analyticsV3.SchemaAccountRef
import typings.googleapis.v3Mod.analyticsV3.SchemaProfileRef
import typings.googleapis.v3Mod.analyticsV3.SchemaWebPropertyRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountRef extends StObject {
  
  var accountRef: js.UndefOr[SchemaAccountRef] = js.undefined
  
  var profileRef: js.UndefOr[SchemaProfileRef] = js.undefined
  
  var webPropertyRef: js.UndefOr[SchemaWebPropertyRef] = js.undefined
}
object AccountRef {
  
  inline def apply(): AccountRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountRef]
  }
  
  extension [Self <: AccountRef](x: Self) {
    
    inline def setAccountRef(value: SchemaAccountRef): Self = StObject.set(x, "accountRef", value.asInstanceOf[js.Any])
    
    inline def setAccountRefUndefined: Self = StObject.set(x, "accountRef", js.undefined)
    
    inline def setProfileRef(value: SchemaProfileRef): Self = StObject.set(x, "profileRef", value.asInstanceOf[js.Any])
    
    inline def setProfileRefUndefined: Self = StObject.set(x, "profileRef", js.undefined)
    
    inline def setWebPropertyRef(value: SchemaWebPropertyRef): Self = StObject.set(x, "webPropertyRef", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyRefUndefined: Self = StObject.set(x, "webPropertyRef", js.undefined)
  }
}
