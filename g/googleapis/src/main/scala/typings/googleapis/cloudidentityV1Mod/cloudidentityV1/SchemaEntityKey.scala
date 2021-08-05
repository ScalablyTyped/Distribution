package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An EntityKey uniquely identifies an Entity. Namespaces are used to provide
  * isolation for IDs. A single ID can be reused across namespaces but the
  * combination of a namespace and an ID must be unique.
  */
trait SchemaEntityKey extends StObject {
  
  /**
    * The ID of the entity within the given namespace. The ID must be unique
    * within its namespace.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Namespaces provide isolation for IDs, so an ID only needs to be unique
    * within its namespace.  Namespaces are currently only created as part of
    * IdentitySource creation from Admin Console. A namespace
    * `&quot;identitysources/{identity_source_id}&quot;` is created
    * corresponding to every Identity Source `identity_source_id`.
    */
  var namespace: js.UndefOr[String] = js.undefined
}
object SchemaEntityKey {
  
  inline def apply(): SchemaEntityKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntityKey]
  }
  
  extension [Self <: SchemaEntityKey](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
  }
}
