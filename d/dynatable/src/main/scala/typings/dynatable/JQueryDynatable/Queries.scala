package typings.dynatable.JQueryDynatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Queries extends js.Object {
  /** functions object for Queries */
  var functions: QueriesFunctions
  /**
    * Add a new condition in the queries
    *
    * @param name The key for for the query
    * @param value The value we wish to find
    * @return A reference to the related Dynatable object
    */
  def add(name: String, value: js.Any): Dynatable
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
  def run(): js.Any
  /**
    * Shortcut for performing simple query from built-in search
    *
    * @param q The value that will be searched for
    */
  def runSearch(q: js.Any): Unit
  /** Set up the input fields for creating queries */
  def setupInputs(): Unit
}

object Queries {
  @scala.inline
  def apply(
    add: (String, js.Any) => Dynatable,
    functions: QueriesFunctions,
    init: () => Unit,
    initOnLoad: () => Boolean,
    remove: String => Dynatable,
    run: () => js.Any,
    runSearch: js.Any => Unit,
    setupInputs: () => Unit
  ): Queries = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), functions = functions.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initOnLoad = js.Any.fromFunction0(initOnLoad), remove = js.Any.fromFunction1(remove), run = js.Any.fromFunction0(run), runSearch = js.Any.fromFunction1(runSearch), setupInputs = js.Any.fromFunction0(setupInputs))
  
    __obj.asInstanceOf[Queries]
  }
}

