package typings
package dynogelsLib.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTablesOptions extends js.Object {
  var readCapacity: js.UndefOr[scala.Double] = js.undefined
  var streamSpecification: js.UndefOr[dynogelsLib.Anon_StreamEnabled] = js.undefined
  var writeCapacity: js.UndefOr[scala.Double] = js.undefined
}

object CreateTablesOptions {
  @scala.inline
  def apply(
    readCapacity: scala.Int | scala.Double = null,
    streamSpecification: dynogelsLib.Anon_StreamEnabled = null,
    writeCapacity: scala.Int | scala.Double = null
  ): CreateTablesOptions = {
    val __obj = js.Dynamic.literal()
    if (readCapacity != null) __obj.updateDynamic("readCapacity")(readCapacity.asInstanceOf[js.Any])
    if (streamSpecification != null) __obj.updateDynamic("streamSpecification")(streamSpecification)
    if (writeCapacity != null) __obj.updateDynamic("writeCapacity")(writeCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTablesOptions]
  }
}

