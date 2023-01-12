package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRegion
  extends StObject
     with IBase {
  
  /** [Method] Modifies the current region to be adjusted by offsets
    * @param top Number top offset
    * @param right Number right offset
    * @param bottom Number bottom offset
    * @param left Number left offset
    * @returns Ext.util.Region this
    */
  var adjust: js.UndefOr[
    js.Function4[
      /* top */ js.UndefOr[Double], 
      /* right */ js.UndefOr[Double], 
      /* bottom */ js.UndefOr[Double], 
      /* left */ js.UndefOr[Double], 
      this.type
    ]
  ] = js.undefined
  
  /** [Method] Modifies the current region to be constrained to the targetRegion
    * @param targetRegion Ext.util.Region
    * @returns Ext.util.Region this
    */
  var constrainTo: js.UndefOr[js.Function1[/* targetRegion */ js.UndefOr[this.type], this.type]] = js.undefined
  
  /** [Method] Checks if this region completely contains the region that is passed in
    * @param region Ext.util.Region
    * @returns Boolean
    */
  var contains: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], Boolean]] = js.undefined
  
  /** [Method] Create a copy of this Region
    * @returns Ext.util.Region
    */
  var copy: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Method] Copy the values of another Region to this Region
    * @param p Ext.util.Region The region to copy from.
    * @returns Ext.util.Region This Region
    */
  var copyFrom: js.UndefOr[js.Function1[/* p */ js.UndefOr[this.type], this.type]] = js.undefined
  
  /** [Method] Check whether this region is equivalent to the given region
    * @param region Ext.util.Region The region to compare with
    * @returns Boolean
    */
  @JSName("equals")
  var equals_FIRegion: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], Boolean]] = js.undefined
  
  /** [Method] Get the offset amount of a point outside the region
    * @param axis String
    * @param p Ext.util.Point the point
    * @returns Ext.util.Offset
    */
  var getOutOfBoundOffset: js.UndefOr[js.Function2[/* axis */ js.UndefOr[String], /* p */ js.UndefOr[IPoint], IOffset]] = js.undefined
  
  /** [Method] Get the offset amount on the x axis
    * @param p Number the offset
    * @returns Number
    */
  var getOutOfBoundOffsetX: js.UndefOr[js.Function1[/* p */ js.UndefOr[Double], Double]] = js.undefined
  
  /** [Method] Get the offset amount on the y axis
    * @param p Number the offset
    * @returns Number
    */
  var getOutOfBoundOffsetY: js.UndefOr[js.Function1[/* p */ js.UndefOr[Double], Double]] = js.undefined
  
  /** [Method] Checks if this region intersects the region passed in
    * @param region Ext.util.Region
    * @returns Ext.util.Region/Boolean Returns the intersected region or false if there is no intersection.
    */
  var intersect: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], Any]] = js.undefined
  
  /** [Method] Check whether the point  offset is out of bound
    * @param axis String
    * @param p Ext.util.Point/Number the point / offset
    * @returns Boolean
    */
  var isOutOfBound: js.UndefOr[js.Function2[/* axis */ js.UndefOr[String], /* p */ js.UndefOr[Any], Boolean]] = js.undefined
  
  /** [Method] Check whether the offset is out of bound in the x axis
    * @param p Number the offset
    * @returns Boolean
    */
  var isOutOfBoundX: js.UndefOr[js.Function1[/* p */ js.UndefOr[Double], Boolean]] = js.undefined
  
  /** [Method] Check whether the offset is out of bound in the y axis
    * @param p Number the offset
    * @returns Boolean
    */
  var isOutOfBoundY: js.UndefOr[js.Function1[/* p */ js.UndefOr[Double], Boolean]] = js.undefined
  
  /** [Method] Round all the properties of this region
    * @returns Ext.util.Region this This Region
    */
  var round: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Method] Translate this region by the given offset amount
    * @param x Ext.util.Offset/Object Object containing the x and y properties. Or the x value is using the two argument form.
    * @param y Number The y value unless using an Offset object.
    * @returns Ext.util.Region this This Region
    */
  var translateBy: js.UndefOr[js.Function2[/* x */ js.UndefOr[Any], /* y */ js.UndefOr[Double], this.type]] = js.undefined
  
  /** [Method] Returns the smallest region that contains the current AND targetRegion
    * @param region Ext.util.Region
    * @returns Ext.util.Region a new region
    */
  var union: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], this.type]] = js.undefined
}
object IRegion {
  
