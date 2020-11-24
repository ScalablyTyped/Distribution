package typings.fluentFfmpeg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioVideoFilter extends js.Object {
  
  var filter: String = js.native
  
  var options: String | js.Array[String] | js.Object = js.native
}
object AudioVideoFilter {
  
  @scala.inline
  def apply(filter: String, options: String | js.Array[String] | js.Object): AudioVideoFilter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioVideoFilter]
  }
  
  @scala.inline
  implicit class AudioVideoFilterOps[Self <: AudioVideoFilter] (val x: Self) extends AnyVal {
    
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
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: String*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: String | js.Array[String] | js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
