package typings
package durandalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DurandalViewLocatorModule extends js.Object {
  /**
       * Converts a module id into a view id. By default the ids are the same.
       * @param {string} moduleId The module id.
       * @returns {string} The view id.
      */
  def convertModuleIdToViewId(moduleId: java.lang.String): java.lang.String = js.native
  /**
       * If no view id can be determined, this function is called to genreate one. By default it attempts to determine the object's type and use that.
       * @param {object} obj The object to determine the fallback id for.
       * @returns {string} The view id.
      */
  def determineFallbackViewId(obj: js.Any): java.lang.String = js.native
  /**
       * Locates the specified view.
       * @param {string|DOMElement} viewUrlOrId A view url or view id to locate.
       * @param {string} [area] The area to translate the view to.
       * @param {DOMElement[]} [elementsToSearch] An existing set of elements to search first.
       * @returns {Promise} A promise of the view.
      */
  def locateView(viewUrlOrId: java.lang.String): DurandalPromise[stdLib.HTMLElement] = js.native
  /**
       * Locates the specified view.
       * @param {string|DOMElement} viewUrlOrId A view url or view id to locate.
       * @param {string} [area] The area to translate the view to.
       * @param {DOMElement[]} [elementsToSearch] An existing set of elements to search first.
       * @returns {Promise} A promise of the view.
      */
  def locateView(viewUrlOrId: java.lang.String, area: java.lang.String): DurandalPromise[stdLib.HTMLElement] = js.native
  /**
       * Locates the specified view.
       * @param {string|DOMElement} viewUrlOrId A view url or view id to locate.
       * @param {string} [area] The area to translate the view to.
       * @param {DOMElement[]} [elementsToSearch] An existing set of elements to search first.
       * @returns {Promise} A promise of the view.
      */
  def locateView(
    viewUrlOrId: java.lang.String,
    area: java.lang.String,
    elementsToSearch: js.Array[stdLib.HTMLElement]
  ): DurandalPromise[stdLib.HTMLElement] = js.native
  /**
       * Locates the specified view.
       * @param {string|DOMElement} view A view. It will be immediately returned.
       * @param {string} [area] The area to translate the view to.
       * @param {DOMElement[]} [elementsToSearch] An existing set of elements to search first.
       * @returns {Promise} A promise of the view.
      */
  def locateView(view: stdLib.HTMLElement): DurandalPromise[stdLib.HTMLElement] = js.native
  /**
       * Locates the specified view.
       * @param {string|DOMElement} view A view. It will be immediately returned.
       * @param {string} [area] The area to translate the view to.
       * @param {DOMElement[]} [elementsToSearch] An existing set of elements to search first.
       * @returns {Promise} A promise of the view.
      */
  def locateView(view: stdLib.HTMLElement, area: java.lang.String): DurandalPromise[stdLib.HTMLElement] = js.native
  /**
       * Locates the specified view.
       * @param {string|DOMElement} view A view. It will be immediately returned.
       * @param {string} [area] The area to translate the view to.
       * @param {DOMElement[]} [elementsToSearch] An existing set of elements to search first.
       * @returns {Promise} A promise of the view.
      */
  def locateView(view: stdLib.HTMLElement, area: java.lang.String, elementsToSearch: js.Array[stdLib.HTMLElement]): DurandalPromise[stdLib.HTMLElement] = js.native
  /**
       * Maps an object instance to a view instance.
       * @param {object} obj The object to locate the view for.
       * @param {string} [area] The area to translate the view to.
       * @param {DOMElement[]} [elementsToSearch] An existing set of elements to search first.
       * @returns {Promise} A promise of the view.
      */
  def locateViewForObject(obj: js.Any, area: java.lang.String): DurandalPromise[stdLib.HTMLElement] = js.native
  /**
       * Maps an object instance to a view instance.
       * @param {object} obj The object to locate the view for.
       * @param {string} [area] The area to translate the view to.
       * @param {DOMElement[]} [elementsToSearch] An existing set of elements to search first.
       * @returns {Promise} A promise of the view.
      */
  def locateViewForObject(obj: js.Any, area: java.lang.String, elementsToSearch: js.Array[stdLib.HTMLElement]): DurandalPromise[stdLib.HTMLElement] = js.native
  /**
       * Takes a view id and translates it into a particular area. By default, no translation occurs.
       * @param {string} viewId The view id.
       * @param {string} area The area to translate the view to.
       * @returns {string} The translated view id.
      */
  def translateViewIdToArea(viewId: java.lang.String, area: java.lang.String): java.lang.String = js.native
  /**
       * Allows you to set up a convention for mapping module folders to view folders. It is a convenience method that customizes `convertModuleIdToViewId` and `translateViewIdToArea` under the covers.
       * @param {string} [modulesPath] A string to match in the path and replace with the viewsPath. If not specified, the match is 'viewmodels'.
       * @param {string} [viewsPath] The replacement for the modulesPath. If not specified, the replacement is 'views'.
       * @param {string} [areasPath] Partial views are mapped to the "views" folder if not specified. Use this parameter to change their location.
      */
  def useConvention(): scala.Unit = js.native
  /**
       * Allows you to set up a convention for mapping module folders to view folders. It is a convenience method that customizes `convertModuleIdToViewId` and `translateViewIdToArea` under the covers.
       * @param {string} [modulesPath] A string to match in the path and replace with the viewsPath. If not specified, the match is 'viewmodels'.
       * @param {string} [viewsPath] The replacement for the modulesPath. If not specified, the replacement is 'views'.
       * @param {string} [areasPath] Partial views are mapped to the "views" folder if not specified. Use this parameter to change their location.
      */
  def useConvention(modulesPath: java.lang.String): scala.Unit = js.native
  /**
       * Allows you to set up a convention for mapping module folders to view folders. It is a convenience method that customizes `convertModuleIdToViewId` and `translateViewIdToArea` under the covers.
       * @param {string} [modulesPath] A string to match in the path and replace with the viewsPath. If not specified, the match is 'viewmodels'.
       * @param {string} [viewsPath] The replacement for the modulesPath. If not specified, the replacement is 'views'.
       * @param {string} [areasPath] Partial views are mapped to the "views" folder if not specified. Use this parameter to change their location.
      */
  def useConvention(modulesPath: java.lang.String, viewsPath: java.lang.String): scala.Unit = js.native
  /**
       * Allows you to set up a convention for mapping module folders to view folders. It is a convenience method that customizes `convertModuleIdToViewId` and `translateViewIdToArea` under the covers.
       * @param {string} [modulesPath] A string to match in the path and replace with the viewsPath. If not specified, the match is 'viewmodels'.
       * @param {string} [viewsPath] The replacement for the modulesPath. If not specified, the replacement is 'views'.
       * @param {string} [areasPath] Partial views are mapped to the "views" folder if not specified. Use this parameter to change their location.
      */
  def useConvention(modulesPath: java.lang.String, viewsPath: java.lang.String, areasPath: java.lang.String): scala.Unit = js.native
}

