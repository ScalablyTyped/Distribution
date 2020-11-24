package typings.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVersion extends js.Object {
  
  /** [Method] Returns whether this version equals to the supplied argument
    * @param target String/Number The version to compare with
    * @returns Boolean True if this version equals to the target, false otherwise
    */
  @JSName("equals")
  var equals_FIVersion: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Method] Returns the build component value
    * @returns Number build
    */
  var getBuild: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the major component value
    * @returns Number major
    */
  var getMajor: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the minor component value
    * @returns Number minor
    */
  var getMinor: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the patch component value
    * @returns Number patch
    */
  var getPatch: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the release component value
    * @returns Number release
    */
  var getRelease: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns shortVersion version without dots and release
    * @returns String
    */
  var getShortVersion: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Convenient alias to isGreaterThan
    * @param target String/Number
    * @returns Boolean
    */
  var gt: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Method] Convenient alias to isGreaterThanOrEqual
    * @param target String/Number
    * @returns Boolean
    */
  var gtEq: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Method] Returns whether this version if greater than the supplied argument
    * @param target String/Number The version to compare with
    * @returns Boolean True if this version if greater than the target, false otherwise
    */
  var isGreaterThan: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Method] Returns whether this version if greater than or equal to the supplied argument
    * @param target String/Number The version to compare with
    * @returns Boolean True if this version if greater than or equal to the target, false otherwise
    */
  var isGreaterThanOrEqual: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Method] Returns whether this version if smaller than the supplied argument
    * @param target String/Number The version to compare with
    * @returns Boolean True if this version if smaller than the target, false otherwise
    */
  var isLessThan: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Method] Returns whether this version if less than or equal to the supplied argument
    * @param target String/Number The version to compare with
    * @returns Boolean True if this version if less than or equal to the target, false otherwise
    */
  var isLessThanOrEqual: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Method] Convenient alias to isLessThan
    * @param target String/Number
    * @returns Boolean
    */
  var lt: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Method] Convenient alias to isLessThanOrEqual
    * @param target String/Number
    * @returns Boolean
    */
  var ltEq: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Method] Returns whether this version matches the supplied argument
    * @param target String/Number The version to compare with
    * @returns Boolean True if this version matches the target, false otherwise
    */
  var `match`: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Method] Returns this format  major minor patch build release
    * @returns Number[]
    */
  var toArray: js.UndefOr[js.Function0[Array]] = js.native
}
object IVersion {
  
  @scala.inline
  def apply(): IVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVersion]
  }
  
  @scala.inline
  implicit class IVersionOps[Self <: IVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEquals(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEquals: Self = this.set("equals", js.undefined)
    
    @scala.inline
    def setGetBuild(value: () => Double): Self = this.set("getBuild", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetBuild: Self = this.set("getBuild", js.undefined)
    
    @scala.inline
    def setGetMajor(value: () => Double): Self = this.set("getMajor", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMajor: Self = this.set("getMajor", js.undefined)
    
    @scala.inline
    def setGetMinor(value: () => Double): Self = this.set("getMinor", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMinor: Self = this.set("getMinor", js.undefined)
    
    @scala.inline
    def setGetPatch(value: () => Double): Self = this.set("getPatch", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPatch: Self = this.set("getPatch", js.undefined)
    
    @scala.inline
    def setGetRelease(value: () => Double): Self = this.set("getRelease", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRelease: Self = this.set("getRelease", js.undefined)
    
    @scala.inline
    def setGetShortVersion(value: () => java.lang.String): Self = this.set("getShortVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetShortVersion: Self = this.set("getShortVersion", js.undefined)
    
    @scala.inline
    def setGt(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = this.set("gt", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGt: Self = this.set("gt", js.undefined)
    
    @scala.inline
    def setGtEq(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = this.set("gtEq", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGtEq: Self = this.set("gtEq", js.undefined)
    
    @scala.inline
    def setIsGreaterThan(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = this.set("isGreaterThan", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsGreaterThan: Self = this.set("isGreaterThan", js.undefined)
    
    @scala.inline
    def setIsGreaterThanOrEqual(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = this.set("isGreaterThanOrEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsGreaterThanOrEqual: Self = this.set("isGreaterThanOrEqual", js.undefined)
    
    @scala.inline
    def setIsLessThan(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = this.set("isLessThan", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsLessThan: Self = this.set("isLessThan", js.undefined)
    
    @scala.inline
    def setIsLessThanOrEqual(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = this.set("isLessThanOrEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsLessThanOrEqual: Self = this.set("isLessThanOrEqual", js.undefined)
    
    @scala.inline
    def setLt(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = this.set("lt", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLt: Self = this.set("lt", js.undefined)
    
    @scala.inline
    def setLtEq(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = this.set("ltEq", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLtEq: Self = this.set("ltEq", js.undefined)
    
    @scala.inline
    def setMatch(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = this.set("match", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    
    @scala.inline
    def setToArray(value: () => Array): Self = this.set("toArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteToArray: Self = this.set("toArray", js.undefined)
  }
}
