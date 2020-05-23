package typings.googleAppsScriptOauth2.GoogleAppsScriptOAuth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Storage extends js.Object {
  /**
    * Gets a stored value.
    * If optSkipMemoryCheck, bypass the local memory cache when fetching the token.
    */
  def getValue(key: String): js.Any = js.native
  def getValue(key: String, optSkipMemoryCheck: Boolean): js.Any = js.native
  /**
    * Removes a stored value.
    */
  def removeValue(key: String): Unit = js.native
  /**
    * Resets the storage, removing all stored data.
    */
  def reset(): Unit = js.native
  /**
    * Stores value.
    */
  def setValue(key: String, value: js.Any): Unit = js.native
}

