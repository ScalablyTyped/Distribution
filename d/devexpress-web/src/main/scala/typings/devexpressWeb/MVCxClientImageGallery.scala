package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the ImageGallery extension.
  */
@JSGlobal("MVCxClientImageGallery")
@js.native
class MVCxClientImageGallery () extends ASPxClientImageGallery {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientImageGallery: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientImageGallery]] = js.native
  /**
    * Sends a callback with a parameter to update the ImageGallery by processing the passed information on the server, in an Action specified via the ImageGallery's ImageGallerySettings.CustomActionRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the ImageGallerySettings.CustomActionRouteValues property.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(data: js.Any): Unit = js.native
  def PerformCallback(data: js.Any, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
}

/* static members */
@JSGlobal("MVCxClientImageGallery")
@js.native
object MVCxClientImageGallery extends js.Object {
  /**
    * Converts the specified object to the MVCxClientImageGallery type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): MVCxClientImageGallery = js.native
}

