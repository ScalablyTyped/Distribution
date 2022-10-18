package typings.devcert

import org.scalablytyped.runtime.Shortcut
import typings.devcert.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPlatformsMod extends Shortcut {
  
  @JSImport("devcert/dist/platforms", JSImport.Default)
  @js.native
  val default: Platform = js.native
  
  @js.native
  trait Platform extends StObject {
    
    def addDomainToHostFileIfMissing(domain: String): js.Promise[Unit] = js.native
    
    def addToTrustStores(certificatePath: String): js.Promise[Unit] = js.native
    def addToTrustStores(certificatePath: String, options: Options): js.Promise[Unit] = js.native
    
    def deleteProtectedFiles(filepath: String): Unit = js.native
    
    def readProtectedFile(filepath: String): js.Promise[String] = js.native
    
    def removeFromTrustStores(certificatePath: String): Unit = js.native
    
    def writeProtectedFile(filepath: String, contents: String): js.Promise[Unit] = js.native
  }
  
  type _To = Platform
  
  /* This means you don't have to write `default`, but can instead just say `distPlatformsMod.foo` */
  override def _to: Platform = default
}
