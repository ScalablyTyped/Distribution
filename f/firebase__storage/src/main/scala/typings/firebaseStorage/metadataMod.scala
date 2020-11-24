package typings.firebaseStorage

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseStorage.srcMetadataMod.Metadata
import typings.firebaseStorage.srcServiceMod.StorageService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/src/implementation/metadata", JSImport.Namespace)
@js.native
object metadataMod extends js.Object {
  
  def addRef(metadata: Metadata, service: StorageService): Unit = js.native
  
  def downloadUrlFromResourceString(metadata: Metadata, resourceString: String): String | Null = js.native
  
  def fromResource(service: StorageService, resource: StringDictionary[js.Any], mappings: Mappings): Metadata = js.native
  
  def fromResourceString(service: StorageService, resourceString: String, mappings: Mappings): Metadata | Null = js.native
  
  def getMappings(): Mappings = js.native
  
  @JSName("noXform_")
  def noXform[T](metadata: Metadata, value: T): T = js.native
  
  def toResourceString(metadata: Metadata, mappings: Mappings): String = js.native
  
  def xformPath(): js.UndefOr[String] = js.native
  def xformPath(fullPath: String): js.UndefOr[String] = js.native
  
  @js.native
  trait Mapping[T] extends js.Object {
    
    var local: String = js.native
    
    var server: String = js.native
    
    var writable: Boolean = js.native
    
    def xform(p1: Metadata): js.UndefOr[T] = js.native
    def xform(p1: Metadata, p2: T): js.UndefOr[T] = js.native
  }
  
  type Mappings = js.Array[Mapping[Double | String]]
}
