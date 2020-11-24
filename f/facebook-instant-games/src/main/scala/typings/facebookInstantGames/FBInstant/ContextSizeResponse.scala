package typings.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The answer field is true if the current context size is between the minSize and maxSize values that are specified in the object, and false otherwise.
  */
@js.native
trait ContextSizeResponse extends js.Object {
  
  var answer: Boolean = js.native
  
  var maxSize: js.UndefOr[Double] = js.native
  
  var minSize: js.UndefOr[Double] = js.native
}
object ContextSizeResponse {
  
  @scala.inline
  def apply(answer: Boolean): ContextSizeResponse = {
    val __obj = js.Dynamic.literal(answer = answer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextSizeResponse]
  }
  
  @scala.inline
  implicit class ContextSizeResponseOps[Self <: ContextSizeResponse] (val x: Self) extends AnyVal {
    
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
    def setAnswer(value: Boolean): Self = this.set("answer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
  }
}
