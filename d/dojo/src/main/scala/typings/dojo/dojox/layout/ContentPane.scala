package typings.dojo.dojox.layout

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.adjustPaths
import typings.dojo.dojoStrings.cleanContent
import typings.dojo.dojoStrings.executeScripts
import typings.dojo.dojoStrings.renderStyles
import typings.dojo.dojoStrings.scriptHasHooks
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/layout/ContentPane.html
  *
  * An extended version of dijit.layout.ContentPane.
  * Supports infile scripts and external ones declared by <script src=''...>
  * relative path adjustments (content fetched from a different folder)
  * <style> and <link rel='stylesheet' href='..'> tags,
  * css paths inside cssText is adjusted (if you set adjustPaths = true)
  *
  * NOTE that dojo.require in script in the fetched file isn't recommended
  * Many widgets need to be required at page load to work properly
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.layout.ContentPane")
@js.native
class ContentPane ()
  extends typings.dojo.dijit.layout.ContentPane {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Adjust relative paths in html string content to point to this page.
    * Only useful if you grab content from a another folder then the current one
    *
    */
  var adjustPaths: Boolean = js.native
  /**
    * Cleans content to make it less likely to generate DOM/JS errors.
    * Useful if you send ContentPane a complete page, instead of a html fragment
    * scans for:
    *
    * title Node, remove
    * DOCTYPE tag, remove
    *
    */
  var cleanContent: Boolean = js.native
  /**
    * Execute (eval) scripts that is found in the content
    *
    */
  var executeScripts: Boolean = js.native
  /**
    * trigger/load styles in the content
    *
    */
  var renderStyles: Boolean = js.native
  /**
    * replace keyword 'container' in scripts with 'dijit.byId(this.id)'
    * NOTE this name might change in the near future
    *
    */
  var scriptHasHooks: Boolean = js.native
  @JSName("get")
  def get_adjustPaths(property: adjustPaths): Boolean = js.native
  @JSName("get")
  def get_cleanContent(property: cleanContent): Boolean = js.native
  @JSName("get")
  def get_executeScripts(property: executeScripts): Boolean = js.native
  @JSName("get")
  def get_renderStyles(property: renderStyles): Boolean = js.native
  @JSName("get")
  def get_scriptHasHooks(property: scriptHasHooks): Boolean = js.native
  /**
    * event callback, called on script error or on java handler error
    * override and return your own html string if you want a some text
    * displayed within the ContentPane
    *
    * @param e
    */
  def onExecError(e: Event_): Unit = js.native
  @JSName("set")
  def set_adjustPaths(property: adjustPaths, value: Boolean): Unit = js.native
  @JSName("set")
  def set_cleanContent(property: cleanContent, value: Boolean): Unit = js.native
  @JSName("set")
  def set_executeScripts(property: executeScripts, value: Boolean): Unit = js.native
  @JSName("set")
  def set_renderStyles(property: renderStyles, value: Boolean): Unit = js.native
  @JSName("set")
  def set_scriptHasHooks(property: scriptHasHooks, value: Boolean): Unit = js.native
  @JSName("watch")
  def watch_adjustPaths(
    property: adjustPaths,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_cleanContent(
    property: cleanContent,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
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
  def watch_renderStyles(
    property: renderStyles,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_scriptHasHooks(
    property: scriptHasHooks,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

