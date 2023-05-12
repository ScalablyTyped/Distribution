package typings.gcpMetadata

import org.scalablytyped.runtime.StringDictionary
import typings.gcpMetadata.gcpMetadataStrings.Google
import typings.node.httpMod.OutgoingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gcp-metadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gcp-metadata", "BASE_PATH")
  @js.native
  val BASE_PATH: /* "/computeMetadata/v1" */ String = js.native
  
  object GCE_LINUX_BIOS_PATHS {
    
    @JSImport("gcp-metadata", "GCE_LINUX_BIOS_PATHS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("gcp-metadata", "GCE_LINUX_BIOS_PATHS.BIOS_DATE")
    @js.native
    def BIOS_DATE: String = js.native
    inline def BIOS_DATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BIOS_DATE")(x.asInstanceOf[js.Any])
    
    @JSImport("gcp-metadata", "GCE_LINUX_BIOS_PATHS.BIOS_VENDOR")
    @js.native
    def BIOS_VENDOR: String = js.native
    inline def BIOS_VENDOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BIOS_VENDOR")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined std.Readonly<{  Metadata-Flavor :'Google'}> */
  object HEADERS {
    
    @JSImport("gcp-metadata", "HEADERS.Metadata-Flavor")
    @js.native
    val MetadataFlavor: Google = js.native
  }
  
  @JSImport("gcp-metadata", "HEADER_NAME")
  @js.native
  val HEADER_NAME: /* "Metadata-Flavor" */ String = js.native
  
  @JSImport("gcp-metadata", "HEADER_VALUE")
  @js.native
  val HEADER_VALUE: /* "Google" */ String = js.native
  
  @JSImport("gcp-metadata", "HOST_ADDRESS")
  @js.native
  val HOST_ADDRESS: /* "http://169.254.169.254" */ String = js.native
  
  @JSImport("gcp-metadata", "SECONDARY_HOST_ADDRESS")
  @js.native
  val SECONDARY_HOST_ADDRESS: /* "http://metadata.google.internal." */ String = js.native
  
  inline def detectGCPResidency(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("detectGCPResidency")().asInstanceOf[Boolean]
  
  @JSImport("gcp-metadata", "gcpResidencyCache")
  @js.native
  def gcpResidencyCache: Boolean | Null = js.native
  inline def gcpResidencyCache_=(x: Boolean | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gcpResidencyCache")(x.asInstanceOf[js.Any])
  
  inline def instance[T](): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")().asInstanceOf[js.Promise[T]]
  inline def instance[T](options: String): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def instance[T](options: Options): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  inline def isAvailable(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[js.Promise[Boolean]]
  
  inline def isGoogleCloudServerless(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGoogleCloudServerless")().asInstanceOf[Boolean]
  
  inline def isGoogleComputeEngine(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGoogleComputeEngine")().asInstanceOf[Boolean]
  
  inline def isGoogleComputeEngineLinux(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGoogleComputeEngineLinux")().asInstanceOf[Boolean]
  
  inline def isGoogleComputeEngineMACAddress(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGoogleComputeEngineMACAddress")().asInstanceOf[Boolean]
  
  inline def project[T](): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("project")().asInstanceOf[js.Promise[T]]
  inline def project[T](options: String): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("project")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def project[T](options: Options): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("project")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  inline def requestTimeout(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("requestTimeout")().asInstanceOf[Double]
  
  inline def resetIsAvailableCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetIsAvailableCache")().asInstanceOf[Unit]
  
  inline def setGCPResidency(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGCPResidency")().asInstanceOf[Unit]
  inline def setGCPResidency(value: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGCPResidency")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var params: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    }
  }
}
