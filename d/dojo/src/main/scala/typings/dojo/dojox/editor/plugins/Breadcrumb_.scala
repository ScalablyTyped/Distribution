package typings.dojo.dojox.editor.plugins

import typings.dojo.dijit._editor.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/Breadcrumb.html
  *
  * This plugin provides Breadcrumb capability to the editor. As you move
  * around the editor, it updates with your current indention depth.
  *
  * @param args       OptionalInitial settings for any of the attributes.
  */
@JSGlobal("dojox.editor.plugins.Breadcrumb")
@js.native
class Breadcrumb_ () extends Plugin {
  def this(args: js.Object) = this()
  /**
    * The toolbar containing the breadcrumb.
    *
    */
  var breadcrumbBar: js.Object = js.native
}

