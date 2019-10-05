package typings.dojo.dojox.editor.plugins

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.dijit._Widget
import typings.dojo.dijit._editor._Plugin
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.menuTitle
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/Breadcrumb.html
  *
  * This plugin provides Breadcrumb capability to the editor. As you move
  * around the editor, it updates with your current indention depth.
  *
  * @param args       OptionalInitial settings for any of the attributes.
  */
@JSGlobal("dojox.editor.plugins.Breadcrumb")
@js.native
class Breadcrumb () extends _Plugin {
  def this(args: js.Object) = this()
  /**
    * The toolbar containing the breadcrumb.
    *
    */
  var breadcrumbBar: js.Object = js.native
}

@JSGlobal("dojox.editor.plugins.Breadcrumb")
@js.native
object Breadcrumb extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/Breadcrumb._BreadcrumbMenuTitle.html
    *
    * Simple internal, non-clickable, menu entry to act as a menu title bar.
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
  - typings.dojo.dijit._Contained because Inheritance from two classes. Inlined getIndexInParent, getNextSibling, getPreviousSibling
  - typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @js.native
  class _BreadcrumbMenuTitle () extends _Widget {
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
    var menuTitle: String = js.native
    /**
      *
      */
    var searchContainerNode: Boolean = js.native
    /**
      * HTML style attributes as cssText string or name/value hash
      *
      */
    @JSName("style")
    var style__BreadcrumbMenuTitle: String = js.native
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
      * Returns the index of this widget within its container parent.
      * It returns -1 if the parent does not exist, or if the parent
      * is not a dijit/_Container
      *
      */
    /**
      * Returns the index of this widget within its container parent.
      * It returns -1 if the parent does not exist, or if the parent
      * is not a dijit/_Container
      * 
      */
    def getIndexInParent(): js.Any = js.native
    /**
      * Returns null if this is the last child of the parent,
      * otherwise returns the next element sibling to the "right".
      *
      */
    /**
      * Returns null if this is the last child of the parent,
      * otherwise returns the next element sibling to the "right".
      * 
      */
    def getNextSibling(): js.Any = js.native
    /**
      * Returns null if this is the first child of the parent,
      * otherwise returns the next element sibling to the "left".
      *
      */
    /**
      * Returns null if this is the first child of the parent,
      * otherwise returns the next element sibling to the "left".
      * 
      */
    def getPreviousSibling(): js.Any = js.native
    @JSName("get")
    def get_attachScope(property: attachScope): js.Object = js.native
    @JSName("get")
    def get_menuTitle(property: menuTitle): String = js.native
    @JSName("get")
    def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
    @JSName("get")
    def get_templatePath(property: templatePath): String = js.native
    @JSName("get")
    def get_templateString(property: templateString): String = js.native
    @JSName("set")
    def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
    @JSName("set")
    def set_menuTitle(property: menuTitle, value: String): Unit = js.native
    @JSName("set")
    def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("set")
    def set_templatePath(property: templatePath, value: String): Unit = js.native
    @JSName("set")
    def set_templateString(property: templateString, value: String): Unit = js.native
    @JSName("watch")
    def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_menuTitle(property: menuTitle, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_searchContainerNode(property: searchContainerNode, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templatePath(property: templatePath, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  }
  
}

