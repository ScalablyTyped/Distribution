package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ribbon's RibbonGroup object.
  */
@JSGlobal("ASPxClientRibbonGroup")
@js.native
class ASPxClientRibbonGroup () extends js.Object {
  /**
    * Gets or sets the group's index within the collection.
    */
  var index: Double = js.native
  /**
    * Gets the name of the current ribbon group.
    */
  var name: String = js.native
  /**
    * Gets the client ribbon object to which the current group belongs.
    */
  var ribbon: ASPxClientRibbon = js.native
  /**
    * Gets the client tab object to which the current group belongs.
    */
  var tab: ASPxClientRibbonTab = js.native
  /**
    * Returns a value specifying whether a ribbon group is displayed.
    */
  def GetVisible(): Boolean = js.native
}

