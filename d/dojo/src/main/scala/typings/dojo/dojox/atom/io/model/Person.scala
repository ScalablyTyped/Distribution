package typings.dojo.dojox.atom.io.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/atom/io/model.Person.html
  *
  * Class container for 'person' types, such as Author, contributors, and so on.
  *
  * @param personType
  * @param name
  * @param email
  * @param uri
  */
@JSGlobal("dojox.atom.io.model.Person")
@js.native
class Person protected () extends js.Object {
  def this(personType: js.Any, name: js.Any, email: js.Any, uri: js.Any) = this()
  /**
    *
    * @param tag
    */
  def accept(tag: js.Any): js.Any = js.native
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
    * Function to do construction of the person data from the DOM node containing it.
    *
    * @param node The DOM node to process for person data.
    */
  def buildFromDom(node: js.Any): Unit = js.native
  /**
    *
    * @param name
    */
  def getAttribute(name: js.Any): js.Any = js.native
}

