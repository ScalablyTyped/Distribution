package typings.fingerprintjsFingerprintjs.anon

import typings.fingerprintjsFingerprintjs.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetData extends js.Object {
  
  def getData(done: js.Function1[/* value */ js.Any, Unit], options: Options): Unit = js.native
  
  var key: String = js.native
  
  var pauseBefore: js.UndefOr[Boolean] = js.native
}
object GetData {
  
  @scala.inline
  def apply(getData: (js.Function1[/* value */ js.Any, Unit], Options) => Unit, key: String): GetData = {
    val __obj = js.Dynamic.literal(getData = js.Any.fromFunction2(getData), key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetData]
  }
  
  @scala.inline
  implicit class GetDataOps[Self <: GetData] (val x: Self) extends AnyVal {
    
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
    def setGetData(value: (js.Function1[/* value */ js.Any, Unit], Options) => Unit): Self = this.set("getData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPauseBefore(value: Boolean): Self = this.set("pauseBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePauseBefore: Self = this.set("pauseBefore", js.undefined)
  }
}
