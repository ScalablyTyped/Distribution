package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The RelinkingTool allows the user to reconnect an existing Link
  * if the Link.relinkableTo and/or Link.relinkableFrom properties are true.
  */
@JSImport("go", "RelinkingTool")
@js.native
/**
  * You do not normally need to create an instance of this tool because one already exists as the ToolManager.relinkingTool, which you can modify.
  */
class RelinkingTool () extends LinkingBaseTool {
  
  /**
    * Make a temporary link look and act like the real Link being relinked.
    * @param {Link} reallink
    * @param {Link} templink
    */
  def copyLinkProperties(reallink: Link, templink: Link): Unit = js.native
  
  /**Gets or sets a small GraphObject that is copied as a relinking handle for the selected link path at the "from" end of the link.*/
  var fromHandleArchetype: GraphObject = js.native
  
  /**This read-only property returns the GraphObject that is the tool handle being dragged by the user.*/
  var handle: GraphObject = js.native
  
  /**
    * Modify an existing Link to connect to a new node and port.
    * @param {Link} existinglink
    * @param {Node} newnode the Node to connect to or from.
    * @param {GraphObject} newport the GraphObject port to connect to or from.
    * @param {boolean} toend If true, this modifies the link's "to" node and port; otherwise it modifies the "from" node and port.
    */
  def reconnectLink(existinglink: Link, newnode: Node, newport: GraphObject, toend: Boolean): Boolean = js.native
  
  /**Gets or sets a small GraphObject that is copied as a relinking handle for the selected link path at the "to" end of the link.*/
  var toHandleArchetype: GraphObject = js.native
}
