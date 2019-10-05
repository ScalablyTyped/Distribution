package typings.dojo

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.dojo.dijit._editor.plugins.LinkDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dijit/_editor/plugins/LinkDialog", JSImport.Namespace)
@js.native
object dijitUnderscoreEditorPluginsLinkDialogMod
  extends TopLevel[
      TypeofLinkDialog with (Instantiable1[js.UndefOr[/* args */ js.Object], LinkDialog])
    ] {
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
  class ImgLinkDialog ()
    extends typings.dojo.dijit._editor.plugins.LinkDialog.ImgLinkDialog {
    def this(args: js.Object) = this()
  }
  
}

