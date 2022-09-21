package typings.expoDevcert

import typings.expoDevcert.userInterfaceMod.UserInterface
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@expo/devcert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def certificateFor[O /* <: Options */](domain: String): js.Promise[IReturnData[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("certificateFor")(domain.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IReturnData[O]]]
  inline def certificateFor[O /* <: Options */](domain: String, options: O): js.Promise[IReturnData[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("certificateFor")(domain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IReturnData[O]]]
  
  inline def configuredDomains(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("configuredDomains")().asInstanceOf[js.Array[String]]
  
  inline def hasCertificateFor(domain: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasCertificateFor")(domain.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def removeDomain(domain: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeDomain")(domain.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def uninstall(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uninstall")().asInstanceOf[Unit]
  
  trait ICaBuffer
    extends StObject
       with IReturnCa[Any] {
    
    var ca: Buffer
  }
  object ICaBuffer {
    
    inline def apply(ca: Buffer): ICaBuffer = {
      val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICaBuffer]
    }
    
    extension [Self <: ICaBuffer](x: Self) {
      
      inline def setCa(value: Buffer): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICaPath
    extends StObject
       with IReturnCaPath[Any] {
    
    var caPath: String
  }
  object ICaPath {
    
    inline def apply(caPath: String): ICaPath = {
      val __obj = js.Dynamic.literal(caPath = caPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICaPath]
    }
    
    extension [Self <: ICaPath](x: Self) {
      
      inline def setCaPath(value: String): Self = StObject.set(x, "caPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDomainData extends StObject {
    
    var cert: Buffer
    
    var key: Buffer
  }
  object IDomainData {
    
    inline def apply(cert: Buffer, key: Buffer): IDomainData = {
      val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDomainData]
    }
    
    extension [Self <: IDomainData](x: Self) {
      
      inline def setCert(value: Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.expoDevcert.expoDevcertBooleans.`false`
    - typings.expoDevcert.mod.ICaBuffer
  */
  trait IReturnCa[O /* <: Options */] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.expoDevcert.expoDevcertBooleans.`false`
    - typings.expoDevcert.mod.ICaPath
  */
  trait IReturnCaPath[O /* <: Options */] extends StObject
  
  type IReturnData[O /* <: Options */] = IDomainData & IReturnCa[O] & IReturnCaPath[O]
  
  trait Options extends StObject {
    
    /** Return the CA certificate data? */
    var getCaBuffer: js.UndefOr[Boolean] = js.undefined
    
    /** Return the path to the CA certificate? */
    var getCaPath: js.UndefOr[Boolean] = js.undefined
    
    /** If `certutil` is not installed already (for updating nss databases; e.g. firefox), do not attempt to install it */
    var skipCertutilInstall: js.UndefOr[Boolean] = js.undefined
    
    /** Do not update your systems host file with the domain name of the certificate */
    var skipHostsFile: js.UndefOr[Boolean] = js.undefined
    
    /** User interface hooks */
    var ui: js.UndefOr[UserInterface] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setGetCaBuffer(value: Boolean): Self = StObject.set(x, "getCaBuffer", value.asInstanceOf[js.Any])
      
      inline def setGetCaBufferUndefined: Self = StObject.set(x, "getCaBuffer", js.undefined)
      
      inline def setGetCaPath(value: Boolean): Self = StObject.set(x, "getCaPath", value.asInstanceOf[js.Any])
      
      inline def setGetCaPathUndefined: Self = StObject.set(x, "getCaPath", js.undefined)
      
      inline def setSkipCertutilInstall(value: Boolean): Self = StObject.set(x, "skipCertutilInstall", value.asInstanceOf[js.Any])
      
      inline def setSkipCertutilInstallUndefined: Self = StObject.set(x, "skipCertutilInstall", js.undefined)
      
      inline def setSkipHostsFile(value: Boolean): Self = StObject.set(x, "skipHostsFile", value.asInstanceOf[js.Any])
      
      inline def setSkipHostsFileUndefined: Self = StObject.set(x, "skipHostsFile", js.undefined)
      
      inline def setUi(value: UserInterface): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
      
      inline def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
    }
  }
}
