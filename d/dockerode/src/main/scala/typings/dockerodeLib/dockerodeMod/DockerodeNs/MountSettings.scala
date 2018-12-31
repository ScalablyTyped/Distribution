package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountSettings extends js.Object {
  var BindOptions: js.UndefOr[dockerodeLib.Anon_Propagation] = js.undefined
  var Consistency: js.UndefOr[MountConsistency] = js.undefined
  var ReadOnly: js.UndefOr[scala.Boolean] = js.undefined
  var Source: java.lang.String
  var Target: java.lang.String
  var Type: MountType
}

