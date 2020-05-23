package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings of a tab stop.
  */
trait TabSettings extends js.Object {
  /**
    * Specifies the tab alignment type.
    */
  var alignment: TabAlign
  /**
    * Specifies whether the individual tab stop is in effect.
    */
  var deleted: Boolean
  /**
    * Specifies the tab leader symbol.
    */
  var leader: TabLeaderType
  /**
    * Specifies the position of the tab stop.
    */
  var position: Double
}

object TabSettings {
  @scala.inline
  def apply(alignment: TabAlign, deleted: Boolean, leader: TabLeaderType, position: Double): TabSettings = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], leader = leader.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabSettings]
  }
}

