package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pagelocation
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var page_location: js.UndefOr[String] = js.undefined
  
  var page_path: js.UndefOr[String] = js.undefined
  
  var page_title: js.UndefOr[String] = js.undefined
}
object Pagelocation {
  
  @scala.inline
  def apply(): Pagelocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pagelocation]
  }
  
  @scala.inline
  implicit class PagelocationMutableBuilder[Self <: Pagelocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPage_location(value: String): Self = StObject.set(x, "page_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage_locationUndefined: Self = StObject.set(x, "page_location", js.undefined)
    
    @scala.inline
    def setPage_path(value: String): Self = StObject.set(x, "page_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage_pathUndefined: Self = StObject.set(x, "page_path", js.undefined)
    
    @scala.inline
    def setPage_title(value: String): Self = StObject.set(x, "page_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage_titleUndefined: Self = StObject.set(x, "page_title", js.undefined)
  }
}
