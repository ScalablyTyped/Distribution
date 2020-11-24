package typings.firebasePerformance.mod.firebaseAppTypesAugmentingMod

import typings.firebasePerformanceTypes.mod.FirebasePerformance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirebaseNamespace extends js.Object {
  
  var performance: js.UndefOr[js.Function1[/* app */ js.UndefOr[FirebaseApp], FirebasePerformance]] = js.native
}
object FirebaseNamespace {
  
  @scala.inline
  def apply(): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirebaseNamespace]
  }
  
  @scala.inline
  implicit class FirebaseNamespaceOps[Self <: FirebaseNamespace] (val x: Self) extends AnyVal {
    
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
    def setPerformance(value: /* app */ js.UndefOr[FirebaseApp] => FirebasePerformance): Self = this.set("performance", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePerformance: Self = this.set("performance", js.undefined)
  }
}
