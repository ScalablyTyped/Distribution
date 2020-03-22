package typings.devcert

import typings.devcert.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devcert/dist/platforms", JSImport.Namespace)
@js.native
object platformsMod extends js.Object {
  @js.native
  trait Platform extends js.Object {
    def addDomainToHostFileIfMissing(domain: String): js.Promise[Unit] = js.native
    def addToTrustStores(certificatePath: String): js.Promise[Unit] = js.native
    def addToTrustStores(certificatePath: String, options: Options): js.Promise[Unit] = js.native
    def deleteProtectedFiles(filepath: String): Unit = js.native
    def readProtectedFile(filepath: String): js.Promise[String] = js.native
    def removeFromTrustStores(certificatePath: String): Unit = js.native
    def writeProtectedFile(filepath: String, contents: String): js.Promise[Unit] = js.native
  }
  
  val default: Platform = js.native
}

