package typings.googleapis.buildSrcApisRuntimeconfigV1beta1Mod.runtimeconfig_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A RuntimeConfig resource is the primary resource in the Cloud RuntimeConfig
  * service. A RuntimeConfig resource consists of metadata and a hierarchy of
  * variables.
  */
@js.native
trait Schema$RuntimeConfig extends js.Object {
  /**
    * An optional description of the RuntimeConfig object.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The resource name of a runtime config. The name must have the format:
    * projects/[PROJECT_ID]/configs/[CONFIG_NAME]  The `[PROJECT_ID]` must be a
    * valid project ID, and `[CONFIG_NAME]` is an arbitrary name that matches
    * the `[0-9A-Za-z](?:[_.A-Za-z0-9-]{0,62}[_.A-Za-z0-9])?` regular
    * expression. The length of `[CONFIG_NAME]` must be less than 64
    * characters.  You pick the RuntimeConfig resource name, but the server
    * will validate that the name adheres to this format. After you create the
    * resource, you cannot change the resource&#39;s name.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$RuntimeConfig {
  @scala.inline
  def apply(description: String = null, name: String = null): Schema$RuntimeConfig = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RuntimeConfig]
  }
}

