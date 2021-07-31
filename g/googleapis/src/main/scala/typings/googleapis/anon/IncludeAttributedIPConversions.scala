package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeAttributedIPConversions extends StObject {
  
  var includeAttributedIPConversions: js.UndefOr[Boolean] = js.undefined
  
  var includeUnattributedCookieConversions: js.UndefOr[Boolean] = js.undefined
  
  var includeUnattributedIPConversions: js.UndefOr[Boolean] = js.undefined
}
object IncludeAttributedIPConversions {
  
  @scala.inline
  def apply(): IncludeAttributedIPConversions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeAttributedIPConversions]
  }
  
  @scala.inline
  implicit class IncludeAttributedIPConversionsMutableBuilder[Self <: IncludeAttributedIPConversions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeAttributedIPConversions(value: Boolean): Self = StObject.set(x, "includeAttributedIPConversions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeAttributedIPConversionsUndefined: Self = StObject.set(x, "includeAttributedIPConversions", js.undefined)
    
    @scala.inline
    def setIncludeUnattributedCookieConversions(value: Boolean): Self = StObject.set(x, "includeUnattributedCookieConversions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUnattributedCookieConversionsUndefined: Self = StObject.set(x, "includeUnattributedCookieConversions", js.undefined)
    
    @scala.inline
    def setIncludeUnattributedIPConversions(value: Boolean): Self = StObject.set(x, "includeUnattributedIPConversions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUnattributedIPConversionsUndefined: Self = StObject.set(x, "includeUnattributedIPConversions", js.undefined)
  }
}
