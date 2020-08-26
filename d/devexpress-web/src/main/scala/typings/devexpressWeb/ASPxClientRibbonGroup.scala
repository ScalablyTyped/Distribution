package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ribbon's RibbonGroup object.
  */
@js.native
trait ASPxClientRibbonGroup extends js.Object {
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
  @scala.inline
  implicit class ASPxClientRibbonGroupOps[Self <: ASPxClientRibbonGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetVisible(value: () => Boolean): Self = this.set("GetVisible", js.Any.fromFunction0(value))
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRibbon(value: ASPxClientRibbon): Self = this.set("ribbon", value.asInstanceOf[js.Any])
    @scala.inline
    def setTab(value: ASPxClientRibbonTab): Self = this.set("tab", value.asInstanceOf[js.Any])
  }
  
}

