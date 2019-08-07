package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the information about tab stops.
  */
@JSGlobal("TabsSettings")
@js.native
class TabsSettings () extends js.Object {
  /**
    * Specifies the default distance between tab stops.
    */
  var defaultTabStop: Double = js.native
  /**
    * Gets or sets a list of tab stops.
    */
  var tabs: js.Array[TabSettings] = js.native
}

