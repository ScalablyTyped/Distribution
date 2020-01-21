package typings.dojo.dojox.editor.plugins

import typings.dojo.dijit._editor.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/LocalImage.html
  *
  * This plugin provides an enhanced image link dialog that
  * not only insert the online images, but upload the local image files onto
  * to server then insert them as well.
  *
  * Dependencies:
  * This plugin depends on dojox.form.FileUploader to upload the images on the local driver.
  * Do the regression test whenever FileUploader is upgraded.
  *
  * @param args       OptionalInitial settings for any of the attributes.
  */
@JSGlobal("dojox.editor.plugins.LocalImage")
@js.native
class LocalImage () extends Plugin {
  def this(args: js.Object) = this()
  /**
    * The prefix of the image url on the server.
    * For example, an image is uploaded and stored at
    * http://www.myhost.com/images/uploads/test.jpg.
    * When the image is uploaded, the server returns "uploads/test.jpg" as the
    * relative path. So the baseImageUrl should be set to "http://www.myhost.com/images/"
    * so that the client can retrieve the image from the server.
    * If the image file is located on the same domain as that of the current web page,
    * baseImageUrl can be a relative path. For example:
    *
    * baseImageUrl = images/
    * and the server returns uploads/test.jpg
    *
    * The complete URL of the image file is images/upload/test.jpg
    *
    */
  var baseImageUrl: String = js.native
  /**
    * Used for validating input as correct email address.  Taken from dojox.validate
    *
    */
  var emailRegExp: String = js.native
  /**
    * Specify the types of images that are allowed to be uploaded.
    * Note that the type checking on server is also very important!
    *
    */
  var fileMask: String = js.native
  /**
    *
    */
  var htmlFieldName: String = js.native
  /**
    * String used for templating the <img> HTML to insert at the desired point.
    *
    */
  var htmlTemplate: String = js.native
  /**
    * Over-ride for template since this is an enhanced image dialog.
    *
    */
  var linkDialogTemplate: String = js.native
  /**
    * Tag used for the link type (img).
    *
    */
  var tag: String = js.native
  /**
    * The url targeted for uploading. Both absolute and relative URLs are OK.
    *
    */
  var uploadUrl: String = js.native
  /**
    * Indicate whether the user can upload a local image file onto the server.
    * If it is set to true, the Browse button will be available.
    *
    */
  var uploadable: Boolean = js.native
  /**
    * Used to validate if the input is a valid image URL.
    *
    */
  var urlRegExp: String = js.native
}

