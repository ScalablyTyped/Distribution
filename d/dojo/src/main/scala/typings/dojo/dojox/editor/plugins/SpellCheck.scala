package typings.dojo.dojox.editor.plugins

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit._Widget
import typings.dojo.dijit._editor._Plugin
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.contextRequire
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.dojo.dojoStrings.widgetsInTemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/SpellCheck.html
  *
  * This plugin provides a spelling check capability for the editor.
  *
  */
@JSGlobal("dojox.editor.plugins.SpellCheck")
@js.native
class SpellCheck () extends _Plugin {
  /**
    * The max length of each XHR request. It is used to divide the large
    * text into pieces so that the server-side piece can hold.
    *
    */
  var bufferLength: Double = js.native
  /**
    * Indicate if the interactive spelling check is enabled
    *
    */
  var interactive: Boolean = js.native
  /**
    * The minutes to waiting for the response. The default value is 30 seconds.
    *
    */
  var timeout: Double = js.native
  /**
    * The url of the spelling check service
    *
    */
  var url: String = js.native
}

@JSGlobal("dojox.editor.plugins.SpellCheck")
@js.native
object SpellCheck extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/SpellCheck._SpellCheckControl.html
    *
    * The widget that is used for the UI of the batch spelling check
    *
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
  - typings.dojo.dijit._WidgetsInTemplateMixin because Inheritance from two classes. Inlined 
  - typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined 
  - typings.dojo.dijit._Templated because Inheritance from two classes. Inlined attachScope, contextRequire, searchContainerNode, templatePath, templateString, widgetsInTemplate, buildRendering, destroyRendering, startup, getCachedTemplate */ @js.native
  class _SpellCheckControl () extends _Widget {
    /**
      * Object to which attach points and events will be scoped.  Defaults
      * to 'this'.
      *
      */
    var attachScope: js.Object = js.native
    /**
      * Used to provide a context require to the dojo/parser in order to be
      * able to use relative MIDs (e.g. ./Widget) in the widget's template.
      *
      */
    var contextRequire: js.Function = js.native
    /**
      *
      */
    var searchContainerNode: Boolean = js.native
    /**
      * HTML style attributes as cssText string or name/value hash
      *
      */
    @JSName("style")
    var style__SpellCheckControl: String = js.native
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
      *
      */
    var widgetsInTemplate: Boolean = js.native
    /**
      * Set the focus of the control
      *
      */
    def focus(): Unit = js.native
    /**
      * Static method to get a template based on the templatePath or
      * templateString key
      */
    /**
      * Static method to get a template based on the templatePath or
      * templateString key
      */
    def getCachedTemplate(): js.Any = js.native
    @JSName("get")
    def get_attachScope(property: attachScope): js.Object = js.native
    @JSName("get")
    def get_contextRequire(property: contextRequire): js.Function = js.native
    @JSName("get")
    def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
    @JSName("get")
    def get_templatePath(property: templatePath): String = js.native
    @JSName("get")
    def get_templateString(property: templateString): String = js.native
    @JSName("get")
    def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
    /**
      *
      */
    def onAddToDic(): Unit = js.native
    /**
      *
      */
    def onCancel(): Unit = js.native
    /**
      *
      */
    def onEnter(): Unit = js.native
    /**
      *
      */
    def onReplace(): Unit = js.native
    /**
      *
      */
    def onReplaceAll(): Unit = js.native
    /**
      *
      */
    def onSkip(): Unit = js.native
    /**
      *
      */
    def onSkipAll(): Unit = js.native
    @JSName("set")
    def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
    @JSName("set")
    def set_contextRequire(property: contextRequire, value: js.Function): Unit = js.native
    @JSName("set")
    def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("set")
    def set_templatePath(property: templatePath, value: String): Unit = js.native
    @JSName("set")
    def set_templateString(property: templateString, value: String): Unit = js.native
    @JSName("set")
    def set_widgetsInTemplate(property: widgetsInTemplate, value: Boolean): Unit = js.native
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
    def watch_contextRequire(
      property: contextRequire,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[js.Function], 
          /* newValue */ js.UndefOr[js.Function], 
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
    def watch_widgetsInTemplate(
      property: widgetsInTemplate,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Boolean], 
          /* newValue */ js.UndefOr[Boolean], 
          Unit
        ]
    ): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/SpellCheck._SpellCheckScriptMultiPart.html
    *
    * It is a base network service component. It transfers text to a remote service port
    * with cross domain ability enabled. It can split text into specified pieces and send
    * them out one by one so that it can handle the case when the service has a limitation of
    * the capability.
    * The encoding is UTF-8.
    *
    */
  @js.native
  class _SpellCheckScriptMultiPart () extends js.Object {
    /**
      *
      */
    var ACTION_QUERY: String = js.native
    /**
      *
      */
    var ACTION_UPDATE: String = js.native
    /**
      *
      */
    var SEC: Double = js.native
    /**
      *
      */
    var callbackHandle: String = js.native
    /**
      *
      */
    var delimiter: String = js.native
    /**
      *
      */
    var label: String = js.native
    /**
      *
      */
    var maxBufferLength: Double = js.native
    /**
      *
      * @param data
      */
    def onLoad(data: String): Unit = js.native
    /**
      * Send the content to the service port with the specified action
      *
      * @param content The text to be sent
      * @param action               OptionalThe action the service should take. Current support actions areACTION_QUERY and ACTION_UPDATE
      */
    def send(content: String, action: String): Unit = js.native
    /**
      *
      * @param seconds
      */
    def setWaitingTime(seconds: Double): Unit = js.native
  }
  
}

