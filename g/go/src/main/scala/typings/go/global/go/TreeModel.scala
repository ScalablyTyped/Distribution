package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TreeModels support tree-structured graphs of nodes and links.
  * Each node can have at most one "tree parent"; cycles are not permitted.
  * The reference to the parent node's key is a property of the child node data.
  */
@JSGlobal("go.TreeModel")
@js.native
/**
  * This constructs an empty TreeModel unless one provides arguments as the initial data array values for the Model.nodeDataArray property.
  * @param {Array<Object>=} nodedataarray an optional Array containing JavaScript objects to be represented by Nodes.
  */
class TreeModel ()
  extends typings.go.mod.TreeModel {
  def this(nodedataarray: js.Array[js.Object]) = this()
}
