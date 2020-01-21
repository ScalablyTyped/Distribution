package typings.domHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object animateMod {
  type AnimateProperties = typings.std.Record[
    typings.domHelpers.typesMod.Property | typings.domHelpers.isTransformMod.TransformValue, 
    java.lang.String
  ]
}
