package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database flags for Cloud SQL instances.
  */
@js.native
trait Schema$DatabaseFlags extends js.Object {
  /**
    * The name of the flag. These flags are passed at instance startup, so
    * include both server options and system variables for MySQL. Flags should
    * be specified with underscores, not hyphens. For more information, see
    * Configuring Database Flags in the Cloud SQL documentation.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The value of the flag. Booleans should be set to on for true and off for
    * false. This field must be omitted if the flag doesn&#39;t take a value.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$DatabaseFlags {
  @scala.inline
  def apply(name: String = null, value: String = null): Schema$DatabaseFlags = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DatabaseFlags]
  }
}

