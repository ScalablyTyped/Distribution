package typings.eurekaDashJsDashClient.eurekaDashJsDashClientMod.EurekaClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataCenterInfo extends js.Object {
  var `@class`: js.UndefOr[String] = js.undefined
  var name: DataCenterName
}

object DataCenterInfo {
  @scala.inline
  def apply(name: DataCenterName, `@class`: String = null): DataCenterInfo = {
    val __obj = js.Dynamic.literal(name = name)
    if (`@class` != null) __obj.updateDynamic("@class")(`@class`)
    __obj.asInstanceOf[DataCenterInfo]
  }
}

