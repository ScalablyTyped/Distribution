package typings.firebaseStorage.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOptions extends StObject {
  
  /**
    * If set, limits the total number of `prefixes` and `items` to return.
    * The default and maximum maxResults is 1000.
    */
  var maxResults: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The `nextPageToken` from a previous call to `list()`. If provided,
    * listing is resumed from the previous position.
    */
  var pageToken: js.UndefOr[String | Null] = js.undefined
}
object ListOptions {
  
  inline def apply(): ListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListOptions] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsNull: Self = StObject.set(x, "maxResults", null)
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
