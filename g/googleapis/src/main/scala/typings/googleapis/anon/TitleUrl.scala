package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TitleUrl extends StObject {
  
  var title: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object TitleUrl {
  
  @scala.inline
  def apply(): TitleUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleUrl]
  }
  
  @scala.inline
  implicit class TitleUrlMutableBuilder[Self <: TitleUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
