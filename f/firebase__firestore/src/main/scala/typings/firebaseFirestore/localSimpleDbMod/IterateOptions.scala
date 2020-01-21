package typings.firebaseFirestore.localSimpleDbMod

import typings.std.IDBKeyRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterateOptions extends js.Object {
  /** Index to iterate over (else primary keys will be iterated) */
  var index: js.UndefOr[String] = js.undefined
  /** If true, values aren't read while iterating. */
  var keysOnly: js.UndefOr[Boolean] = js.undefined
  /** IndxedDB Range to iterate over (else entire store will be iterated) */
  var range: js.UndefOr[IDBKeyRange] = js.undefined
  /** If true, iterate over the store in reverse. */
  var reverse: js.UndefOr[Boolean] = js.undefined
}

object IterateOptions {
  @scala.inline
  def apply(
    index: String = null,
    keysOnly: js.UndefOr[Boolean] = js.undefined,
    range: IDBKeyRange = null,
    reverse: js.UndefOr[Boolean] = js.undefined
  ): IterateOptions = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(keysOnly)) __obj.updateDynamic("keysOnly")(keysOnly.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterateOptions]
  }
}

