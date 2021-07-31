package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An EntityKey uniquely identifies an Entity. Namespaces are used to provide
  * isolation for ids.  A single Id can be reused across namespaces but the
  * combination of a namespace and an id must be unique.
  */
trait SchemaEntityKey extends StObject {
  
  /**
    * The id of the entity within the given namespace. The id must be unique
    * within its namespace.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Namespaces provide isolation for ids, i.e an id only needs to be unique
    * within its namespace.  Namespaces are currently only created as part of
    * IdentitySource creation from Admin Console. A namespace
    * `&quot;identitysources/{identity_source_id}&quot;` is created
    * corresponding to every Identity Source `identity_source_id`.
    */
  var namespace: js.UndefOr[String] = js.undefined
}
object SchemaEntityKey {
  
  @scala.inline
  def apply(): SchemaEntityKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntityKey]
  }
  
  @scala.inline
  implicit class SchemaEntityKeyMutableBuilder[Self <: SchemaEntityKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
  }
}
