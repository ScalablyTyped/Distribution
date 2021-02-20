package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MainPageSuffix extends StObject {
  
  var mainPageSuffix: js.UndefOr[String] = js.native
  
  var notFoundPage: js.UndefOr[String] = js.native
}
object MainPageSuffix {
  
  @scala.inline
  def apply(): MainPageSuffix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MainPageSuffix]
  }
  
  @scala.inline
  implicit class MainPageSuffixMutableBuilder[Self <: MainPageSuffix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMainPageSuffix(value: String): Self = StObject.set(x, "mainPageSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainPageSuffixUndefined: Self = StObject.set(x, "mainPageSuffix", js.undefined)
    
    @scala.inline
    def setNotFoundPage(value: String): Self = StObject.set(x, "notFoundPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotFoundPageUndefined: Self = StObject.set(x, "notFoundPage", js.undefined)
  }
}
