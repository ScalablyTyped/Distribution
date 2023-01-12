package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object used to fetch additional pages of Places results.
  */
trait PlaceSearchPagination extends StObject {
  
  /**
    * Indicates if further results are available. <code>true</code> when there
    * is an additional results page.
    */
  var hasNextPage: Boolean
  
  /**
    * Fetches the next page of results. Uses the same callback function that
    * was provided to the first search request.
    */
  def nextPage(): Unit
}
object PlaceSearchPagination {
  
  inline def apply(hasNextPage: Boolean, nextPage: () => Unit): PlaceSearchPagination = {
    val __obj = js.Dynamic.literal(hasNextPage = hasNextPage.asInstanceOf[js.Any], nextPage = js.Any.fromFunction0(nextPage))
    __obj.asInstanceOf[PlaceSearchPagination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaceSearchPagination] (val x: Self) extends AnyVal {
    
    inline def setHasNextPage(value: Boolean): Self = StObject.set(x, "hasNextPage", value.asInstanceOf[js.Any])
    
    inline def setNextPage(value: () => Unit): Self = StObject.set(x, "nextPage", js.Any.fromFunction0(value))
  }
}
