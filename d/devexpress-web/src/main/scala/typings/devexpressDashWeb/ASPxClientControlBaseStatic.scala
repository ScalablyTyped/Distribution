package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientControlBaseStatic extends js.Object {
  /**
    * Converts the specified object to the current object's type. This method is effective when you utilize the Client API IntelliSense feature provided by DevExpress.
    * @param obj The client object to be type cast. Represents an instance of a DevExpress web control's client object.
    */
  def Cast(obj: js.Object): ASPxClientControlBase
}

object ASPxClientControlBaseStatic {
  @scala.inline
  def apply(Cast: js.Object => ASPxClientControlBase): ASPxClientControlBaseStatic = {
    val __obj = js.Dynamic.literal(Cast = js.Any.fromFunction1(Cast))
  
    __obj.asInstanceOf[ASPxClientControlBaseStatic]
  }
}

