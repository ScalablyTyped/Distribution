package typings.dynogels.dynogelsMod

import typings.dynogels.Anon_StreamEnabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTablesOptions extends js.Object {
  var readCapacity: js.UndefOr[Double] = js.undefined
  var streamSpecification: js.UndefOr[Anon_StreamEnabled] = js.undefined
  var writeCapacity: js.UndefOr[Double] = js.undefined
}

object CreateTablesOptions {
  @scala.inline
  def apply(
    readCapacity: Int | Double = null,
    streamSpecification: Anon_StreamEnabled = null,
    writeCapacity: Int | Double = null
  ): CreateTablesOptions = {
    val __obj = js.Dynamic.literal()
    if (readCapacity != null) __obj.updateDynamic("readCapacity")(readCapacity.asInstanceOf[js.Any])
    if (streamSpecification != null) __obj.updateDynamic("streamSpecification")(streamSpecification.asInstanceOf[js.Any])
    if (writeCapacity != null) __obj.updateDynamic("writeCapacity")(writeCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTablesOptions]
  }
}

