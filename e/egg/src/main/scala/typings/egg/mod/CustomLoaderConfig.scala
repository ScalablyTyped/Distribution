package typings.egg.mod

import typings.egg.eggStrings.app
import typings.egg.eggStrings.ctx
import typings.eggCore.AnonPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent egg.egg.RemoveSpecProp<egg-core.egg-core.FileLoaderOption, 'inject' | 'target'> */
trait CustomLoaderConfig extends js.Object {
  var call: js.UndefOr[Boolean] = js.undefined
  var caseStyle: js.UndefOr[String | (js.Function1[/* str */ String, js.Array[String]])] = js.undefined
  var directory: String | js.Array[String]
  var filter: js.UndefOr[js.Function1[/* obj */ js.Object, Boolean]] = js.undefined
  var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
  var initializer: js.UndefOr[js.Function2[/* obj */ js.Object, /* options */ AnonPath, _]] = js.undefined
  /**
    * an object you wanner load to, value can only be 'ctx' or 'app'. default to app
    */
  var inject: js.UndefOr[ctx | app] = js.undefined
  /**
    * whether need to load files in plugins or framework, default to false
    */
  var loadunit: js.UndefOr[Boolean] = js.undefined
  var `match`: js.UndefOr[String | js.Array[String]] = js.undefined
  var `override`: js.UndefOr[Boolean] = js.undefined
}

object CustomLoaderConfig {
  @scala.inline
  def apply(
    directory: String | js.Array[String],
    call: js.UndefOr[Boolean] = js.undefined,
    caseStyle: String | (js.Function1[/* str */ String, js.Array[String]]) = null,
    filter: /* obj */ js.Object => Boolean = null,
    ignore: String | js.Array[String] = null,
    initializer: (/* obj */ js.Object, /* options */ AnonPath) => _ = null,
    inject: ctx | app = null,
    loadunit: js.UndefOr[Boolean] = js.undefined,
    `match`: String | js.Array[String] = null,
    `override`: js.UndefOr[Boolean] = js.undefined
  ): CustomLoaderConfig = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any])
    if (!js.isUndefined(call)) __obj.updateDynamic("call")(call.asInstanceOf[js.Any])
    if (caseStyle != null) __obj.updateDynamic("caseStyle")(caseStyle.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (initializer != null) __obj.updateDynamic("initializer")(js.Any.fromFunction2(initializer))
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    if (!js.isUndefined(loadunit)) __obj.updateDynamic("loadunit")(loadunit.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLoaderConfig]
  }
}

