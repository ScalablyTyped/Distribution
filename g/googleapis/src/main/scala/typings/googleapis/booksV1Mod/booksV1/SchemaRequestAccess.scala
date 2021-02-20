package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRequestAccess extends StObject {
  
  /**
    * A concurrent access response.
    */
  var concurrentAccess: js.UndefOr[SchemaConcurrentAccessRestriction] = js.native
  
  /**
    * A download access response.
    */
  var downloadAccess: js.UndefOr[SchemaDownloadAccessRestriction] = js.native
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaRequestAccess {
  
  @scala.inline
  def apply(): SchemaRequestAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequestAccess]
  }
  
  @scala.inline
  implicit class SchemaRequestAccessMutableBuilder[Self <: SchemaRequestAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConcurrentAccess(value: SchemaConcurrentAccessRestriction): Self = StObject.set(x, "concurrentAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcurrentAccessUndefined: Self = StObject.set(x, "concurrentAccess", js.undefined)
    
    @scala.inline
    def setDownloadAccess(value: SchemaDownloadAccessRestriction): Self = StObject.set(x, "downloadAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadAccessUndefined: Self = StObject.set(x, "downloadAccess", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
