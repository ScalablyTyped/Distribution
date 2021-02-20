package typings.firebaseStorage

import typings.firebaseStorage.srcReferenceMod.Reference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcListMod {
  
  type ListOptions = typings.firebaseStorageTypes.mod.ListOptions
  
  @js.native
  trait ListResult extends StObject {
    
    var items: js.Array[Reference] = js.native
    
    var nextPageToken: js.UndefOr[String] = js.native
    
    var prefixes: js.Array[Reference] = js.native
  }
  object ListResult {
    
    @scala.inline
    def apply(items: js.Array[Reference], prefixes: js.Array[Reference]): ListResult = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], prefixes = prefixes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListResult]
    }
    
    @scala.inline
    implicit class ListResultMutableBuilder[Self <: ListResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[Reference]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: Reference*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      
      @scala.inline
      def setPrefixes(value: js.Array[Reference]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixesVarargs(value: Reference*): Self = StObject.set(x, "prefixes", js.Array(value :_*))
    }
  }
}
