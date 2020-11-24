package typings.ethereumCryptography.hdkeyCryptoMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hash extends js.Object {
  
  var buffers: js.Any = js.native
  
  def digest(param: js.Any): Buffer = js.native
  
  val hashFunction: js.Any = js.native
  
  def update(buffer: Buffer): this.type = js.native
}
object Hash {
  
  @scala.inline
  def apply(buffers: js.Any, digest: js.Any => Buffer, hashFunction: js.Any, update: Buffer => Hash): Hash = {
    val __obj = js.Dynamic.literal(buffers = buffers.asInstanceOf[js.Any], digest = js.Any.fromFunction1(digest), hashFunction = hashFunction.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Hash]
  }
  
  @scala.inline
  implicit class HashOps[Self <: Hash] (val x: Self) extends AnyVal {
    
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
    def setBuffers(value: js.Any): Self = this.set("buffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigest(value: js.Any => Buffer): Self = this.set("digest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHashFunction(value: js.Any): Self = this.set("hashFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: Buffer => Hash): Self = this.set("update", js.Any.fromFunction1(value))
  }
}
