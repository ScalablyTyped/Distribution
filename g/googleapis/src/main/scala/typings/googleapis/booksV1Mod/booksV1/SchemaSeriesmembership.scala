package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSeriesmembership extends StObject {
  
  /**
    * Resorce type.
    */
  var kind: js.UndefOr[String] = js.native
  
  var member: js.UndefOr[js.Array[SchemaVolume]] = js.native
  
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaSeriesmembership {
  
  @scala.inline
  def apply(): SchemaSeriesmembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeriesmembership]
  }
  
  @scala.inline
  implicit class SchemaSeriesmembershipMutableBuilder[Self <: SchemaSeriesmembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMember(value: js.Array[SchemaVolume]): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    @scala.inline
    def setMemberVarargs(value: SchemaVolume*): Self = StObject.set(x, "member", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
