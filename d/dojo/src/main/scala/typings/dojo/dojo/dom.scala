package typings.dojo.dojo

import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dom.html
  *
  * This module defines the core dojo DOM API.
  *
  */
@js.native
trait dom extends js.Object {
  /**
    * Returns DOM node with matching id attribute or falsy value (ex: null or undefined)
    * if not found.  If id is a DomNode, this function is a no-op.
    *
    * @param id A string to match an HTML id attribute or a reference to a DOM Node
    * @param doc               OptionalDocument to work in. Defaults to the current value ofdojo/_base/window.doc.  Can be used to retrievenode references from other documents.
    */
  def byId(id: String): js.Any = js.native
  def byId(id: String, doc: HTMLDocument): js.Any = js.native
  /**
    * Returns DOM node with matching id attribute or falsy value (ex: null or undefined)
    * if not found.  If id is a DomNode, this function is a no-op.
    *
    * @param id A string to match an HTML id attribute or a reference to a DOM Node
    * @param doc               OptionalDocument to work in. Defaults to the current value ofdojo/_base/window.doc.  Can be used to retrievenode references from other documents.
    */
  def byId(id: HTMLElement): js.Any = js.native
  def byId(id: HTMLElement, doc: HTMLDocument): js.Any = js.native
  /**
    * Returns true if node is a descendant of ancestor
    *
    * @param node string id or node reference to test
    * @param ancestor string id or node reference of potential parent to test against
    */
  def isDescendant(node: String, ancestor: String): Boolean = js.native
  /**
    * Returns true if node is a descendant of ancestor
    *
    * @param node string id or node reference to test
    * @param ancestor string id or node reference of potential parent to test against
    */
  def isDescendant(node: String, ancestor: HTMLElement): Boolean = js.native
  /**
    * Returns true if node is a descendant of ancestor
    *
    * @param node string id or node reference to test
    * @param ancestor string id or node reference of potential parent to test against
    */
  def isDescendant(node: HTMLElement, ancestor: String): Boolean = js.native
  /**
    * Returns true if node is a descendant of ancestor
    *
    * @param node string id or node reference to test
    * @param ancestor string id or node reference of potential parent to test against
    */
  def isDescendant(node: HTMLElement, ancestor: HTMLElement): Boolean = js.native
  /**
    *
    * @param node
    * @param selectable
    */
  def setSelectable(node: js.Any, selectable: js.Any): Unit = js.native
}

