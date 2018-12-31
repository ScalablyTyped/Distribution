package typings
package dynatableLib.JQueryDynatableNs

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
  def add(name: java.lang.String, value: js.Any): Dynatable
  /** Set up the initial search parameters */
  def init(): scala.Unit
  /**
    * Check if search feature is enabled
    *
    * @return A boolean if search feature is enabled
    */
  def initOnLoad(): scala.Boolean
  /**
    * Remove the query from the dataset
    *
    * @param name The key for for the query to be removed
    * @return A reference to the related Dynatable object
    */
  def remove(name: java.lang.String): Dynatable
  /**  Run a search with all the saved queries */
  def run(): js.Any
  /**
    * Shortcut for performing simple query from built-in search
    *
    * @param q The value that will be searched for
    */
  def runSearch(q: js.Any): scala.Unit
  /** Set up the input fields for creating queries */
  def setupInputs(): scala.Unit
}

