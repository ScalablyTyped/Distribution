package typings
package forgeDashDiLib.forgeDashDiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a binding lifecycle. */
trait ILifecycle extends js.Object {
  /**
    * Returns the instance from a resolver based on the configured lifecycle.
    * @param {IResolver} resolver The type resolver.
    */
  def getInstance[T](resolver: IResolver): T
}

object ILifecycle {
  @scala.inline
  def apply(getInstance: IResolver => js.Any): ILifecycle = {
    val __obj = js.Dynamic.literal(getInstance = js.Any.fromFunction1(getInstance))
  
    __obj.asInstanceOf[ILifecycle]
  }
}

