package typings.dojo.dijit

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyFunction
import typings.dojo.Fn_NewValueOldValuePropertyNumber
import typings.dojo.dojo._base.Color
import typings.dojo.dojoStrings.active
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.cellClass
import typings.dojo.dojoStrings.cssStateNodes
import typings.dojo.dojoStrings.defaultTimeout
import typings.dojo.dojoStrings.dyeClass
import typings.dojo.dojoStrings.hovering
import typings.dojo.dojoStrings.palette
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.tabIndex
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.dojo.dojoStrings.timeoutChangeRate
import typings.dojo.dojoStrings.value
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/ColorPalette.html
  *
  * A keyboard accessible color-picking widget
  * Grid showing various colors, so the user can pick a certain color.
  * Can be used standalone, or as a popup.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._CssStateMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit._PaletteMixin because Inheritance from two classes. Inlined active, cellClass, cssStateNodes, defaultTimeout, dyeClass, hovering, tabIndex, timeoutChangeRate, value, focus, postCreate, onChange
- typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dijit.ColorPalette")
@js.native
class ColorPalette () extends _Widget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * True if mouse was pressed while over this widget, and hasn't been released yet
    * 
    */
  var active: Boolean = js.native
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    * 
    */
  var attachScope: js.Object = js.native
  /**
    * CSS class applied to each cell in the palette
    * 
    */
  var cellClass: String = js.native
  /**
    * Subclasses may define a cssStateNodes property that lists sub-nodes within the widget that
    * need CSS classes applied on mouse hover/press and focus.
    * 
    * Each entry in this optional hash is a an attach-point name (like "upArrowButton") mapped to a CSS class name
    * (like "dijitUpArrowButton"). Example:
    * 
    * {
    *     "upArrowButton": "dijitUpArrowButton",
    *     "downArrowButton": "dijitDownArrowButton"
    * }
    * The above will set the CSS class dijitUpArrowButton to the this.upArrowButton DOMNode when it
    * 
    * is hovered, etc.
    * 
    */
  var cssStateNodes: js.Object = js.native
  /**
    * Number of milliseconds before a held key or button becomes typematic
    * 
    */
  var defaultTimeout: Double = js.native
  /**
    * Constructor for Object created for each cell of the palette.
    * dyeClass should implement the dijit/_PaletteMixin.__Dye interface.
    * 
    */
  var dyeClass: js.Function | js.Object = js.native
  /**
    * True if cursor is over this widget
    * 
    */
  var hovering: Boolean = js.native
  /**
    * Size of grid, either "7x10" or "3x4".
    * 
    */
  var palette: String = js.native
  /**
    * 
    */
  var searchContainerNode: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    * 
    */
  @JSName("style")
  var style_ColorPalette: String = js.native
  /**
    * Widget tab index.
    * 
    */
  var tabIndex: String = js.native
  /**
    * Path to template (HTML file) for this widget relative to dojo.baseUrl.
    * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
    * 
    */
  var templatePath: String = js.native
  /**
    * The template of this widget.
    * 
    */
  var templateString: String = js.native
  /**
    * Fraction of time used to change the typematic timer between events
    * 1.0 means that each typematic event fires at defaultTimeout intervals
    * Less than 1.0 means that each typematic event fires at an increasing faster rate
    * 
    */
  var timeoutChangeRate: Double = js.native
  /**
    * Currently selected color/emoticon/etc.
    * 
    */
  var value: String = js.native
  /**
    * Focus this widget.  Puts focus on the most recently focused cell.
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
  def get_active(property: active): Boolean = js.native
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_cellClass(property: cellClass): String = js.native
  @JSName("get")
  def get_cssStateNodes(property: cssStateNodes): js.Object = js.native
  @JSName("get")
  def get_defaultTimeout(property: defaultTimeout): Double = js.native
  @JSName("get")
  def get_dyeClass(property: dyeClass): js.Function = js.native
  @JSName("get")
  def get_hovering(property: hovering): Boolean = js.native
  @JSName("get")
  def get_palette(property: palette): String = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_tabIndex(property: tabIndex): String = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  @JSName("get")
  def get_timeoutChangeRate(property: timeoutChangeRate): Double = js.native
  @JSName("get")
  def get_value(property: value): String = js.native
  /**
    * Callback when a cell is selected.
    * 
    * @param value Value corresponding to cell.             
    */
  def onChange(value: String): Unit = js.native
  @JSName("set")
  def set_active(property: active, value: Boolean): Unit = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_cellClass(property: cellClass, value: String): Unit = js.native
  @JSName("set")
  def set_cssStateNodes(property: cssStateNodes, value: js.Object): Unit = js.native
  @JSName("set")
  def set_defaultTimeout(property: defaultTimeout, value: Double): Unit = js.native
  @JSName("set")
  def set_dyeClass(property: dyeClass, value: js.Function): Unit = js.native
  @JSName("set")
  def set_hovering(property: hovering, value: Boolean): Unit = js.native
  @JSName("set")
  def set_palette(property: palette, value: String): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_tabIndex(property: tabIndex, value: String): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  @JSName("set")
  def set_timeoutChangeRate(property: timeoutChangeRate, value: Double): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: String): Unit = js.native
  @JSName("watch")
  def watch_active(property: active, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_cellClass(property: cellClass, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_cssStateNodes(property: cssStateNodes, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_defaultTimeout(property: defaultTimeout, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_dyeClass(property: dyeClass, callback: Fn_NewValueOldValuePropertyFunction): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_hovering(property: hovering, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_palette(property: palette, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_searchContainerNode(property: searchContainerNode, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_tabIndex(property: tabIndex, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templatePath(property: templatePath, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_timeoutChangeRate(property: timeoutChangeRate, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_value(property: value, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
}

@JSGlobal("dijit.ColorPalette")
@js.native
object ColorPalette extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/ColorPalette._Color.html
    *
    * Object associated with each cell in a ColorPalette palette.
    * Implements dijit/Dye.
    * 
    * @param alias English name of the color.     
    * @param row Vertical position in grid.     
    * @param col     
    * @param title Localized name of the color.     
    */
  @js.native
  class _Color protected () extends Color {
    def this(alias: String, row: Double, col: js.Any, title: String) = this()
    /**
      * 
      */
    var hcTemplate: String = js.native
    /**
      * 
      */
    var template: String = js.native
    /**
      * 
      * @param cell             
      * @param blankGif             
      */
    def fillCell(cell: HTMLElement, blankGif: String): Unit = js.native
    /**
      * Note that although dijit._Color is initialized with a value like "white" getValue() always
      * returns a hex value
      * 
      */
    def getValue(): js.Any = js.native
  }
  
}