  inline def apply(): IRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRegion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRegion] (val x: Self) extends AnyVal {
    
    inline def setAdjust(
      value: (/* top */ js.UndefOr[Double], /* right */ js.UndefOr[Double], /* bottom */ js.UndefOr[Double], /* left */ js.UndefOr[Double]) => IRegion
    ): Self = StObject.set(x, "adjust", js.Any.fromFunction4(value))
    
    inline def setAdjustUndefined: Self = StObject.set(x, "adjust", js.undefined)
    
    inline def setConstrainTo(value: /* targetRegion */ js.UndefOr[IRegion] => IRegion): Self = StObject.set(x, "constrainTo", js.Any.fromFunction1(value))
    
    inline def setConstrainToUndefined: Self = StObject.set(x, "constrainTo", js.undefined)
    
    inline def setContains(value: /* region */ js.UndefOr[IRegion] => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    inline def setCopy(value: () => IRegion): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
    
    inline def setCopyFrom(value: /* p */ js.UndefOr[IRegion] => IRegion): Self = StObject.set(x, "copyFrom", js.Any.fromFunction1(value))
    
    inline def setCopyFromUndefined: Self = StObject.set(x, "copyFrom", js.undefined)
    
    inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    inline def setEquals_(value: /* region */ js.UndefOr[IRegion] => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    inline def setGetOutOfBoundOffset(value: (/* axis */ js.UndefOr[String], /* p */ js.UndefOr[IPoint]) => IOffset): Self = StObject.set(x, "getOutOfBoundOffset", js.Any.fromFunction2(value))
    
    inline def setGetOutOfBoundOffsetUndefined: Self = StObject.set(x, "getOutOfBoundOffset", js.undefined)
    
    inline def setGetOutOfBoundOffsetX(value: /* p */ js.UndefOr[Double] => Double): Self = StObject.set(x, "getOutOfBoundOffsetX", js.Any.fromFunction1(value))
    
    inline def setGetOutOfBoundOffsetXUndefined: Self = StObject.set(x, "getOutOfBoundOffsetX", js.undefined)
    
    inline def setGetOutOfBoundOffsetY(value: /* p */ js.UndefOr[Double] => Double): Self = StObject.set(x, "getOutOfBoundOffsetY", js.Any.fromFunction1(value))
    
    inline def setGetOutOfBoundOffsetYUndefined: Self = StObject.set(x, "getOutOfBoundOffsetY", js.undefined)
    
    inline def setIntersect(value: /* region */ js.UndefOr[IRegion] => Any): Self = StObject.set(x, "intersect", js.Any.fromFunction1(value))
    
    inline def setIntersectUndefined: Self = StObject.set(x, "intersect", js.undefined)
    
    inline def setIsOutOfBound(value: (/* axis */ js.UndefOr[String], /* p */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "isOutOfBound", js.Any.fromFunction2(value))
    
    inline def setIsOutOfBoundUndefined: Self = StObject.set(x, "isOutOfBound", js.undefined)
    
    inline def setIsOutOfBoundX(value: /* p */ js.UndefOr[Double] => Boolean): Self = StObject.set(x, "isOutOfBoundX", js.Any.fromFunction1(value))
    
    inline def setIsOutOfBoundXUndefined: Self = StObject.set(x, "isOutOfBoundX", js.undefined)
    
    inline def setIsOutOfBoundY(value: /* p */ js.UndefOr[Double] => Boolean): Self = StObject.set(x, "isOutOfBoundY", js.Any.fromFunction1(value))
    
    inline def setIsOutOfBoundYUndefined: Self = StObject.set(x, "isOutOfBoundY", js.undefined)
    
    inline def setRound(value: () => IRegion): Self = StObject.set(x, "round", js.Any.fromFunction0(value))
    
    inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    
    inline def setTranslateBy(value: (/* x */ js.UndefOr[Any], /* y */ js.UndefOr[Double]) => IRegion): Self = StObject.set(x, "translateBy", js.Any.fromFunction2(value))
    
    inline def setTranslateByUndefined: Self = StObject.set(x, "translateBy", js.undefined)
    
    inline def setUnion(value: /* region */ js.UndefOr[IRegion] => IRegion): Self = StObject.set(x, "union", js.Any.fromFunction1(value))
    
    inline def setUnionUndefined: Self = StObject.set(x, "union", js.undefined)
  }
}
