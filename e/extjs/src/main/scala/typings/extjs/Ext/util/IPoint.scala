package typings.extjs.Ext.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPoint extends IRegion {
  
  /** [Method] Compare this point and another point
    * @param p Ext.util.Point/Object The point to compare with, either an instance of Ext.util.Point or an object with left and top properties
    * @returns Boolean Returns whether they are equivalent
    */
  @JSName("equals")
  var equals_FIPoint: js.UndefOr[js.Function1[/* p */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Method] Determins whether this Point contained by the passed Region Component or element
    * @param region Ext.util.Region/Ext.Component/Ext.dom.Element/HTMLElement The rectangle to check that this Point is within.
    * @returns Boolean
    */
  var isContainedBy: js.UndefOr[js.Function1[/* region */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Method] Whether the given point is not away from this point within the given threshold amount
    * @param p Ext.util.Point/Object The point to check with, either an instance of Ext.util.Point or an object with left and top properties
    * @param threshold Object/Number Can be either an object with x and y properties or a number
    * @returns Boolean
    */
  var isWithin: js.UndefOr[
    js.Function2[/* p */ js.UndefOr[js.Any], /* threshold */ js.UndefOr[js.Any], Boolean]
  ] = js.native
  
  /** [Method] Compare this point with another point when the x and y values of both points are rounded
    * @param p Ext.util.Point/Object The point to compare with, either an instance of Ext.util.Point or an object with x and y properties
    * @returns Boolean
    */
  var roundedEquals: js.UndefOr[js.Function1[/* p */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Method] Returns a human eye friendly string that represents this point useful for debugging
    * @returns String
    */
  @JSName("toString")
  var toString_FIPoint: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Alias for translateBy
    * @param x Ext.util.Offset/Object Object containing the x and y properties. Or the x value is using the two argument form.
    * @param y Number The y value unless using an Offset object.
    * @returns Ext.util.Region this This Region
    */
  var translate: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double], IRegion]] = js.native
}
object IPoint {
  
  @scala.inline
  def apply(): IPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPoint]
  }
  
  @scala.inline
  implicit class IPointOps[Self <: IPoint] (val x: Self) extends AnyVal {
    
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
    def setEquals(value: /* p */ js.UndefOr[js.Any] => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEquals: Self = this.set("equals", js.undefined)
    
    @scala.inline
    def setIsContainedBy(value: /* region */ js.UndefOr[js.Any] => Boolean): Self = this.set("isContainedBy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsContainedBy: Self = this.set("isContainedBy", js.undefined)
    
    @scala.inline
    def setIsWithin(value: (/* p */ js.UndefOr[js.Any], /* threshold */ js.UndefOr[js.Any]) => Boolean): Self = this.set("isWithin", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteIsWithin: Self = this.set("isWithin", js.undefined)
    
    @scala.inline
    def setRoundedEquals(value: /* p */ js.UndefOr[js.Any] => Boolean): Self = this.set("roundedEquals", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRoundedEquals: Self = this.set("roundedEquals", js.undefined)
    
    @scala.inline
    def setToString(value: () => String): Self = this.set("toString", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteToString: Self = this.set("toString", js.undefined)
    
    @scala.inline
    def setTranslate(value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double]) => IRegion): Self = this.set("translate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
  }
}
