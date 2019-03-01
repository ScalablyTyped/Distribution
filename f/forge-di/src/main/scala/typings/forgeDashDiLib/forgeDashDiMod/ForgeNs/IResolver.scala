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

object IResolver {
  @scala.inline
  def apply(resolve: js.Function0[js.Any]): IResolver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resolve")(resolve)
    __obj.asInstanceOf[IResolver]
  }
}

