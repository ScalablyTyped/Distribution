package typings.feflowCli.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _empty extends js.Object {
  
  @JSName("_")
  var _underscore: js.Array[Double | String] = js.native
}
object _empty {
  
  @scala.inline
  def apply(_underscore: js.Array[Double | String]): _empty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[_empty]
  }
  
  @scala.inline
  implicit class _emptyOps[Self <: _empty] (val x: Self) extends AnyVal {
    
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
    def set_underscoreVarargs(value: (Double | String)*): Self = this.set("_", js.Array(value :_*))
    
    @scala.inline
    def set_underscore(value: js.Array[Double | String]): Self = this.set("_", value.asInstanceOf[js.Any])
  }
}
