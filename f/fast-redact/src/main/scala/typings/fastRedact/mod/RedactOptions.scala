package typings.fastRedact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedactOptions extends js.Object {
  /** This is the value which overwrites redacted properties. */
  var censor: js.UndefOr[String | (js.Function1[/* v */ js.Any, _])] = js.undefined
  /** An array of strings describing the nested location of a key in an object. */
  var paths: js.Array[String]
  /** The remove option, when set to true will cause keys to be removed from the serialized output. */
  var remove: js.UndefOr[Boolean] = js.undefined
  /** The serialize option may either be a function or a boolean. If a function is supplied, this will be used to serialize the redacted object. */
  var serialize: js.UndefOr[Boolean | (js.Function1[/* v */ js.Any, _])] = js.undefined
  /** The strict option, when set to true, will cause the redactor function to throw if instead of an object it finds a primitive. */
  var strict: js.UndefOr[Boolean] = js.undefined
}

object RedactOptions {
  @scala.inline
  def apply(
    paths: js.Array[String],
    censor: String | (js.Function1[/* v */ js.Any, _]) = null,
    remove: js.UndefOr[Boolean] = js.undefined,
    serialize: Boolean | (js.Function1[/* v */ js.Any, _]) = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): RedactOptions = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    if (censor != null) __obj.updateDynamic("censor")(censor.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.get.asInstanceOf[js.Any])
    if (serialize != null) __obj.updateDynamic("serialize")(serialize.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedactOptions]
  }
}

