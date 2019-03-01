package typings
package gapiDotClientDotMirrorLib.gapiNs.clientNs.mirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsResource extends js.Object {
  /** Gets a single setting by ID. */
  def get(request: gapiDotClientDotMirrorLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Setting]
}

object SettingsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotMirrorLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Setting]
    ]
  ): SettingsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.asInstanceOf[SettingsResource]
  }
}

