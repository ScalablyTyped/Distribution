package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a base for client-side editors which are capable of displaying images.
  */
@JSGlobal("ASPxClientImageBase")
@js.native
class ASPxClientImageBase () extends ASPxClientStaticEdit {
  /**
    * Sets the size of the image displayed within the image editor.
    * @param width An integer value that specifies the image's width.
    * @param height An integer value that specifies the image's height.
    */
  def SetSize(width: Double, height: Double): Unit = js.native
}

