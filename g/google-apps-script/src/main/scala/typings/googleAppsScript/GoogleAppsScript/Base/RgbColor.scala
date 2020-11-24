package typings.googleAppsScript.GoogleAppsScript.Base

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A color defined by red, green, blue color channels.
  */
@js.native
trait RgbColor extends js.Object {
  
  def asHexString(): String = js.native
  
  def getBlue(): Integer = js.native
  
  def getColorType(): ColorType = js.native
  
  def getGreen(): Integer = js.native
  
  def getRed(): Integer = js.native
}
object RgbColor {
  
  @scala.inline
  def apply(
    asHexString: () => String,
    getBlue: () => Integer,
    getColorType: () => ColorType,
    getGreen: () => Integer,
    getRed: () => Integer
  ): RgbColor = {
    val __obj = js.Dynamic.literal(asHexString = js.Any.fromFunction0(asHexString), getBlue = js.Any.fromFunction0(getBlue), getColorType = js.Any.fromFunction0(getColorType), getGreen = js.Any.fromFunction0(getGreen), getRed = js.Any.fromFunction0(getRed))
    __obj.asInstanceOf[RgbColor]
  }
  
  @scala.inline
  implicit class RgbColorOps[Self <: RgbColor] (val x: Self) extends AnyVal {
    
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
    def setAsHexString(value: () => String): Self = this.set("asHexString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBlue(value: () => Integer): Self = this.set("getBlue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetColorType(value: () => ColorType): Self = this.set("getColorType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGreen(value: () => Integer): Self = this.set("getGreen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRed(value: () => Integer): Self = this.set("getRed", js.Any.fromFunction0(value))
  }
}
