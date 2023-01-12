package typings.firebaseAuth

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm5SrcCoreUtilProvidersMod {
  
  @JSImport("@firebase/auth/dist/esm5/src/core/util/providers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def providerDataAsNames[T /* <: ProviderAssociatedObject */](providerData: js.Array[T]): Set[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("providerDataAsNames")(providerData.asInstanceOf[js.Any]).asInstanceOf[Set[String]]
  
  trait ProviderAssociatedObject extends StObject {
    
    var providerId: js.UndefOr[String] = js.undefined
  }
  object ProviderAssociatedObject {
    
    inline def apply(): ProviderAssociatedObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProviderAssociatedObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProviderAssociatedObject] (val x: Self) extends AnyVal {
      
      inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
      
      inline def setProviderIdUndefined: Self = StObject.set(x, "providerId", js.undefined)
    }
  }
}
