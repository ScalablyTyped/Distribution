package typings.dojo.dojox.data

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/dom.html
  *
  *
  */
@js.native
trait dom extends js.Object {
  /**
    * cross-browser implementation of creating an XML document object.
    *
    * @param str               OptionalOptional text to create the document from.  If not provided, an empty XML document will be created.If str is empty string "", then a new empty document will be created.
    * @param mimetype               OptionalOptional mimetype of the text.  Typically, this is text/xml.  Will be defaulted to text/xml if not provided.
    */
  def createDocument(str: String, mimetype: String): js.Any = js.native
  /**
    * Implementation of MS's innerXML function.
    *
    * @param node The node from which to generate the XML text representation.
    */
  def innerXML(node: HTMLElement): Unit = js.native
  /**
    * removes all children from node and returns the count of children removed.
    * The children nodes are not destroyed. Be sure to call dojo._destroyElement on them
    * after they are not used anymore.
    *
    * @param node The node to remove all the children from.
    */
  def removeChildren(node: HTMLElement): Unit = js.native
  /**
    * Removes all children of node and appends newChild. All the existing
    * children will be destroyed.
    * Removes all children of node and appends newChild. All the existing
    * children will be destroyed.
    *
    * @param node The node to modify the children on
    * @param newChildren The children to add to the node.  It can either be a single Node or anarray of Nodes.
    */
  def replaceChildren(node: HTMLElement, newChildren: js.Array[_]): Unit = js.native
  /**
    * Removes all children of node and appends newChild. All the existing
    * children will be destroyed.
    * Removes all children of node and appends newChild. All the existing
    * children will be destroyed.
    *
    * @param node The node to modify the children on
    * @param newChildren The children to add to the node.  It can either be a single Node or anarray of Nodes.
    */
  def replaceChildren(node: HTMLElement, newChildren: HTMLElement): Unit = js.native
  /**
    * Implementation of the DOM Level 3 attribute; scan node for text
    * Implementation of the DOM Level 3 attribute; scan node for text
    * This function can also update the text of a node by replacing all child
    * content of the node.
    *
    * @param node The node to get the text off of or set the text on.
    * @param text               OptionalOptional argument of the text to apply to the node.
    */
  def textContent(node: HTMLElement, text: String): Unit = js.native
}

