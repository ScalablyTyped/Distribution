package typings.domhandler.mod

import typings.domhandler.domhandlerStrings.comment
import typings.domhandler.domhandlerStrings.directive
import typings.domhandler.domhandlerStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domhandler/lib", "DataNode")
@js.native
class DataNode protected ()
  extends typings.domhandler.nodeMod.DataNode {
  /**
    *
    * @param type The type of the node
    * @param data The content of the data node
    */
  def this(`type`: comment, data: String) = this()
  def this(`type`: directive, data: String) = this()
  def this(`type`: text, data: String) = this()
}

