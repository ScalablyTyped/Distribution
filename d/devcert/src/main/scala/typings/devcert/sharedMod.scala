package typings.devcert

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedMod {
  
  @JSImport("devcert/dist/platforms/shared", "addCertificateToNSSCertDB")
  @js.native
  def addCertificateToNSSCertDB(nssDirGlob: String, certPath: String, certutilPath: String): Unit = js.native
  
  @JSImport("devcert/dist/platforms/shared", "assertNotTouchingFiles")
  @js.native
  def assertNotTouchingFiles(filepath: String, operation: String): Unit = js.native
  
  @JSImport("devcert/dist/platforms/shared", "closeFirefox")
  @js.native
  def closeFirefox(): js.Promise[Unit] = js.native
  
  @JSImport("devcert/dist/platforms/shared", "openCertificateInFirefox")
  @js.native
  def openCertificateInFirefox(firefoxPath: String, certPath: String): js.Promise[Unit] = js.native
  
  @JSImport("devcert/dist/platforms/shared", "removeCertificateFromNSSCertDB")
  @js.native
  def removeCertificateFromNSSCertDB(nssDirGlob: String, certPath: String, certutilPath: String): Unit = js.native
}
