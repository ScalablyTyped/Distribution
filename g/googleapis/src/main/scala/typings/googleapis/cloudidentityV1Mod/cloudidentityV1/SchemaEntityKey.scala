package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An EntityKey uniquely identifies an Entity. Namespaces are used to provide
  * isolation for IDs. A single ID can be reused across namespaces but the
  * combination of a namespace and an ID must be unique.
  */
@js.native
trait SchemaEntityKey extends js.Object {
  /**
    * The ID of the entity within the given namespace. The ID must be unique
    * within its namespace.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Namespaces provide isolation for IDs, so an ID only needs to be unique
    * within its namespace.  Namespaces are currently only created as part of
    * IdentitySource creation from Admin Console. A namespace
    * `&quot;identitysources/{identity_source_id}&quot;` is created
    * corresponding to every Identity Source `identity_source_id`.
    */
  var namespace: js.UndefOr[String] = js.native
}

object SchemaEntityKey {
  @scala.inline
  def apply(id: String = null, namespace: String = null): SchemaEntityKey = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEntityKey]
  }
}

