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
  
  inline def apply(): ClientFileWriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientFileWriteOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientFileWriteOptions] (val x: Self) extends AnyVal {
    
    inline def setLastVersionTag(value: String): Self = StObject.set(x, "lastVersionTag", value.asInstanceOf[js.Any])
    
    inline def setLastVersionTagUndefined: Self = StObject.set(x, "lastVersionTag", js.undefined)
    
    inline def setNoOverwrite(value: Boolean): Self = StObject.set(x, "noOverwrite", value.asInstanceOf[js.Any])
    
    inline def setNoOverwriteUndefined: Self = StObject.set(x, "noOverwrite", js.undefined)
    
    inline def setParentRev(value: String): Self = StObject.set(x, "parentRev", value.asInstanceOf[js.Any])
    
    inline def setParentRevUndefined: Self = StObject.set(x, "parentRev", js.undefined)
  }
}
