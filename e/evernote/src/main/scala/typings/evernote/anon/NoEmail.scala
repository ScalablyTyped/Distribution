package typings.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoEmail extends StObject {
  
  var noEmail: js.UndefOr[Boolean] = js.undefined
  
  var noShare: js.UndefOr[Boolean] = js.undefined
  
  var noSharePublicly: js.UndefOr[Boolean] = js.undefined
  
  var noUpdateContent: js.UndefOr[Boolean] = js.undefined
  
  var noUpdateTitle: js.UndefOr[Boolean] = js.undefined
}
object NoEmail {
  
  @scala.inline
  def apply(): NoEmail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoEmail]
  }
  
  @scala.inline
  implicit class NoEmailMutableBuilder[Self <: NoEmail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNoEmail(value: Boolean): Self = StObject.set(x, "noEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoEmailUndefined: Self = StObject.set(x, "noEmail", js.undefined)
    
    @scala.inline
    def setNoShare(value: Boolean): Self = StObject.set(x, "noShare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSharePublicly(value: Boolean): Self = StObject.set(x, "noSharePublicly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSharePubliclyUndefined: Self = StObject.set(x, "noSharePublicly", js.undefined)
    
    @scala.inline
    def setNoShareUndefined: Self = StObject.set(x, "noShare", js.undefined)
    
    @scala.inline
    def setNoUpdateContent(value: Boolean): Self = StObject.set(x, "noUpdateContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoUpdateContentUndefined: Self = StObject.set(x, "noUpdateContent", js.undefined)
    
    @scala.inline
    def setNoUpdateTitle(value: Boolean): Self = StObject.set(x, "noUpdateTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoUpdateTitleUndefined: Self = StObject.set(x, "noUpdateTitle", js.undefined)
  }
}
