package typings.dojo.dijit._editor.plugins

import typings.dojo.dijit._editor.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/NewPage.html
  *
  * This plugin provides a simple 'new page' capability.  In other
  * words, set content to some default user defined string.
  * 
  * @param args       OptionalInitial settings for any of the attributes.     
  */
@JSGlobal("dijit._editor.plugins.NewPage")
@js.native
class NewPage () extends Plugin {
  def this(args: js.Object) = this()
  /**
    * The default content to insert into the editor as the new page.
    * The default is the <br> tag, a single blank line.
    * 
    */
  var content: String = js.native
}

