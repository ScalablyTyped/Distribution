package typings.dwt.webTwainIOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base64Result extends js.Object {
  
  /**
    * Return part of the string.
    * @param offset The starting position.
    * @param length The length of the expected string.
    */
  def getData(offset: Double, length: Double): String = js.native
  
  /**
    * Return the length of the result string.
    */
  def getLength(): Double = js.native
  
  /**
    * Return the MD5 value of the result.
    */
  def getMD5(): String = js.native
}
object Base64Result {
  
  @scala.inline
  def apply(getData: (Double, Double) => String, getLength: () => Double, getMD5: () => String): Base64Result = {
    val __obj = js.Dynamic.literal(getData = js.Any.fromFunction2(getData), getLength = js.Any.fromFunction0(getLength), getMD5 = js.Any.fromFunction0(getMD5))
    __obj.asInstanceOf[Base64Result]
  }
  
  @scala.inline
  implicit class Base64ResultOps[Self <: Base64Result] (val x: Self) extends AnyVal {
    
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
    def setGetData(value: (Double, Double) => String): Self = this.set("getData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetLength(value: () => Double): Self = this.set("getLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMD5(value: () => String): Self = this.set("getMD5", js.Any.fromFunction0(value))
  }
}
