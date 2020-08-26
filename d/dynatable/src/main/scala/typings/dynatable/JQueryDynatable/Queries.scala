package typings.dynatable.JQueryDynatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queries extends js.Object {
  /** functions object for Queries */
  var functions: QueriesFunctions = js.native
  /**
    * Add a new condition in the queries
    *
    * @param name The key for for the query
    * @param value The value we wish to find
    * @return A reference to the related Dynatable object
    */
  def add(name: String, value: js.Any): Dynatable = js.native
  /** Set up the initial search parameters */
  def init(): Unit = js.native
  /**
    * Check if search feature is enabled
    *
    * @return A boolean if search feature is enabled
    */
  def initOnLoad(): Boolean = js.native
  /**
    * Remove the query from the dataset
    *
    * @param name The key for for the query to be removed
    * @return A reference to the related Dynatable object
    */
  def remove(name: String): Dynatable = js.native
  /**  Run a search with all the saved queries */
  def run(): js.Any = js.native
  /**
    * Shortcut for performing simple query from built-in search
    *
    * @param q The value that will be searched for
    */
  def runSearch(q: js.Any): Unit = js.native
  /** Set up the input fields for creating queries */
  def setupInputs(): Unit = js.native
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
  @scala.inline
  implicit class QueriesOps[Self <: Queries] (val x: Self) extends AnyVal {
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
    def setAdd(value: (String, js.Any) => Dynatable): Self = this.set("add", js.Any.fromFunction2(value))
    @scala.inline
    def setFunctions(value: QueriesFunctions): Self = this.set("functions", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    @scala.inline
    def setInitOnLoad(value: () => Boolean): Self = this.set("initOnLoad", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove(value: String => Dynatable): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setRun(value: () => js.Any): Self = this.set("run", js.Any.fromFunction0(value))
    @scala.inline
    def setRunSearch(value: js.Any => Unit): Self = this.set("runSearch", js.Any.fromFunction1(value))
    @scala.inline
    def setSetupInputs(value: () => Unit): Self = this.set("setupInputs", js.Any.fromFunction0(value))
  }
  
}

