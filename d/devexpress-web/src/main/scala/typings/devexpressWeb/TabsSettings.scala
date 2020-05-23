package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the information about tab stops.
  */
trait TabsSettings extends js.Object {
  /**
    * Specifies the default distance between tab stops.
    */
  var defaultTabStop: Double
  /**
    * Gets or sets a list of tab stops.
    */
  var tabs: js.Array[TabSettings]
}

object TabsSettings {
  @scala.inline
  def apply(defaultTabStop: Double, tabs: js.Array[TabSettings]): TabsSettings = {
    val __obj = js.Dynamic.literal(defaultTabStop = defaultTabStop.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsSettings]
  }
}

