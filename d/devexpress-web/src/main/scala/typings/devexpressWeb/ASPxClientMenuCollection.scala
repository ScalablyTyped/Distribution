package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client collection that maintains client menu objects.
  */
@JSGlobal("ASPxClientMenuCollection")
@js.native
class ASPxClientMenuCollection () extends ASPxClientControlCollection {
  /**
    * Hides all menus maitained by the collection.
    */
  def HideAll(): Unit = js.native
  /**
    * Recalculates the position of visible sub menus.
    */
  def RecalculateAll(): Unit = js.native
}

