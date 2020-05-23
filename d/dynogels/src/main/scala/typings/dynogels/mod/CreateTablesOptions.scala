package typings.dynogels.mod

import typings.dynogels.anon.StreamEnabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTablesOptions extends js.Object {
  var readCapacity: js.UndefOr[Double] = js.undefined
  var streamSpecification: js.UndefOr[StreamEnabled] = js.undefined
  var writeCapacity: js.UndefOr[Double] = js.undefined
}

object CreateTablesOptions {
  @scala.inline
  def apply(
    readCapacity: js.UndefOr[Double] = js.undefined,
    streamSpecification: StreamEnabled = null,
    writeCapacity: js.UndefOr[Double] = js.undefined
  ): CreateTablesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(readCapacity)) __obj.updateDynamic("readCapacity")(readCapacity.get.asInstanceOf[js.Any])
    if (streamSpecification != null) __obj.updateDynamic("streamSpecification")(streamSpecification.asInstanceOf[js.Any])
    if (!js.isUndefined(writeCapacity)) __obj.updateDynamic("writeCapacity")(writeCapacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTablesOptions]
  }
}

