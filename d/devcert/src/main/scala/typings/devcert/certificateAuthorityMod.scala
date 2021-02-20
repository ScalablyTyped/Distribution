package typings.devcert

import typings.devcert.anon.CaCertPath
import typings.devcert.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certificateAuthorityMod {
  
  @JSImport("devcert/dist/certificate-authority", JSImport.Default)
  @js.native
  def default(): js.Promise[Unit] = js.native
  @JSImport("devcert/dist/certificate-authority", JSImport.Default)
  @js.native
  def default(options: Options): js.Promise[Unit] = js.native
  
  @JSImport("devcert/dist/certificate-authority", "ensureCACertReadable")
  @js.native
  def ensureCACertReadable(): js.Promise[Unit] = js.native
  @JSImport("devcert/dist/certificate-authority", "ensureCACertReadable")
  @js.native
  def ensureCACertReadable(options: Options): js.Promise[Unit] = js.native
  
  @JSImport("devcert/dist/certificate-authority", "uninstall")
  @js.native
  def uninstall(): Unit = js.native
  
  @JSImport("devcert/dist/certificate-authority", "withCertificateAuthorityCredentials")
  @js.native
  def withCertificateAuthorityCredentials(cb: js.Function1[/* hasCaKeyPathCaCertPath */ CaCertPath, js.Promise[Unit] | Unit]): js.Promise[Unit] = js.native
}
