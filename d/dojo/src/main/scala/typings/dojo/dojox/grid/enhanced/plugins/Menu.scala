package typings.dojo.dojox.grid.enhanced.plugins

import typings.dojo.dojox.grid.enhanced._Plugin
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/Menu.html
  *
  * Provides context menu support, including header menu, row menu, cell menu and selected region menu
  *
  */
@JSGlobal("dojox.grid.enhanced.plugins.Menu")
@js.native
class Menu () extends _Plugin {
  /**
    * menu types
    *
    */
  var types: js.Object = js.native
  /**
    * Show appropriate context menu
    * Fired from dojox.grid.enhanced._Events.onRowContextMenu, 'this' scope - Grid
    *
    * @param e
    */
  def showMenu(e: Event): Unit = js.native
}

