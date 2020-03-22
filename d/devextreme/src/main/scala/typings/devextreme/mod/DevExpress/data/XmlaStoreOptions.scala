package typings.devextreme.mod.DevExpress.data

import typings.devextreme.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlaStoreOptions extends js.Object {
  /** Specifies a function that customizes the request before it is sent to the server. */
  var beforeSend: js.UndefOr[js.Function1[/* options */ AnonData, _]] = js.undefined
  /** Specifies the database (or initial catalog) that contains the OLAP cube to use. */
  var catalog: js.UndefOr[String] = js.undefined
  /** Specifies the name of the OLAP cube to use from the catalog. */
  var cube: js.UndefOr[String] = js.undefined
  /** Specifies the OLAP server's URL. */
  var url: js.UndefOr[String] = js.undefined
}

object XmlaStoreOptions {
  @scala.inline
  def apply(
    beforeSend: /* options */ AnonData => _ = null,
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

