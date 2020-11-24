package typings.firebase.mod.firebase.firestore

import typings.firebase.firebaseStrings.estimate
import typings.firebase.firebaseStrings.none
import typings.firebase.firebaseStrings.previous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotOptions extends js.Object {
  
  /**
    * If set, controls the return value for server timestamps that have not yet
    * been set to their final value.
    *
    * By specifying 'estimate', pending server timestamps return an estimate
    * based on the local clock. This estimate will differ from the final value
    * and cause these values to change once the server result becomes available.
    *
    * By specifying 'previous', pending timestamps will be ignored and return
    * their previous value instead.
    *
    * If omitted or set to 'none', `null` will be returned by default until the
    * server value becomes available.
    */
  val serverTimestamps: js.UndefOr[estimate | previous | none] = js.native
}
object SnapshotOptions {
  
  @scala.inline
  def apply(): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotOptions]
  }
  
  @scala.inline
  implicit class SnapshotOptionsOps[Self <: SnapshotOptions] (val x: Self) extends AnyVal {
    
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
    def setServerTimestamps(value: estimate | previous | none): Self = this.set("serverTimestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerTimestamps: Self = this.set("serverTimestamps", js.undefined)
  }
}
