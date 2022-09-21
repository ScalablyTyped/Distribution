package typings.firebaseStorage

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseStorage.anon.PartialMetadata
import typings.firebaseStorage.serviceMod.FirebaseStorageImpl
import typings.firebaseStorage.srcMetadataMod.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataMod {
  
  @JSImport("@firebase/storage/dist/node-esm/src/implementation/metadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addRef(metadata: Metadata, service: FirebaseStorageImpl): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRef")(metadata.asInstanceOf[js.Any], service.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def downloadUrlFromResourceString(metadata: Metadata, resourceString: String, host: String, protocol: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadUrlFromResourceString")(metadata.asInstanceOf[js.Any], resourceString.asInstanceOf[js.Any], host.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def fromResource(service: FirebaseStorageImpl, resource: StringDictionary[Any], mappings: Mappings): Metadata = (^.asInstanceOf[js.Dynamic].applyDynamic("fromResource")(service.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], mappings.asInstanceOf[js.Any])).asInstanceOf[Metadata]
  
  inline def fromResourceString(service: FirebaseStorageImpl, resourceString: String, mappings: Mappings): Metadata | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fromResourceString")(service.asInstanceOf[js.Any], resourceString.asInstanceOf[js.Any], mappings.asInstanceOf[js.Any])).asInstanceOf[Metadata | Null]
  
  inline def getMappings(): Mappings = ^.asInstanceOf[js.Dynamic].applyDynamic("getMappings")().asInstanceOf[Mappings]
  
  inline def noXform[T](metadata: Metadata, value: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("noXform_")(metadata.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def toResourceString(metadata: PartialMetadata, mappings: Mappings): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toResourceString")(metadata.asInstanceOf[js.Any], mappings.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def xformPath(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("xformPath")().asInstanceOf[js.UndefOr[String]]
  inline def xformPath(fullPath: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("xformPath")(fullPath.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  @js.native
  trait Mapping[T] extends StObject {
    
    var local: String = js.native
    
    var server: String = js.native
    
    var writable: Boolean = js.native
    
    def xform(p1: Metadata): js.UndefOr[T] = js.native
    def xform(p1: Metadata, p2: T): js.UndefOr[T] = js.native
  }
  
  type Mappings = js.Array[Mapping[Double | String]]
}
