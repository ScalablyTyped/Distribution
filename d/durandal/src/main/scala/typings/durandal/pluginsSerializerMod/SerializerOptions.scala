package typings.durandal.pluginsSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializerOptions extends js.Object {
  /**
    * The default replacer function used during serialization. By default properties starting with '_' or '$' are removed from the serialized object.
    * @param {string} key The object key to check.
    * @param {object} value The object value to check.
    * @returns {object} The value to serialize.
    */
  var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.undefined
  /**
    * The amount of space to use for indentation when writing out JSON.
    * @default undefined
    */
  var space: js.Any
}

object SerializerOptions {
  @scala.inline
  def apply(space: js.Any, replacer: (/* key */ String, /* value */ js.Any) => _ = null): SerializerOptions = {
    val __obj = js.Dynamic.literal(space = space)
    if (replacer != null) __obj.updateDynamic("replacer")(js.Any.fromFunction2(replacer))
    __obj.asInstanceOf[SerializerOptions]
  }
}

