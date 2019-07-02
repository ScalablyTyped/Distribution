package typings
package dockerodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DestinationMode extends js.Object {
  var Destination: java.lang.String
  var Mode: java.lang.String
  var Name: js.UndefOr[java.lang.String] = js.undefined
  var Propagation: java.lang.String
  var RW: scala.Boolean
  var Source: java.lang.String
}

object Anon_DestinationMode {
  @scala.inline
  def apply(
    Destination: java.lang.String,
    Mode: java.lang.String,
    Propagation: java.lang.String,
    RW: scala.Boolean,
    Source: java.lang.String,
    Name: java.lang.String = null
  ): Anon_DestinationMode = {
    val __obj = js.Dynamic.literal(Destination = Destination, Mode = Mode, Propagation = Propagation, RW = RW, Source = Source)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[Anon_DestinationMode]
  }
}

