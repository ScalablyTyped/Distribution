package typings.firebaseApp

import typings.firebaseApp.distAppSrcTypesMod.PlatformLoggerService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAppSrcPlatformLoggerServiceMod {
  
  @JSImport("@firebase/app/dist/app/src/platformLoggerService", "PlatformLoggerServiceImpl")
  @js.native
  open class PlatformLoggerServiceImpl protected ()
    extends StObject
       with PlatformLoggerService {
    def this(container: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentContainer */ Any) = this()
    
    /* private */ val container: Any = js.native
    
    /* CompleteClass */
    override def getPlatformInfoString(): String = js.native
  }
}
