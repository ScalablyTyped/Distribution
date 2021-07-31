package typings.googleEarth.global.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.earth.KmlDateTime")
@js.native
class KmlDateTime ()
  extends StObject
     with typings.googleEarth.google.earth.KmlDateTime {
  
  /**
    * Returns the date and time in XML Schema time format.
    */
  /* CompleteClass */
  override def get(): String = js.native
  
  /**
    * Set the date.  Accepts only XML Schema time (see XML Schema Part 2: Datatypes Second Edition).
    * The value can be expressed as yyyy-mm-ddThh:mm:sszzzzzz, where T is the separator between the date and the time,
    * and the time zone is either Z(for UTC) or zzzzzz, which represents +/-hh:mm in relation to UTC.
    * Additionally, the value can be expressed as a date only.
    */
  /* CompleteClass */
  override def set(date: String): Unit = js.native
}
