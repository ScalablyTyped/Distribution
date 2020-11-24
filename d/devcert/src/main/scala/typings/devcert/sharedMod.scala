package typings.devcert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devcert/dist/platforms/shared", JSImport.Namespace)
@js.native
object sharedMod extends js.Object {
  
  def addCertificateToNSSCertDB(nssDirGlob: String, certPath: String, certutilPath: String): Unit = js.native
  
  def assertNotTouchingFiles(filepath: String, operation: String): Unit = js.native
  
  def closeFirefox(): js.Promise[Unit] = js.native
  
  def openCertificateInFirefox(firefoxPath: String, certPath: String): js.Promise[Unit] = js.native
  
  def removeCertificateFromNSSCertDB(nssDirGlob: String, certPath: String, certutilPath: String): Unit = js.native
}
