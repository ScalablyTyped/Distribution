package typings.dynatable.JQueryDynatable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Queries extends StObject {
  
  /**
    * Add a new condition in the queries
    *
    * @param name The key for for the query
    * @param value The value we wish to find
    * @return A reference to the related Dynatable object
    */
  def add(name: String, value: Any): Dynatable
  
  /** functions object for Queries */
  var functions: QueriesFunctions
  
  /** Set up the initial search parameters */
  def init(): Unit
  
  /**
    * Check if search feature is enabled
    *
    * @return A boolean if search feature is enabled
    */
  def initOnLoad(): Boolean
  
  /**
    * Remove the query from the dataset
    *
    * @param name The key for for the query to be removed
    * @return A reference to the related Dynatable object
    */
  def remove(name: String): Dynatable
  
  /**  Run a search with all the saved queries */
  def run(): Any
  
  /**
    * Shortcut for performing simple query from built-in search
    *
    * @param q The value that will be searched for
    */
  def runSearch(q: Any): Unit
  
  /** Set up the input fields for creating queries */
  def setupInputs(): Unit
}
object Queries {
  
  inline def apply(
    add: (String, Any) => Dynatable,
    functions: QueriesFunctions,
    init: () => Unit,
    initOnLoad: () => Boolean,
    remove: String => Dynatable,
    run: () => Any,
    runSearch: Any => Unit,
    setupInputs: () => Unit
  ): Queries = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), functions = functions.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initOnLoad = js.Any.fromFunction0(initOnLoad), remove = js.Any.fromFunction1(remove), run = js.Any.fromFunction0(run), runSearch = js.Any.fromFunction1(runSearch), setupInputs = js.Any.fromFunction0(setupInputs))
    __obj.asInstanceOf[Queries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Queries] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: (String, Any) => Dynatable): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setFunctions(value: QueriesFunctions): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    inline def setInitOnLoad(value: () => Boolean): Self = StObject.set(x, "initOnLoad", js.Any.fromFunction0(value))
    
    inline def setRemove(value: String => Dynatable): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setRun(value: () => Any): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
    
    inline def setRunSearch(value: Any => Unit): Self = StObject.set(x, "runSearch", js.Any.fromFunction1(value))
    
    inline def setSetupInputs(value: () => Unit): Self = StObject.set(x, "setupInputs", js.Any.fromFunction0(value))
  }
}
