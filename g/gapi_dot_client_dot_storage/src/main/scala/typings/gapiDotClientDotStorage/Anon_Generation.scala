package typings.gapiDotClientDotStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Generation extends js.Object {
  /** The generation of this object to use as the source. */
  var generation: js.UndefOr[String] = js.undefined
  /** The source object's name. The source object's bucket is implicitly the destination bucket. */
  var name: js.UndefOr[String] = js.undefined
  /** Conditions that must be met for this operation to execute. */
  var objectPreconditions: js.UndefOr[Anon_IfGenerationMatch] = js.undefined
}

object Anon_Generation {
  @scala.inline
  def apply(generation: String = null, name: String = null, objectPreconditions: Anon_IfGenerationMatch = null): Anon_Generation = {
    val __obj = js.Dynamic.literal()
    if (generation != null) __obj.updateDynamic("generation")(generation)
    if (name != null) __obj.updateDynamic("name")(name)
    if (objectPreconditions != null) __obj.updateDynamic("objectPreconditions")(objectPreconditions)
    __obj.asInstanceOf[Anon_Generation]
  }
}

