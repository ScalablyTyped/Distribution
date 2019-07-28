package typings.firebase.firebaseMod.installationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Installations extends js.Object {
  /**
    * Deletes the Firebase Installation and all associated data.
    */
  def delete(): js.Promise[Unit]
  /**
    * Creates a Firebase Installation if there isn't one for the app and
    * returns the Installation ID.
    *
    * @return Firebase Installation ID
    */
  def getId(): js.Promise[String]
  /**
    * Returns an Authentication Token for the current Firebase Installation.
    *
    * @return Firebase Installation Authentication Token
    */
  def getToken(): js.Promise[String]
}

object Installations {
  @scala.inline
  def apply(
    delete: () => js.Promise[Unit],
    getId: () => js.Promise[String],
    getToken: () => js.Promise[String]
  ): Installations = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), getId = js.Any.fromFunction0(getId), getToken = js.Any.fromFunction0(getToken))
  
    __obj.asInstanceOf[Installations]
  }
}

