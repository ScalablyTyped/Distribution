package typings
package electronDashBuilderLib.outBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CliOptions
  extends appDashBuilderDashLibLib.outPackagerApiMod.PackagerOptions
     with electronDashPublishLib.electronDashPublishMod.PublishOptions {
  var arch: js.UndefOr[java.lang.String] = js.undefined
  var arm64: js.UndefOr[scala.Boolean] = js.undefined
  var armv7l: js.UndefOr[scala.Boolean] = js.undefined
  var dir: js.UndefOr[scala.Boolean] = js.undefined
  var ia32: js.UndefOr[scala.Boolean] = js.undefined
  var platform: js.UndefOr[java.lang.String] = js.undefined
  var x64: js.UndefOr[scala.Boolean] = js.undefined
}

