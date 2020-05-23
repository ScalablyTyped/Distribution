package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings of a tab stop.
  */
@JSGlobal("TabSettings")
@js.native
class TabSettings ()
  extends typings.devexpressWeb.TabSettings {
  /**
    * Specifies the tab alignment type.
    */
  /* CompleteClass */
  override var alignment: typings.devexpressWeb.TabAlign = js.native
  /**
    * Specifies whether the individual tab stop is in effect.
    */
  /* CompleteClass */
  override var deleted: Boolean = js.native
  /**
    * Specifies the tab leader symbol.
    */
  /* CompleteClass */
  override var leader: typings.devexpressWeb.TabLeaderType = js.native
  /**
    * Specifies the position of the tab stop.
    */
  /* CompleteClass */
  override var position: Double = js.native
}

