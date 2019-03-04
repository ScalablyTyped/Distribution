package typings
package forgeDashDiLib.forgeDashDiMod.ForgeNs

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
  def apply(getInstance: js.Function1[IResolver, js.Any]): ILifecycle = {
    val __obj = js.Dynamic.literal(getInstance = getInstance)
  
    __obj.asInstanceOf[ILifecycle]
  }
}

