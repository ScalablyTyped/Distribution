package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A guest attributes namespace/key/value entry.
  */
@js.native
trait SchemaGuestAttributesEntry extends js.Object {
  /**
    * Key for the guest attribute entry.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Namespace for the guest attribute entry.
    */
  var namespace: js.UndefOr[String] = js.native
  /**
    * Value for the guest attribute entry.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaGuestAttributesEntry {
  @scala.inline
  def apply(key: String = null, namespace: String = null, value: String = null): SchemaGuestAttributesEntry = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGuestAttributesEntry]
  }
}

