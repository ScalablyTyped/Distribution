package typings.firebaseStorage.storageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResult extends StObject {
  
  /**
    * Objects in this directory.
    * You can call getMetadata() and getDownloadUrl() on them.
    */
  var items: js.Array[StorageReference]
  
  /**
    * If set, there might be more results for this list. Use this token to resume the list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * References to prefixes (sub-folders). You can call list() on them to
    * get its contents.
    *
    * Folders are implicit based on '/' in the object paths.
    * For example, if a bucket has two objects '/a/b/1' and '/a/b/2', list('/a')
    * will return '/a/b' as a prefix.
    */
  var prefixes: js.Array[StorageReference]
}
object ListResult {
  
  inline def apply(items: js.Array[StorageReference], prefixes: js.Array[StorageReference]): ListResult = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], prefixes = prefixes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResult]
  }
  
  extension [Self <: ListResult](x: Self) {
    
    inline def setItems(value: js.Array[StorageReference]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: StorageReference*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPrefixes(value: js.Array[StorageReference]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
    
    inline def setPrefixesVarargs(value: StorageReference*): Self = StObject.set(x, "prefixes", js.Array(value*))
  }
}
