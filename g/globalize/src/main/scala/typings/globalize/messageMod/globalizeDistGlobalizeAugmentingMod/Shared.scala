package typings.globalize.messageMod.globalizeDistGlobalizeAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shared extends js.Object {
  /**
  		 * Formats a message (using ICU message format pattern) given its path and a set of variables into a user-readable string
  		 * @param path String or Array containing the path of the message content, eg. "greetings/bye", or [ "greetings", "bye" ].
  		 * @param variables Variables can be Objects, where each property can be referenced by name inside a message; or Arrays, where each entry of the Array can be used inside a message, using numeric indices. When passing one or more arguments of other types, they're converted to an Array and used as such.
  		 * @returns {string} Return a user-readable string.
  		 */
  def formatMessage(path: String): String = js.native
  def formatMessage(path: String, variables: String): String = js.native
  def formatMessage(path: String, variables: js.Array[String]): String = js.native
  def formatMessage(path: String, variables: js.Object): String = js.native
  def formatMessage(path: js.Array[String]): String = js.native
  def formatMessage(path: js.Array[String], variables: String): String = js.native
  def formatMessage(path: js.Array[String], variables: js.Array[String]): String = js.native
  def formatMessage(path: js.Array[String], variables: js.Object): String = js.native
  /**
  		 * Return a function that formats a message (using ICU message format pattern) given its path and a set of variables into a user-readable string. It supports pluralization and gender inflections.
  		 * @param path String or Array containing the path of the message content, eg. "greetings/bye", or [ "greetings", "bye" ].
  		 * @returns {Function} Return A function that formats a message (using ICU message format pattern) given its path and a set of variables into a user-readable string. It supports pluralization and gender inflections.
  		 */
  def messageFormatter(path: String): js.Function1[/* variables */ js.UndefOr[String | js.Array[String] | js.Object], String] = js.native
  def messageFormatter(path: js.Array[String]): js.Function1[/* variables */ js.UndefOr[String | js.Array[String] | js.Object], String] = js.native
}

