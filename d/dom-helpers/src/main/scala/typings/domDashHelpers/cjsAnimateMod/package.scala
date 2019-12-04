package typings.domDashHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cjsAnimateMod {
  import typings.domDashHelpers.cjsIsTransformMod.TransformValue
  import typings.domDashHelpers.cjsTypesMod.Property
  import typings.std.Record

  type AnimateProperties = Record[Property | TransformValue, String]
}
