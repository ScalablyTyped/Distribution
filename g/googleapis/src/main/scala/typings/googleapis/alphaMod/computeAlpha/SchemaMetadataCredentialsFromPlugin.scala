package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom authenticator credentials.
  */
@js.native
trait SchemaMetadataCredentialsFromPlugin extends js.Object {
  /**
    * Plugin name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A text proto that conforms to a Struct type definition interpreted by the
    * plugin.
    */
  var structConfig: js.UndefOr[String] = js.native
}

object SchemaMetadataCredentialsFromPlugin {
  @scala.inline
  def apply(name: String = null, structConfig: String = null): SchemaMetadataCredentialsFromPlugin = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (structConfig != null) __obj.updateDynamic("structConfig")(structConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetadataCredentialsFromPlugin]
  }
}

