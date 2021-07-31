package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishedAt extends StObject {
  
  var publishedAt: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object PublishedAt {
  
  @scala.inline
  def apply(): PublishedAt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishedAt]
  }
  
  @scala.inline
  implicit class PublishedAtMutableBuilder[Self <: PublishedAt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
