package typings.dojo.dijit.layout

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit._Widget
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.content
import typings.dojo.dojoStrings.doLayout
import typings.dojo.dojoStrings.errorMessage
import typings.dojo.dojoStrings.extractContent
import typings.dojo.dojoStrings.href
import typings.dojo.dojoStrings.ioArgs
import typings.dojo.dojoStrings.isLayoutContainer
import typings.dojo.dojoStrings.isLoaded
import typings.dojo.dojoStrings.loadingMessage
import typings.dojo.dojoStrings.onLoadDeferred
import typings.dojo.dojoStrings.parseOnLoad
import typings.dojo.dojoStrings.parserScope
import typings.dojo.dojoStrings.preload
import typings.dojo.dojoStrings.preventCache
import typings.dojo.dojoStrings.refreshOnShow
import typings.dojo.dojoStrings.stopParser
import typings.dojo.dojoStrings.style
import typings.std.Error
import typings.std.HTMLElement
import typings.std.NodeList
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/ContentPane.html
  *
  * A widget containing an HTML fragment, specified inline
  * or by uri.  Fragment may include widgets.
  * This widget embeds a document fragment in the page, specified
  * either by uri, javascript generated markup or DOM reference.
  * Any widgets within this content are instantiated and managed,
  * but laid out according to the HTML structure.  Unlike IFRAME,
  * ContentPane embeds a document fragment as would be found
  * inside the BODY tag of a full HTML document.  It should not
  * contain the HTML, HEAD, or BODY tags.
  * For more advanced functionality with scripts and
  * stylesheets, see dojox/layout/ContentPane.  This widget may be
  * used stand alone or as a base class for other widgets.
  * ContentPane is useful as a child of other layout containers
  * such as BorderContainer or TabContainer, but note that those
  * widgets can contain any widget as a child.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.layout._ContentPaneResizeMixin because Inheritance from two classes. Inlined doLayout, isLayoutContainer, resize, startup
