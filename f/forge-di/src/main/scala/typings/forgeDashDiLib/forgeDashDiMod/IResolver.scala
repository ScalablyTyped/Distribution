package typings
package forgeDashDiLib.forgeDashDiMod

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
  def apply(resolve: () => js.Any): IResolver = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction0(resolve))
  
    __obj.asInstanceOf[IResolver]
  }
}

