package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DestinationMode extends js.Object {
  var Destination: String
  var Mode: String
  var Name: js.UndefOr[String] = js.undefined
  var Propagation: String
  var RW: Boolean
  var Source: String
}

object Anon_DestinationMode {
  @scala.inline
  def apply(
    Destination: String,
    Mode: String,
    Propagation: String,
    RW: Boolean,
    Source: String,
    Name: String = null
  ): Anon_DestinationMode = {
    val __obj = js.Dynamic.literal(Destination = Destination, Mode = Mode, Propagation = Propagation, RW = RW, Source = Source)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[Anon_DestinationMode]
  }
}

