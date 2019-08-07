package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings to define a hyperlink.
  */
@JSGlobal("HyperlinkSettings")
@js.native
/**
  * Initializes a new instance of the HyperlinkSettings object.
  * @param url A hyperlink URL.
  * @param bookmark A bookmark name.
  * @param tooltip A tooltip text.
  * @param text A hyperlink text.
  */
class HyperlinkSettings () extends js.Object {
  def this(url: String) = this()
  def this(url: String, bookmark: String) = this()
  def this(url: String, bookmark: String, tooltip: String) = this()
  def this(url: String, bookmark: String, tooltip: String, text: String) = this()
  /**
    * Specifies a hyperlink's bookmark.
    */
  var bookmark: String = js.native
  /**
    * Specifies a hyperlink text.
    */
  var text: String = js.native
  /**
    * Specifies a tooltip text.
    */
  var tooltip: String = js.native
  /**
    * Specifies a hyperlink's destination.
    */
  var url: String = js.native
}

