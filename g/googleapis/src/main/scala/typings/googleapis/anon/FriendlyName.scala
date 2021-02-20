package typings.googleapis.anon

import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FriendlyName extends StObject {
  
  var friendlyName: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var numericId: js.UndefOr[String] = js.native
  
  var projectReference: js.UndefOr[SchemaProjectReference] = js.native
}
object FriendlyName {
  
  @scala.inline
  def apply(): FriendlyName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FriendlyName]
  }
  
  @scala.inline
  implicit class FriendlyNameMutableBuilder[Self <: FriendlyName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNumericId(value: String): Self = StObject.set(x, "numericId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericIdUndefined: Self = StObject.set(x, "numericId", js.undefined)
    
    @scala.inline
    def setProjectReference(value: SchemaProjectReference): Self = StObject.set(x, "projectReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectReferenceUndefined: Self = StObject.set(x, "projectReference", js.undefined)
  }
}