- typings.dojo.dijit._Container because Inheritance from two classes. Inlined addChild, addChild, buildRendering, getIndexOfChild, hasChildren, removeChild, removeChild */ @JSGlobal("dijit.layout.ContentPane")
@js.native
class ContentPane () extends _Widget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * The innerHTML of the ContentPane.
    * Note that the initialization parameter / argument to set("content", ...)
    * can be a String, DomNode, Nodelist, or _Widget.
    * 
    */
  var content: String = js.native
  /**
    * 
    * false - don't adjust size of children
    * true - if there is a single visible child widget, set it's size to however big the ContentPane is
    * 
    */
  var doLayout: Boolean = js.native
  /**
    * Message that shows if an error occurs
    * 
    */
  var errorMessage: String = js.native
  /**
    * Extract visible content from inside of <body> .... </body>.
    * I.e., strip <html> and <head> (and it's contents) from the href
    * 
    */
  var extractContent: Boolean = js.native
  /**
    * The href of the content that displays now.
    * Set this at construction if you want to load data externally when the
    * pane is shown.  (Set preload=true to load it immediately.)
    * Changing href after creation doesn't have any effect; Use set('href', ...);
    * 
    */
  var href: String = js.native
  /**
    * Parameters to pass to xhrGet() request, for example:
    * 
    * <div data-dojo-type="dijit/layout/ContentPane" data-dojo-props="href: './bar', ioArgs: {timeout: 500}">
    * 
    */
  var ioArgs: js.Object = js.native
  /**
    * Indicates that this widget will call resize() on it's child widgets
    * when they become visible.
    * 
    */
  var isLayoutContainer: Boolean = js.native
  /**
    * True if the ContentPane has data in it, either specified
    * during initialization (via href or inline content), or set
    * via set('content', ...) / set('href', ...)
    * 
    * False if it doesn't have any content, or if ContentPane is
    * still in the process of downloading href.
    * 
    */
  var isLoaded: Boolean = js.native
  /**
    * Message that shows while downloading
    * 
    */
  var loadingMessage: String = js.native
  /**
    * This is the dojo.Deferred returned by set('href', ...) and refresh().
    * Calling onLoadDeferred.then() registers your
    * callback to be called only once, when the prior set('href', ...) call or
    * the initial href parameter to the constructor finishes loading.
    * 
    * This is different than an onLoad() handler which gets called any time any href
    * or content is loaded.
    * 
    */
  var onLoadDeferred: js.Object = js.native
  /**
    * Parse content and create the widgets, if any.
    * 
    */
  var parseOnLoad: Boolean = js.native
  /**
    * Flag passed to parser.  Root for attribute names to search for.   If scopeName is dojo,
    * will search for data-dojo-type (or dojoType).  For backwards compatibility
    * reasons defaults to dojo._scopeName (which is "dojo" except when
    * multi-version support is used, when it will be something like dojo16, dojo20, etc.)
    * 
    */
  var parserScope: String = js.native
  /**
    * Force load of data on initialization even if pane is hidden.
    * 
    */
  var preload: Boolean = js.native
  /**
    * Prevent caching of data from href's by appending a timestamp to the href.
    * 
    */
  var preventCache: Boolean = js.native
  /**
    * Refresh (re-download) content when pane goes from hidden to shown
    * 
    */
  var refreshOnShow: Boolean = js.native
  /**
    * 
    */
  var stopParser: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    * 
    */
  @JSName("style")
  var style_ContentPane: String = js.native
  /**
    * Makes the given widget a child of this widget.
    * Inserts specified child widget's dom node as a child of this widget's
    * container node, and possibly does other processing (such as layout).
    * 
    * @param widget             
    * @param insertIndex               Optional            
    */
  /**
    * Makes the given widget a child of this widget.
    * Inserts specified child widget's dom node as a child of this widget's
    * container node, and possibly does other processing (such as layout).
    * 
    * @param widget             
    * @param insertIndex               Optional            
    */
  def addChild(widget: _WidgetBase): Unit = js.native
  def addChild(widget: _WidgetBase, insertIndex: Double): Unit = js.native
  /**
    * Cancels an in-flight download of content
    * 
    */
  def cancel(): Unit = js.native
  /**
    * 
    * @param params             
    * @param srcNodeRef             
    */
  def create(params: js.Any, srcNodeRef: js.Any): Unit = js.native
  /**
    * Gets the index of the child in this container or -1 if not found
    * 
    * @param child             
    */
  /**
    * Gets the index of the child in this container or -1 if not found
    * 
    * @param child             
    */
  def getIndexOfChild(child: _WidgetBase): js.Any = js.native
  @JSName("get")
  def get_content(property: content): String = js.native
  @JSName("get")
  def get_doLayout(property: doLayout): Boolean = js.native
  @JSName("get")
  def get_errorMessage(property: errorMessage): String = js.native
  @JSName("get")
  def get_extractContent(property: extractContent): Boolean = js.native
  @JSName("get")
  def get_href(property: href): String = js.native
  @JSName("get")
  def get_ioArgs(property: ioArgs): js.Object = js.native
  @JSName("get")
  def get_isLayoutContainer(property: isLayoutContainer): Boolean = js.native
  @JSName("get")
  def get_isLoaded(property: isLoaded): Boolean = js.native
  @JSName("get")
  def get_loadingMessage(property: loadingMessage): String = js.native
  @JSName("get")
  def get_onLoadDeferred(property: onLoadDeferred): js.Object = js.native
  @JSName("get")
  def get_parseOnLoad(property: parseOnLoad): Boolean = js.native
  @JSName("get")
  def get_parserScope(property: parserScope): String = js.native
  @JSName("get")
  def get_preload(property: preload): Boolean = js.native
  @JSName("get")
  def get_preventCache(property: preventCache): Boolean = js.native
  @JSName("get")
  def get_refreshOnShow(property: refreshOnShow): Boolean = js.native
  @JSName("get")
  def get_stopParser(property: stopParser): Boolean = js.native
  /**
    * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
    * 
    */
  /**
    * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
    * 
    */
  def hasChildren(): Boolean = js.native
  /**
    * Function that should grab the content specified via href.
    * 
    * @param args An object with the following properties:handleAs (String, optional): Acceptable values are: text (default), json, json-comment-optional,json-comment-filtered, javascript, xml. See dojo/_base/xhr.contentHandlerssync (Boolean, optional): false is default. Indicates whether the request shouldbe a synchronous (blocking) request.headers (Object, optional): Additional HTTP headers to send in the request.failOk (Boolean, optional): false is default. Indicates whether a request should beallowed to fail (and therefore no console error message inthe event of a failure)contentType (String|Boolean): "application/x-www-form-urlencoded" is default. Set to false toprevent a Content-Type header from being sent, or to a stringto send a different Content-Type.load: This function will becalled on a successful HTTP response code.error: This function willbe called when the request fails due to a network or server error, the urlis invalid, etc. It will also be called if the load or handle callback throws anexception, unless djConfig.debugAtAllCosts is true.  This allows deployed applicationsto continue to run even when a logic error happens in the callback, while makingit easier to troubleshoot while in debug mode.handle: This function willbe called at the end of every request, whether or not an error occurs.url (String): URL to server endpoint.content (Object, optional): Contains properties with string values. Theseproperties will be serialized as name1=value2 andpassed in the request.timeout (Integer, optional): Milliseconds to wait for the response. If this timepasses, the then error callbacks are called.form (DOMNode, optional): DOM node for a form. Used to extract the form valuesand send to the server.preventCache (Boolean, optional): Default is false. If true, then a"dojo.preventCache" parameter is sent in the requestwith a value that changes with each request(timestamp). Useful only with GET-type requests.rawBody (String, optional): Sets the raw body for an HTTP request. If this is used, then the contentproperty is ignored. This is mostly useful for HTTP methods that havea body to their requests, like PUT or POST. This property can be used insteadof postData and putData for dojo/_base/xhr.rawXhrPost and dojo/_base/xhr.rawXhrPut respectively.ioPublish (Boolean, optional): Set this explicitly to false to prevent publishing of topics related toIO operations. Otherwise, if djConfig.ioPublish is set to true, topicswill be published via dojo/topic.publish() for different phases of an IO operation.See dojo/main.__IoPublish for a list of topics that are published.            
    */
  def ioMethod(args: js.Object): js.Any = js.native
  /**
    * 
    * @param params             
    * @param node             
    * @param ctor             
    */
  def markupFactory(params: js.Any, node: js.Any, ctor: js.Any): js.Any = js.native
  /**
    * Called on DOM faults, require faults etc. in content.
    * 
    * In order to display an error message in the pane, return
    * the error message from this method, as an HTML string.
    * 
    * By default (if this method is not overriden), it returns
    * nothing, so the error message is just printed to the console.
    * 
    * @param error             
    */
  def onContentError(error: Error): Unit = js.native
  /**
    * Called when download is finished.
    * 
    */
  def onDownloadEnd(): Unit = js.native
  /**
    * Called when download error occurs.
    * 
    * In order to display an error message in the pane, return
    * the error message from this method, as an HTML string.
    * 
    * Default behavior (if this method is not overriden) is to display
    * the error message inside the pane.
    * 
    * @param error             
    */
  def onDownloadError(error: Error): js.Any = js.native
  /**
    * Called before download starts.
    * The string returned by this function will be the html
    * that tells the user we are loading something.
    * Override with your own function if you want to change text.
    * 
    */
  def onDownloadStart(): js.Any = js.native
  /**
    * Event hook, is called after everything is loaded and widgetified
    * 
    * @param data             
    */
  def onLoad(data: js.Any): Unit = js.native
  /**
    * Event hook, is called before old content is cleared
    * 
    */
  def onUnload(): Unit = js.native
  /**
    * [Re]download contents of href and display
    * cancels any currently in-flight requests
    * posts "loading..." message
    * sends XHR to download new data
    * 
    */
  def refresh(): js.Any = js.native
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    * 
    * @param widget             
    */
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    * 
    * @param widget             
    */
  def removeChild(widget: Double): Unit = js.native
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    * 
    * @param widget             
    */
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    * 
    * @param widget             
    */
  def removeChild(widget: _WidgetBase): Unit = js.native
  /**
    * See dijit/layout/_LayoutWidget.resize() for description.
    * Although ContentPane doesn't extend _LayoutWidget, it does implement
    * the same API.
    * 
    * @param changeSize             
    * @param resultSize             
    */
  def resize(changeSize: js.Any, resultSize: js.Any): Unit = js.native
  /**
    * Deprecated.   Use set('content', ...) instead.
    * 
    * @param data             
    */
  def setContent(data: String): Unit = js.native
  /**
    * Deprecated.   Use set('content', ...) instead.
    * 
    * @param data             
    */
  def setContent(data: HTMLElement): Unit = js.native
  /**
    * Deprecated.   Use set('content', ...) instead.
    * 
    * @param data             
    */
  def setContent(data: NodeList): Unit = js.native
  /**
    * Deprecated.   Use set('href', ...) instead.
    * 
    * @param href             
    */
  def setHref(href: String): js.Any = js.native
  /**
    * Deprecated.   Use set('href', ...) instead.
    * 
    * @param href             
    */
  def setHref(href: URL): js.Any = js.native
  @JSName("set")
  def set_content(property: content, value: String): Unit = js.native
  @JSName("set")
  def set_doLayout(property: doLayout, value: Boolean): Unit = js.native
  @JSName("set")
  def set_errorMessage(property: errorMessage, value: String): Unit = js.native
  @JSName("set")
  def set_extractContent(property: extractContent, value: Boolean): Unit = js.native
  @JSName("set")
  def set_href(property: href, value: String): Unit = js.native
  @JSName("set")
  def set_ioArgs(property: ioArgs, value: js.Object): Unit = js.native
  @JSName("set")
  def set_isLayoutContainer(property: isLayoutContainer, value: Boolean): Unit = js.native
  @JSName("set")
  def set_isLoaded(property: isLoaded, value: Boolean): Unit = js.native
  @JSName("set")
  def set_loadingMessage(property: loadingMessage, value: String): Unit = js.native
  @JSName("set")
  def set_onLoadDeferred(property: onLoadDeferred, value: js.Object): Unit = js.native
  @JSName("set")
  def set_parseOnLoad(property: parseOnLoad, value: Boolean): Unit = js.native
  @JSName("set")
  def set_parserScope(property: parserScope, value: String): Unit = js.native
  @JSName("set")
  def set_preload(property: preload, value: Boolean): Unit = js.native
  @JSName("set")
  def set_preventCache(property: preventCache, value: Boolean): Unit = js.native
  @JSName("set")
  def set_refreshOnShow(property: refreshOnShow, value: Boolean): Unit = js.native
  @JSName("set")
  def set_stopParser(property: stopParser, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("watch")
  def watch_content(
    property: content,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_doLayout(
    property: doLayout,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_errorMessage(
    property: errorMessage,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_extractContent(
    property: extractContent,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_href(
    property: href,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_ioArgs(
    property: ioArgs,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_isLayoutContainer(
    property: isLayoutContainer,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_isLoaded(
    property: isLoaded,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_loadingMessage(
    property: loadingMessage,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_onLoadDeferred(
    property: onLoadDeferred,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_parseOnLoad(
    property: parseOnLoad,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_parserScope(
    property: parserScope,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_preload(
    property: preload,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_preventCache(
    property: preventCache,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_refreshOnShow(
    property: refreshOnShow,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_stopParser(
    property: stopParser,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

