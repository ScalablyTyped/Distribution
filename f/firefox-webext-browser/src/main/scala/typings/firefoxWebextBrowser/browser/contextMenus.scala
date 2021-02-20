package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.NumberDictionary
import typings.firefoxWebextBrowser.browser.extension.ViewType
import typings.firefoxWebextBrowser.browser.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the browser.contextMenus API to add items to the browser's context menu. You can choose what types of objects your context menu additions apply to, such as images, hyperlinks, and pages.
  *
  * Permissions: `contextMenus`
  */
object contextMenus {
  
  /* contextMenus types */
  /**
    * The different contexts a menu can appear in. Specifying 'all' is equivalent to the combination of all other contexts except for 'tab' and 'tools_menu'.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.all
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.page
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.frame
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.selection
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.link
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.editable
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.password
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.image
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.video
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.audio
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.launcher
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.browser_action
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.page_action
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab
  */
  trait ContextType extends StObject
  object ContextType {
    
    @scala.inline
    def all: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.all = "all".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.all]
    
    @scala.inline
    def audio: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.audio = "audio".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.audio]
    
    @scala.inline
    def bookmark: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark = "bookmark".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark]
    
    @scala.inline
    def browser_action: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.browser_action = "browser_action".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.browser_action]
    
    @scala.inline
    def editable: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.editable = "editable".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.editable]
    
    @scala.inline
    def frame: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.frame = "frame".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.frame]
    
    @scala.inline
    def image: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.image = "image".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.image]
    
    @scala.inline
    def launcher: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.launcher = "launcher".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.launcher]
    
    @scala.inline
    def link: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.link = "link".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.link]
    
    @scala.inline
    def page: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.page = "page".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.page]
    
    @scala.inline
    def page_action: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.page_action = "page_action".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.page_action]
    
    @scala.inline
    def password: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.password = "password".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.password]
    
    @scala.inline
    def selection: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.selection = "selection".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.selection]
    
    @scala.inline
    def tab: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab = "tab".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab]
    
    @scala.inline
    def video: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.video = "video".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.video]
  }
  
  @js.native
  trait CreateCreateProperties extends StObject {
    
    /**
      * The initial state of a checkbox or radio item: true for selected and false for unselected. Only one radio item can be selected at a time in a given group of radio items.
      */
    var checked: js.UndefOr[Boolean] = js.native
    
    /**
      * Specifies a command to issue for the context click. Currently supports internal commands _execute_page_action, _execute_browser_action and _execute_sidebar_action.
      */
    var command: js.UndefOr[String] = js.native
    
    /** List of contexts this menu item will appear in. Defaults to ['page'] if not specified. */
    var contexts: js.UndefOr[js.Array[ContextType]] = js.native
    
    /**
      * Lets you restrict the item to apply only to documents whose URL matches one of the given patterns. (This applies to frames as well.) For details on the format of a pattern, see Match Patterns.
      */
    var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.native
    
    /** Whether this context menu item is enabled or disabled. Defaults to true. */
    var enabled: js.UndefOr[Boolean] = js.native
    
    var icons: js.UndefOr[CreateCreatePropertiesIcons] = js.native
    
    /**
      * The unique ID to assign to this item. Mandatory for event pages. Cannot be the same as another ID for this extension.
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * A function that will be called back when the menu item is clicked. Event pages cannot use this; instead, they should register a listener for `contextMenus.onClicked`.
      * @param info Information about the item clicked and the context where the click happened.
      * @param tab The details of the tab where the click took place. Note: this parameter only present for extensions.
      */
    var onclick: js.UndefOr[js.Function2[/* info */ OnClickData, /* tab */ Tab, Unit]] = js.native
    
    /** The ID of a parent menu item; this makes the item a child of a previously added item. */
    var parentId: js.UndefOr[Double | String] = js.native
    
    /**
      * Similar to documentUrlPatterns, but lets you filter based on the src attribute of img/audio/video tags and the href of anchor tags.
      */
    var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The text to be displayed in the item; this is _required_ unless `type` is 'separator'. When the context is 'selection', you can use `%s` within the string to show the selected text. For example, if this parameter's value is "Translate '%s' to Pig Latin" and the user selects the word "cool", the context menu item for the selection is "Translate 'cool' to Pig Latin".
      */
    var title: js.UndefOr[String] = js.native
    
    /** The type of menu item. Defaults to 'normal' if not specified. */
    var `type`: js.UndefOr[ItemType] = js.native
    
    /**
      * List of view types where the menu item will be shown. Defaults to any view, including those without a viewType.
      */
    var viewTypes: js.UndefOr[js.Array[ViewType]] = js.native
    
    /** Whether the item is visible in the menu. */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object CreateCreateProperties {
    
    @scala.inline
    def apply(): CreateCreateProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateCreateProperties]
    }
    
    @scala.inline
    implicit class CreateCreatePropertiesMutableBuilder[Self <: CreateCreateProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      @scala.inline
      def setContexts(value: js.Array[ContextType]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
      
      @scala.inline
      def setContextsVarargs(value: ContextType*): Self = StObject.set(x, "contexts", js.Array(value :_*))
      
      @scala.inline
      def setDocumentUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "documentUrlPatterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentUrlPatternsUndefined: Self = StObject.set(x, "documentUrlPatterns", js.undefined)
      
      @scala.inline
      def setDocumentUrlPatternsVarargs(value: String*): Self = StObject.set(x, "documentUrlPatterns", js.Array(value :_*))
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setIcons(value: CreateCreatePropertiesIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOnclick(value: (/* info */ OnClickData, /* tab */ Tab) => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
      
      @scala.inline
      def setParentId(value: Double | String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setTargetUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "targetUrlPatterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUrlPatternsUndefined: Self = StObject.set(x, "targetUrlPatterns", js.undefined)
      
      @scala.inline
      def setTargetUrlPatternsVarargs(value: String*): Self = StObject.set(x, "targetUrlPatterns", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: ItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setViewTypes(value: js.Array[ViewType]): Self = StObject.set(x, "viewTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewTypesUndefined: Self = StObject.set(x, "viewTypes", js.undefined)
      
      @scala.inline
      def setViewTypesVarargs(value: ViewType*): Self = StObject.set(x, "viewTypes", js.Array(value :_*))
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type CreateCreatePropertiesIcons = NumberDictionary[String]
  
  /** The type of menu item. */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.checkbox
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.radio
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.separator
  */
  trait ItemType extends StObject
  object ItemType {
    
    @scala.inline
    def checkbox: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.checkbox = "checkbox".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.checkbox]
    
    @scala.inline
    def normal: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = "normal".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal]
    
    @scala.inline
    def radio: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.radio = "radio".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.radio]
    
    @scala.inline
    def separator: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.separator = "separator".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.separator]
  }
  
  /** Information sent when a context menu item is clicked. */
  @js.native
  trait OnClickData extends StObject {
    
    /** The id of the bookmark where the context menu was clicked, if it was on a bookmark. */
    var bookmarkId: String = js.native
    
    /** An integer value of button by which menu item was clicked. */
    var button: js.UndefOr[Double] = js.native
    
    /** A flag indicating the state of a checkbox or radio item after it is clicked. */
    var checked: js.UndefOr[Boolean] = js.native
    
    /** A flag indicating whether the element is editable (text input, textarea, etc.). */
    var editable: Boolean = js.native
    
    /** The id of the frame of the element where the context menu was clicked. */
    var frameId: js.UndefOr[Double] = js.native
    
    /** The URL of the frame of the element where the context menu was clicked, if it was in a frame. */
    var frameUrl: js.UndefOr[String] = js.native
    
    /** If the element is a link, the text of that link. */
    var linkText: js.UndefOr[String] = js.native
    
    /** If the element is a link, the URL it points to. */
    var linkUrl: js.UndefOr[String] = js.native
    
    /**
      * One of 'image', 'video', or 'audio' if the context menu was activated on one of these types of elements.
      */
    var mediaType: js.UndefOr[String] = js.native
    
    /** The ID of the menu item that was clicked. */
    var menuItemId: Double | String = js.native
    
    /** An array of keyboard modifiers that were held while the menu item was clicked. */
    var modifiers: js.Array[OnClickDataModifiers] = js.native
    
    /**
      * The URL of the page where the menu item was clicked. This property is not set if the click occured in a context where there is no current page, such as in a launcher context menu.
      */
    var pageUrl: js.UndefOr[String] = js.native
    
    /** The parent ID, if any, for the item clicked. */
    var parentMenuItemId: js.UndefOr[Double | String] = js.native
    
    /** The text for the context selection, if any. */
    var selectionText: js.UndefOr[String] = js.native
    
    /** Will be present for elements with a 'src' URL. */
    var srcUrl: js.UndefOr[String] = js.native
    
    /**
      * An identifier of the clicked element, if any. Use menus.getTargetElement in the page to find the corresponding element.
      */
    var targetElementId: js.UndefOr[Double] = js.native
    
    /** The type of view where the menu is clicked. May be unset if the menu is not associated with a view. */
    var viewType: js.UndefOr[ViewType] = js.native
    
    /** A flag indicating the state of a checkbox or radio item before it was clicked. */
    var wasChecked: js.UndefOr[Boolean] = js.native
  }
  object OnClickData {
    
    @scala.inline
    def apply(
      bookmarkId: String,
      editable: Boolean,
      menuItemId: Double | String,
      modifiers: js.Array[OnClickDataModifiers]
    ): OnClickData = {
      val __obj = js.Dynamic.literal(bookmarkId = bookmarkId.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], menuItemId = menuItemId.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnClickData]
    }
    
    @scala.inline
    implicit class OnClickDataMutableBuilder[Self <: OnClickData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBookmarkId(value: String): Self = StObject.set(x, "bookmarkId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
      
      @scala.inline
      def setFrameUrl(value: String): Self = StObject.set(x, "frameUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameUrlUndefined: Self = StObject.set(x, "frameUrl", js.undefined)
      
      @scala.inline
      def setLinkText(value: String): Self = StObject.set(x, "linkText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkTextUndefined: Self = StObject.set(x, "linkText", js.undefined)
      
      @scala.inline
      def setLinkUrl(value: String): Self = StObject.set(x, "linkUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUrlUndefined: Self = StObject.set(x, "linkUrl", js.undefined)
      
      @scala.inline
      def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      @scala.inline
      def setMenuItemId(value: Double | String): Self = StObject.set(x, "menuItemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiers(value: js.Array[OnClickDataModifiers]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersVarargs(value: OnClickDataModifiers*): Self = StObject.set(x, "modifiers", js.Array(value :_*))
      
      @scala.inline
      def setPageUrl(value: String): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
      
      @scala.inline
      def setParentMenuItemId(value: Double | String): Self = StObject.set(x, "parentMenuItemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentMenuItemIdUndefined: Self = StObject.set(x, "parentMenuItemId", js.undefined)
      
      @scala.inline
      def setSelectionText(value: String): Self = StObject.set(x, "selectionText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionTextUndefined: Self = StObject.set(x, "selectionText", js.undefined)
      
      @scala.inline
      def setSrcUrl(value: String): Self = StObject.set(x, "srcUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUrlUndefined: Self = StObject.set(x, "srcUrl", js.undefined)
      
      @scala.inline
      def setTargetElementId(value: Double): Self = StObject.set(x, "targetElementId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetElementIdUndefined: Self = StObject.set(x, "targetElementId", js.undefined)
      
      @scala.inline
      def setViewType(value: ViewType): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewTypeUndefined: Self = StObject.set(x, "viewType", js.undefined)
      
      @scala.inline
      def setWasChecked(value: Boolean): Self = StObject.set(x, "wasChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWasCheckedUndefined: Self = StObject.set(x, "wasChecked", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Shift
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Alt
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Command
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Ctrl
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.MacCtrl
  */
  trait OnClickDataModifiers extends StObject
  object OnClickDataModifiers {
    
    @scala.inline
    def Alt: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Alt = "Alt".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Alt]
    
    @scala.inline
    def Command: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Command = "Command".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Command]
    
    @scala.inline
    def Ctrl: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Ctrl = "Ctrl".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Ctrl]
    
    @scala.inline
    def MacCtrl: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.MacCtrl = "MacCtrl".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.MacCtrl]
    
    @scala.inline
    def Shift: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Shift = "Shift".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.Shift]
  }
  
  /**
    * Information about the context of the menu action and the created menu items. For more information about each property, see OnClickData. The following properties are only set if the extension has host permissions for the given context: linkUrl, linkText, srcUrl, pageUrl, frameUrl, selectionText.
    */
  @js.native
  trait OnShownInfo extends StObject {
    
    /** A list of all contexts that apply to the menu. */
    var contexts: js.Array[ContextType] = js.native
    
    var editable: Boolean = js.native
    
    var frameUrl: js.UndefOr[String] = js.native
    
    var linkText: js.UndefOr[String] = js.native
    
    var linkUrl: js.UndefOr[String] = js.native
    
    var mediaType: js.UndefOr[String] = js.native
    
    /** A list of IDs of the menu items that were shown. */
    var menuIds: Double | js.Array[String] = js.native
    
    var pageUrl: js.UndefOr[String] = js.native
    
    var selectionText: js.UndefOr[String] = js.native
    
    var srcUrl: js.UndefOr[String] = js.native
    
    var targetElementId: js.UndefOr[Double] = js.native
    
    var viewType: js.UndefOr[ViewType] = js.native
  }
  object OnShownInfo {
    
    @scala.inline
    def apply(contexts: js.Array[ContextType], editable: Boolean, menuIds: Double | js.Array[String]): OnShownInfo = {
      val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], menuIds = menuIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnShownInfo]
    }
    
    @scala.inline
    implicit class OnShownInfoMutableBuilder[Self <: OnShownInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContexts(value: js.Array[ContextType]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextsVarargs(value: ContextType*): Self = StObject.set(x, "contexts", js.Array(value :_*))
      
      @scala.inline
      def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameUrl(value: String): Self = StObject.set(x, "frameUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameUrlUndefined: Self = StObject.set(x, "frameUrl", js.undefined)
      
      @scala.inline
      def setLinkText(value: String): Self = StObject.set(x, "linkText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkTextUndefined: Self = StObject.set(x, "linkText", js.undefined)
      
      @scala.inline
      def setLinkUrl(value: String): Self = StObject.set(x, "linkUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUrlUndefined: Self = StObject.set(x, "linkUrl", js.undefined)
      
      @scala.inline
      def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      @scala.inline
      def setMenuIds(value: Double | js.Array[String]): Self = StObject.set(x, "menuIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuIdsVarargs(value: String*): Self = StObject.set(x, "menuIds", js.Array(value :_*))
      
      @scala.inline
      def setPageUrl(value: String): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
      
      @scala.inline
      def setSelectionText(value: String): Self = StObject.set(x, "selectionText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionTextUndefined: Self = StObject.set(x, "selectionText", js.undefined)
      
      @scala.inline
      def setSrcUrl(value: String): Self = StObject.set(x, "srcUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUrlUndefined: Self = StObject.set(x, "srcUrl", js.undefined)
      
      @scala.inline
      def setTargetElementId(value: Double): Self = StObject.set(x, "targetElementId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetElementIdUndefined: Self = StObject.set(x, "targetElementId", js.undefined)
      
      @scala.inline
      def setViewType(value: ViewType): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewTypeUndefined: Self = StObject.set(x, "viewType", js.undefined)
    }
  }
  
  @js.native
  trait OverrideContextContextOptions extends StObject {
    
    /** Required when context is 'bookmark'. Requires 'bookmark' permission. */
    var bookmarkId: js.UndefOr[String] = js.native
    
    /**
      * ContextType to override, to allow menu items from other extensions in the menu. Currently only 'bookmark' and 'tab' are supported. showDefaults cannot be used with this option.
      */
    var context: js.UndefOr[OverrideContextContextOptionsContext] = js.native
    
    /** Whether to also include default menu items in the menu. */
    var showDefaults: js.UndefOr[Boolean] = js.native
    
    /** Required when context is 'tab'. Requires 'tabs' permission. */
    var tabId: js.UndefOr[Double] = js.native
  }
  object OverrideContextContextOptions {
    
    @scala.inline
    def apply(): OverrideContextContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverrideContextContextOptions]
    }
    
    @scala.inline
    implicit class OverrideContextContextOptionsMutableBuilder[Self <: OverrideContextContextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBookmarkId(value: String): Self = StObject.set(x, "bookmarkId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBookmarkIdUndefined: Self = StObject.set(x, "bookmarkId", js.undefined)
      
      @scala.inline
      def setContext(value: OverrideContextContextOptionsContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setShowDefaults(value: Boolean): Self = StObject.set(x, "showDefaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDefaultsUndefined: Self = StObject.set(x, "showDefaults", js.undefined)
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    }
  }
  
  /**
    * ContextType to override, to allow menu items from other extensions in the menu. Currently only 'bookmark' and 'tab' are supported. showDefaults cannot be used with this option.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab
  */
  trait OverrideContextContextOptionsContext extends StObject
  object OverrideContextContextOptionsContext {
    
    @scala.inline
    def bookmark: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark = "bookmark".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark]
    
    @scala.inline
    def tab: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab = "tab".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab]
  }
  
  /** The properties to update. Accepts the same values as the create function. */
  @js.native
  trait UpdateUpdateProperties extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var contexts: js.UndefOr[js.Array[ContextType]] = js.native
    
    var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.native
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var icons: js.UndefOr[UpdateUpdatePropertiesIcons] = js.native
    
    /**
      * @param tab The details of the tab where the click took place. Note: this parameter only present for extensions.
      */
    var onclick: js.UndefOr[js.Function2[/* info */ OnClickData, /* tab */ Tab, Unit]] = js.native
    
    /** Note: You cannot change an item to be a child of one of its own descendants. */
    var parentId: js.UndefOr[Double | String] = js.native
    
    var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[ItemType] = js.native
    
    var viewTypes: js.UndefOr[js.Array[ViewType]] = js.native
    
    /** Whether the item is visible in the menu. */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object UpdateUpdateProperties {
    
    @scala.inline
    def apply(): UpdateUpdateProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateUpdateProperties]
    }
    
    @scala.inline
    implicit class UpdateUpdatePropertiesMutableBuilder[Self <: UpdateUpdateProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setContexts(value: js.Array[ContextType]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
      
      @scala.inline
      def setContextsVarargs(value: ContextType*): Self = StObject.set(x, "contexts", js.Array(value :_*))
      
      @scala.inline
      def setDocumentUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "documentUrlPatterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentUrlPatternsUndefined: Self = StObject.set(x, "documentUrlPatterns", js.undefined)
      
      @scala.inline
      def setDocumentUrlPatternsVarargs(value: String*): Self = StObject.set(x, "documentUrlPatterns", js.Array(value :_*))
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setIcons(value: UpdateUpdatePropertiesIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      @scala.inline
      def setOnclick(value: (/* info */ OnClickData, /* tab */ Tab) => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
      
      @scala.inline
      def setParentId(value: Double | String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setTargetUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "targetUrlPatterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUrlPatternsUndefined: Self = StObject.set(x, "targetUrlPatterns", js.undefined)
      
      @scala.inline
      def setTargetUrlPatternsVarargs(value: String*): Self = StObject.set(x, "targetUrlPatterns", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: ItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setViewTypes(value: js.Array[ViewType]): Self = StObject.set(x, "viewTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewTypesUndefined: Self = StObject.set(x, "viewTypes", js.undefined)
      
      @scala.inline
      def setViewTypesVarargs(value: ViewType*): Self = StObject.set(x, "viewTypes", js.Array(value :_*))
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type UpdateUpdatePropertiesIcons = NumberDictionary[String]
}
