package typings.dojo.dojox.grid.enhanced.plugins

import typings.dojo.dojox.grid.enhanced.Plugin
import typings.std.Event_
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
class Menu () extends Plugin {
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
  def showMenu(e: Event_): Unit = js.native
}

