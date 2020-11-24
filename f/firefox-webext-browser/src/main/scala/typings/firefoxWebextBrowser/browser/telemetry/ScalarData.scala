package typings.firefoxWebextBrowser.browser.telemetry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents registration data for a Telemetry scalar. */
@js.native
trait ScalarData extends js.Object {
  
  /**
    * True if this scalar entry is expired. This allows recording it without error, but it will be discarded.
    */
  var expired: js.UndefOr[Boolean] = js.native
  
  /** True if this is a keyed scalar. */
  var keyed: js.UndefOr[Boolean] = js.native
  
  var kind: ScalarType = js.native
  
  /** True if this data should be recorded on release. */
  var record_on_release: js.UndefOr[Boolean] = js.native
}
object ScalarData {
  
  @scala.inline
  def apply(kind: ScalarType): ScalarData = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalarData]
  }
  
  @scala.inline
  implicit class ScalarDataOps[Self <: ScalarData] (val x: Self) extends AnyVal {
    
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
    def setKind(value: ScalarType): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpired(value: Boolean): Self = this.set("expired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpired: Self = this.set("expired", js.undefined)
    
    @scala.inline
    def setKeyed(value: Boolean): Self = this.set("keyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyed: Self = this.set("keyed", js.undefined)
    
    @scala.inline
    def setRecord_on_release(value: Boolean): Self = this.set("record_on_release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecord_on_release: Self = this.set("record_on_release", js.undefined)
  }
}
