package typings.dynatable.JQueryDynatable

import typings.dynatable.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsSearch extends StObject {
  
  /** Inject the search form at the target location */
  def attach(): Unit
  
  /**
    * Build the html markup for the search form
    *
    * @return The jQuery object for the search form
    */
  def create(): JQuery
  
  /** Call the `attach()` method */
  def init(): Unit
  
  /**
    * Check if the search feature is enabled in `settings.features`
    *
    * @return A boolean
    */
  def initOnLoad(): Boolean
}
object InputsSearch {
  
  inline def apply(attach: () => Unit, create: () => JQuery, init: () => Unit, initOnLoad: () => Boolean): InputsSearch = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction0(attach), create = js.Any.fromFunction0(create), init = js.Any.fromFunction0(init), initOnLoad = js.Any.fromFunction0(initOnLoad))
    __obj.asInstanceOf[InputsSearch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputsSearch] (val x: Self) extends AnyVal {
    
    inline def setAttach(value: () => Unit): Self = StObject.set(x, "attach", js.Any.fromFunction0(value))
    
    inline def setCreate(value: () => JQuery): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    
    inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    inline def setInitOnLoad(value: () => Boolean): Self = StObject.set(x, "initOnLoad", js.Any.fromFunction0(value))
  }
}
