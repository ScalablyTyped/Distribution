package typings.dojo.dojox.atom.io.model

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/atom/io/model.Category.html
  *
  * Class container for 'Category' types.
  *
  * @param scheme
  * @param term
  * @param label
  */
@JSGlobal("dojox.atom.io.model.Category")
@js.native
class Category protected () extends js.Object {
  def this(scheme: String, term: String, label: String) = this()
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
    * Function to do construction of the Category data from the DOM node containing it.
    *
    * @param node The DOM node to process for content.
    */
  def buildFromDom(node: HTMLElement): Unit = js.native
  /**
    *
    * @param name
    */
  def getAttribute(name: js.Any): js.Any = js.native
}

