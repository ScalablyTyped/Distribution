package typings.durandal

import typings.std.Error
import typings.std.HTMLElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DurandalViewEngineModule extends js.Object {
  /**
    * The file extension that view source files are expected to have.
    * @default .html
    */
  var viewExtension: String = js.native
  /**
    * The name of the RequireJS loader plugin used by the viewLocator to obtain the view source. (Use requirejs to map the plugin's full path).
    * @default text
    */
  var viewPlugin: String = js.native
  /**
    * Parameters passed to the RequireJS loader plugin used by the viewLocator to obtain the view source.
    * @default The empty string by default.
    */
  var viewPluginParameters: String = js.native
  /**
    * Converts a view id into a full RequireJS path.
    * @param {string} viewId The view id to convert.
    * @returns {string} The require path.
    */
  def convertViewIdToRequirePath(viewId: String): String = js.native
  /**
    * Converts a view url into a view id.
    * @param {string} url The url to convert.
    * @returns {string} The view id.
    */
  def convertViewUrlToViewId(url: String): String = js.native
  /**
    * Called when a view cannot be found to provide the opportunity to locate or generate a fallback view. Mainly used to ease development.
    * @param {string} viewId The view id whose view should be created.
    * @param {string} requirePath The require path that was attempted.
    * @param {Error} requirePath The error that was returned from the attempt to locate the default view.
    * @returns {Promise} A promise for the fallback view.
    */
  def createFallbackView(viewId: String, requirePath: String, err: Error): DurandalPromise[HTMLElement] = js.native
  /**
    * Creates the view associated with the view id.
    * @param {string} viewId The view id whose view should be created.
    * @returns {DurandalPromise<HTMLElement>} A promise of the view.
    */
  def createView(viewId: String): DurandalPromise[HTMLElement] = js.native
  /**
    * Converts an array of elements into a single element. White space and comments are removed. If a single element does not remain, then the elements are wrapped.
    * @param {HTMLElement[]} allElements The elements.
    * @returns {HTMLElement} A single element.
    */
  def ensureSingleElement(allElements: js.Array[Node]): HTMLElement = js.native
  /**
    * Determines if the url is a url for a view, according to the view engine.
    * @param {string} url The potential view url.
    * @returns {boolean} True if the url is a view url, false otherwise.
    */
  def isViewUrl(url: String): Boolean = js.native
  /**
    * Parses the view engine recognized markup and returns DOM elements.
    * @param {string} markup The markup to parse.
    * @returns {HTMLElement[]} The elements.
    */
  def parseMarkup(markup: String): js.Array[Node] = js.native
  /**
    * Calls `parseMarkup` and then pipes the results through `ensureSingleElement`.
    * @param {string} markup The markup to process.
    * @returns {HTMLElement} The view.
    */
  def processMarkup(markup: String): HTMLElement = js.native
  /**
    * Puts the view associated with the id into the cache of parsed views.
    * @param {string} id The view id whose view should be cached.
    * @param {DOMElement} view The view to cache.
    */
  def putViewInCache(id: String, view: HTMLElement): Unit = js.native
  /**
    * Gets the view associated with the id from the cache of parsed views.
    * @param {string} id The view id to lookup in the cache.
    * @return {DOMElement|null} The cached view or null if it's not in the cache.
    */
  def tryGetViewFromCache(id: String): HTMLElement = js.native
}

object DurandalViewEngineModule {
  @scala.inline
  def apply(
    convertViewIdToRequirePath: String => String,
    convertViewUrlToViewId: String => String,
    createFallbackView: (String, String, Error) => DurandalPromise[HTMLElement],
    createView: String => DurandalPromise[HTMLElement],
    ensureSingleElement: js.Array[Node] => HTMLElement,
    isViewUrl: String => Boolean,
    parseMarkup: String => js.Array[Node],
    processMarkup: String => HTMLElement,
    putViewInCache: (String, HTMLElement) => Unit,
    tryGetViewFromCache: String => HTMLElement,
    viewExtension: String,
    viewPlugin: String,
    viewPluginParameters: String
  ): DurandalViewEngineModule = {
    val __obj = js.Dynamic.literal(convertViewIdToRequirePath = js.Any.fromFunction1(convertViewIdToRequirePath), convertViewUrlToViewId = js.Any.fromFunction1(convertViewUrlToViewId), createFallbackView = js.Any.fromFunction3(createFallbackView), createView = js.Any.fromFunction1(createView), ensureSingleElement = js.Any.fromFunction1(ensureSingleElement), isViewUrl = js.Any.fromFunction1(isViewUrl), parseMarkup = js.Any.fromFunction1(parseMarkup), processMarkup = js.Any.fromFunction1(processMarkup), putViewInCache = js.Any.fromFunction2(putViewInCache), tryGetViewFromCache = js.Any.fromFunction1(tryGetViewFromCache), viewExtension = viewExtension.asInstanceOf[js.Any], viewPlugin = viewPlugin.asInstanceOf[js.Any], viewPluginParameters = viewPluginParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurandalViewEngineModule]
  }
  @scala.inline
  implicit class DurandalViewEngineModuleOps[Self <: DurandalViewEngineModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConvertViewIdToRequirePath(value: String => String): Self = this.set("convertViewIdToRequirePath", js.Any.fromFunction1(value))
    @scala.inline
    def setConvertViewUrlToViewId(value: String => String): Self = this.set("convertViewUrlToViewId", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateFallbackView(value: (String, String, Error) => DurandalPromise[HTMLElement]): Self = this.set("createFallbackView", js.Any.fromFunction3(value))
    @scala.inline
    def setCreateView(value: String => DurandalPromise[HTMLElement]): Self = this.set("createView", js.Any.fromFunction1(value))
    @scala.inline
    def setEnsureSingleElement(value: js.Array[Node] => HTMLElement): Self = this.set("ensureSingleElement", js.Any.fromFunction1(value))
    @scala.inline
    def setIsViewUrl(value: String => Boolean): Self = this.set("isViewUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setParseMarkup(value: String => js.Array[Node]): Self = this.set("parseMarkup", js.Any.fromFunction1(value))
    @scala.inline
    def setProcessMarkup(value: String => HTMLElement): Self = this.set("processMarkup", js.Any.fromFunction1(value))
    @scala.inline
    def setPutViewInCache(value: (String, HTMLElement) => Unit): Self = this.set("putViewInCache", js.Any.fromFunction2(value))
    @scala.inline
    def setTryGetViewFromCache(value: String => HTMLElement): Self = this.set("tryGetViewFromCache", js.Any.fromFunction1(value))
    @scala.inline
    def setViewExtension(value: String): Self = this.set("viewExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewPlugin(value: String): Self = this.set("viewPlugin", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewPluginParameters(value: String): Self = this.set("viewPluginParameters", value.asInstanceOf[js.Any])
  }
  
}

