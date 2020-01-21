package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxImage control.
  */
@JSGlobal("ASPxClientImage")
@js.native
class ASPxClientImage () extends ASPxClientImageBase {
  /**
    * Returns the URL pointing to the image displayed within the image editor.
    */
  def GetImageUrl(): String = js.native
  /**
    * Sets the URL which points to the image displayed within the image editor.
    * @param url A string value specifying the URL to the image displayed within the editor.
    */
  def SetImageUrl(url: String): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientImage")
@js.native
object ASPxClientImage extends js.Object {
  /**
    * Converts the specified object to the ASPxClientImage type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientImage = js.native
}

