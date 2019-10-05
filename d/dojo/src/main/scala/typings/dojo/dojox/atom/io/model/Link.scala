package typings.dojo.dojox.atom.io.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/atom/io/model.Link.html
  *
  * Class container for 'link' types.
  *
  * @param href
  * @param rel
  * @param hrefLang
  * @param title
  * @param type
  */
@JSGlobal("dojox.atom.io.model.Link")
@js.native
class Link protected () extends js.Object {
  def this(href: js.Any, rel: js.Any, hrefLang: js.Any, title: js.Any, `type`: js.Any) = this()
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
    * Function to do construction of the link data from the DOM node containing it.
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

