package typings.dojo.dojox.mobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/_ContentPaneMixin.html
  *
  * Mixin for a very simple content pane to embed an HTML fragment.
  * By mixing this class into a widget, the widget can have the ability
  * to embed an external HTML fragment and to run the parser.
  *
  */
@JSGlobal("dojox.mobile._ContentPaneMixin")
@js.native
class ContentPaneMixin () extends ExecScriptMixin {
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
}

