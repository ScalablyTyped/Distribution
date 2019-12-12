package typings.atFirebaseStorage

import typings.atFirebaseStorage.distSrcImplementationLocationMod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/location", JSImport.Namespace)
@js.native
object distSrcImplementationLocationMod extends js.Object {
  @js.native
  class Location protected () extends js.Object {
    def this(bucket: String, path: String) = this()
    val bucket: String = js.native
    var path_ : js.Any = js.native
    def bucketOnlyServerUrl(): String = js.native
    def fullServerUrl(): String = js.native
    def isRoot(): Boolean = js.native
    def path(): String = js.native
  }
  
  /* static members */
  @js.native
  object Location extends js.Object {
    def makeFromBucketSpec(bucketString: String): Location = js.native
    def makeFromUrl(url: String): Location = js.native
  }
  
}

