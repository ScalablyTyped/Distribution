package typings
package durandalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurandalViewEngineModule extends js.Object {
  /**
    * The file extension that view source files are expected to have.
    * @default .html
    */
  var viewExtension: java.lang.String
  /**
    * The name of the RequireJS loader plugin used by the viewLocator to obtain the view source. (Use requirejs to map the plugin's full path).
    * @default text
    */
  var viewPlugin: java.lang.String
  /**
    * Parameters passed to the RequireJS loader plugin used by the viewLocator to obtain the view source.
    * @default The empty string by default.
    */
  var viewPluginParameters: java.lang.String
  /**
    * Converts a view id into a full RequireJS path.
    * @param {string} viewId The view id to convert.
    * @returns {string} The require path.
    */
  def convertViewIdToRequirePath(viewId: java.lang.String): java.lang.String
  /**
    * Converts a view url into a view id.
    * @param {string} url The url to convert.
    * @returns {string} The view id.
    */
  def convertViewUrlToViewId(url: java.lang.String): java.lang.String
  /**
    * Called when a view cannot be found to provide the opportunity to locate or generate a fallback view. Mainly used to ease development.
    * @param {string} viewId The view id whose view should be created.
    * @param {string} requirePath The require path that was attempted.
    * @param {Error} requirePath The error that was returned from the attempt to locate the default view.
    * @returns {Promise} A promise for the fallback view.
    */
  def createFallbackView(viewId: java.lang.String, requirePath: java.lang.String, err: stdLib.Error): DurandalPromise[stdLib.HTMLElement]
  /**
    * Creates the view associated with the view id.
    * @param {string} viewId The view id whose view should be created.
    * @returns {DurandalPromise<HTMLElement>} A promise of the view.
    */
  def createView(viewId: java.lang.String): DurandalPromise[stdLib.HTMLElement]
  /**
    * Converts an array of elements into a single element. White space and comments are removed. If a single element does not remain, then the elements are wrapped.
    * @param {HTMLElement[]} allElements The elements.
    * @returns {HTMLElement} A single element.
    */
  def ensureSingleElement(allElements: js.Array[stdLib.Node]): stdLib.HTMLElement
  /**
    * Determines if the url is a url for a view, according to the view engine.
    * @param {string} url The potential view url.
    * @returns {boolean} True if the url is a view url, false otherwise.
    */
  def isViewUrl(url: java.lang.String): scala.Boolean
  /**
    * Parses the view engine recognized markup and returns DOM elements.
    * @param {string} markup The markup to parse.
    * @returns {HTMLElement[]} The elements.
    */
  def parseMarkup(markup: java.lang.String): js.Array[stdLib.Node]
  /**
    * Calls `parseMarkup` and then pipes the results through `ensureSingleElement`.
    * @param {string} markup The markup to process.
    * @returns {HTMLElement} The view.
    */
  def processMarkup(markup: java.lang.String): stdLib.HTMLElement
  /**
    * Puts the view associated with the id into the cache of parsed views.
    * @param {string} id The view id whose view should be cached.
    * @param {DOMElement} view The view to cache.
    */
  def putViewInCache(id: java.lang.String, view: stdLib.HTMLElement): scala.Unit
  /**
    * Gets the view associated with the id from the cache of parsed views.
    * @param {string} id The view id to lookup in the cache.
    * @return {DOMElement|null} The cached view or null if it's not in the cache.
    */
  def tryGetViewFromCache(id: java.lang.String): stdLib.HTMLElement
}

object DurandalViewEngineModule {
  @scala.inline
  def apply(
    convertViewIdToRequirePath: java.lang.String => java.lang.String,
    convertViewUrlToViewId: java.lang.String => java.lang.String,
    createFallbackView: (java.lang.String, java.lang.String, stdLib.Error) => DurandalPromise[stdLib.HTMLElement],
    createView: java.lang.String => DurandalPromise[stdLib.HTMLElement],
    ensureSingleElement: js.Array[stdLib.Node] => stdLib.HTMLElement,
    isViewUrl: java.lang.String => scala.Boolean,
    parseMarkup: java.lang.String => js.Array[stdLib.Node],
    processMarkup: java.lang.String => stdLib.HTMLElement,
    putViewInCache: (java.lang.String, stdLib.HTMLElement) => scala.Unit,
    tryGetViewFromCache: java.lang.String => stdLib.HTMLElement,
    viewExtension: java.lang.String,
    viewPlugin: java.lang.String,
    viewPluginParameters: java.lang.String
  ): DurandalViewEngineModule = {
    val __obj = js.Dynamic.literal(convertViewIdToRequirePath = js.Any.fromFunction1(convertViewIdToRequirePath), convertViewUrlToViewId = js.Any.fromFunction1(convertViewUrlToViewId), createFallbackView = js.Any.fromFunction3(createFallbackView), createView = js.Any.fromFunction1(createView), ensureSingleElement = js.Any.fromFunction1(ensureSingleElement), isViewUrl = js.Any.fromFunction1(isViewUrl), parseMarkup = js.Any.fromFunction1(parseMarkup), processMarkup = js.Any.fromFunction1(processMarkup), putViewInCache = js.Any.fromFunction2(putViewInCache), tryGetViewFromCache = js.Any.fromFunction1(tryGetViewFromCache), viewExtension = viewExtension, viewPlugin = viewPlugin, viewPluginParameters = viewPluginParameters)
  
    __obj.asInstanceOf[DurandalViewEngineModule]
  }
}

