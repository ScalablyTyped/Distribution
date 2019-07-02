package typings
package dockerodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Destination extends js.Object {
  var Destination: java.lang.String
  var Driver: js.UndefOr[java.lang.String] = js.undefined
  var Mode: java.lang.String
  var Name: js.UndefOr[java.lang.String] = js.undefined
  var Propagation: java.lang.String
  var RW: scala.Boolean
  var Source: java.lang.String
  var Type: java.lang.String
}

object Anon_Destination {
  @scala.inline
  def apply(
    Destination: java.lang.String,
    Mode: java.lang.String,
    Propagation: java.lang.String,
    RW: scala.Boolean,
    Source: java.lang.String,
    Type: java.lang.String,
    Driver: java.lang.String = null,
    Name: java.lang.String = null
  ): Anon_Destination = {
    val __obj = js.Dynamic.literal(Destination = Destination, Mode = Mode, Propagation = Propagation, RW = RW, Source = Source, Type = Type)
    if (Driver != null) __obj.updateDynamic("Driver")(Driver)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[Anon_Destination]
  }
}

