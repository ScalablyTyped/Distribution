package typings.firebaseAppTypes.privateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirebaseService extends js.Object {
  
  var INTERNAL: js.UndefOr[FirebaseServiceInternals] = js.native
  
  var app: typings.firebaseAppTypes.mod.FirebaseApp = js.native
}
object FirebaseService {
  
  @scala.inline
  def apply(app: typings.firebaseAppTypes.mod.FirebaseApp): FirebaseService = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseService]
  }
  
  @scala.inline
  implicit class FirebaseServiceOps[Self <: FirebaseService] (val x: Self) extends AnyVal {
    
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
    def setApp(value: typings.firebaseAppTypes.mod.FirebaseApp): Self = this.set("app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINTERNAL(value: FirebaseServiceInternals): Self = this.set("INTERNAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteINTERNAL: Self = this.set("INTERNAL", js.undefined)
  }
}
