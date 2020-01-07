package typings.googleapis.buildSrcApisFitnessV1Mod.fitness_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ListDataSourcesResponse extends js.Object {
  /**
    * A previously created data source.
    */
  var dataSource: js.UndefOr[js.Array[Schema$DataSource]] = js.native
}

object Schema$ListDataSourcesResponse {
  @scala.inline
  def apply(dataSource: js.Array[Schema$DataSource] = null): Schema$ListDataSourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListDataSourcesResponse]
  }
}

