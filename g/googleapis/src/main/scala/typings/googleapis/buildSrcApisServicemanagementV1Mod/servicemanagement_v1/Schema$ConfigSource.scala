package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a source file which is used to generate the service
  * configuration defined by `google.api.Service`.
  */
@js.native
trait Schema$ConfigSource extends js.Object {
  /**
    * Set of source configuration files that are used to generate a service
    * configuration (`google.api.Service`).
    */
  var files: js.UndefOr[js.Array[Schema$ConfigFile]] = js.native
  /**
    * A unique ID for a specific instance of this message, typically assigned
    * by the client for tracking purpose. If empty, the server may choose to
    * generate one instead.
    */
  var id: js.UndefOr[String] = js.native
}

object Schema$ConfigSource {
  @scala.inline
  def apply(files: js.Array[Schema$ConfigFile] = null, id: String = null): Schema$ConfigSource = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ConfigSource]
  }
}

