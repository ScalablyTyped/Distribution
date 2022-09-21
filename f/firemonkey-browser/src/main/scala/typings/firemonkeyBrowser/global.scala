package typings.firemonkeyBrowser

import typings.firemonkeyBrowser.GM.FetchRequest
import typings.firemonkeyBrowser.GM.FetchResponse
import typings.firemonkeyBrowser.GM.Value
import typings.firemonkeyBrowser.GM.XMLRequest
import typings.firemonkeyBrowser.anon.AddStyle
import typings.firemonkeyBrowser.anon.Browser
import typings.firemonkeyBrowser.anon.Image
import typings.firemonkeyBrowser.anon.Modal
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  //#region GM3 style APIs
  object GM {
    
    @JSGlobal("GM")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addElement(parentNode: String, tagName: String, attributes: js.Object): HTMLElement | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addElement")(parentNode.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Unit]
    /**
      * Appends and returns an element with the specified attributes
      * @example
      * // loading an external script
      * const elem = GM.addElement('script', {src: 'https://....'});
      * elem.onload = () => console.log(elem, 'loaded');
      * @example
      * // appending to shadowRoot
      * const elem = GM_addElement(parentElement.shadowRoot, 'iframe', {src: 'https://....'});
      * @example
      * // appending to DOM
      * const elem = GM_addElement(parentElement, 'a', {href: 'https://....', title: 'Some title', target: '_blank', textContent: 'Some text'});
      * @see {@link https://erosman.github.io/support/content/help.html#addElement}
      */
    inline def addElement(tagName: String, attributes: js.Object): HTMLElement | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addElement")(tagName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Unit]
    
    /**
      * Utility function to inject script element.
      * @example
      * const js = `function sum(x, y) {
      *   return x + y;
      * }`;
      * GM_addScript(js);
      * @example
      * function someFunc() {
      *   ...
      * }
      * GM.addScript('(' + someFunc + ')();');
      * @see {@link https://erosman.github.io/support/content/help.html#addScript}
      */
    inline def addScript(js_ : String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addScript")(js_.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Utility function to inject style element.
      * @example
      * const css = `body {
      *   border-top: 2px solid grey;
      * }`;
      * GM.addStyle(css);
      * @see {@link https://erosman.github.io/support/content/help.html#addStyle}
      */
    inline def addStyle(css: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addStyle")(css.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Script storage change listener that returns the key as listener ID
      * @see {@link https://erosman.github.io/support/content/help.html#addValueChangeListener}
      */
    inline def addValueChangeListener(
      key: String,
      callback: js.Function4[
          /* key */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[String], 
          /* newValue */ js.UndefOr[String], 
          /* remote */ js.UndefOr[Boolean], 
          Unit
        ]
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addValueChangeListener")(key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Deletes an existing name / value pair from storage.
      * @see {@link https://erosman.github.io/support/content/help.html#deleteValue}
      */
    inline def deleteValue(key: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteValue")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Simple file download from the Internet.
      * @see {@link https://erosman.github.io/support/content/help.html#download}
      */
    inline def download(url: String): js.Promise[js.UndefOr[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("download")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Double]]]
    inline def download(url: String, filename: String): js.Promise[js.UndefOr[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("download")(url.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Double]]]
    
    /**
      * An API is based on the {@link https://developer.mozilla.org/docs/Web/API/WindowOrWorkerGlobalScope/fetch JavaScript Fetch API}
      * which provides the new Promise based interface for fetching resources (including {@link https://developer.mozilla.org/en-US/docs/Web/Security/Same-origin_policy across the network}).
      * It will seem familiar to anyone who has used XMLHttpRequest, but it provides a more powerful and flexible feature set
      * @see {@link https://erosman.github.io/support/content/help.html#fetch}
      */
    inline def fetch(url: String): js.Promise[FetchResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FetchResponse]]
    inline def fetch(url: String, init: FetchRequest): js.Promise[FetchResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FetchResponse]]
    
    /**
      * Given a defined `@resource`, this method fetches and returns the content of the url
      * @see {@link https://erosman.github.io/support/content/help.html#getResourceText}
      */
    inline def getResourceText(resourceName: String): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getResourceText")(resourceName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
    
    /**
      * Given a defined `@resource`, this method returns it as a URL
      * @see {@link https://erosman.github.io/support/content/help.html#getResourceUrl}
      */
    inline def getResourceUrl(resourceName: String): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getResourceUrl")(resourceName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
    
    /**
      * Retrieves a value that was set with `GM.setValue`
      * @see {@link https://erosman.github.io/support/content/help.html#getValue}
      */
    inline def getValue(key: String): js.Promise[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Value]]
    inline def getValue[TValue](key: String, defaultValue: TValue): js.Promise[TValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TValue]]
    
    inline def getValue_TValue[TValue](key: String): js.Promise[TValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TValue]]
    
    /**
      * An object container info about the running script.
      * @see {@link https://erosman.github.io/support/content/help.html#info}
      */
    @JSGlobal("GM.info")
    @js.native
    def info: Browser = js.native
    inline def info_=(x: Browser): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    /**
      * Retrieves an array of preference names that this script has stored
      * @see {@link https://erosman.github.io/support/content/help.html#listValues}
      */
    inline def listValues(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listValues")().asInstanceOf[js.Promise[js.Array[String]]]
    
    /**
      * The API is added for convenience.
      * @see {@link https://erosman.github.io/support/content/help.html#log}
      */
    inline def log(data: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(data.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /**
      * Displays a notification to the user, using the underlying operating
      * system's notification mechanism
      * @see {@link https://erosman.github.io/support/content/help.html#notification}
      */
    inline def notification(text: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("notification")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def notification(text: Image): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("notification")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    /**
      * Opens the specified URL in a new tab.
      * @see {@link https://erosman.github.io/support/content/help.html#openInTab}
      */
    inline def openInTab(url: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("openInTab")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def openInTab(url: String, openInBackground: Boolean): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openInTab")(url.asInstanceOf[js.Any], openInBackground.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    /**
      * A utility to create popups on the webpage.
      * @see {@link https://erosman.github.io/support/content/help.html#popup}
      */
    inline def popup(): AddStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("popup")().asInstanceOf[AddStyle]
    inline def popup(options: Modal): AddStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("popup")(options.asInstanceOf[js.Any]).asInstanceOf[AddStyle]
    
    /**
      * Adds an item to the User Script Commands menu.
      * @example
      * // anonymous function
      * GM_registerMenuCommand('Hello, world (anon)', () => { alert('Hello, world! (anon)')});
      * @example
      * // named function
      * function sayHello() { alert('Hello, world! (named)')}
      * GM.registerMenuCommand('Hello, world (named)', sayHello);
      * @see {@link https://erosman.github.io/support/content/help.html#registerMenuCommand}
      */
    inline def registerMenuCommand(name: String, onClick: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerMenuCommand")(name.asInstanceOf[js.Any], onClick.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Remove storage change listener for key
      * @see {@link https://erosman.github.io/support/content/help.html#removeValueChangeListener}
      */
    inline def removeValueChangeListener(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeValueChangeListener")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Sets the current contents of the operating system's clipboard
      * @see {@link https://erosman.github.io/support/content/help.html#setClipboard}
      */
    inline def setClipboard(text: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setClipboard")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Allows user script authors to persist simple values across page loads and
      * across origins.
      * Strings, booleans, and integers are currently the only allowed data types.
      * @see {@link https://erosman.github.io/support/content/help.html#setValue}
      */
    inline def setValue(key: String, value: Value): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setValue")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * removes an item from the User Script Commands menu.
      * @see {@link https://erosman.github.io/support/content/help.html#unregisterMenuCommand}
      */
    inline def unregisterMenuCommand(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterMenuCommand")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Performs a similar function to the standard XMLHttpRequest object, but
      * allows these requests to cross the {@link https://developer.mozilla.org/en-US/docs/Web/Security/Same-origin_policy same origin policy} boundaries.
      * @see {@link https://erosman.github.io/support/content/help.html#xmlHttpRequest}
      */
    inline def xmlHttpRequest(init: XMLRequest[Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlHttpRequest")(init.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  }
  
  //#endregion
  //#region GM4 style APIs
  @JSGlobal("GM_addElement")
  @js.native
  def GMAddElement: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.addElement */ Any = js.native
  
  inline def GMAddElement_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.addElement */ Any
  ): Unit = js.Dynamic.global.updateDynamic("GM_addElement")(x.asInstanceOf[js.Any])
  
  @JSGlobal("GM_addScript")
  @js.native
  def GMAddScript: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.addScript */ Any = js.native
  
  inline def GMAddScript_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.addScript */ Any
  ): Unit = js.Dynamic.global.updateDynamic("GM_addScript")(x.asInstanceOf[js.Any])
  
  @JSGlobal("GM_addStyle")
  @js.native
  def GMAddStyle: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.addStyle */ Any = js.native
  
  inline def GMAddStyle_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.addStyle */ Any
  ): Unit = js.Dynamic.global.updateDynamic("GM_addStyle")(x.asInstanceOf[js.Any])
  
  @JSGlobal("GM_addValueChangeListener")
  @js.native
  def GMAddValueChangeListener: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.addValueChangeListener */ Any = js.native
  
  inline def GMAddValueChangeListener_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.addValueChangeListener */ Any
  ): Unit = js.Dynamic.global.updateDynamic("GM_addValueChangeListener")(x.asInstanceOf[js.Any])
  
  /**
    * Deletes an existing name / value pair from storage.
    * @see {@link https://erosman.github.io/support/content/help.html#deleteValue}
    */
  inline def GMDeleteValue(key: String): Unit = js.Dynamic.global.applyDynamic("GM_deleteValue")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSGlobal("GM_download")
  @js.native
  def GMDownload: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.download */ Any = js.native
  
  inline def GMDownload_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.download */ Any
  ): Unit = js.Dynamic.global.updateDynamic("GM_download")(x.asInstanceOf[js.Any])
  
  @JSGlobal("GM_fetch")
  @js.native
  def GMFetch: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.fetch */ Any = js.native
  
  inline def GMFetch_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.fetch */ Any
  ): Unit = js.Dynamic.global.updateDynamic("GM_fetch")(x.asInstanceOf[js.Any])
  
  /**
    * Given a defined `@resource`, this method fetches and returns the content of the url
    * @see {@link https://erosman.github.io/support/content/help.html#getResourceText}
    */
  inline def GMGetResourceText(resourceName: String): String | Unit = js.Dynamic.global.applyDynamic("GM_getResourceText")(resourceName.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
  
  /**
    * Given a defined `@resource`, this method returns it as a URL
    * @see {@link https://erosman.github.io/support/content/help.html#getResourceUrl}
    */
  inline def GMGetResourceUrl(resourceName: String): String | Unit = js.Dynamic.global.applyDynamic("GM_getResourceUrl")(resourceName.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
  
  /**
    * Retrieves a value that was set with `GM.setValue`
    * @see {@link https://erosman.github.io/support/content/help.html#getValue}
    */
  inline def GMGetValue(key: String): Value = js.Dynamic.global.applyDynamic("GM_getValue")(key.asInstanceOf[js.Any]).asInstanceOf[Value]
  inline def GMGetValue[TValue](key: String, defaultValue: TValue): TValue = (js.Dynamic.global.applyDynamic("GM_getValue")(key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[TValue]
  
  inline def GMGetValue_TValue_TValue[TValue](key: String): TValue = js.Dynamic.global.applyDynamic("GM_getValue")(key.asInstanceOf[js.Any]).asInstanceOf[TValue]
  
  @JSGlobal("GM_info")
  @js.native
  def GMInfo: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.info */ Any = js.native
  
  inline def GMInfo_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.info */ Any
  ): Unit = js.Dynamic.global.updateDynamic("GM_info")(x.asInstanceOf[js.Any])
  
  /**
    * Retrieves an array of preference names that this script has stored
    * @see {@link https://erosman.github.io/support/content/help.html#listValues}
    */
  inline def GMListValues(): js.Array[String] = js.Dynamic.global.applyDynamic("GM_listValues")().asInstanceOf[js.Array[String]]
  
  @JSGlobal("GM_log")
  @js.native
  def GMLog: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.log */ Any = js.native
  
  inline def GMLog_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.log */ Any
  ): Unit = js.Dynamic.global.updateDynamic("GM_log")(x.asInstanceOf[js.Any])
  
  @JSGlobal("GM_notification")
  @js.native
  def GMNotification: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.notification */ Any = js.native
  
  inline def GMNotification_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.notification */ Any
  ): Unit = js.Dynamic.global.updateDynamic("GM_notification")(x.asInstanceOf[js.Any])
  
  @JSGlobal("GM_openInTab")
  @js.native
  def GMOpenInTab: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.openInTab */ Any = js.native
  
  inline def GMOpenInTab_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.openInTab */ Any
  ): Unit = js.Dynamic.global.updateDynamic("GM_openInTab")(x.asInstanceOf[js.Any])
  
  @JSGlobal("GM_popup")
  @js.native
  def GMPopup: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.popup */ Any = js.native
  
  inline def GMPopup_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.popup */ Any
  ): Unit = js.Dynamic.global.updateDynamic("GM_popup")(x.asInstanceOf[js.Any])
  
  @JSGlobal("GM_registerMenuCommand")
  @js.native
  def GMRegisterMenuCommand: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.registerMenuCommand */ Any = js.native
  
  inline def GMRegisterMenuCommand_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.registerMenuCommand */ Any
  ): Unit = js.Dynamic.global.updateDynamic("GM_registerMenuCommand")(x.asInstanceOf[js.Any])
  
  @JSGlobal("GM_removeValueChangeListener")
  @js.native
  def GMRemoveValueChangeListener: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.removeValueChangeListener */ Any = js.native
  
  inline def GMRemoveValueChangeListener_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.removeValueChangeListener */ Any
  ): Unit = js.Dynamic.global.updateDynamic("GM_removeValueChangeListener")(x.asInstanceOf[js.Any])
  
  @JSGlobal("GM_setClipboard")
  @js.native
  def GMSetClipboard: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.setClipboard */ Any = js.native
  
  inline def GMSetClipboard_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.setClipboard */ Any
  ): Unit = js.Dynamic.global.updateDynamic("GM_setClipboard")(x.asInstanceOf[js.Any])
  
  /**
    * Allows user script authors to persist simple values across page loads and
    * across origins.
    * Strings, booleans, and integers are currently the only allowed data types.
    * @see {@link https://erosman.github.io/support/content/help.html#setValue}
    */
  inline def GMSetValue(key: String, value: Value): Unit = (js.Dynamic.global.applyDynamic("GM_setValue")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("GM_unregisterMenuCommand")
  @js.native
  def GMUnregisterMenuCommand: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.unregisterMenuCommand */ Any = js.native
  
  inline def GMUnregisterMenuCommand_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.unregisterMenuCommand */ Any
  ): Unit = js.Dynamic.global.updateDynamic("GM_unregisterMenuCommand")(x.asInstanceOf[js.Any])
  
  @JSGlobal("GM_xmlHttpRequest")
  @js.native
  def GMXmlHttpRequest: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.xmlHttpRequest */ Any = js.native
  
  inline def GMXmlHttpRequest_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof GM.xmlHttpRequest */ Any
  ): Unit = js.Dynamic.global.updateDynamic("GM_xmlHttpRequest")(x.asInstanceOf[js.Any])
  
  /**
    * Window object of the content page where the user script is running on.
    * @see {@link https://erosman.github.io/support/content/help.html#unsafeWindow}
    */
  @JSGlobal("unsafeWindow")
  @js.native
  def unsafeWindow: Window = js.native
  inline def unsafeWindow_=(x: Window): Unit = js.Dynamic.global.updateDynamic("unsafeWindow")(x.asInstanceOf[js.Any])
}
