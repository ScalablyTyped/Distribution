package typings.dojo.dojox.atom.io.model

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/atom/io/model.Content.html
  *
  * Class container for 'Content' types. Such as summary, content, username, and so on types of data.
  *
  * @param tagName
  * @param value
  * @param src
  * @param type
  * @param xmlLang
  */
@JSGlobal("dojox.atom.io.model.Content")
@js.native
class Content protected () extends js.Object {
  def this(tagName: js.Any, value: js.Any, src: js.Any, `type`: js.Any, xmlLang: js.Any) = this()
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
    * Function to do construction of the Content data from the DOM node containing it.
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

