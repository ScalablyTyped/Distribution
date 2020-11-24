package typings.firebase.mod.firebase.firestore

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Blob extends js.Object {
  
  /**
    * Returns true if this `Blob` is equal to the provided one.
    *
    * @param other The `Blob` to compare against.
    * @return true if this `Blob` is equal to the provided one.
    */
  def isEqual(other: Blob): Boolean = js.native
  
  /**
    * Returns the bytes of a Blob as a Base64-encoded string.
    *
    * @return
    *   The Base64-encoded string created from the Blob object.
    */
  def toBase64(): String = js.native
  
  /**
    * Returns the bytes of a Blob in a new Uint8Array.
    *
    * @return
    *   The Uint8Array created from the Blob object.
    */
  def toUint8Array(): Uint8Array = js.native
}
object Blob {
  
  @scala.inline
  def apply(isEqual: Blob => Boolean, toBase64: () => String, toUint8Array: () => Uint8Array): Blob = {
    val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction1(isEqual), toBase64 = js.Any.fromFunction0(toBase64), toUint8Array = js.Any.fromFunction0(toUint8Array))
    __obj.asInstanceOf[Blob]
  }
  
  @scala.inline
  implicit class BlobOps[Self <: Blob] (val x: Self) extends AnyVal {
    
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
    def setIsEqual(value: Blob => Boolean): Self = this.set("isEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToBase64(value: () => String): Self = this.set("toBase64", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToUint8Array(value: () => Uint8Array): Self = this.set("toUint8Array", js.Any.fromFunction0(value))
  }
}
