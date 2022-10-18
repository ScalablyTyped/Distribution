package typings.devcert

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConstantsMod {
  
  @JSImport("devcert/dist/constants", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("devcert/dist/constants", "caSelfSignConfig")
  @js.native
  val caSelfSignConfig: String = js.native
  
  @JSImport("devcert/dist/constants", "caVersionFile")
  @js.native
  val caVersionFile: String = js.native
  
  @JSImport("devcert/dist/constants", "configDir")
  @js.native
  val configDir: Any = js.native
  
  inline def configPath(pathSegments: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("configPath")(pathSegments.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  @JSImport("devcert/dist/constants", "domainsDir")
  @js.native
  val domainsDir: String = js.native
  
  inline def ensureConfigDirs(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureConfigDirs")().asInstanceOf[Unit]
  
  inline def getLegacyConfigDir(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLegacyConfigDir")().asInstanceOf[String]
  
  inline def getStableDomainPath(domains: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStableDomainPath")(domains.asInstanceOf[js.Any]).asInstanceOf[String]
  
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
  
  inline def pathForDomain(domain: String, pathSegments: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pathForDomain")(scala.List(domain.asInstanceOf[js.Any]).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  @JSImport("devcert/dist/constants", "rootCACertPath")
  @js.native
  val rootCACertPath: String = js.native
  
  @JSImport("devcert/dist/constants", "rootCADir")
  @js.native
  val rootCADir: String = js.native
  
  @JSImport("devcert/dist/constants", "rootCAKeyPath")
  @js.native
  val rootCAKeyPath: String = js.native
  
  inline def withDomainCertificateConfig(domains: js.Array[String], cb: js.Function1[/* filepath */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("withDomainCertificateConfig")(domains.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def withDomainSigningRequestConfig(domains: js.Array[String], cb: js.Function1[/* filepath */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("withDomainSigningRequestConfig")(domains.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
