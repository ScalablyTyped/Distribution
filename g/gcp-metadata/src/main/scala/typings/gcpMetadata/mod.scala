package typings.gcpMetadata

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.OutgoingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gcp-metadata", "BASE_PATH")
  @js.native
  val BASE_PATH: /* "/computeMetadata/v1" */ String = js.native
  
  /* Inlined std.Readonly<{  Metadata-Flavor :string}> */
  object HEADERS {
    
    @JSImport("gcp-metadata", "HEADERS.Metadata-Flavor")
    @js.native
    val MetadataFlavor: String = js.native
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
  
  @JSImport("gcp-metadata", "instance")
  @js.native
  def instance[T](): js.Promise[T] = js.native
  @JSImport("gcp-metadata", "instance")
  @js.native
  def instance[T](options: String): js.Promise[T] = js.native
  @JSImport("gcp-metadata", "instance")
  @js.native
  def instance[T](options: Options): js.Promise[T] = js.native
  
  @JSImport("gcp-metadata", "isAvailable")
  @js.native
  def isAvailable(): js.Promise[Boolean] = js.native
  
  @JSImport("gcp-metadata", "project")
  @js.native
  def project[T](): js.Promise[T] = js.native
  @JSImport("gcp-metadata", "project")
  @js.native
  def project[T](options: String): js.Promise[T] = js.native
  @JSImport("gcp-metadata", "project")
  @js.native
  def project[T](options: Options): js.Promise[T] = js.native
  
  @JSImport("gcp-metadata", "requestTimeout")
  @js.native
  def requestTimeout(): Double = js.native
  
  @JSImport("gcp-metadata", "resetIsAvailableCache")
  @js.native
  def resetIsAvailableCache(): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.native
    
    var params: js.UndefOr[StringDictionary[String]] = js.native
    
    var property: js.UndefOr[String] = js.native
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
      def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    }
  }
}
