package typings.googleapis.buildSrcApisDatastoreV1beta3Mod.datastore_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a kind.
  */
@js.native
trait Schema$KindExpression extends js.Object {
  /**
    * The name of the kind.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$KindExpression {
  @scala.inline
  def apply(name: String = null): Schema$KindExpression = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$KindExpression]
  }
}

