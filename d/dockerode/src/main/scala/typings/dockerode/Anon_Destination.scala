package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Destination extends js.Object {
  var Destination: String
  var Driver: js.UndefOr[String] = js.undefined
  var Mode: String
  var Name: js.UndefOr[String] = js.undefined
  var Propagation: String
  var RW: Boolean
  var Source: String
  var Type: String
}

object Anon_Destination {
  @scala.inline
  def apply(
    Destination: String,
    Mode: String,
    Propagation: String,
    RW: Boolean,
    Source: String,
    Type: String,
    Driver: String = null,
    Name: String = null
  ): Anon_Destination = {
    val __obj = js.Dynamic.literal(Destination = Destination, Mode = Mode, Propagation = Propagation, RW = RW, Source = Source, Type = Type)
    if (Driver != null) __obj.updateDynamic("Driver")(Driver)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[Anon_Destination]
  }
}

