package typings.expoDevcert

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPlatformsSharedMod {
  
  @JSImport("@expo/devcert/dist/platforms/shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addCertificateToNSSCertDB(nssDirGlob: String, certPath: String, certutilPath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCertificateToNSSCertDB")(nssDirGlob.asInstanceOf[js.Any], certPath.asInstanceOf[js.Any], certutilPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def assertNotTouchingFiles(filepath: String, operation: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNotTouchingFiles")(filepath.asInstanceOf[js.Any], operation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def closeFirefox(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("closeFirefox")().asInstanceOf[js.Promise[Unit]]
  
  inline def openCertificateInFirefox(firefoxPath: String, certPath: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("openCertificateInFirefox")(firefoxPath.asInstanceOf[js.Any], certPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def removeCertificateFromNSSCertDB(nssDirGlob: String, certPath: String, certutilPath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCertificateFromNSSCertDB")(nssDirGlob.asInstanceOf[js.Any], certPath.asInstanceOf[js.Any], certutilPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
