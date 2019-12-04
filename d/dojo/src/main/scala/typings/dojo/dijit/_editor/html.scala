package typings.dojo.dijit._editor

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/html.html
  *
  * HTML serialization utility functions used by editor
  * 
  */
trait html extends js.Object {
  /**
    * Adds escape sequences for special characters in XML: &<>"'.
    * Optionally skips escapes for single quotes.
    * 
    * @param str             
    * @param noSingleQuotes               Optional            
    */
  def escapeXml(str: String, noSingleQuotes: Boolean): js.Any
  /**
    * Returns the html content of a DomNode's children
    * 
    * @param node             
    */
  def getChildrenHtml(node: HTMLElement): js.Any
  /**
    * Pushes the html content of a DomNode's children into out[]
    * 
    * @param dom             
    * @param output an array of arrays of points             
    */
  def getChildrenHtmlHelper(dom: HTMLElement, output: js.Array[String]): Unit
  /**
    * Return string representing HTML for node and it's children
    * 
    * @param node             
    */
  def getNodeHtml(node: HTMLElement): js.Any
  /**
    * Pushes array of strings into output[] which represent HTML for node and it's children
    * 
    * @param node             
    * @param output             
    */
  def getNodeHtmlHelper(node: HTMLElement, output: js.Array[String]): String
}

object html {
  @scala.inline
  def apply(
    escapeXml: (String, Boolean) => js.Any,
    getChildrenHtml: HTMLElement => js.Any,
    getChildrenHtmlHelper: (HTMLElement, js.Array[String]) => Unit,
    getNodeHtml: HTMLElement => js.Any,
    getNodeHtmlHelper: (HTMLElement, js.Array[String]) => String
  ): html = {
    val __obj = js.Dynamic.literal(escapeXml = js.Any.fromFunction2(escapeXml), getChildrenHtml = js.Any.fromFunction1(getChildrenHtml), getChildrenHtmlHelper = js.Any.fromFunction2(getChildrenHtmlHelper), getNodeHtml = js.Any.fromFunction1(getNodeHtml), getNodeHtmlHelper = js.Any.fromFunction2(getNodeHtmlHelper))
  
    __obj.asInstanceOf[html]
  }
}

