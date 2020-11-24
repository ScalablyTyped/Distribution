package typings.electronPublish.mod

import typings.builderUtilRuntime.mod.CancellationToken
import typings.electronPublish.multiProgressMod.MultiProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishContext extends js.Object {
  
  val cancellationToken: CancellationToken = js.native
  
  val progress: MultiProgress | Null = js.native
}
object PublishContext {
  
  @scala.inline
  def apply(cancellationToken: CancellationToken): PublishContext = {
    val __obj = js.Dynamic.literal(cancellationToken = cancellationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishContext]
  }
  
  @scala.inline
  implicit class PublishContextOps[Self <: PublishContext] (val x: Self) extends AnyVal {
    
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
    def setCancellationToken(value: CancellationToken): Self = this.set("cancellationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: MultiProgress): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressNull: Self = this.set("progress", null)
  }
}
