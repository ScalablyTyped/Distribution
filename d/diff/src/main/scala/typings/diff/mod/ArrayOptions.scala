package typings.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayOptions[TLeft, TRight] extends BaseOptions {
  
  /**
    * Comparator for custom equality checks.
    */
  var comparator: js.UndefOr[js.Function2[/* left */ TLeft, /* right */ TRight, Boolean]] = js.native
}
object ArrayOptions {
  
  @scala.inline
  def apply[TLeft, TRight](): ArrayOptions[TLeft, TRight] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayOptions[TLeft, TRight]]
  }
  
  @scala.inline
  implicit class ArrayOptionsOps[Self <: ArrayOptions[_, _], TLeft, TRight] (val x: Self with (ArrayOptions[TLeft, TRight])) extends AnyVal {
    
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
    def setComparator(value: (/* left */ TLeft, /* right */ TRight) => Boolean): Self = this.set("comparator", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteComparator: Self = this.set("comparator", js.undefined)
  }
}
