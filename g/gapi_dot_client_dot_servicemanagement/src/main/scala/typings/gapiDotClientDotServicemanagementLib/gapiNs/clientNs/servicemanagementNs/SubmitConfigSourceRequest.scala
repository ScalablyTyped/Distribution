package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SubmitConfigSourceRequest extends js.Object {
  /** The source configuration for the service. */
  var configSource: js.UndefOr[ConfigSource] = js.undefined
  /**
               * Optional. If set, this will result in the generation of a
               * `google.api.Service` configuration based on the `ConfigSource` provided,
               * but the generated config and the sources will NOT be persisted.
               */
  var validateOnly: js.UndefOr[scala.Boolean] = js.undefined
}

