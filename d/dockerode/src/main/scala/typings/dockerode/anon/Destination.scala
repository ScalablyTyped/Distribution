package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Destination extends js.Object {
  var Destination: String
  var Driver: js.UndefOr[String] = js.undefined
  var Mode: String
  var Name: js.UndefOr[String] = js.undefined
  var Propagation: String
  var RW: Boolean
  var Source: String
  var Type: String
}

object Destination {
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
  ): Destination = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], Propagation = Propagation.asInstanceOf[js.Any], RW = RW.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (Driver != null) __obj.updateDynamic("Driver")(Driver.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
}

