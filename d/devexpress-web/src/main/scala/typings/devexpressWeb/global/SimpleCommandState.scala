package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a simple state common to most of the client commands.
  */
@JSGlobal("SimpleCommandState")
@js.native
class SimpleCommandState ()
  extends typings.devexpressWeb.SimpleCommandState {
  /**
    * Specifies a command availability.
    */
  /* CompleteClass */
  override var enabled: Boolean = js.native
  /**
    * Specifies a command visibility.
    */
  /* CompleteClass */
  override var visible: Boolean = js.native
}

