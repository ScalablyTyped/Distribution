package typings.devextreme.anon

import typings.devextreme.devextremeStrings.custom
import typings.devextreme.devextremeStrings.localStorage
import typings.devextreme.devextremeStrings.sessionStorage
import typings.devextreme.mod.global.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLoad extends js.Object {
  var customLoad: js.UndefOr[js.Function0[typings.devextreme.mod.global.Promise[_] | JQueryPromise[_]]] = js.undefined
  var customSave: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var savingTimeout: js.UndefOr[Double] = js.undefined
  var storageKey: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[custom | localStorage | sessionStorage] = js.undefined
}

object CustomLoad {
  @scala.inline
  def apply(
    customLoad: () => typings.devextreme.mod.global.Promise[_] | JQueryPromise[_] = null,
    customSave: /* state */ js.Any => _ = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    savingTimeout: js.UndefOr[Double] = js.undefined,
    storageKey: String = null,
    `type`: custom | localStorage | sessionStorage = null
  ): CustomLoad = {
    val __obj = js.Dynamic.literal()
    if (customLoad != null) __obj.updateDynamic("customLoad")(js.Any.fromFunction0(customLoad))
    if (customSave != null) __obj.updateDynamic("customSave")(js.Any.fromFunction1(customSave))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(savingTimeout)) __obj.updateDynamic("savingTimeout")(savingTimeout.get.asInstanceOf[js.Any])
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLoad]
  }
}

