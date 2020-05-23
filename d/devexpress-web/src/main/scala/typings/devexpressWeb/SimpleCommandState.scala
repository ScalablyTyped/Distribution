package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a simple state common to most of the client commands.
  */
trait SimpleCommandState extends js.Object {
  /**
    * Specifies a command availability.
    */
  var enabled: Boolean
  /**
    * Specifies a command visibility.
    */
  var visible: Boolean
}

object SimpleCommandState {
  @scala.inline
  def apply(enabled: Boolean, visible: Boolean): SimpleCommandState = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleCommandState]
  }
}

