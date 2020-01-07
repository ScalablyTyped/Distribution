package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom authenticator credentials.
  */
@js.native
trait Schema$MetadataCredentialsFromPlugin extends js.Object {
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

object Schema$MetadataCredentialsFromPlugin {
  @scala.inline
  def apply(name: String = null, structConfig: String = null): Schema$MetadataCredentialsFromPlugin = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (structConfig != null) __obj.updateDynamic("structConfig")(structConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MetadataCredentialsFromPlugin]
  }
}

