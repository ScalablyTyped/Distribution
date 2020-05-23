package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ribbon's RibbonGroup object.
  */
trait ASPxClientRibbonGroup extends js.Object {
  /**
    * Gets or sets the group's index within the collection.
    */
  var index: Double
  /**
    * Gets the name of the current ribbon group.
    */
  var name: String
  /**
    * Gets the client ribbon object to which the current group belongs.
    */
  var ribbon: ASPxClientRibbon
  /**
    * Gets the client tab object to which the current group belongs.
    */
  var tab: ASPxClientRibbonTab
  /**
    * Returns a value specifying whether a ribbon group is displayed.
    */
  def GetVisible(): Boolean
}

object ASPxClientRibbonGroup {
  @scala.inline
  def apply(
    GetVisible: () => Boolean,
    index: Double,
    name: String,
    ribbon: ASPxClientRibbon,
    tab: ASPxClientRibbonTab
  ): ASPxClientRibbonGroup = {
    val __obj = js.Dynamic.literal(GetVisible = js.Any.fromFunction0(GetVisible), index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ribbon = ribbon.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRibbonGroup]
  }
}

