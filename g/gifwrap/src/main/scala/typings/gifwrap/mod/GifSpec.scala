package typings.gifwrap.mod

import typings.gifwrap.gifwrapNumbers.`0`
import typings.gifwrap.gifwrapNumbers.`1`
import typings.gifwrap.gifwrapNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GifSpec extends js.Object {
  
  var colorScope: js.UndefOr[`0` | `1` | `2`] = js.native
  
  var loops: js.UndefOr[Double] = js.native
}
object GifSpec {
  
  @scala.inline
  def apply(): GifSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GifSpec]
  }
  
  @scala.inline
  implicit class GifSpecOps[Self <: GifSpec] (val x: Self) extends AnyVal {
    
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
    def setColorScope(value: `0` | `1` | `2`): Self = this.set("colorScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorScope: Self = this.set("colorScope", js.undefined)
    
    @scala.inline
    def setLoops(value: Double): Self = this.set("loops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoops: Self = this.set("loops", js.undefined)
  }
}
