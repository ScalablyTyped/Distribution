package typings.dynatable.JQueryDynatable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sorts extends StObject {
  
  /**
    * Add a new sort in sortKeys
    *
    * @param attr The key for for the sorting
    * @param direction The sorting direction (-1 or +1)
    * @return A reference to the related Dynatable object
    */
  def add(attr: String, direction: Double): Dynatable
  
  /** Remove all the sortKeys */
  def clear(): Unit
  
  /** functions object for Sorts */
  var functions: SortsFunctions
  
  /**
    * Try to intelligently guess which sort function to use based on the type of attribute values.
    *
    * @param a The first record
    * @param b The second record
    * @param attr The key of the property
    * @return A string containing one of the types ('string' or 'number')
    */
  def guessType(a: js.Any, b: js.Any, attr: String): String
  
  /** Create and init the sorts */
  def init(): Unit
  
  /**
    * Check if sort feature is enabled
    *
    * @return A boolean if sort feature is enabled
    */
  def initOnLoad(): Boolean
  
  /**
    * Remove a sort attribute from the sortKeys
    *
    * @param attr The key to be removed from the sorting
    * @return A reference to the related Dynatable object
    */
  def remove(attr: String): Dynatable
}
object Sorts {
  
  inline def apply(
    add: (String, Double) => Dynatable,
    clear: () => Unit,
    functions: SortsFunctions,
    guessType: (js.Any, js.Any, String) => String,
    init: () => Unit,
    initOnLoad: () => Boolean,
    remove: String => Dynatable
  ): Sorts = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), functions = functions.asInstanceOf[js.Any], guessType = js.Any.fromFunction3(guessType), init = js.Any.fromFunction0(init), initOnLoad = js.Any.fromFunction0(initOnLoad), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[Sorts]
  }
  
  extension [Self <: Sorts](x: Self) {
    
    inline def setAdd(value: (String, Double) => Dynatable): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setFunctions(value: SortsFunctions): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    inline def setGuessType(value: (js.Any, js.Any, String) => String): Self = StObject.set(x, "guessType", js.Any.fromFunction3(value))
    
    inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    inline def setInitOnLoad(value: () => Boolean): Self = StObject.set(x, "initOnLoad", js.Any.fromFunction0(value))
    
    inline def setRemove(value: String => Dynatable): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
