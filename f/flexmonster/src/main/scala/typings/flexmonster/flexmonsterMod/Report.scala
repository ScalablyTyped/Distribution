package typings.flexmonster.flexmonsterMod

import typings.flexmonster.Anon_Columns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Report extends js.Object {
  var conditions: js.UndefOr[js.Array[ConditionalFormat]] = js.undefined
  var creationDate: js.UndefOr[String] = js.undefined
  var dataSource: js.UndefOr[DataSource] = js.undefined
  var formats: js.UndefOr[js.Array[Format]] = js.undefined
  var localization: js.UndefOr[js.Object | String] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var slice: js.UndefOr[Slice] = js.undefined
  var tableSizes: js.UndefOr[Anon_Columns] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object Report {
  @scala.inline
  def apply(
    conditions: js.Array[ConditionalFormat] = null,
    creationDate: String = null,
    dataSource: DataSource = null,
    formats: js.Array[Format] = null,
    localization: js.Object | String = null,
    options: Options = null,
    slice: Slice = null,
    tableSizes: Anon_Columns = null,
    version: String = null
  ): Report = {
    val __obj = js.Dynamic.literal()
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (localization != null) __obj.updateDynamic("localization")(localization.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (slice != null) __obj.updateDynamic("slice")(slice.asInstanceOf[js.Any])
    if (tableSizes != null) __obj.updateDynamic("tableSizes")(tableSizes.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Report]
  }
}

