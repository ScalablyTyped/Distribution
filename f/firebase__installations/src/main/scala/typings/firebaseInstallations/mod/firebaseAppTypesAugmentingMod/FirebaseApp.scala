package typings.firebaseInstallations.mod.firebaseAppTypesAugmentingMod

import typings.firebaseInstallationsTypes.mod.FirebaseInstallations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirebaseApp extends js.Object {
  
  def installations(): FirebaseInstallations = js.native
}
object FirebaseApp {
  
  @scala.inline
  def apply(installations: () => FirebaseInstallations): FirebaseApp = {
    val __obj = js.Dynamic.literal(installations = js.Any.fromFunction0(installations))
    __obj.asInstanceOf[FirebaseApp]
  }
  
  @scala.inline
  implicit class FirebaseAppOps[Self <: FirebaseApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInstallations(value: () => FirebaseInstallations): Self = this.set("installations", js.Any.fromFunction0(value))
  }
}
