package typings.atFirebaseStorage

import org.scalablytyped.runtime.StringDictionary
import typings.atFirebaseStorage.distSrcImplementationAuthwrapperMod.AuthWrapper
import typings.atFirebaseStorage.distSrcMetadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/metadata", JSImport.Namespace)
@js.native
object distSrcImplementationMetadataMod extends js.Object {
  /**
    * @struct
    */
  @js.native
  trait Mapping[T] extends js.Object {
    var local: String = js.native
    var server: String = js.native
    var writable: Boolean = js.native
    def xform(p1: Metadata): js.UndefOr[T] = js.native
    def xform(p1: Metadata, p2: T): js.UndefOr[T] = js.native
  }
  
  def addRef(metadata: Metadata, authWrapper: AuthWrapper): Unit = js.native
  def downloadUrlFromResourceString(metadata: Metadata, resourceString: String): String | Null = js.native
  def fromResource(authWrapper: AuthWrapper, resource: StringDictionary[js.Any], mappings: Mappings): Metadata = js.native
  def fromResourceString(authWrapper: AuthWrapper, resourceString: String, mappings: Mappings): Metadata | Null = js.native
  def getMappings(): Mappings = js.native
  def metadataValidator(p: js.Any): Unit = js.native
  def noXform_[T](metadata: Metadata, value: T): T = js.native
  def toResourceString(metadata: Metadata, mappings: Mappings): String = js.native
  def xformPath(): js.UndefOr[String] = js.native
  def xformPath(fullPath: String): js.UndefOr[String] = js.native
  type Mappings = js.Array[Mapping[Double | String]]
}

