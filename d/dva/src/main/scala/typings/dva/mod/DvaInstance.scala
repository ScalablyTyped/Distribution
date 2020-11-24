package typings.dva.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DvaInstance extends js.Object {
  
  /**
    * Register a model.
    *
    * @param model
    */
  def model(model: Model): Unit = js.native
  
  /**
    * Config router. Takes a function with arguments { history, dispatch },
    * and expects router config. It use the same api as react-router,
    * return jsx elements or JavaScript Object for dynamic routing.
    *
    * @param router
    */
  def router(router: Router): Unit = js.native
  
  /**
    * Start the application. Selector is optional. If no selector
    * arguments, it will return a function that return JSX elements.
    *
    * @param selector
    */
  def start(): js.Any = js.native
  def start(selector: String): js.Any = js.native
  def start(selector: HTMLElement): js.Any = js.native
  
  /**
    * Unregister a model.
    *
    * @param namespace
    */
  def unmodel(namespace: String): Unit = js.native
  
  /**
    * Register an object of hooks on the application.
    *
    * @param hooks
    */
  def use(hooks: Hooks): Unit = js.native
}
