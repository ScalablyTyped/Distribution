package typings
package firebaseLib.firebaseMod.installationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Installations extends js.Object {
  /**
    * Deletes the Firebase Installation and all associated data.
    */
  def delete(): js.Promise[scala.Unit]
  /**
    * Creates a Firebase Installation if there isn't one for the app and
    * returns the Installation ID.
    *
    * @return Firebase Installation ID
    */
  def getId(): js.Promise[java.lang.String]
  /**
    * Returns an Authentication Token for the current Firebase Installation.
    *
    * @return Firebase Installation Authentication Token
    */
  def getToken(): js.Promise[java.lang.String]
}

object Installations {
  @scala.inline
  def apply(
    delete: () => js.Promise[scala.Unit],
    getId: () => js.Promise[java.lang.String],
    getToken: () => js.Promise[java.lang.String]
  ): Installations = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), getId = js.Any.fromFunction0(getId), getToken = js.Any.fromFunction0(getToken))
  
    __obj.asInstanceOf[Installations]
  }
}

