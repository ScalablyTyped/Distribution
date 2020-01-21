package typings.dojo.dojo.dnd.Container

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/Container.__ContainerArgs.html
  *
  *
  */
@JSGlobal("dojo.dnd.Container.__ContainerArgs")
@js.native
class ContainerArgs () extends js.Object {
  /**
    * node or node's id to use as the parent node for dropped items
    * (must be underneath the 'node' parameter in the DOM)
    *
    */
  var dropParent: HTMLElement = js.native
  /**
    * don't start the drag operation, if clicked on form elements
    *
    */
  var skipForm: Boolean = js.native
  /**
    * a creator function, which takes a data item, and returns an object like that:
    * {node: newNode, data: usedData, type: arrayOfStrings}
    *
    */
  def creator(): Unit = js.native
}

