package typings.dojo.dojox.mobile.dh

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/dh/HtmlContentHandler.html
  *
  * A HTML content handler.
  * This module is a content handler that creates a view from HTML
  * data. If widgets used in the HTML data are not available, they
  * are loaded automatically before instantiation.
  *
  */
@JSGlobal("dojox.mobile.dh.HtmlContentHandler")
@js.native
class HtmlContentHandler () extends js.Object {
  /**
    * Parses the given data and creates a new view at the given position.
    *
    * @param content Content data for a new view.
    * @param target A DOM node under which a new view is created.
    * @param refNode               OptionalAn optional reference DOM node before which a new view is created.
    */
  def parse(content: String, target: HTMLElement, refNode: HTMLElement): js.Any = js.native
}

