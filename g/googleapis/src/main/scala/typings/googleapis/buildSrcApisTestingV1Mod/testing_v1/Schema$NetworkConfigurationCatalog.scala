package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$NetworkConfigurationCatalog extends js.Object {
  var configurations: js.UndefOr[js.Array[Schema$NetworkConfiguration]] = js.native
}

object Schema$NetworkConfigurationCatalog {
  @scala.inline
  def apply(configurations: js.Array[Schema$NetworkConfiguration] = null): Schema$NetworkConfigurationCatalog = {
    val __obj = js.Dynamic.literal()
    if (configurations != null) __obj.updateDynamic("configurations")(configurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NetworkConfigurationCatalog]
  }
}

