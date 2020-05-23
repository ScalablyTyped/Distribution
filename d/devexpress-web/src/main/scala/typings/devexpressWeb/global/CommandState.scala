package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the state of a command.
  */
@JSGlobal("CommandState")
@js.native
class CommandState[T] ()
  extends typings.devexpressWeb.CommandState[T] {
  /**
    * Specifies a command availability.
    */
  /* CompleteClass */
  override var enabled: Boolean = js.native
  /**
    * Specifies a command value.
    */
  /* CompleteClass */
  override var value: T = js.native
  /**
    * Specifies a command visibility.
    */
  /* CompleteClass */
  override var visible: Boolean = js.native
}

