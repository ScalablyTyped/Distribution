package typings
package firebaseDashClientLib.firebaseDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseClient
  extends /**
	 * Creates a new FirebaseClient given the provided configuration
	 */
org.scalablytyped.runtime.Instantiable1[/* config */ FirebaseConfig, FirebaseClient] {
  /**
  	 * Deletes the resource at a given path
  	 * @param path Relative path from the base for the resource
  	 */
  def delete(path: java.lang.String): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  /**
  	 * Retrieves all objects at the base path
  	 */
  def get[T](): qLib.qMod.QNs.Promise[T] = js.native
  /**
  	 * Retrieves an object
  	 * @param path Relative path from the base for the resource
  	 */
  def get[T](path: java.lang.String): qLib.qMod.QNs.Promise[T] = js.native
  /**
  	 * @param path Relative path from the base for the resource
  	 * @param value Object to push to the path
  	 */
  def push[T](path: java.lang.String, value: T): qLib.qMod.QNs.Promise[PushResponse] = js.native
  /**
  	 * Returns a promise of the HTTP response from setting the value at the given path
  	 * @param path Relative path from the base for the resource
  	 * @param data Data to be set as the value for the given path
  	 */
  def set[T](path: java.lang.String, data: T): qLib.qMod.QNs.Promise[T] = js.native
  /**
  	 * Update a node at a given path
  	 * @param path Relative path from the base for the resource
  	 * @param value Value of the response
  	 */
  def update[T](path: java.lang.String, value: T): qLib.qMod.QNs.Promise[T] = js.native
}

