package typings.fsExtra.anon

import typings.fsExtra.fsExtraBooleans.`false`
import typings.fsExtra.fsExtraStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncodingWithFileTypes extends js.Object {
  
  var encoding: buffer = js.native
  
  var withFileTypes: js.UndefOr[`false`] = js.native
}
object EncodingWithFileTypes {
  
  @scala.inline
  def apply(encoding: buffer): EncodingWithFileTypes = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingWithFileTypes]
  }
  
  @scala.inline
  implicit class EncodingWithFileTypesOps[Self <: EncodingWithFileTypes] (val x: Self) extends AnyVal {
    
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
    def setEncoding(value: buffer): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithFileTypes(value: `false`): Self = this.set("withFileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithFileTypes: Self = this.set("withFileTypes", js.undefined)
  }
}
