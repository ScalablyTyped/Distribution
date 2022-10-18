package typings.firebaseStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcImplementationLocationMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/location", "Location")
  @js.native
  open class Location protected () extends StObject {
    def this(bucket: String, path: String) = this()
    
    val bucket: String = js.native
    
    def bucketOnlyServerUrl(): String = js.native
    
    def fullServerUrl(): String = js.native
    
    def isRoot: Boolean = js.native
    
    def path: String = js.native
    
    /* private */ var path_ : Any = js.native
  }
  /* static members */
  object Location {
    
    @JSImport("@firebase/storage/dist/src/implementation/location", "Location")
    @js.native
    val ^ : js.Any = js.native
    
    inline def makeFromBucketSpec(bucketString: String, host: String): Location = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFromBucketSpec")(bucketString.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Location]
    
    inline def makeFromUrl(url: String, host: String): Location = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFromUrl")(url.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Location]
  }
}
