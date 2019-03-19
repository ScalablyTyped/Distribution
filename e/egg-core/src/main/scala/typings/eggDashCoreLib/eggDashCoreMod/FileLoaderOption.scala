package typings
package eggDashCoreLib.eggDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileLoaderOption extends js.Object {
  /** determine whether invoke when exports is function */
  var call: js.UndefOr[scala.Boolean] = js.undefined
  /** set property's case when converting a filepath to property list. */
  var caseStyle: js.UndefOr[java.lang.String | (js.Function1[/* str */ java.lang.String, java.lang.String])] = js.undefined
  /** directories to be loaded */
  var directory: java.lang.String | js.Array[java.lang.String]
  /** a function that filter the exports which can be loaded */
  var filter: js.UndefOr[js.Function1[/* obj */ js.Object, scala.Boolean]] = js.undefined
  /** ignore the files when load, support glob */
  var ignore: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** custom file exports, receive two parameters, first is the inject object(if not js file, will be content buffer), second is an `options` object that contain `path` */
  var initializer: js.UndefOr[js.Function2[/* obj */ js.Object, /* options */ eggDashCoreLib.Anon_Path, _]] = js.undefined
  /** an object that be the argument when invoke the function */
  var inject: js.UndefOr[js.Object] = js.undefined
  /** match the files when load, support glob, default to all js files */
  var `match`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** determine whether override the property when get the same name */
  var `override`: js.UndefOr[scala.Boolean] = js.undefined
  /** attach the target object from loaded files */
  var target: js.Object
}

object FileLoaderOption {
  @scala.inline
  def apply(
    directory: java.lang.String | js.Array[java.lang.String],
    target: js.Object,
    call: js.UndefOr[scala.Boolean] = js.undefined,
    caseStyle: java.lang.String | (js.Function1[/* str */ java.lang.String, java.lang.String]) = null,
    filter: /* obj */ js.Object => scala.Boolean = null,
    ignore: java.lang.String | js.Array[java.lang.String] = null,
    initializer: (/* obj */ js.Object, /* options */ eggDashCoreLib.Anon_Path) => _ = null,
    inject: js.Object = null,
    `match`: java.lang.String | js.Array[java.lang.String] = null,
    `override`: js.UndefOr[scala.Boolean] = js.undefined
  ): FileLoaderOption = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], target = target)
    if (!js.isUndefined(call)) __obj.updateDynamic("call")(call)
    if (caseStyle != null) __obj.updateDynamic("caseStyle")(caseStyle.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (initializer != null) __obj.updateDynamic("initializer")(js.Any.fromFunction2(initializer))
    if (inject != null) __obj.updateDynamic("inject")(inject)
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`)
    __obj.asInstanceOf[FileLoaderOption]
  }
}

