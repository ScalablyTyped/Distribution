package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the FilterControl extension.
  */
@JSGlobal("MVCxClientFilterControl")
@js.native
class MVCxClientFilterControl () extends ASPxClientFilterControl {
  /**
    * Returns the filter control's state.
    * @param obj An object that receives a filter control's callback parameters.
    */
  def FillStateObject(obj: js.Any): Unit = js.native
}

/* static members */
@JSGlobal("MVCxClientFilterControl")
@js.native
object MVCxClientFilterControl extends js.Object {
  /**
    * Converts the specified object to the MVCxClientFilterControl type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): MVCxClientFilterControl = js.native
}

