package typings.dojo.dojox.mobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/TreeView.html
  *
  * A scrollable view with tree-style navigation.
  * This widget can be connected to a dojox/data/FileStore as a
  * quick directory browser. You may use it when implementing the
  * Master-Detail pattern.
  *
  */
@JSGlobal("dojox.mobile.TreeView")
@js.native
class TreeView () extends ScrollableView {
  /**
    * Called when the user clicks a tree item.
    *
    * @param li The item that the user clicked.
    */
  def handleClick(li: ListItem): Unit = js.native
}

