package typings
package dvtngDashJssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSS extends js.Object {
  /**
    * Retrieve all rules added via JSS, organized by selectors
    */
  def get(): Selectors = js.native
  /**
    * Retrieve rules added via JSS for a given selector
    * @param s CSS selector
    */
  def get(s: java.lang.String): Properties = js.native
  /**
    * Retrieve all rules specified for a given selector (not necessarily added via JSS)
    * @param s CSS selector
    */
  def getAll(s: java.lang.String): Properties = js.native
  /**
    * Remove all rules added via JSS
    */
  def remove(): scala.Unit = js.native
  /**
    * Remove all rules added via JSS for the given selector
    */
  def remove(s: java.lang.String): scala.Unit = js.native
  /**
    * Add or extend an existing rule
    * @param s CSS selector
    * @param p CSS properties
    */
  def set(s: java.lang.String, p: Properties): scala.Unit = js.native
}

