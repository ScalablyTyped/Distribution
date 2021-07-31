package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlDateTime extends StObject {
  
  /**
    * Returns the date and time in XML Schema time format.
    */
  def get(): String
  
  /**
    * Set the date.  Accepts only XML Schema time (see XML Schema Part 2: Datatypes Second Edition).
    * The value can be expressed as yyyy-mm-ddThh:mm:sszzzzzz, where T is the separator between the date and the time,
    * and the time zone is either Z(for UTC) or zzzzzz, which represents +/-hh:mm in relation to UTC.
    * Additionally, the value can be expressed as a date only.
    */
  def set(date: String): Unit
}
object KmlDateTime {
  
  @scala.inline
  def apply(get: () => String, set: String => Unit): KmlDateTime = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[KmlDateTime]
  }
  
  @scala.inline
  implicit class KmlDateTimeMutableBuilder[Self <: KmlDateTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: () => String): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: String => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
