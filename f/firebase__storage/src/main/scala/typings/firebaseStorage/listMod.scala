package typings.firebaseStorage

import typings.firebaseStorage.referenceMod.ReferenceCompat
import typings.firebaseStorage.serviceMod.StorageServiceCompat
import typings.firebaseStorageTypes.mod.ListResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("@firebase/storage/dist/compat/list", "ListResultCompat")
  @js.native
  class ListResultCompat protected () extends ListResult {
    def this(_delegate: typings.firebaseStorage.srcListMod.ListResult, _service: StorageServiceCompat) = this()
    
    val _delegate: js.Any = js.native
    
    val _service: js.Any = js.native
    
    @JSName("items")
    def items_MListResultCompat: js.Array[ReferenceCompat] = js.native
    
    @JSName("nextPageToken")
    def nextPageToken_MListResultCompat: String | Null = js.native
    
    @JSName("prefixes")
    def prefixes_MListResultCompat: js.Array[ReferenceCompat] = js.native
  }
}
