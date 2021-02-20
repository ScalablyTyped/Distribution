package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDownloadAccesses extends StObject {
  
  /**
    * A list of download access responses.
    */
  var downloadAccessList: js.UndefOr[js.Array[SchemaDownloadAccessRestriction]] = js.native
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaDownloadAccesses {
  
  @scala.inline
  def apply(): SchemaDownloadAccesses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDownloadAccesses]
  }
  
  @scala.inline
  implicit class SchemaDownloadAccessesMutableBuilder[Self <: SchemaDownloadAccesses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownloadAccessList(value: js.Array[SchemaDownloadAccessRestriction]): Self = StObject.set(x, "downloadAccessList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadAccessListUndefined: Self = StObject.set(x, "downloadAccessList", js.undefined)
    
    @scala.inline
    def setDownloadAccessListVarargs(value: SchemaDownloadAccessRestriction*): Self = StObject.set(x, "downloadAccessList", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
