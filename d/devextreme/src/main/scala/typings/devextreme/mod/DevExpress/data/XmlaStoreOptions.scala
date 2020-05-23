package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlaStoreOptions extends js.Object {
  /** @name XmlaStore.Options.beforeSend */
  var beforeSend: js.UndefOr[js.Function1[/* options */ Data, _]] = js.undefined
  /** @name XmlaStore.Options.catalog */
  var catalog: js.UndefOr[String] = js.undefined
  /** @name XmlaStore.Options.cube */
  var cube: js.UndefOr[String] = js.undefined
  /** @name XmlaStore.Options.url */
  var url: js.UndefOr[String] = js.undefined
}

object XmlaStoreOptions {
  @scala.inline
  def apply(
    beforeSend: /* options */ Data => _ = null,
    catalog: String = null,
    cube: String = null,
    url: String = null
  ): XmlaStoreOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction1(beforeSend))
    if (catalog != null) __obj.updateDynamic("catalog")(catalog.asInstanceOf[js.Any])
    if (cube != null) __obj.updateDynamic("cube")(cube.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlaStoreOptions]
  }
}

