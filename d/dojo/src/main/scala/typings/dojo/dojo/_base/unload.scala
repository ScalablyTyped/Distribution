package typings.dojo.dojo._base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/unload.html
  *
  * This module contains the document and window unload detection API.
  *
  */
@js.native
trait unload extends js.Object {
  /**
    * registers a function to be triggered when the page unloads.
    * The first time that addOnUnload is called Dojo will
    * register a page listener to trigger your unload handler
    * with.
    *
    * In a browser environment, the functions will be triggered
    * during the window.onbeforeunload event. Be careful of doing
    * too much work in an unload handler. onbeforeunload can be
    * triggered if a link to download a file is clicked, or if
    * the link is a javascript: link. In these cases, the
    * onbeforeunload event fires, but the document is not
    * actually destroyed. So be careful about doing destructive
    * operations in a dojo.addOnUnload callback.
    *
    * Further note that calling dojo.addOnUnload will prevent
    * browsers from using a "fast back" cache to make page
    * loading via back button instantaneous.
    *
    * @param obj               Optional
    * @param functionName               Optional
    */
  def addOnUnload(): Unit = js.native
  def addOnUnload(obj: js.Function): Unit = js.native
  def addOnUnload(obj: js.Function, functionName: String): Unit = js.native
  def addOnUnload(obj: js.Function, functionName: js.Function): Unit = js.native
  def addOnUnload(obj: js.Object): Unit = js.native
  def addOnUnload(obj: js.Object, functionName: String): Unit = js.native
  def addOnUnload(obj: js.Object, functionName: js.Function): Unit = js.native
  /**
    * registers a function to be triggered when window.onunload
    * fires.
    * The first time that addOnWindowUnload is called Dojo
    * will register a page listener to trigger your unload
    * handler with. Note that registering these handlers may
    * destroy "fastback" page caching in browsers that support
    * it. Be careful trying to modify the DOM or access
    * JavaScript properties during this phase of page unloading:
    * they may not always be available. Consider
    * addOnUnload() if you need to modify the DOM or do
    * heavy JavaScript work since it fires at the equivalent of
    * the page's "onbeforeunload" event.
    *
    * @param obj               Optional
    * @param functionName               Optional
    */
  def addOnWindowUnload(): Unit = js.native
  def addOnWindowUnload(obj: js.Function): Unit = js.native
  def addOnWindowUnload(obj: js.Function, functionName: String): Unit = js.native
  def addOnWindowUnload(obj: js.Function, functionName: js.Function): Unit = js.native
  def addOnWindowUnload(obj: js.Object): Unit = js.native
  def addOnWindowUnload(obj: js.Object, functionName: String): Unit = js.native
  def addOnWindowUnload(obj: js.Object, functionName: js.Function): Unit = js.native
}

