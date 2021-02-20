package typings.documentdbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options associated with a replace operation. */
@js.native
trait IReplaceOptions extends StObject {
  
  /**
    * The entity tag associated with the resource.
    * This is matched with the persisted resource before deletion.
    */
  var etag: js.UndefOr[String] = js.native
  
  /** Specifies indexing directives. */
  var indexAction: js.UndefOr[String] = js.native
}
object IReplaceOptions {
  
  @scala.inline
  def apply(): IReplaceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReplaceOptions]
  }
  
  @scala.inline
  implicit class IReplaceOptionsMutableBuilder[Self <: IReplaceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setIndexAction(value: String): Self = StObject.set(x, "indexAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexActionUndefined: Self = StObject.set(x, "indexAction", js.undefined)
  }
}
