package typings.dojo.dojox.mobile

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.`lazy`
import typings.dojo.dojoStrings.content
import typings.dojo.dojoStrings.executeScripts
import typings.dojo.dojoStrings.href
import typings.dojo.dojoStrings.parseOnLoad
import typings.dojo.dojoStrings.prog
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/ContentPane.html
  *
  * A very simple content pane to embed an HTML fragment.
  * This widget embeds an HTML fragment and runs the parser. It has
  * the ability to load external content using dojo/_base/xhr. onLoad()
  * is called when parsing is done and the content is
  * ready. Compared with dijit/layout/ContentPane, this widget
  * provides only basic fuctionality, but it is much lighter.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dojox.mobile.ExecScriptMixin because Inheritance from two classes. Inlined 
- typings.dojo.dojox.mobile.ContentPaneMixin because Inheritance from two classes. Inlined content, executeScripts, href, `lazy`, parseOnLoad, prog, errorHandler, execScript, load, loadHandler, onLoad */ @JSGlobal("dojox.mobile.ContentPane")
@js.native
class ContentPane () extends Container {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * An HTML fragment to embed.
    *
    */
  var content: String = js.native
  /**
    * If true, executes scripts that is found in the content.
    *
    */
  var executeScripts: Boolean = js.native
  /**
    * URL of the content to embed.
    *
    */
  var href: String = js.native
  /**
    * If true, external content specified with the href property is
    * not loaded at startup time. It can be loaded by calling load().
    *
    */
  var `lazy`: String = js.native
  /**
    * If true, runs the parser when the load completes.
    *
    */
  var parseOnLoad: Boolean = js.native
  /**
    * If true, shows progress indicator while loading an HTML fragment
    * specified by href.
    *
    */
  var prog: Boolean = js.native
  /**
    * An error handler called when load fails.
    *
    * @param err
    */
  def errorHandler(err: js.Any): Unit = js.native
  /**
    * Finds script tags and executes the script.
    *
    * @param html The HTML input.
    */
  def execScript(html: String): js.Any = js.native
  @JSName("get")
  def get_content(property: content): String = js.native
  @JSName("get")
  def get_executeScripts(property: executeScripts): Boolean = js.native
  @JSName("get")
  def get_href(property: href): String = js.native
  @JSName("get")
  def get_lazy(property: `lazy`): String = js.native
  @JSName("get")
  def get_parseOnLoad(property: parseOnLoad): Boolean = js.native
  @JSName("get")
  def get_prog(property: prog): Boolean = js.native
  /**
    * Loads external content specified with href.
    *
    */
  def load(): Unit = js.native
  /**
    * A handler called when load completes.
    *
    * @param response
    */
  def loadHandler(response: String): Unit = js.native
  /**
    * Stub method to allow the application to connect to the
    * loading of external content (see load()).
    * Called when parsing is done and the content is ready.
    *
    */
  def onLoad(): Boolean = js.native
  @JSName("set")
  def set_content(property: content, value: String): Unit = js.native
  @JSName("set")
  def set_executeScripts(property: executeScripts, value: Boolean): Unit = js.native
  @JSName("set")
  def set_href(property: href, value: String): Unit = js.native
  @JSName("set")
  def set_lazy(property: `lazy`, value: String): Unit = js.native
  @JSName("set")
  def set_parseOnLoad(property: parseOnLoad, value: Boolean): Unit = js.native
  @JSName("set")
  def set_prog(property: prog, value: Boolean): Unit = js.native
  @JSName("watch")
  def watch_content(
    property: content,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_executeScripts(
    property: executeScripts,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_href(
    property: href,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_lazy(
    property: `lazy`,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_parseOnLoad(
    property: parseOnLoad,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_prog(
    property: prog,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

