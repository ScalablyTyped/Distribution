package typings.firebaseAppTypes.privateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirebaseApp
  extends typings.firebaseAppTypes.mod.FirebaseApp {
  
  def _addComponent(
    component: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component */ js.Any
  ): Unit = js.native
  
  def _addOrOverwriteComponent(
    component: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component */ js.Any
  ): Unit = js.native
  
  def _removeServiceInstance(name: String): Unit = js.native
  def _removeServiceInstance(name: String, instanceIdentifier: String): Unit = js.native
  
  var container: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentContainer */ js.Any = js.native
}
