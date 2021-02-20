package typings.devcert

import typings.devcert.userInterfaceMod.UserInterface
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("devcert", "certificateFor")
  @js.native
  def certificateFor[O /* <: Options */](domain: String): js.Promise[IReturnData[O]] = js.native
  @JSImport("devcert", "certificateFor")
  @js.native
  def certificateFor[O /* <: Options */](domain: String, options: O): js.Promise[IReturnData[O]] = js.native
  
  @JSImport("devcert", "configuredDomains")
  @js.native
  def configuredDomains(): js.Array[String] = js.native
  
  @JSImport("devcert", "hasCertificateFor")
  @js.native
  def hasCertificateFor(domain: String): Boolean = js.native
  
  @JSImport("devcert", "removeDomain")
  @js.native
  def removeDomain(domain: String): Unit = js.native
  
  @JSImport("devcert", "uninstall")
  @js.native
  def uninstall(): Unit = js.native
  
  @js.native
  trait ICaBuffer
    extends IReturnCa[js.Any] {
    
    var ca: Buffer = js.native
  }
  object ICaBuffer {
    
    @scala.inline
    def apply(ca: Buffer): ICaBuffer = {
      val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICaBuffer]
    }
    
    @scala.inline
    implicit class ICaBufferMutableBuilder[Self <: ICaBuffer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCa(value: Buffer): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICaPath
    extends IReturnCaPath[js.Any] {
    
    var caPath: String = js.native
  }
  object ICaPath {
    
    @scala.inline
    def apply(caPath: String): ICaPath = {
      val __obj = js.Dynamic.literal(caPath = caPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICaPath]
    }
    
    @scala.inline
    implicit class ICaPathMutableBuilder[Self <: ICaPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaPath(value: String): Self = StObject.set(x, "caPath", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDomainData extends StObject {
    
    var cert: Buffer = js.native
    
    var key: Buffer = js.native
  }
  object IDomainData {
    
    @scala.inline
    def apply(cert: Buffer, key: Buffer): IDomainData = {
      val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDomainData]
    }
    
    @scala.inline
    implicit class IDomainDataMutableBuilder[Self <: IDomainData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCert(value: Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devcert.devcertBooleans.`false`
    - typings.devcert.mod.ICaBuffer
  */
  trait IReturnCa[O /* <: Options */] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.devcert.devcertBooleans.`false`
    - typings.devcert.mod.ICaPath
  */
  trait IReturnCaPath[O /* <: Options */] extends StObject
  
  type IReturnData[O /* <: Options */] = IDomainData with IReturnCa[O] with IReturnCaPath[O]
  
  @js.native
  trait Options extends StObject {
    
    /** Return the CA certificate data? */
    var getCaBuffer: js.UndefOr[Boolean] = js.native
    
    /** Return the path to the CA certificate? */
    var getCaPath: js.UndefOr[Boolean] = js.native
    
    /** If `certutil` is not installed already (for updating nss databases; e.g. firefox), do not attempt to install it */
    var skipCertutilInstall: js.UndefOr[Boolean] = js.native
    
    /** Do not update your systems host file with the domain name of the certificate */
    var skipHostsFile: js.UndefOr[Boolean] = js.native
    
    /** User interface hooks */
    var ui: js.UndefOr[UserInterface] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetCaBuffer(value: Boolean): Self = StObject.set(x, "getCaBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetCaBufferUndefined: Self = StObject.set(x, "getCaBuffer", js.undefined)
      
      @scala.inline
      def setGetCaPath(value: Boolean): Self = StObject.set(x, "getCaPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetCaPathUndefined: Self = StObject.set(x, "getCaPath", js.undefined)
      
      @scala.inline
      def setSkipCertutilInstall(value: Boolean): Self = StObject.set(x, "skipCertutilInstall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipCertutilInstallUndefined: Self = StObject.set(x, "skipCertutilInstall", js.undefined)
      
      @scala.inline
      def setSkipHostsFile(value: Boolean): Self = StObject.set(x, "skipHostsFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipHostsFileUndefined: Self = StObject.set(x, "skipHostsFile", js.undefined)
      
      @scala.inline
      def setUi(value: UserInterface): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
    }
  }
}
