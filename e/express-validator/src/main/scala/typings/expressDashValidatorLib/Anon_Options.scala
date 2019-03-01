package typings
package expressDashValidatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options[T]
  extends expressDashValidatorLib.checkSchemaMod.SanitizerSchemaOptions[T] {
  var options: js.UndefOr[T | js.Array[T]] = js.undefined
}

object Anon_Options {
  @scala.inline
  def apply[T](options: T | js.Array[T] = null): Anon_Options[T] = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Options[T]]
  }
}

