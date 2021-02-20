package typings.dropboxjs.Dropbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountInfoOptions extends StObject {
  
  var httpCache: Boolean = js.native
}
object AccountInfoOptions {
  
  @scala.inline
  def apply(httpCache: Boolean): AccountInfoOptions = {
    val __obj = js.Dynamic.literal(httpCache = httpCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfoOptions]
  }
  
  @scala.inline
  implicit class AccountInfoOptionsMutableBuilder[Self <: AccountInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpCache(value: Boolean): Self = StObject.set(x, "httpCache", value.asInstanceOf[js.Any])
  }
}
