package typings.gapiClientStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Generation extends js.Object {
  /** The generation of this object to use as the source. */
  var generation: js.UndefOr[String] = js.undefined
  /** The source object's name. The source object's bucket is implicitly the destination bucket. */
  var name: js.UndefOr[String] = js.undefined
  /** Conditions that must be met for this operation to execute. */
  var objectPreconditions: js.UndefOr[IfGenerationMatch] = js.undefined
}

object Generation {
  @scala.inline
  def apply(generation: String = null, name: String = null, objectPreconditions: IfGenerationMatch = null): Generation = {
    val __obj = js.Dynamic.literal()
    if (generation != null) __obj.updateDynamic("generation")(generation.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (objectPreconditions != null) __obj.updateDynamic("objectPreconditions")(objectPreconditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Generation]
  }
}

