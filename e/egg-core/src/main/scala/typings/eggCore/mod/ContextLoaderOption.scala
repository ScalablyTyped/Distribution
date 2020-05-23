package typings.eggCore.mod

import typings.eggCore.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<egg-core.egg-core.FileLoaderOption> */
trait ContextLoaderOption extends js.Object {
  var call: js.UndefOr[Boolean] = js.undefined
  var caseStyle: js.UndefOr[String | (js.Function1[/* str */ String, js.Array[String]])] = js.undefined
  /** directories to be loaded */
  var directory: String | js.Array[String]
  /** determine the field name of inject object. */
  var fieldClass: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[js.Function1[/* obj */ js.Object, Boolean]] = js.undefined
  var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
  var initializer: js.UndefOr[js.Function2[/* obj */ js.Object, /* options */ Path, _]] = js.undefined
  /** required inject */
  var inject: js.Object
  var `match`: js.UndefOr[String | js.Array[String]] = js.undefined
  var `override`: js.UndefOr[Boolean] = js.undefined
  /** property name defined to target */
  var property: String
  var target: js.UndefOr[js.Object] = js.undefined
}

object ContextLoaderOption {
  @scala.inline
  def apply(
    directory: String | js.Array[String],
    inject: js.Object,
    property: String,
    call: js.UndefOr[Boolean] = js.undefined,
    caseStyle: String | (js.Function1[/* str */ String, js.Array[String]]) = null,
    fieldClass: String = null,
    filter: /* obj */ js.Object => Boolean = null,
    ignore: String | js.Array[String] = null,
    initializer: (/* obj */ js.Object, /* options */ Path) => _ = null,
    `match`: String | js.Array[String] = null,
    `override`: js.UndefOr[Boolean] = js.undefined,
    target: js.Object = null
  ): ContextLoaderOption = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], inject = inject.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    if (!js.isUndefined(call)) __obj.updateDynamic("call")(call.get.asInstanceOf[js.Any])
    if (caseStyle != null) __obj.updateDynamic("caseStyle")(caseStyle.asInstanceOf[js.Any])
    if (fieldClass != null) __obj.updateDynamic("fieldClass")(fieldClass.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (initializer != null) __obj.updateDynamic("initializer")(js.Any.fromFunction2(initializer))
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextLoaderOption]
  }
}

