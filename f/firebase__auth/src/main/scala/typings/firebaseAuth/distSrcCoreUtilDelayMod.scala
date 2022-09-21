package typings.firebaseAuth

import typings.firebaseAuth.firebaseAuthNumbers.`5000`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreUtilDelayMod {
  
  @JSImport("@firebase/auth/dist/src/core/util/delay", "Delay")
  @js.native
  open class Delay protected () extends StObject {
    def this(shortDelay: Double, longDelay: Double) = this()
    
    def get(): Double = js.native
    
    /* private */ val isMobile: Any = js.native
    
    /* private */ val longDelay: Any = js.native
    
    /* private */ val shortDelay: Any = js.native
  }
  
  object DelayMin {
    
    inline def OFFLINE: `5000` = 5000.asInstanceOf[`5000`]
  }
  type DelayMin = `5000`
}
