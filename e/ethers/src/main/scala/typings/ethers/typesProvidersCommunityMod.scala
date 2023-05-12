package typings.ethers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersCommunityMod {
  
  @JSImport("ethers/types/providers/community", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def showThrottleMessage(service: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showThrottleMessage")(service.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait CommunityResourcable extends StObject {
    
    /**
      *  Returns true of the instance is connected using the community
      *  credentials.
      */
    def isCommunityResource(): Boolean
  }
  object CommunityResourcable {
    
    inline def apply(isCommunityResource: () => Boolean): CommunityResourcable = {
      val __obj = js.Dynamic.literal(isCommunityResource = js.Any.fromFunction0(isCommunityResource))
      __obj.asInstanceOf[CommunityResourcable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommunityResourcable] (val x: Self) extends AnyVal {
      
      inline def setIsCommunityResource(value: () => Boolean): Self = StObject.set(x, "isCommunityResource", js.Any.fromFunction0(value))
    }
  }
}
