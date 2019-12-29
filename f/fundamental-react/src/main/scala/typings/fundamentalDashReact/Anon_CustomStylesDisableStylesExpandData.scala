package typings.fundamentalDashReact

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomStylesDisableStylesExpandData extends js.Object {
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  /* Object with rowId keys and boolean values representing whether that row is expanded. This variable is handled internally, but can be overridden by the consumer through this prop. */
  var expandData: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  /* Set to *true* for an expanded tree. This variable is handled internally, but can be overridden by the consumer through this prop */
  var isExpandAll: js.UndefOr[Boolean] = js.undefined
  /* Callback that is called whenever the internal expand/collapse state changes. The argument is an an object with rowId keys and boolean values representing whether that row is expanded. */
  var onExpandChange: js.UndefOr[js.Function1[/* expandData */ StringDictionary[Boolean], Unit]] = js.undefined
}

object Anon_CustomStylesDisableStylesExpandData {
  @scala.inline
  def apply(
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    expandData: StringDictionary[Boolean] = null,
    isExpandAll: js.UndefOr[Boolean] = js.undefined,
    onExpandChange: /* expandData */ StringDictionary[Boolean] => Unit = null
  ): Anon_CustomStylesDisableStylesExpandData = {
    val __obj = js.Dynamic.literal()
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (expandData != null) __obj.updateDynamic("expandData")(expandData.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpandAll)) __obj.updateDynamic("isExpandAll")(isExpandAll.asInstanceOf[js.Any])
    if (onExpandChange != null) __obj.updateDynamic("onExpandChange")(js.Any.fromFunction1(onExpandChange))
    __obj.asInstanceOf[Anon_CustomStylesDisableStylesExpandData]
  }
}

