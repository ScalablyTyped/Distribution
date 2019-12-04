package typings.dojo.dojox.atom.io.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/atom/io/model.Node.html
  *
  *
  * @param name_space
  * @param name
  * @param attributes
  * @param content
  * @param shortNs
  */
@JSGlobal("dojox.atom.io.model.Node")
@js.native
class Node protected () extends js.Object {
  def this(name_space: js.Any, name: js.Any, attributes: js.Any, content: js.Any, shortNs: js.Any) = this()
  /**
    *
    * @param name
    * @param value
    */
  def addAttribute(name: js.Any, value: js.Any): Unit = js.native
  /**
    *
    * @param content
    */
  def addContent(content: js.Any): Unit = js.native
  /**
    *
    * @param node
    */
  def buildFromDom(node: js.Any): Unit = js.native
  /**
    *
    * @param name
    */
  def getAttribute(name: js.Any): js.Any = js.native
}

