package typings.googleDashEarth.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlTimeStamp")
@js.native
class KmlTimeStamp () extends KmlTimePrimitive {
  /**
    * Represents a single moment in time.
    * This is a simple element and contains no children.
    * Its value is a dateTime, specified in XML time.
    * The precision of the TimeStamp is dictated by the dateTime value in the when property.
    *
    * * dateTime gives second resolution
    * * date gives day resolution
    * * gYearMonth gives month resolution
    * * gYear gives year resolution
    */
  def getWhen(): KmlDateTime = js.native
}

