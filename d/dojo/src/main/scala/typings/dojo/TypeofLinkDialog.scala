package typings.dojo

import org.scalablytyped.runtime.Instantiable1
import typings.dojo.dijit._editor.plugins.LinkDialog.ImgLinkDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofLinkDialog extends js.Object {
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
  var ImgLinkDialog: Instantiable1[
    js.UndefOr[/* args */ js.Object], 
    typings.dojo.dijit._editor.plugins.LinkDialog.ImgLinkDialog
  ]
}

object TypeofLinkDialog {
  @scala.inline
  def apply(ImgLinkDialog: Instantiable1[js.UndefOr[/* args */ js.Object], ImgLinkDialog]): TypeofLinkDialog = {
    val __obj = js.Dynamic.literal(ImgLinkDialog = ImgLinkDialog.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofLinkDialog]
  }
}

