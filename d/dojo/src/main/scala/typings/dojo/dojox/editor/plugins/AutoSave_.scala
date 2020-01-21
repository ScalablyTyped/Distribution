package typings.dojo.dojox.editor.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/AutoSave.html
  *
  * This plugin provides the auto save capability to the editor. The
  * plugin saves the content of the editor in interval. When
  * the save action is performed, the document in the editor frame
  * will be posted to the URL provided, or none, if none provided.
  *
  * @param args       OptionalInitial settings for any of the attributes.
  */
@JSGlobal("dojox.editor.plugins.AutoSave")
@js.native
class AutoSave_ () extends Save {
  def this(args: js.Object) = this()
  /**
    * The interval to perform the save action.
    *
    */
  var interval: Double = js.native
}

