package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Orientation extends js.Object
/**
  * Lists values specifying the page orientation.
  */
@JSGlobal("Orientation")
@js.native
object Orientation extends js.Object {
  
  /**
    * Worksheet page orientation is landscape.
    */
  @js.native
  sealed trait Landscape extends Orientation
  
  /**
    * Worksheet page orientation is portrait.
    */
  @js.native
  sealed trait Portrait extends Orientation
}
