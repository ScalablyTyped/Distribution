package typings.extjs.Ext.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPoint
  extends StObject
     with IRegion {
  
  /** [Method] Compare this point and another point
    * @param p Ext.util.Point/Object The point to compare with, either an instance of Ext.util.Point or an object with left and top properties
    * @returns Boolean Returns whether they are equivalent
    */
  @JSName("equals")
  var equals_FIPoint: js.UndefOr[js.Function1[/* p */ js.UndefOr[Any], Boolean]] = js.undefined
  
  /** [Method] Determins whether this Point contained by the passed Region Component or element
    * @param region Ext.util.Region/Ext.Component/Ext.dom.Element/HTMLElement The rectangle to check that this Point is within.
    * @returns Boolean
    */
  var isContainedBy: js.UndefOr[js.Function1[/* region */ js.UndefOr[Any], Boolean]] = js.undefined
  
  /** [Method] Whether the given point is not away from this point within the given threshold amount
    * @param p Ext.util.Point/Object The point to check with, either an instance of Ext.util.Point or an object with left and top properties
    * @param threshold Object/Number Can be either an object with x and y properties or a number
    * @returns Boolean
    */
  var isWithin: js.UndefOr[js.Function2[/* p */ js.UndefOr[Any], /* threshold */ js.UndefOr[Any], Boolean]] = js.undefined
  
  /** [Method] Compare this point with another point when the x and y values of both points are rounded
    * @param p Ext.util.Point/Object The point to compare with, either an instance of Ext.util.Point or an object with x and y properties
    * @returns Boolean
    */
  var roundedEquals: js.UndefOr[js.Function1[/* p */ js.UndefOr[Any], Boolean]] = js.undefined
  
  /** [Method] Returns a human eye friendly string that represents this point useful for debugging
    * @returns String
    */
  @JSName("toString")
  var toString_FIPoint: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Alias for translateBy
    * @param x Ext.util.Offset/Object Object containing the x and y properties. Or the x value is using the two argument form.
    * @param y Number The y value unless using an Offset object.
    * @returns Ext.util.Region this This Region
    */
  var translate: js.UndefOr[js.Function2[/* x */ js.UndefOr[Any], /* y */ js.UndefOr[Double], IRegion]] = js.undefined
}
object IPoint {
  
  inline def apply(): IPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPoint] (val x: Self) extends AnyVal {
    
    inline def setEquals_(value: /* p */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    inline def setIsContainedBy(value: /* region */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "isContainedBy", js.Any.fromFunction1(value))
    
    inline def setIsContainedByUndefined: Self = StObject.set(x, "isContainedBy", js.undefined)
    
    inline def setIsWithin(value: (/* p */ js.UndefOr[Any], /* threshold */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "isWithin", js.Any.fromFunction2(value))
    
    inline def setIsWithinUndefined: Self = StObject.set(x, "isWithin", js.undefined)
    
    inline def setRoundedEquals(value: /* p */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "roundedEquals", js.Any.fromFunction1(value))
    
    inline def setRoundedEqualsUndefined: Self = StObject.set(x, "roundedEquals", js.undefined)
    
    inline def setToString_(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
    
    inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
    
    inline def setTranslate(value: (/* x */ js.UndefOr[Any], /* y */ js.UndefOr[Double]) => IRegion): Self = StObject.set(x, "translate", js.Any.fromFunction2(value))
    
    inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
  }
}
