package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceReference extends js.Object {
  /**
    * The URL for a specific instance.
    */
  var instance: js.UndefOr[String] = js.native
}

object SchemaInstanceReference {
  @scala.inline
  def apply(instance: String = null): SchemaInstanceReference = {
    val __obj = js.Dynamic.literal()
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstanceReference]
  }
}

