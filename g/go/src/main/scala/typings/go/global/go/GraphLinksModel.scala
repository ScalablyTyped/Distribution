package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GraphLinksModels support links between nodes and grouping nodes and links into subgraphs.
  * GraphLinksModels hold node data and link data in separate arrays.
  * Node data is normally represented in a Diagram by instances of Node,
  * but they could be represented by simple Parts or by Groups.
  * Link data should be represented by instances of Link.
  */
@JSGlobal("go.GraphLinksModel")
@js.native
/**
  * This constructs an empty GraphLinksModel unless one provides arguments as the initial data array values for the Model.nodeDataArray and GraphLinksModel.linkDataArray properties.
  * @param {Array<Object>=} nodedataarray an optional Array containing JavaScript objects to be represented by Nodes.
  * @param {Array<Object>=} linkdataarray an optional Array containing JavaScript objects to be represented by Links.
  */
open class GraphLinksModel ()
  extends typings.go.mod.GraphLinksModel {
  def this(nodedataarray: js.Array[js.Object]) = this()
  def this(nodedataarray: js.Array[js.Object], linkdataarray: js.Array[js.Object]) = this()
  def this(nodedataarray: Unit, linkdataarray: js.Array[js.Object]) = this()
}
