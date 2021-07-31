package typings.devcert

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @JSImport("devcert/dist/constants", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("devcert/dist/constants", "VALID_DOMAIN")
  @js.native
  val VALID_DOMAIN: RegExp = js.native
  
  @JSImport("devcert/dist/constants", "VALID_IP")
  @js.native
  val VALID_IP: RegExp = js.native
  
  @JSImport("devcert/dist/constants", "caSelfSignConfig")
  @js.native
  val caSelfSignConfig: String = js.native
  
  @JSImport("devcert/dist/constants", "caVersionFile")
  @js.native
  val caVersionFile: String = js.native
  
  @JSImport("devcert/dist/constants", "configDir")
  @js.native
  val configDir: js.Any = js.native
  
  @scala.inline
  def configPath(pathSegments: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("configPath")(pathSegments.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("devcert/dist/constants", "domainsDir")
  @js.native
  val domainsDir: String = js.native
  
  @scala.inline
  def ensureConfigDirs(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureConfigDirs")().asInstanceOf[Unit]
  
  @scala.inline
  def getLegacyConfigDir(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLegacyConfigDir")().asInstanceOf[String]
  
  @JSImport("devcert/dist/constants", "isLinux")
  @js.native
  val isLinux: Boolean = js.native
  
  @JSImport("devcert/dist/constants", "isMac")
  @js.native
  val isMac: Boolean = js.native
  
  @JSImport("devcert/dist/constants", "isWindows")
  @js.native
  val isWindows: Boolean = js.native
  
  @JSImport("devcert/dist/constants", "opensslDatabaseFilePath")
  @js.native
  val opensslDatabaseFilePath: String = js.native
  
  @JSImport("devcert/dist/constants", "opensslSerialFilePath")
  @js.native
  val opensslSerialFilePath: String = js.native
  
  @scala.inline
  def pathForDomain(domain: String, pathSegments: String*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pathForDomain")(domain.asInstanceOf[js.Any], pathSegments.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("devcert/dist/constants", "rootCACertPath")
  @js.native
  val rootCACertPath: String = js.native
  
  @JSImport("devcert/dist/constants", "rootCADir")
  @js.native
  val rootCADir: String = js.native
  
  @JSImport("devcert/dist/constants", "rootCAKeyPath")
  @js.native
  val rootCAKeyPath: String = js.native
  
  @scala.inline
  def withDomainCertificateConfig(domain: String, cb: js.Function1[/* filepath */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("withDomainCertificateConfig")(domain.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def withDomainSigningRequestConfig(domain: String, cb: js.Function1[/* filepath */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("withDomainSigningRequestConfig")(domain.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
