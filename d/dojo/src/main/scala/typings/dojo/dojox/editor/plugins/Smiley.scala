package typings.dojo.dojox.editor.plugins

import typings.dojo.dijit._editor.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/Smiley.html
  *
  * This plugin allows the user to select from emoticons or "smileys"
  * to insert at the current cursor position.
  * The commands provided by this plugin are:
  *
  * smiley - inserts the selected emoticon
  *
  * @param args       OptionalInitial settings for any of the attributes.
  */
@JSGlobal("dojox.editor.plugins.Smiley")
@js.native
class Smiley () extends Plugin {
  def this(args: js.Object) = this()
  /**
    *
    */
  var emoticonImageClass: String = js.native
  /**
    * a marker for emoticon wrap like [:-)] for regexp convienent
    * when a message which contains an emoticon stored in a database or view source, this marker include also
    * but when user enter an emoticon by key board, user don't need to enter this marker.
    * also emoticon definition character set can not contains this marker
    *
    */
  var emoticonMarker: String = js.native
}

