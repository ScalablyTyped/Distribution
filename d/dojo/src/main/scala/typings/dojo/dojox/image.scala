package typings.dojo.dojox

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit._Widget
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.cellMargin
import typings.dojo.dojoStrings.cellSize
import typings.dojo.dojoStrings.children
import typings.dojo.dojoStrings.cols
import typings.dojo.dojoStrings.delay
import typings.dojo.dojoStrings.easing
import typings.dojo.dojoStrings.glassSize
import typings.dojo.dojoStrings.rows
import typings.dojo.dojoStrings.scale
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.dojo.dojoStrings.threads
import typings.dojo.dojox.image.MagnifierLite
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/image.html
  *
  * Deprecated.  Should require dojox/image modules directly rather than trying to access them through
  * this module.
  *
  */
trait image extends js.Object

@JSGlobal("dojox.image")
@js.native
object image extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/image/Badge.html
    *
    * A simple grid of Images that loops through thumbnails
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
  - typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @js.native
  class Badge () extends _Widget {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      * Object to which attach points and events will be scoped.  Defaults
      * to 'this'.
      *
      */
    var attachScope: js.Object = js.native
    /**
      * Size in PX to adjust for cell margins
      *
      */
    var cellMargin: Double = js.native
    /**
      * Size in PX of each thumbnail
      *
      */
    var cellSize: Double = js.native
    /**
      * A CSS3 Selector that determines the node to become a child
      *
      */
    var children: String = js.native
    /**
      * Number of Columns to display
      *
      */
    var cols: Double = js.native
    /**
      * Time (in ms) to show the image before sizing down again
      *
      */
    var delay: Double = js.native
    /**
      * An easing function to use when showing the node (does not apply to shrinking)
      *
      */
    var easing: js.Function = js.native
    /**
      * Number of Rows to display
      *
      */
    var rows: Double = js.native
    /**
      *
      */
    var searchContainerNode: Boolean = js.native
    /**
      * HTML style attributes as cssText string or name/value hash
      *
      */
    @JSName("style")
    var style_Badge: String = js.native
    /**
      * Path to template (HTML file) for this widget relative to dojo.baseUrl.
      * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
      *
      */
    var templatePath: String = js.native
    /**
      *
      */
    var templateString: String = js.native
    /**
      * how many cycles will be going "simultaneously" (>2 not reccommended)
      *
      */
    var threads: Double = js.native
    /**
      * Static method to get a template based on the templatePath or
      * templateString key
      */
    def getCachedTemplate(): js.Any = js.native
    /**
      * Static method to get a template based on the templatePath or
      * templateString key
      * 
      * @param templateString The template             
      * @param alwaysUseString Don't cache the DOM tree for this template, even if it doesn't have any variables             
      * @param doc               OptionalThe target document.   Defaults to document global if unspecified.             
      */
    def getCachedTemplate(templateString: String, alwaysUseString: Boolean): js.Any = js.native
    def getCachedTemplate(templateString: String, alwaysUseString: Boolean, doc: HTMLDocument): js.Any = js.native
    @JSName("get")
    def get_attachScope(property: attachScope): js.Object = js.native
    @JSName("get")
    def get_cellMargin(property: cellMargin): Double = js.native
    @JSName("get")
    def get_cellSize(property: cellSize): Double = js.native
    @JSName("get")
    def get_children(property: children): String = js.native
    @JSName("get")
    def get_cols(property: cols): Double = js.native
    @JSName("get")
    def get_delay(property: delay): Double = js.native
    @JSName("get")
    def get_easing(property: easing): js.Function = js.native
    @JSName("get")
    def get_rows(property: rows): Double = js.native
    @JSName("get")
    def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
    @JSName("get")
    def get_templatePath(property: templatePath): String = js.native
    @JSName("get")
    def get_templateString(property: templateString): String = js.native
    @JSName("get")
    def get_threads(property: threads): Double = js.native
    @JSName("set")
    def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
    @JSName("set")
    def set_cellMargin(property: cellMargin, value: Double): Unit = js.native
    @JSName("set")
    def set_cellSize(property: cellSize, value: Double): Unit = js.native
    @JSName("set")
    def set_children(property: children, value: String): Unit = js.native
    @JSName("set")
    def set_cols(property: cols, value: Double): Unit = js.native
    @JSName("set")
    def set_delay(property: delay, value: Double): Unit = js.native
    @JSName("set")
    def set_easing(property: easing, value: js.Function): Unit = js.native
    @JSName("set")
    def set_rows(property: rows, value: Double): Unit = js.native
    @JSName("set")
    def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("set")
    def set_templatePath(property: templatePath, value: String): Unit = js.native
    @JSName("set")
    def set_templateString(property: templateString, value: String): Unit = js.native
    @JSName("set")
    def set_threads(property: threads, value: Double): Unit = js.native
    @JSName("watch")
    def watch_attachScope(
      property: attachScope,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[js.Object], 
          /* newValue */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_cellMargin(
      property: cellMargin,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Double], 
          /* newValue */ js.UndefOr[Double], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_cellSize(
      property: cellSize,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Double], 
          /* newValue */ js.UndefOr[Double], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_children(
      property: children,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[String], 
          /* newValue */ js.UndefOr[String], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_cols(
      property: cols,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Double], 
          /* newValue */ js.UndefOr[Double], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_delay(
      property: delay,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Double], 
          /* newValue */ js.UndefOr[Double], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_easing(
      property: easing,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[js.Function], 
          /* newValue */ js.UndefOr[js.Function], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_rows(
      property: rows,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Double], 
          /* newValue */ js.UndefOr[Double], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_searchContainerNode(
      property: searchContainerNode,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Boolean], 
          /* newValue */ js.UndefOr[Boolean], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templatePath(
      property: templatePath,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[String], 
          /* newValue */ js.UndefOr[String], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templateString(
      property: templateString,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[String], 
          /* newValue */ js.UndefOr[String], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_threads(
      property: threads,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Double], 
          /* newValue */ js.UndefOr[Double], 
          Unit
        ]
    ): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/image/FlickrBadge.html
    *
    *
    */
  @js.native
  class FlickrBadge () extends js.Object {
    /**
      *
      */
    var apikey: String = js.native
    /**
      *
      */
    var children: String = js.native
    /**
      * Free text search.  Photos who's title, description, or tags contain the text will be displayed
      *
      */
    var searchText: String = js.native
    /**
      * The id of the set to display
      *
      */
    var setid: String = js.native
    /**
      * A comma separated list of tags or an array of tags to grab from Flickr
      *
      */
    var tags: String = js.native
    /**
      * Where to display the pictures when clicked on.  Valid values are the same as the target attribute
      * of the A tag.
      *
      */
    var target: String = js.native
    /**
      * If you know your Flickr userid, you can set it to prevent a call to fetch the id
      *
      */
    var userid: String = js.native
    /**
      * Your Flickr username
      *
      */
    var username: String = js.native
    /**
      *
      */
    def postCreate(): Unit = js.native
    /**
      *
      */
    def startup(): Unit = js.native
  }
  
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
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/image/LightboxNano.html
    *
    * A simple "nano" version of the lightbox.
    * Very lightweight lightbox which only displays a larger image.  There is
    * no support for a caption or description.  The lightbox can be closed by
    * clicking any where or pressing any key.  This widget is intended to be
    * used on <a> and <img> tags.  Upon creation, if the domNode is <img> tag,
    * then it is wrapped in an <a> tag, then a <div class="enlarge"> is placed
    * inside the <a> and can be styled to display an icon that the original
    * can be enlarged.
    *
    * @param p       Optional
    * @param n       Optional
    */
  @js.native
  class LightboxNano () extends js.Object {
    def this(p: js.Object) = this()
    def this(p: js.Object, n: HTMLElement) = this()
    /**
      * The delay in milliseconds of the LightboxNano open and close animation.
      *
      */
    var duration: Double = js.native
    /**
      * URL to the large image to show in the lightbox.
      *
      */
    var href: String = js.native
    /**
      * The delay in milliseconds after the LightboxNano is created before preloading the larger image.
      *
      */
    var preloadDelay: Double = js.native
    /**
      * Destroys the LightboxNano and it's DOM node
      *
      */
    def destroy(): Unit = js.native
    /**
      * Shows this LightboxNano programatically. Allows passing a new href and
      * a programmatic origin.
      *
      * @param args               OptionalAn object with optional members of href and origin.origin can be be a String|Id of a DomNode to use whenanimating the opening of the image (the 'box' effect startsfrom this origin point. eg: { origin: e.target })If there's no origin, it will use the center of the viewport.The href member is a string URL for the image to bedisplayed. Omitting either of these members will revert tothe default href (which could be absent in some cases) andthe original srcNodeRef for the widget.
      */
    def show(args: js.Object): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/image/Magnifier.html
    *
    * Adds magnification on a portion of an image element, using dojox.gfx
    * An unobtrusive way to add an unstyled overlay
    * above the srcNode image element. The overlay/glass is a
    * scaled version of the src image (so larger images sized down
    * are clearer).
    *
    * over-ride the _createGlass method to create your custom surface,
    * being sure to create an img node on that surface.
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  @js.native
  class Magnifier () extends MagnifierLite {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/image/MagnifierLite.html
    *
    * Adds magnification on a portion of an image element
    * An unobtrusive way to add an unstyled overlay
    * above the srcNode image element. The overlay/glass is a
    * scaled version of the src image (so larger images sized down
    * are clearer).
    *
    * The logic behind requiring the src image to be large is
    * "it's going to be downloaded, anyway" so this method avoids
    * having to make thumbnails and 2 http requests among other things.
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  @js.native
  class MagnifierLite () extends _Widget {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      * the width and height of the bounding box
      *
      */
    var glassSize: Double = js.native
    /**
      * the multiplier of the Mangification.
      *
      */
    var scale: js.Object = js.native
    /**
      * HTML style attributes as cssText string or name/value hash
      *
      */
    @JSName("style")
    var style_MagnifierLite: String = js.native
    /**
      *
      * @param finalize
      */
    def destroy(finalize: js.Any): Unit = js.native
    @JSName("get")
    def get_glassSize(property: glassSize): Double = js.native
    @JSName("get")
    def get_scale(property: scale): js.Object = js.native
    @JSName("set")
    def set_glassSize(property: glassSize, value: Double): Unit = js.native
    @JSName("set")
    def set_scale(property: scale, value: js.Object): Unit = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("watch")
    def watch_glassSize(
      property: glassSize,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Double], 
          /* newValue */ js.UndefOr[Double], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_scale(
      property: scale,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[js.Object], 
          /* newValue */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Anon_Unwatch = js.native
  }
  
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
  
}

