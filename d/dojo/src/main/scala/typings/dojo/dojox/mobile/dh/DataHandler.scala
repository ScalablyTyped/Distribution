package typings.dojo.dojox.mobile.dh

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/dh/DataHandler.html
  *
  * A component that provides an interface between data and handlers.
  * This module fetches data through DataSource and calls a
  * ContentHandler to parse the content data and create a new view.
  *
  * @param ds
  * @param target
  * @param refNode       Optional
  */
@JSGlobal("dojox.mobile.dh.DataHandler")
@js.native
class DataHandler protected () extends js.Object {
  def this(ds: js.Object, target: HTMLElement) = this()
  def this(ds: js.Object, target: HTMLElement, refNode: HTMLElement) = this()
  /**
    * A DataSource instance.
    *
    */
  var ds: js.Object = js.native
  /**
    * An optional reference DOM node before which a new view is created.
    *
    */
  var refNode: HTMLElement = js.native
  /**
    * A DOM node under which a new view is created.
    *
    */
  var target: HTMLElement = js.native
  /**
    * Fetches data through DataSource and passes it to a content
    * handler.
    *
    * @param contentType The type of the content. (ex. "html")It is used to determine what content handler to use.
    * @param callback A function to be called after creating a new view.
    */
  def processData(contentType: String, callback: js.Function): Unit = js.native
}

