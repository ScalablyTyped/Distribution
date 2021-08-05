package typings.firebaseStorage

import typings.firebaseStorage.referenceMod.ReferenceCompat
import typings.firebaseStorage.serviceMod.StorageServiceCompat
import typings.firebaseStorageTypes.mod.ListResult
import typings.firebaseStorageTypes.mod.Reference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("@firebase/storage/dist/compat/list", "ListResultCompat")
  @js.native
  class ListResultCompat protected ()
    extends StObject
       with ListResult {
    def this(_delegate: typings.firebaseStorage.srcListMod.ListResult, _service: StorageServiceCompat) = this()
    
    /* private */ val _delegate: js.Any = js.native
    
    /* private */ val _service: js.Any = js.native
    
    /* CompleteClass */
    var items: js.Array[Reference] = js.native
    @JSName("items")
    def items_MListResultCompat: js.Array[ReferenceCompat] = js.native
    
    /* CompleteClass */
    var nextPageToken: String | Null = js.native
    @JSName("nextPageToken")
    def nextPageToken_MListResultCompat: String | Null = js.native
    
    /* CompleteClass */
    var prefixes: js.Array[Reference] = js.native
    @JSName("prefixes")
    def prefixes_MListResultCompat: js.Array[ReferenceCompat] = js.native
  }
}
