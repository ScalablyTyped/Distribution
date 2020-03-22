package typings.eggCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<egg-core.egg-core.ContextLoaderOption> */
trait PartialContextLoaderOptio extends js.Object {
  var call: js.UndefOr[Boolean] = js.undefined
  var caseStyle: js.UndefOr[String | (js.Function1[/* str */ String, js.Array[String]])] = js.undefined
  var directory: js.UndefOr[String | js.Array[String]] = js.undefined
  var fieldClass: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[js.Function1[/* obj */ js.Object, Boolean]] = js.undefined
  var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
  var initializer: js.UndefOr[js.Function2[/* obj */ js.Object, /* options */ AnonPath, _]] = js.undefined
  var inject: js.UndefOr[js.Object] = js.undefined
  var `match`: js.UndefOr[String | js.Array[String]] = js.undefined
  var `override`: js.UndefOr[Boolean] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[js.Object] = js.undefined
}

object PartialContextLoaderOptio {
  @scala.inline
  def apply(
    call: js.UndefOr[Boolean] = js.undefined,
    caseStyle: String | (js.Function1[/* str */ String, js.Array[String]]) = null,
    directory: String | js.Array[String] = null,
    fieldClass: String = null,
    filter: /* obj */ js.Object => Boolean = null,
    ignore: String | js.Array[String] = null,
    initializer: (/* obj */ js.Object, /* options */ AnonPath) => _ = null,
    inject: js.Object = null,
    `match`: String | js.Array[String] = null,
    `override`: js.UndefOr[Boolean] = js.undefined,
    property: String = null,
    target: js.Object = null
  ): PartialContextLoaderOptio = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(call)) __obj.updateDynamic("call")(call.asInstanceOf[js.Any])
    if (caseStyle != null) __obj.updateDynamic("caseStyle")(caseStyle.asInstanceOf[js.Any])
    if (directory != null) __obj.updateDynamic("directory")(directory.asInstanceOf[js.Any])
    if (fieldClass != null) __obj.updateDynamic("fieldClass")(fieldClass.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (initializer != null) __obj.updateDynamic("initializer")(js.Any.fromFunction2(initializer))
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialContextLoaderOptio]
  }
}

