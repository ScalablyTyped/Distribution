package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVersion extends StObject {
  
  /** [Method] Returns whether this version equals to the supplied argument
    * @param target String/Number The version to compare with
    * @returns Boolean True if this version equals to the target, false otherwise
    */
  @JSName("equals")
  var equals_FIVersion: js.UndefOr[js.Function1[/* target */ js.UndefOr[Any], Boolean]] = js.undefined
  
  /** [Method] Returns the build component value
    * @returns Number build
    */
  var getBuild: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the major component value
    * @returns Number major
    */
  var getMajor: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the minor component value
    * @returns Number minor
    */
  var getMinor: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the patch component value
    * @returns Number patch
    */
  var getPatch: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the release component value
    * @returns Number release
    */
  var getRelease: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns shortVersion version without dots and release
    * @returns String
    */
  var getShortVersion: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Convenient alias to isGreaterThan
    * @param target String/Number
    * @returns Boolean
    */
  var gt: js.UndefOr[js.Function1[/* target */ js.UndefOr[Any], Boolean]] = js.undefined
  
  /** [Method] Convenient alias to isGreaterThanOrEqual
    * @param target String/Number
    * @returns Boolean
    */
  var gtEq: js.UndefOr[js.Function1[/* target */ js.UndefOr[Any], Boolean]] = js.undefined
  
  /** [Method] Returns whether this version if greater than the supplied argument
    * @param target String/Number The version to compare with
    * @returns Boolean True if this version if greater than the target, false otherwise
    */
  var isGreaterThan: js.UndefOr[js.Function1[/* target */ js.UndefOr[Any], Boolean]] = js.undefined
  
  /** [Method] Returns whether this version if greater than or equal to the supplied argument
    * @param target String/Number The version to compare with
    * @returns Boolean True if this version if greater than or equal to the target, false otherwise
    */
  var isGreaterThanOrEqual: js.UndefOr[js.Function1[/* target */ js.UndefOr[Any], Boolean]] = js.undefined
  
  /** [Method] Returns whether this version if smaller than the supplied argument
    * @param target String/Number The version to compare with
    * @returns Boolean True if this version if smaller than the target, false otherwise
    */
  var isLessThan: js.UndefOr[js.Function1[/* target */ js.UndefOr[Any], Boolean]] = js.undefined
  
  /** [Method] Returns whether this version if less than or equal to the supplied argument
    * @param target String/Number The version to compare with
    * @returns Boolean True if this version if less than or equal to the target, false otherwise
    */
  var isLessThanOrEqual: js.UndefOr[js.Function1[/* target */ js.UndefOr[Any], Boolean]] = js.undefined
  
  /** [Method] Convenient alias to isLessThan
    * @param target String/Number
    * @returns Boolean
    */
  var lt: js.UndefOr[js.Function1[/* target */ js.UndefOr[Any], Boolean]] = js.undefined
  
  /** [Method] Convenient alias to isLessThanOrEqual
    * @param target String/Number
    * @returns Boolean
    */
  var ltEq: js.UndefOr[js.Function1[/* target */ js.UndefOr[Any], Boolean]] = js.undefined
  
  /** [Method] Returns whether this version matches the supplied argument
    * @param target String/Number The version to compare with
    * @returns Boolean True if this version matches the target, false otherwise
    */
  var `match`: js.UndefOr[js.Function1[/* target */ js.UndefOr[Any], Boolean]] = js.undefined
  
  /** [Method] Returns this format  major minor patch build release
    * @returns Number[]
    */
  var toArray: js.UndefOr[js.Function0[Array]] = js.undefined
}
object IVersion {
  
  inline def apply(): IVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IVersion] (val x: Self) extends AnyVal {
    
    inline def setEquals_(value: /* target */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    inline def setGetBuild(value: () => Double): Self = StObject.set(x, "getBuild", js.Any.fromFunction0(value))
    
    inline def setGetBuildUndefined: Self = StObject.set(x, "getBuild", js.undefined)
    
    inline def setGetMajor(value: () => Double): Self = StObject.set(x, "getMajor", js.Any.fromFunction0(value))
    
    inline def setGetMajorUndefined: Self = StObject.set(x, "getMajor", js.undefined)
    
    inline def setGetMinor(value: () => Double): Self = StObject.set(x, "getMinor", js.Any.fromFunction0(value))
    
    inline def setGetMinorUndefined: Self = StObject.set(x, "getMinor", js.undefined)
    
    inline def setGetPatch(value: () => Double): Self = StObject.set(x, "getPatch", js.Any.fromFunction0(value))
    
    inline def setGetPatchUndefined: Self = StObject.set(x, "getPatch", js.undefined)
    
    inline def setGetRelease(value: () => Double): Self = StObject.set(x, "getRelease", js.Any.fromFunction0(value))
    
    inline def setGetReleaseUndefined: Self = StObject.set(x, "getRelease", js.undefined)
    
    inline def setGetShortVersion(value: () => java.lang.String): Self = StObject.set(x, "getShortVersion", js.Any.fromFunction0(value))
    
    inline def setGetShortVersionUndefined: Self = StObject.set(x, "getShortVersion", js.undefined)
    
    inline def setGt(value: /* target */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "gt", js.Any.fromFunction1(value))
    
    inline def setGtEq(value: /* target */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "gtEq", js.Any.fromFunction1(value))
    
    inline def setGtEqUndefined: Self = StObject.set(x, "gtEq", js.undefined)
    
    inline def setGtUndefined: Self = StObject.set(x, "gt", js.undefined)
    
    inline def setIsGreaterThan(value: /* target */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "isGreaterThan", js.Any.fromFunction1(value))
    
    inline def setIsGreaterThanOrEqual(value: /* target */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "isGreaterThanOrEqual", js.Any.fromFunction1(value))
    
    inline def setIsGreaterThanOrEqualUndefined: Self = StObject.set(x, "isGreaterThanOrEqual", js.undefined)
    
    inline def setIsGreaterThanUndefined: Self = StObject.set(x, "isGreaterThan", js.undefined)
    
    inline def setIsLessThan(value: /* target */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "isLessThan", js.Any.fromFunction1(value))
    
    inline def setIsLessThanOrEqual(value: /* target */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "isLessThanOrEqual", js.Any.fromFunction1(value))
    
    inline def setIsLessThanOrEqualUndefined: Self = StObject.set(x, "isLessThanOrEqual", js.undefined)
    
    inline def setIsLessThanUndefined: Self = StObject.set(x, "isLessThan", js.undefined)
    
    inline def setLt(value: /* target */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "lt", js.Any.fromFunction1(value))
    
    inline def setLtEq(value: /* target */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "ltEq", js.Any.fromFunction1(value))
    
    inline def setLtEqUndefined: Self = StObject.set(x, "ltEq", js.undefined)
    
    inline def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
    
    inline def setMatch(value: /* target */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setToArray(value: () => Array): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
    
    inline def setToArrayUndefined: Self = StObject.set(x, "toArray", js.undefined)
  }
}
