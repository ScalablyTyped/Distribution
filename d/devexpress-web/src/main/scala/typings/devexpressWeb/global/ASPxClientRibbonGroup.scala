package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ribbon's RibbonGroup object.
  */
@JSGlobal("ASPxClientRibbonGroup")
@js.native
class ASPxClientRibbonGroup ()
  extends typings.devexpressWeb.ASPxClientRibbonGroup {
  /**
    * Gets or sets the group's index within the collection.
    */
  /* CompleteClass */
  override var index: Double = js.native
  /**
    * Gets the name of the current ribbon group.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Gets the client ribbon object to which the current group belongs.
    */
  /* CompleteClass */
  override var ribbon: typings.devexpressWeb.ASPxClientRibbon = js.native
  /**
    * Gets the client tab object to which the current group belongs.
    */
  /* CompleteClass */
  override var tab: typings.devexpressWeb.ASPxClientRibbonTab = js.native
  /**
    * Returns a value specifying whether a ribbon group is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
}

