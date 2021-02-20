package typings.documentdbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options associated with a delete operation. */
@js.native
trait IDeleteOptions extends StObject {
  
  /**
    * The entity tag associated with the resource.
    * This is matched with the persisted resource before deletion.
    */
  var etag: js.UndefOr[String] = js.native
}
object IDeleteOptions {
  
  @scala.inline
  def apply(): IDeleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeleteOptions]
  }
  
  @scala.inline
  implicit class IDeleteOptionsMutableBuilder[Self <: IDeleteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
  }
}
