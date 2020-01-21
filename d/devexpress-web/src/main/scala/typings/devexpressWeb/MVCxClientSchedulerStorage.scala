package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the Scheduler Storage Control extension.
  */
@JSGlobal("MVCxClientSchedulerStorage")
@js.native
class MVCxClientSchedulerStorage () extends ASPxClientSchedulerStorageControl {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientSchedulerStorage: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientSchedulerStorage]] = js.native
}

/* static members */
@JSGlobal("MVCxClientSchedulerStorage")
@js.native
object MVCxClientSchedulerStorage extends js.Object {
  /**
    * Converts the specified object to the MVCxClientSchedulerStorage type. SchedulerStorage
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): MVCxClientSchedulerStorage = js.native
}

