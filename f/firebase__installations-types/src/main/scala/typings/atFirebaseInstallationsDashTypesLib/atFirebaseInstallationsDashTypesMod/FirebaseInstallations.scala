package typings
package atFirebaseInstallationsDashTypesLib.atFirebaseInstallationsDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseInstallations extends js.Object {
  def delete(): js.Promise[scala.Unit]
  def getId(): js.Promise[java.lang.String]
  def getToken(): js.Promise[java.lang.String]
}

object FirebaseInstallations {
  @scala.inline
  def apply(
    delete: () => js.Promise[scala.Unit],
    getId: () => js.Promise[java.lang.String],
    getToken: () => js.Promise[java.lang.String]
  ): FirebaseInstallations = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), getId = js.Any.fromFunction0(getId), getToken = js.Any.fromFunction0(getToken))
  
    __obj.asInstanceOf[FirebaseInstallations]
  }
}

