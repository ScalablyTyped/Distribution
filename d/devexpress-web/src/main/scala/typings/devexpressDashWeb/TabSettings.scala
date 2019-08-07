package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings of a tab stop.
  */
@JSGlobal("TabSettings")
@js.native
class TabSettings () extends js.Object {
  /**
    * Specifies the tab alignment type.
    */
  var alignment: TabAlign = js.native
  /**
    * Specifies whether the individual tab stop is in effect.
    */
  var deleted: Boolean = js.native
  /**
    * Specifies the tab leader symbol.
    */
  var leader: TabLeaderType = js.native
  /**
    * Specifies the position of the tab stop.
    */
  var position: Double = js.native
}

