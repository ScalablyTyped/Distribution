package typings.googleapis.buildSrcApisDatastoreV1Mod.datastore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a property relative to the kind expressions.
  */
@js.native
trait Schema$PropertyReference extends js.Object {
  /**
    * The name of the property. If name includes &quot;.&quot;s, it may be
    * interpreted as a property name path.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$PropertyReference {
  @scala.inline
  def apply(name: String = null): Schema$PropertyReference = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PropertyReference]
  }
}

