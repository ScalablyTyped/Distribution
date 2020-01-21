package typings.dojo.dojox.grid.enhanced.plugins

import typings.dojo.dojox.grid.enhanced.Plugin
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/Search.html
  *
  * Search the grid using wildcard string or Regular Expression.
  *
  * @param grid
  * @param args
  */
@JSGlobal("dojox.grid.enhanced.plugins.Search")
@js.native
class Search protected () extends Plugin {
  def this(grid: js.Any, args: js.Any) = this()
  /**
    *
    * @param searchArgs
    * @param onSearched
    */
  def searchRow(searchArgs: String, onSearched: js.Function2[/* index */ Double, /* item */ js.Object, _]): Unit = js.native
  /**
    *
    * @param searchArgs
    * @param onSearched
    */
  def searchRow(searchArgs: js.Object, onSearched: js.Function2[/* index */ Double, /* item */ js.Object, _]): Unit = js.native
  /**
    *
    * @param searchArgs
    * @param onSearched
    */
  def searchRow(searchArgs: RegExp, onSearched: js.Function2[/* index */ Double, /* item */ js.Object, _]): Unit = js.native
}

