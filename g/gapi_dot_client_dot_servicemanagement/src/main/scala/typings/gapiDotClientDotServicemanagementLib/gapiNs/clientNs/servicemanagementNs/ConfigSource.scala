package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigSource extends js.Object {
  /**
    * Set of source configuration files that are used to generate a service
    * configuration (`google.api.Service`).
    */
  var files: js.UndefOr[js.Array[ConfigFile]] = js.undefined
  /**
    * A unique ID for a specific instance of this message, typically assigned
    * by the client for tracking purpose. If empty, the server may choose to
    * generate one instead.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object ConfigSource {
  @scala.inline
  def apply(files: js.Array[ConfigFile] = null, id: java.lang.String = null): ConfigSource = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[ConfigSource]
  }
}

