package typings.dojo.dijit._editor

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit._Widget
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.comboClass
import typings.dojo.dojoStrings.command
import typings.dojo.dojoStrings.generic
import typings.dojo.dojoStrings.label
import typings.dojo.dojoStrings.plainText
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.dojo.dojoStrings.values
import typings.dojo.dojoStrings.widgetsInTemplate
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dijit._editor.plugins")
@js.native
object plugins extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/AlwaysShowToolbar.html
    *
    * This plugin is required for Editors in auto-expand mode.
    * It handles the auto-expansion as the user adds/deletes text,
    * and keeps the editor's toolbar visible even when the top of the editor
    * has scrolled off the top of the viewport (usually when editing a long
    * document).
    * Specify this in extraPlugins (or plugins) parameter and also set
    * height to "".
    * 
    * @param args       OptionalInitial settings for any of the attributes.     
    */
  @js.native
  class AlwaysShowToolbar () extends _Plugin {
    def this(args: js.Object) = this()
    /**
      * 
      * @param e             
      */
    def setEditor(e: js.Any): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/EnterKeyHandling.html
    *
    * This plugin tries to make all browsers behave consistently with regard to
    * how ENTER behaves in the editor window.  It traps the ENTER key and alters
    * the way DOM is constructed in certain cases to try to commonize the generated
    * DOM and behaviors across browsers.
    * This plugin has three modes:
    * 
    * blockNodeForEnter=BR
    * blockNodeForEnter=DIV
    * blockNodeForEnter=P
    * In blockNodeForEnter=P, the ENTER key starts a new
    * paragraph, and shift-ENTER starts a new line in the current paragraph.
    * For example, the input:
    * 
    * first paragraph <shift-ENTER>
    * second line of first paragraph <ENTER>
    * second paragraph
    * will generate:
    * 
    * <p>
    *     first paragraph
    *     <br/>
    *     second line of first paragraph
    * </p>
    * <p>
    *     second paragraph
    * </p>
    * In BR and DIV mode, the ENTER key conceptually goes to a new line in the
    * current paragraph, and users conceptually create a new paragraph by pressing ENTER twice.
    * For example, if the user enters text into an editor like this:
    * 
    * one <ENTER>
    * two <ENTER>
    * three <ENTER>
    * <ENTER>
    * four <ENTER>
    * five <ENTER>
    * six <ENTER>
    * It will appear on the screen as two 'paragraphs' of three lines each.  Markupwise, this generates:
    * 
    * BR:
    * 
    * one<br/>
    * two<br/>
    * three<br/>
    * <br/>
    * four<br/>
    * five<br/>
    * six<br/>
    * DIV:
    * 
    * <div>one</div>
    * <div>two</div>
    * <div>three</div>
    * <div>&nbsp;</div>
    * <div>four</div>
    * <div>five</div>
    * <div>six</div>
    * 
    * @param args This object will be passed to the plugin constructor     
    */
  @js.native
  class EnterKeyHandling protected () extends _Plugin {
    def this(args: js.Any) = this()
    /**
      * This property decides the behavior of Enter key. It can be either P,
      * DIV, BR, or empty (which means disable this feature). Anything else
      * will trigger errors.  The default is 'BR'
      * 
      * See class description for more details.
      * 
      */
    var blockNodeForEnter: String = js.native
    /**
      * 
      * @param editor             
      */
    def setEditor(editor: js.Any): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/FontChoice.html
    *
    * This plugin provides three drop downs for setting style in the editor
    * (font, font size, and format block), as controlled by command.
    * The commands provided by this plugin are:
    * 
    * fontName: Provides a drop down to select from a list of font names
    * fontSize: Provides a drop down to select from a list of font sizes
    * formatBlock: Provides a drop down to select from a list of block styles
    * which can easily be added to an editor by including one or more of the above commands
    * in the plugins attribute as follows:
    * plugins="['fontName','fontSize',...]"
    * It is possible to override the default dropdown list by providing an Array for the custom property when
    * instantiating this plugin, e.g.
    * 
    * plugins="[{name:'dijit._editor.plugins.FontChoice', command:'fontName', values:['Verdana','Myriad','Garamond']},...]"
    * Alternatively, for fontName only, generic:true may be specified to provide a dropdown with
    * CSS generic font families.
    * 
    * Note that the editor is often unable to properly handle font styling information defined outside
    * the context of the current editor instance, such as pre-populated HTML.
    * 
    * @param args       OptionalInitial settings for any of the attributes.     
    */
  @js.native
  class FontChoice () extends _Plugin {
    def this(args: js.Object) = this()
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/FullScreen.html
    *
    * This plugin provides FullScreen capability to the editor.  When
    * toggled on, it will render the editor into the full window and
    * overlay everything.  It also binds to the hotkey: CTRL-SHIFT-F11
    * for toggling fullscreen mode.
    * 
    * @param args       OptionalInitial settings for any of the attributes.     
    */
  @js.native
  class FullScreen () extends _Plugin {
    def this(args: js.Object) = this()
    /**
      * Read-Only variable used to denote of the editor is in fullscreen mode or not.
      * 
      */
    var isFullscreen: Boolean = js.native
    /**
      * zIndex value used for overlaying the full page.
      * default is 500.
      * 
      */
    var zIndex: Double = js.native
    /**
      * Function to allow programmatic toggling of the view.
      * 
      */
    def toggle(): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/LinkDialog.html
    *
    * This plugin provides the basis for an 'anchor' (link) dialog and an extension of it
    * provides the image link dialog.
    * The command provided by this plugin is:
    * 
    * createLink
    * 
    * @param args       OptionalInitial settings for any of the attributes.     
    */
  @js.native
  class LinkDialog () extends _Plugin {
    def this(args: js.Object) = this()
    /**
      * Used for validating input as correct email address.  Taken from dojox.validate
      * 
      */
    var emailRegExp: String = js.native
    /**
      * String used for templating the HTML to insert at the desired point.
      * 
      */
    var htmlTemplate: String = js.native
    /**
      * Template for contents of TooltipDialog to pick URL
      * 
      */
    var linkDialogTemplate: String = js.native
    /**
      * Tag used for the link type.
      * 
      */
    var tag: String = js.native
    /**
      * Used for validating input as correct URL.  While file:// urls are not terribly
      * useful, they are technically valid.
      * 
      */
    var urlRegExp: String = js.native
    /**
      * 
      */
    def ImgLinkDialog(): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/NewPage.html
    *
    * This plugin provides a simple 'new page' capability.  In other
    * words, set content to some default user defined string.
    * 
    * @param args       OptionalInitial settings for any of the attributes.     
    */
  @js.native
  class NewPage () extends _Plugin {
    def this(args: js.Object) = this()
    /**
      * The default content to insert into the editor as the new page.
      * The default is the <br> tag, a single blank line.
      * 
      */
    var content: String = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/Print.html
    *
    * This plugin provides Print capability to the editor.  When
    * clicked, the document in the editor frame will be printed.
    * 
    * @param args       OptionalInitial settings for any of the attributes.     
    */
  @js.native
  class Print () extends _Plugin {
    def this(args: js.Object) = this()
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/TabIndent.html
    *
    * This plugin is used to allow the use of the tab and shift-tab keys
    * to indent/outdent list items.  This overrides the default behavior
    * of moving focus from/to the toolbar
    * 
    * @param args       OptionalInitial settings for any of the attributes.     
    */
  @js.native
  class TabIndent () extends _Plugin {
    def this(args: js.Object) = this()
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/TextColor.html
    *
    * This plugin provides dropdown color pickers for setting text color and background color
    * The commands provided by this plugin are:
    * 
    * foreColor - sets the text color
    * hiliteColor - sets the background color
    * 
    * @param args       OptionalInitial settings for any of the attributes.     
    */
  @js.native
  class TextColor () extends _Plugin {
    def this(args: js.Object) = this()
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/ToggleDir.html
    *
    * This plugin is used to toggle direction of the edited document,
    * independent of what direction the whole page is.
    * 
    * @param args       OptionalInitial settings for any of the attributes.     
    */
  @js.native
  class ToggleDir () extends _Plugin {
    def this(args: js.Object) = this()
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/ViewSource.html
    *
    * This plugin provides a simple view source capability.  When view
    * source mode is enabled, it disables all other buttons/plugins on the RTE.
    * It also binds to the hotkey: CTRL-SHIFT-F11 for toggling ViewSource mode.
    * 
    * @param args       OptionalInitial settings for any of the attributes.     
    */
  @js.native
  class ViewSource () extends _Plugin {
    def this(args: js.Object) = this()
    /**
      * Boolean flag used to indicate if the source view should be readonly or not.
      * Cannot be changed after initialization of the plugin.
      * Defaults to false.
      * 
      */
    var readOnly: Boolean = js.native
    /**
      * Boolean flag used to indicate if comment tags should be stripped from the document.
      * Defaults to true.
      * 
      */
    var stripComments: Boolean = js.native
    /**
      * 
      */
    var stripIFrames: Boolean = js.native
    /**
      * Boolean flag used to indicate if script tags should be stripped from the document.
      * Defaults to true.
      * 
      */
    var stripScripts: Boolean = js.native
    /**
      * Internal function to set the caret in the sourceArea
      * to 0x0
      * 
      */
    def setSourceAreaCaret(): Unit = js.native
    /**
      * Function to allow programmatic toggling of the view.
      * 
      */
    def toggle(): Unit = js.native
  }
  
  @js.native
  object FontChoice extends js.Object {
    /**
      * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/FontChoice._FontDropDown.html
      *
      * Base class for widgets that contains a label (like "Font:")
      * and a FilteringSelect drop down to pick a value.
      * Used as Toolbar entry.
      * 
      * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
      * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
    - typings.dojo.dijit._WidgetsInTemplateMixin because Inheritance from two classes. Inlined contextRequire, widgetsInTemplate, startup
    - typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @js.native
    class _FontDropDown () extends _Widget {
      def this(params: js.Object) = this()
      def this(params: js.Object, srcNodeRef: HTMLElement) = this()
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
      @JSName("contextRequire")
      var contextRequire_F_FontDropDown: js.Function = js.native
      /**
        * The label to apply to this particular FontDropDown.
        * 
        */
      var label: String = js.native
      /**
        * Flag to indicate that the returned label should be plain text
        * instead of an example.
        * 
        */
      var plainText: Boolean = js.native
      /**
        * 
        */
      var searchContainerNode: Boolean = js.native
      /**
        * HTML style attributes as cssText string or name/value hash
        * 
        */
      @JSName("style")
      var style__FontDropDown: String = js.native
      /**
        * Path to template (HTML file) for this widget relative to dojo.baseUrl.
        * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
        * 
        */
      var templatePath: String = js.native
      /**
        * The template used to construct the labeled dropdown.
        * 
        */
      var templateString: String = js.native
      /**
        * Should we parse the template to find widgets that might be
        * declared in markup inside it?  (Remove for 2.0 and assume true)
        * 
        */
      var widgetsInTemplate: Boolean = js.native
      /**
        * The context require that is used to resolve modules in template.
        * 
        */
      def contextRequire(): Unit = js.native
      /**
        * Over-ride for focus control of this widget.  Delegates focus down to the
        * filtering select.
        * 
        */
      def focus(): Unit = js.native
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
      def get_label(property: label): String = js.native
      @JSName("get")
      def get_plainText(property: plainText): Boolean = js.native
      @JSName("get")
      def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
      @JSName("get")
      def get_templatePath(property: templatePath): String = js.native
      @JSName("get")
      def get_templateString(property: templateString): String = js.native
      @JSName("get")
      def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
      @JSName("set")
      def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
      @JSName("set")
      def set_label(property: label, value: String): Unit = js.native
      @JSName("set")
      def set_plainText(property: plainText, value: Boolean): Unit = js.native
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
      def watch_label(
        property: label,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[String], 
              /* newValue */ js.UndefOr[String], 
              Unit
            ]
      ): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_plainText(
        property: plainText,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[Boolean], 
              /* newValue */ js.UndefOr[Boolean], 
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
      * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/FontChoice._FontNameDropDown.html
      *
      * Dropdown to select a font; goes in editor toolbar.
      * 
      * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
      * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
    - typings.dojo.dijit._WidgetsInTemplateMixin because Inheritance from two classes. Inlined contextRequire, widgetsInTemplate, startup
    - typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @js.native
    class _FontNameDropDown () extends _Widget {
      def this(params: js.Object) = this()
      def this(params: js.Object, srcNodeRef: HTMLElement) = this()
      /**
        * Object to which attach points and events will be scoped.  Defaults
        * to 'this'.
        * 
        */
      var attachScope: js.Object = js.native
      /**
        * 
        */
      var comboClass: String = js.native
      /**
        * The editor 'command' implemented by this plugin.
        * 
        */
      var command: String = js.native
      /**
        * Used to provide a context require to the dojo/parser in order to be
        * able to use relative MIDs (e.g. ./Widget) in the widget's template.
        * 
        */
      @JSName("contextRequire")
      var contextRequire_F_FontNameDropDown: js.Function = js.native
      /**
        * Use generic (web standard) font names
        * 
        */
      var generic: Boolean = js.native
      /**
        * The label to apply to this particular FontDropDown.
        * 
        */
      var label: String = js.native
      /**
        * Flag to indicate that the returned label should be plain text
        * instead of an example.
        * 
        */
      var plainText: Boolean = js.native
      /**
        * 
        */
      var searchContainerNode: Boolean = js.native
      /**
        * HTML style attributes as cssText string or name/value hash
        * 
        */
      @JSName("style")
      var style__FontNameDropDown: String = js.native
      /**
        * Path to template (HTML file) for this widget relative to dojo.baseUrl.
        * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
        * 
        */
      var templatePath: String = js.native
      /**
        * The template used to construct the labeled dropdown.
        * 
        */
      var templateString: String = js.native
      /**
        * Should we parse the template to find widgets that might be
        * declared in markup inside it?  (Remove for 2.0 and assume true)
        * 
        */
      var widgetsInTemplate: Boolean = js.native
      /**
        * The context require that is used to resolve modules in template.
        * 
        */
      def contextRequire(): Unit = js.native
      /**
        * Over-ride for focus control of this widget.  Delegates focus down to the
        * filtering select.
        * 
        */
      def focus(): Unit = js.native
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
      /**
        * Function used to generate the labels of the format dropdown
        * will return a formatted, or plain label based on the value
        * of the plainText option.
        * 
        * @param value The 'insert value' associated with a name             
        * @param name The text name of the value             
        */
      def getLabel(value: String, name: String): js.Any = js.native
      @JSName("get")
      def get_attachScope(property: attachScope): js.Object = js.native
      @JSName("get")
      def get_comboClass(property: comboClass): String = js.native
      @JSName("get")
      def get_command(property: command): String = js.native
      @JSName("get")
      def get_generic(property: generic): Boolean = js.native
      @JSName("get")
      def get_label(property: label): String = js.native
      @JSName("get")
      def get_plainText(property: plainText): Boolean = js.native
      @JSName("get")
      def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
      @JSName("get")
      def get_templatePath(property: templatePath): String = js.native
      @JSName("get")
      def get_templateString(property: templateString): String = js.native
      @JSName("get")
      def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
      @JSName("set")
      def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
      @JSName("set")
      def set_comboClass(property: comboClass, value: String): Unit = js.native
      @JSName("set")
      def set_command(property: command, value: String): Unit = js.native
      @JSName("set")
      def set_generic(property: generic, value: Boolean): Unit = js.native
      @JSName("set")
      def set_label(property: label, value: String): Unit = js.native
      @JSName("set")
      def set_plainText(property: plainText, value: Boolean): Unit = js.native
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
      def watch_comboClass(
        property: comboClass,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[String], 
              /* newValue */ js.UndefOr[String], 
              Unit
            ]
      ): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_command(
        property: command,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[String], 
              /* newValue */ js.UndefOr[String], 
              Unit
            ]
      ): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_generic(
        property: generic,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[Boolean], 
              /* newValue */ js.UndefOr[Boolean], 
              Unit
            ]
      ): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_label(
        property: label,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[String], 
              /* newValue */ js.UndefOr[String], 
              Unit
            ]
      ): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_plainText(
        property: plainText,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[Boolean], 
              /* newValue */ js.UndefOr[Boolean], 
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
      * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/FontChoice._FontSizeDropDown.html
      *
      * Dropdown to select a font size; goes in editor toolbar.
      * 
      * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
      * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
    - typings.dojo.dijit._WidgetsInTemplateMixin because Inheritance from two classes. Inlined contextRequire, widgetsInTemplate, startup
    - typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @js.native
    class _FontSizeDropDown () extends _Widget {
      def this(params: js.Object) = this()
      def this(params: js.Object, srcNodeRef: HTMLElement) = this()
      /**
        * Object to which attach points and events will be scoped.  Defaults
        * to 'this'.
        * 
        */
      var attachScope: js.Object = js.native
      /**
        * 
        */
      var comboClass: String = js.native
      /**
        * The editor 'command' implemented by this plugin.
        * 
        */
      var command: String = js.native
      /**
        * Used to provide a context require to the dojo/parser in order to be
        * able to use relative MIDs (e.g. ./Widget) in the widget's template.
        * 
        */
      @JSName("contextRequire")
      var contextRequire_F_FontSizeDropDown: js.Function = js.native
      /**
        * The label to apply to this particular FontDropDown.
        * 
        */
      var label: String = js.native
      /**
        * Flag to indicate that the returned label should be plain text
        * instead of an example.
        * 
        */
      var plainText: Boolean = js.native
      /**
        * 
        */
      var searchContainerNode: Boolean = js.native
      /**
        * HTML style attributes as cssText string or name/value hash
        * 
        */
      @JSName("style")
      var style__FontSizeDropDown: String = js.native
      /**
        * Path to template (HTML file) for this widget relative to dojo.baseUrl.
        * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
        * 
        */
      var templatePath: String = js.native
      /**
        * The template used to construct the labeled dropdown.
        * 
        */
      var templateString: String = js.native
      /**
        * The HTML font size values supported by this plugin
        * 
        */
      var values: js.Object = js.native
      /**
        * Should we parse the template to find widgets that might be
        * declared in markup inside it?  (Remove for 2.0 and assume true)
        * 
        */
      var widgetsInTemplate: Boolean = js.native
      /**
        * The context require that is used to resolve modules in template.
        * 
        */
      def contextRequire(): Unit = js.native
      /**
        * Over-ride for focus control of this widget.  Delegates focus down to the
        * filtering select.
        * 
        */
      def focus(): Unit = js.native
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
      /**
        * Function used to generate the labels of the format dropdown
        * will return a formatted, or plain label based on the value
        * of the plainText option.
        * We're stuck using the deprecated FONT tag to correspond
        * with the size measurements used by the editor
        * 
        * @param value The 'insert value' associated with a name             
        * @param name The text name of the value             
        */
      def getLabel(value: String, name: String): js.Any = js.native
      @JSName("get")
      def get_attachScope(property: attachScope): js.Object = js.native
      @JSName("get")
      def get_comboClass(property: comboClass): String = js.native
      @JSName("get")
      def get_command(property: command): String = js.native
      @JSName("get")
      def get_label(property: label): String = js.native
      @JSName("get")
      def get_plainText(property: plainText): Boolean = js.native
      @JSName("get")
      def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
      @JSName("get")
      def get_templatePath(property: templatePath): String = js.native
      @JSName("get")
      def get_templateString(property: templateString): String = js.native
      @JSName("get")
      def get_values(property: values): js.Object = js.native
      @JSName("get")
      def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
      @JSName("set")
      def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
      @JSName("set")
      def set_comboClass(property: comboClass, value: String): Unit = js.native
      @JSName("set")
      def set_command(property: command, value: String): Unit = js.native
      @JSName("set")
      def set_label(property: label, value: String): Unit = js.native
      @JSName("set")
      def set_plainText(property: plainText, value: Boolean): Unit = js.native
      @JSName("set")
      def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
      @JSName("set")
      def set_style(property: style, value: String): Unit = js.native
      @JSName("set")
      def set_templatePath(property: templatePath, value: String): Unit = js.native
      @JSName("set")
      def set_templateString(property: templateString, value: String): Unit = js.native
      @JSName("set")
      def set_values(property: values, value: js.Object): Unit = js.native
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
      def watch_comboClass(
        property: comboClass,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[String], 
              /* newValue */ js.UndefOr[String], 
              Unit
            ]
      ): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_command(
        property: command,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[String], 
              /* newValue */ js.UndefOr[String], 
              Unit
            ]
      ): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_label(
        property: label,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[String], 
              /* newValue */ js.UndefOr[String], 
              Unit
            ]
      ): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_plainText(
        property: plainText,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[Boolean], 
              /* newValue */ js.UndefOr[Boolean], 
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
      def watch_values(
        property: values,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[js.Object], 
              /* newValue */ js.UndefOr[js.Object], 
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
      * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/FontChoice._FormatBlockDropDown.html
      *
      * Dropdown to select a format (like paragraph or heading); goes in editor toolbar.
      * 
      * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
      * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
    - typings.dojo.dijit._WidgetsInTemplateMixin because Inheritance from two classes. Inlined contextRequire, widgetsInTemplate, startup
    - typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @js.native
    class _FormatBlockDropDown () extends _Widget {
      def this(params: js.Object) = this()
      def this(params: js.Object, srcNodeRef: HTMLElement) = this()
      /**
        * Object to which attach points and events will be scoped.  Defaults
        * to 'this'.
        * 
        */
      var attachScope: js.Object = js.native
      /**
        * 
        */
      var comboClass: String = js.native
      /**
        * The editor 'command' implemented by this plugin.
        * 
        */
      var command: String = js.native
      /**
        * Used to provide a context require to the dojo/parser in order to be
        * able to use relative MIDs (e.g. ./Widget) in the widget's template.
        * 
        */
      @JSName("contextRequire")
      var contextRequire_F_FormatBlockDropDown: js.Function = js.native
      /**
        * The label to apply to this particular FontDropDown.
        * 
        */
      var label: String = js.native
      /**
        * Flag to indicate that the returned label should be plain text
        * instead of an example.
        * 
        */
      var plainText: Boolean = js.native
      /**
        * 
        */
      var searchContainerNode: Boolean = js.native
      /**
        * HTML style attributes as cssText string or name/value hash
        * 
        */
      @JSName("style")
      var style__FormatBlockDropDown: String = js.native
      /**
        * Path to template (HTML file) for this widget relative to dojo.baseUrl.
        * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
        * 
        */
      var templatePath: String = js.native
      /**
        * The template used to construct the labeled dropdown.
        * 
        */
      var templateString: String = js.native
      /**
        * The HTML format tags supported by this plugin
        * 
        */
      var values: js.Array[_] = js.native
      /**
        * Should we parse the template to find widgets that might be
        * declared in markup inside it?  (Remove for 2.0 and assume true)
        * 
        */
      var widgetsInTemplate: Boolean = js.native
      /**
        * The context require that is used to resolve modules in template.
        * 
        */
      def contextRequire(): Unit = js.native
      /**
        * Over-ride for focus control of this widget.  Delegates focus down to the
        * filtering select.
        * 
        */
      def focus(): Unit = js.native
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
      /**
        * Function used to generate the labels of the format dropdown
        * will return a formatted, or plain label based on the value
        * of the plainText option.
        * 
        * @param value The 'insert value' associated with a name             
        * @param name The text name of the value             
        */
      def getLabel(value: String, name: String): js.Any = js.native
      @JSName("get")
      def get_attachScope(property: attachScope): js.Object = js.native
      @JSName("get")
      def get_comboClass(property: comboClass): String = js.native
      @JSName("get")
      def get_command(property: command): String = js.native
      @JSName("get")
      def get_label(property: label): String = js.native
      @JSName("get")
      def get_plainText(property: plainText): Boolean = js.native
      @JSName("get")
      def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
      @JSName("get")
      def get_templatePath(property: templatePath): String = js.native
      @JSName("get")
      def get_templateString(property: templateString): String = js.native
      @JSName("get")
      def get_values(property: values): js.Array[_] = js.native
      @JSName("get")
      def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
      @JSName("set")
      def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
      @JSName("set")
      def set_comboClass(property: comboClass, value: String): Unit = js.native
      @JSName("set")
      def set_command(property: command, value: String): Unit = js.native
      @JSName("set")
      def set_label(property: label, value: String): Unit = js.native
      @JSName("set")
      def set_plainText(property: plainText, value: Boolean): Unit = js.native
      @JSName("set")
      def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
      @JSName("set")
      def set_style(property: style, value: String): Unit = js.native
      @JSName("set")
      def set_templatePath(property: templatePath, value: String): Unit = js.native
      @JSName("set")
      def set_templateString(property: templateString, value: String): Unit = js.native
      @JSName("set")
      def set_values(property: values, value: js.Array[_]): Unit = js.native
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
      def watch_comboClass(
        property: comboClass,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[String], 
              /* newValue */ js.UndefOr[String], 
              Unit
            ]
      ): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_command(
        property: command,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[String], 
              /* newValue */ js.UndefOr[String], 
              Unit
            ]
      ): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_label(
        property: label,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[String], 
              /* newValue */ js.UndefOr[String], 
              Unit
            ]
      ): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_plainText(
        property: plainText,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[Boolean], 
              /* newValue */ js.UndefOr[Boolean], 
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
      def watch_values(
        property: values,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[js.Array[_]], 
              /* newValue */ js.UndefOr[js.Array[_]], 
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
    
  }
  
  @js.native
  object LinkDialog extends js.Object {
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
    class ImgLinkDialog () extends _Plugin {
      def this(args: js.Object) = this()
      /**
        * Used for validating input as correct email address.  Taken from dojox.validate
        * 
        */
      var emailRegExp: String = js.native
      /**
        * String used for templating the <img> HTML to insert at the desired point.
        * 
        */
      var htmlTemplate: String = js.native
      /**
        * Over-ride for template since img dialog doesn't need target that anchor tags may.
        * 
        */
      var linkDialogTemplate: String = js.native
      /**
        * Tag used for the link type (img).
        * 
        */
      var tag: String = js.native
      /**
        * Used for validating input as correct URL.  While file:// urls are not terribly
        * useful, they are technically valid.
        * 
        */
      var urlRegExp: String = js.native
    }
    
  }
  
}

