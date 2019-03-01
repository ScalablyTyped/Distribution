package typings
package eurekaDashJsDashClientLib.eurekaDashJsDashClientMod.EurekaClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataCenterInfo extends js.Object {
  var `@class`: js.UndefOr[java.lang.String] = js.undefined
  var name: DataCenterName
}

object DataCenterInfo {
  @scala.inline
  def apply(name: DataCenterName, `@class`: java.lang.String = null): DataCenterInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (`@class` != null) __obj.updateDynamic("@class")(`@class`)
    __obj.asInstanceOf[DataCenterInfo]
  }
}

