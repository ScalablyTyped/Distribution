package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings of a tab stop.
  */
trait TabSettings extends js.Object {
  /**
    * Gets or sets the alignment type, specifying how any text after the tab will be lined up.
    * Value: One of the <see cref="TabAlign" /> values.
    */
  var alignment: js.Any
  /**
    * Gets or sets whether the individual tab stop is in effect.
    * Value: true to switch off this tab stop; otherwise, false.
    */
  var deleted: Boolean
  /**
    * Gets or sets the tab leader style, i.e., the symbol used as a tab leader.
    * Value: One of the <see cref="TabLeaderType" /> values.
    */
  var leader: js.Any
  /**
    * Gets or sets the position of the tab stop.
    * Value: A number representing the distance from the left edge of the text area.
    */
  var position: Double
}

object TabSettings {
  @scala.inline
  def apply(alignment: js.Any, deleted: Boolean, leader: js.Any, position: Double): TabSettings = {
    val __obj = js.Dynamic.literal(alignment = alignment, deleted = deleted, leader = leader, position = position)
  
    __obj.asInstanceOf[TabSettings]
  }
}

