package typings.dojo.dojox.atom.io.model

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/atom/io/model.util.html
  *
  *
  */
trait util extends js.Object {
  /**
    * Utility function to create a date from a DOM node's text content.
    *
    * @param node The DOM node to inspect.
    */
  def createDate(node: HTMLElement): js.Any
  /**
    * Utility function to escape XML special characters in an HTML string.
    *
    * @param str The string to escape
    */
  def escapeHtml(str: String): js.Any
  /**
    * Utility function to get a node name and deal with IE's bad handling of namespaces
    * on tag names.
    *
    * @param node The DOM node whose name to retrieve.
    */
  def getNodename(node: HTMLElement): String
  /**
    * Utility function to un-escape XML special characters in an HTML string.
    *
    * @param str The string to un-escape.
    */
  def unEscapeHtml(str: String): js.Any
}

object util {
  @scala.inline
  def apply(
    createDate: HTMLElement => js.Any,
    escapeHtml: String => js.Any,
    getNodename: HTMLElement => String,
    unEscapeHtml: String => js.Any
  ): util = {
    val __obj = js.Dynamic.literal(createDate = js.Any.fromFunction1(createDate), escapeHtml = js.Any.fromFunction1(escapeHtml), getNodename = js.Any.fromFunction1(getNodename), unEscapeHtml = js.Any.fromFunction1(unEscapeHtml))
    __obj.asInstanceOf[util]
  }
}

