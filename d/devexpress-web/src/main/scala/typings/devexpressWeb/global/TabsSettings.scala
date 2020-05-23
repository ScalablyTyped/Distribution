package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the information about tab stops.
  */
@JSGlobal("TabsSettings")
@js.native
class TabsSettings ()
  extends typings.devexpressWeb.TabsSettings {
  /**
    * Specifies the default distance between tab stops.
    */
  /* CompleteClass */
  override var defaultTabStop: Double = js.native
  /**
    * Gets or sets a list of tab stops.
    */
  /* CompleteClass */
  override var tabs: js.Array[typings.devexpressWeb.TabSettings] = js.native
}

