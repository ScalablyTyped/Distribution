package typings.elasticElasticsearch.connectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionRoles extends js.Object {
  var data: js.UndefOr[Boolean] = js.undefined
  var ingest: js.UndefOr[Boolean] = js.undefined
  var master: js.UndefOr[Boolean] = js.undefined
  var ml: js.UndefOr[Boolean] = js.undefined
}

object ConnectionRoles {
  @scala.inline
  def apply(
    data: js.UndefOr[Boolean] = js.undefined,
    ingest: js.UndefOr[Boolean] = js.undefined,
    master: js.UndefOr[Boolean] = js.undefined,
    ml: js.UndefOr[Boolean] = js.undefined
  ): ConnectionRoles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ingest)) __obj.updateDynamic("ingest")(ingest.get.asInstanceOf[js.Any])
    if (!js.isUndefined(master)) __obj.updateDynamic("master")(master.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ml)) __obj.updateDynamic("ml")(ml.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionRoles]
  }
}

