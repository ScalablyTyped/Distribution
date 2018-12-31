package typings
package forgeDashDiLib.forgeDashDiMod.ForgeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a resolver. */
trait IResolver extends js.Object {
  /**
    * Resolves a specific type.
    */
  def resolve[T](): T
}

