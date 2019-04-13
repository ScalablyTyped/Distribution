package typings
package globalizeLib.distGlobalizeMessageMod.distGlobalizeMod

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
  def formatMessage(path: java.lang.String): java.lang.String = js.native
  def formatMessage(path: java.lang.String, variables: java.lang.String): java.lang.String = js.native
  def formatMessage(path: java.lang.String, variables: js.Array[java.lang.String]): java.lang.String = js.native
  def formatMessage(path: java.lang.String, variables: js.Object): java.lang.String = js.native
  def formatMessage(path: js.Array[java.lang.String]): java.lang.String = js.native
  def formatMessage(path: js.Array[java.lang.String], variables: java.lang.String): java.lang.String = js.native
  def formatMessage(path: js.Array[java.lang.String], variables: js.Array[java.lang.String]): java.lang.String = js.native
  def formatMessage(path: js.Array[java.lang.String], variables: js.Object): java.lang.String = js.native
  /**
  		 * Return a function that formats a message (using ICU message format pattern) given its path and a set of variables into a user-readable string. It supports pluralization and gender inflections.
  		 * @param path String or Array containing the path of the message content, eg. "greetings/bye", or [ "greetings", "bye" ].
  		 * @returns {Function} Return A function that formats a message (using ICU message format pattern) given its path and a set of variables into a user-readable string. It supports pluralization and gender inflections.
  		 */
  def messageFormatter(path: java.lang.String): js.Function1[
    /* variables */ js.UndefOr[java.lang.String | js.Array[java.lang.String] | js.Object], 
    java.lang.String
  ] = js.native
  def messageFormatter(path: js.Array[java.lang.String]): js.Function1[
    /* variables */ js.UndefOr[java.lang.String | js.Array[java.lang.String] | js.Object], 
    java.lang.String
  ] = js.native
}

