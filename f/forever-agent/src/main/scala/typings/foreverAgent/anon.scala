package typings.foreverAgent

import org.scalablytyped.runtime.Instantiable1
import typings.foreverAgent.mod.ForeverAgentOptions
import typings.foreverAgent.mod.ForeverAgentSSL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait SSL extends StObject {
    
    var SSL: Instantiable1[/* options */ js.UndefOr[ForeverAgentOptions], ForeverAgentSSL]
  }
  object SSL {
    
    inline def apply(SSL: Instantiable1[/* options */ js.UndefOr[ForeverAgentOptions], ForeverAgentSSL]): SSL = {
      val __obj = js.Dynamic.literal(SSL = SSL.asInstanceOf[js.Any])
      __obj.asInstanceOf[SSL]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SSL] (val x: Self) extends AnyVal {
      
      inline def setSSL(value: Instantiable1[/* options */ js.UndefOr[ForeverAgentOptions], ForeverAgentSSL]): Self = StObject.set(x, "SSL", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofForeverAgent extends StObject {
    
    /* static member */
    var defaultMinSockets: Double
  }
  object TypeofForeverAgent {
    
    inline def apply(defaultMinSockets: Double): TypeofForeverAgent = {
      val __obj = js.Dynamic.literal(defaultMinSockets = defaultMinSockets.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofForeverAgent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofForeverAgent] (val x: Self) extends AnyVal {
      
      inline def setDefaultMinSockets(value: Double): Self = StObject.set(x, "defaultMinSockets", value.asInstanceOf[js.Any])
    }
  }
}
