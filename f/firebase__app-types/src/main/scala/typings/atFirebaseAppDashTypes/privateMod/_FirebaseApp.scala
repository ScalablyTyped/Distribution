package typings.atFirebaseAppDashTypes.privateMod

import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _FirebaseApp extends FirebaseApp {
  var container: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentContainer */ js.Any = js.native
  def _addComponent(
    component: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component */ js.Any
  ): Unit = js.native
  def _addOrOverwriteComponent(
    component: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component */ js.Any
  ): Unit = js.native
  def _removeServiceInstance(name: String): Unit = js.native
  def _removeServiceInstance(name: String, instanceIdentifier: String): Unit = js.native
}

