package typings.dojo.dojox.mobile.dh

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/dh/JsonContentHandler.html
  *
  * A JSON content handler.
  * This module is a content handler that creates a view from JSON
  * data. If widgets used in the JSON data are not available, they
  * are loaded automatically before instantiation.
  *
  * There are two formats as shown in the examples below. You can
  * choose either of them. The v1.7 format can be more compact, but
  * if you want multiple widgets at the same level, they must be in
  * an array. So, you can have, for example, two consecutive
  * RoundRectLists, but you cannot have, for example,
  * RoundRectCategory, RoundRectList, RoundRectCategory, and
  * RoundRectList, because they are keys in one JS object, which
  * causes conflict. The v1.8 format has no such limitation.
  *
  */
@JSGlobal("dojox.mobile.dh.JsonContentHandler")
@js.native
class JsonContentHandler () extends js.Object {
  /**
    * Parses the given data and creates a new view at the given position.
    *
    * @param content Content data for a new view.
    * @param target A DOM node under which a new view is created.
    * @param refNode               OptionalAn optional reference DOM node before which a new view is created.
    */
  def parse(content: js.Object, target: HTMLElement, refNode: HTMLElement): js.Any = js.native
}

