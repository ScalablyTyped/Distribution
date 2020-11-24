package typings.firefoxWebextBrowser.browser.urlbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A result of a query. Queries can have many results. Each result is created by a provider. */
@js.native
trait Result extends js.Object {
  
  /** An object with arbitrary properties depending on the result's type. */
  var payload: js.Object = js.native
  
  /** The result's source. */
  var source: SourceType = js.native
  
  /** Suggest a preferred position for this result within the result set. */
  var suggestedIndex: js.UndefOr[Double] = js.native
  
  /** The result's type. */
  var `type`: ResultType = js.native
}
object Result {
  
  @scala.inline
  def apply(payload: js.Object, source: SourceType, `type`: ResultType): Result = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    
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
    def setPayload(value: js.Object): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: SourceType): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ResultType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedIndex(value: Double): Self = this.set("suggestedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedIndex: Self = this.set("suggestedIndex", js.undefined)
  }
}
