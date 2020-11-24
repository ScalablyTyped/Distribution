package typings.extjs.Ext.draw

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColor extends IBase {
  
  /** [Method] Get the blue component of the color in the range 0 255
    * @returns Number
    */
  var getBlue: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Return a new color that is darker than this color
    * @param factor Number Darker factor (0..1), default to 0.2
    * @returns Object Ext.draw.Color
    */
  var getDarker: js.UndefOr[js.Function1[/* factor */ js.UndefOr[Double], _]] = js.native
  
  /** [Method] Returns the gray value 0 to 255 of the color
    * @returns Number
    */
  var getGrayscale: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Get the green component of the color in the range 0 255
    * @returns Number
    */
  var getGreen: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Get the equivalent HSL components of the color
    * @returns Number[]
    */
  var getHSL: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Return a new color that is lighter than this color
    * @param factor Number Lighter factor (0..1), default to 0.2
    * @returns Object Ext.draw.Color
    */
  var getLighter: js.UndefOr[js.Function1[/* factor */ js.UndefOr[Double], _]] = js.native
  
  /** [Method] Get the RGB values
    * @returns Number[]
    */
  var getRGB: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Get the red component of the color in the range 0 255
    * @returns Number
    */
  var getRed: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Config Option] (Number) */
  var lightnessFactor: js.UndefOr[Double] = js.native
  
  /** [Method] Return the color in the hex format i e
    * @returns String
    */
  @JSName("toString")
  var toString_FIColor: js.UndefOr[js.Function0[String]] = js.native
}
object IColor {
  
  @scala.inline
  def apply(): IColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColor]
  }
  
  @scala.inline
  implicit class IColorOps[Self <: IColor] (val x: Self) extends AnyVal {
    
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
    def setGetBlue(value: () => Double): Self = this.set("getBlue", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetBlue: Self = this.set("getBlue", js.undefined)
    
    @scala.inline
    def setGetDarker(value: /* factor */ js.UndefOr[Double] => _): Self = this.set("getDarker", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetDarker: Self = this.set("getDarker", js.undefined)
    
    @scala.inline
    def setGetGrayscale(value: () => Double): Self = this.set("getGrayscale", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetGrayscale: Self = this.set("getGrayscale", js.undefined)
    
    @scala.inline
    def setGetGreen(value: () => Double): Self = this.set("getGreen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetGreen: Self = this.set("getGreen", js.undefined)
    
    @scala.inline
    def setGetHSL(value: () => Array): Self = this.set("getHSL", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetHSL: Self = this.set("getHSL", js.undefined)
    
    @scala.inline
    def setGetLighter(value: /* factor */ js.UndefOr[Double] => _): Self = this.set("getLighter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetLighter: Self = this.set("getLighter", js.undefined)
    
    @scala.inline
    def setGetRGB(value: () => Array): Self = this.set("getRGB", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRGB: Self = this.set("getRGB", js.undefined)
    
    @scala.inline
    def setGetRed(value: () => Double): Self = this.set("getRed", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRed: Self = this.set("getRed", js.undefined)
    
    @scala.inline
    def setLightnessFactor(value: Double): Self = this.set("lightnessFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightnessFactor: Self = this.set("lightnessFactor", js.undefined)
    
    @scala.inline
    def setToString(value: () => String): Self = this.set("toString", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteToString: Self = this.set("toString", js.undefined)
  }
}
