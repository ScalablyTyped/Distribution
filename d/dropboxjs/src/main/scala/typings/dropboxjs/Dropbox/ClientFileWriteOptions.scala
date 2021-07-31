package typings.dropboxjs.Dropbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientFileWriteOptions extends StObject {
  
  var lastVersionTag: js.UndefOr[String] = js.undefined
  
  var noOverwrite: js.UndefOr[Boolean] = js.undefined
  
  var parentRev: js.UndefOr[String] = js.undefined
}
object ClientFileWriteOptions {
  
  @scala.inline
  def apply(): ClientFileWriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientFileWriteOptions]
  }
  
  @scala.inline
  implicit class ClientFileWriteOptionsMutableBuilder[Self <: ClientFileWriteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastVersionTag(value: String): Self = StObject.set(x, "lastVersionTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastVersionTagUndefined: Self = StObject.set(x, "lastVersionTag", js.undefined)
    
    @scala.inline
    def setNoOverwrite(value: Boolean): Self = StObject.set(x, "noOverwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoOverwriteUndefined: Self = StObject.set(x, "noOverwrite", js.undefined)
    
    @scala.inline
    def setParentRev(value: String): Self = StObject.set(x, "parentRev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentRevUndefined: Self = StObject.set(x, "parentRev", js.undefined)
  }
}
