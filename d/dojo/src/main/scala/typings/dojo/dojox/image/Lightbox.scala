package typings.dojo.dojox.image

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/image/Lightbox.html
  *
  * A dojo-based Lightbox implementation.
  * An Elegant, keyboard accessible, markup and store capable Lightbox widget to show images
  * in a modal dialog-esque format. Can show individual images as Modal dialog, or can group
  * images with multiple entry points, all using a single "master" Dialog for visualization
  *
  * key controls:
  *
  * ESC - close
  * Down Arrow / Rt Arrow / N - Next Image
  * Up Arrow / Lf Arrow / P - Previous Image
  *
  */
@JSGlobal("dojox.image.Lightbox")
@js.native
class Lightbox () extends js.Object {
  /**
    * Generic time in MS to adjust the feel of widget. could possibly add various
    * durations for the various actions (dialog fadein, sizeing, img fadein ...)
    *
    */
  var duration: Double = js.native
  /**
    * Grouping images in a page with similar tags will provide a 'slideshow' like grouping of images
    *
    */
  var group: String = js.native
  /**
    *
    */
  var href: String = js.native
  /**
    * If true, this Dialog instance will be truly modal and prevent closing until
    * explicitly told to by calling hide() or clicking the (x) - Defaults to false
    * to preserve previous behaviors. (aka: enable click-to-close on the underlay)
    *
    */
  var modal: Boolean = js.native
  /**
    * A string of text to be shown in the Lightbox beneath the image (empty if using a store)
    *
    */
  var title: String = js.native
  /**
    *
    */
  def LightboxDialog(): Unit = js.native
  /**
    *
    */
  def destroy(): Unit = js.native
  /**
    * Disables event clobbering and dialog, and follows natural link
    *
    */
  def disable(): Unit = js.native
  /**
    * Enables the dialog (prevents default link)
    *
    */
  def enable(): Unit = js.native
  /**
    * Hide the Lightbox currently showing
    *
    */
  def hide(): Unit = js.native
  /**
    * Stub fired when the image in the lightbox is clicked.
    *
    */
  def onClick(): Unit = js.native
  /**
    * Show the Lightbox with this instance as the starting point
    *
    */
  def show(): Unit = js.native
  /**
    *
    */
  def startup(): Unit = js.native
}

@JSGlobal("dojox.image.Lightbox")
@js.native
object Lightbox extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/image/Lightbox.LightboxDialog.html
    *
    * The "dialog" shared  between any Lightbox instances on the page, publically available
    * for programmatic manipulation.
    * A widget that intercepts anchor links (typically around images)
    * and displays a modal Dialog. this is the actual Dialog, which you can
    * create and populate manually, though should use simple Lightbox's
    * unless you need the direct access.
    *
    * There should only be one of these on a page, so all dojox.image.Lightbox's will us it
    * (the first instance of a Lightbox to be show()'n will create me If i do not exist)
    *
    * @param args
    */
  @js.native
  class LightboxDialog protected () extends js.Object {
    def this(args: js.Any) = this()
    /**
      * If true, ensure the image always stays within the viewport
      * more difficult than necessary to disable, but enabled by default
      * seems sane in most use cases.
      *
      */
    var adjust: Boolean = js.native
    /**
      * Path to the image used when a 404 is encountered
      *
      */
    var errorImg: js.Object = js.native
    /**
      * The text to display when an unreachable image is linked
      *
      */
    var errorMessage: String = js.native
    /**
      * The classname to apply to the image node in the dialog (for extra styling)
      *
      */
    var imageClass: String = js.native
    /**
      * The src="" attribute of our imageNode (can be null at statup)
      *
      */
    var imgUrl: String = js.native
    /**
      * Array of objects. this is populated by from the JSON object _groups, and
      * should not be populate manually. it is a placeholder for the currently
      * showing group of images in this master dialog
      *
      */
    var inGroup: js.Array[_] = js.native
    /**
      * If true, this Dialog instance will be truly modal and prevent closing until
      * explicitly told to by calling hide() or clicking the (x) - Defaults to false
      * to preserve previous behaviors. (aka: enable click-to-close on the underlay)
      *
      */
    var modal: Boolean = js.native
    /**
      *
      */
    var templateString: String = js.native
    /**
      * The current title, read from object passed to show()
      *
      */
    var title: String = js.native
    /**
      * Add an image to this Master Lightbox
      *
      * @param child The image information to add.href: String - link to image (required)title: String - title to display
      * @param group               Optionalattach to group of similar tag or null for individual image instance
      */
    def addImage(child: js.Object, group: String): Unit = js.native
    /**
      * Hide the Master Lightbox
      *
      */
    def hide(): Unit = js.native
    /**
      * a stub function, called with the currently displayed image as the only argument
      *
      * @param groupData
      */
    def onClick(groupData: js.Any): Unit = js.native
    /**
      * Remove all images in a passed group
      *
      * @param group
      */
    def removeGroup(group: js.Any): Unit = js.native
    /**
      * Remove an image instance from this LightboxDialog.
      *
      * @param child A reference to the Lightbox child that was added (or an object literal)only the .href member is compared for uniqueness. The object may containa .group member as well.
      */
    def removeImage(child: js.Object): Unit = js.native
    /**
      * Resize our dialog container, and fire _showImage
      *
      * @param size
      * @param forceTitle
      */
    def resizeTo(size: js.Object, forceTitle: js.Any): Unit = js.native
    /**
      * Show the Master Dialog. Starts the chain of events to show
      * an image in the dialog, including showing the dialog if it is
      * not already visible
      *
      * @param groupData needs href and title attributes. the values for this image.
      */
    def show(groupData: js.Object): Unit = js.native
    /**
      * Add some extra event handlers, and startup our superclass.
      *
      */
    def startup(): js.Any = js.native
  }
  
}

