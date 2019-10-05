package typings.dojo.dojox.atom.io.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/atom/io/model.Generator.html
  *
  * Class container for 'Generator' types.
  *
  * @param uri
  * @param version
  * @param value
  */
@JSGlobal("dojox.atom.io.model.Generator")
@js.native
class Generator protected () extends js.Object {
  def this(uri: String, version: String, value: String) = this()
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
    * Function to do construction of the generator data from the DOM node containing it.
    *
    * @param node The DOM node to process for link data.
    */
  def buildFromDom(node: js.Any): Unit = js.native
  /**
    *
    * @param name
    */
  def getAttribute(name: js.Any): js.Any = js.native
}

