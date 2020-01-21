package typings.dojo.dijit._editor.plugins

import typings.dojo.dijit._editor.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/LinkDialog.html
  *
  * This plugin provides the basis for an 'anchor' (link) dialog and an extension of it
  * provides the image link dialog.
  * The command provided by this plugin is:
  * 
  * createLink
  * 
  * @param args       OptionalInitial settings for any of the attributes.     
  */
@JSGlobal("dijit._editor.plugins.LinkDialog")
@js.native
class LinkDialog () extends Plugin {
  def this(args: js.Object) = this()
  /**
    * Used for validating input as correct email address.  Taken from dojox.validate
    * 
    */
  var emailRegExp: String = js.native
  /**
    * String used for templating the HTML to insert at the desired point.
    * 
    */
  var htmlTemplate: String = js.native
  /**
    * Template for contents of TooltipDialog to pick URL
    * 
    */
  var linkDialogTemplate: String = js.native
  /**
    * Tag used for the link type.
    * 
    */
  var tag: String = js.native
  /**
    * Used for validating input as correct URL.  While file:// urls are not terribly
    * useful, they are technically valid.
    * 
    */
  var urlRegExp: String = js.native
  /**
    * 
    */
  def ImgLinkDialog(): Unit = js.native
}

@JSGlobal("dijit._editor.plugins.LinkDialog")
@js.native
object LinkDialog extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/LinkDialog.ImgLinkDialog.html
    *
    * This plugin extends LinkDialog and adds in a plugin for handling image links.
    * provides the image link dialog.
    * The command provided by this plugin is:
    * 
    * insertImage
    * 
    * @param args       OptionalInitial settings for any of the attributes.     
    */
  @js.native
  class ImgLinkDialog () extends Plugin {
    def this(args: js.Object) = this()
    /**
      * Used for validating input as correct email address.  Taken from dojox.validate
      * 
      */
    var emailRegExp: String = js.native
    /**
      * String used for templating the <img> HTML to insert at the desired point.
      * 
      */
    var htmlTemplate: String = js.native
    /**
      * Over-ride for template since img dialog doesn't need target that anchor tags may.
      * 
      */
    var linkDialogTemplate: String = js.native
    /**
      * Tag used for the link type (img).
      * 
      */
    var tag: String = js.native
    /**
      * Used for validating input as correct URL.  While file:// urls are not terribly
      * useful, they are technically valid.
      * 
      */
    var urlRegExp: String = js.native
  }
  
}

