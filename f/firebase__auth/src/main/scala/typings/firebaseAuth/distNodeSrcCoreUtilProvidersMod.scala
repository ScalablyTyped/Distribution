package typings.firebaseAuth

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSrcCoreUtilProvidersMod {
  
  @JSImport("@firebase/auth/dist/node/src/core/util/providers", JSImport.Namespace)
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
    
    extension [Self <: ProviderAssociatedObject](x: Self) {
      
      inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
      
      inline def setProviderIdUndefined: Self = StObject.set(x, "providerId", js.undefined)
    }
  }
}
