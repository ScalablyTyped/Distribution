package typings.documentdb.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewDocument
  extends UniqueId
     with /** Custom properties */
/* key */ StringDictionary[js.Any] {
  
  /** The time to live in seconds of the document. */
  var ttl: js.UndefOr[Double] = js.native
}
object NewDocument {
  
  @scala.inline
  def apply(id: String): NewDocument = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewDocument]
  }
  
  @scala.inline
  implicit class NewDocumentMutableBuilder[Self <: NewDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
