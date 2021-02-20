package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDrilldownOptions extends StObject {
  
  var backButton: js.UndefOr[String] = js.native
  
  var closeOnClick: js.UndefOr[Boolean] = js.native
  
  var parentLink: js.UndefOr[Boolean] = js.native
  
  var wrapper: js.UndefOr[String] = js.native
}
object IDrilldownOptions {
  
  @scala.inline
  def apply(): IDrilldownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDrilldownOptions]
  }
  
  @scala.inline
  implicit class IDrilldownOptionsMutableBuilder[Self <: IDrilldownOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackButton(value: String): Self = StObject.set(x, "backButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackButtonUndefined: Self = StObject.set(x, "backButton", js.undefined)
    
    @scala.inline
    def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
    
    @scala.inline
    def setParentLink(value: Boolean): Self = StObject.set(x, "parentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentLinkUndefined: Self = StObject.set(x, "parentLink", js.undefined)
    
    @scala.inline
    def setWrapper(value: String): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
  }
}
