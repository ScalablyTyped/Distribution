package typings.diff.anon

import typings.diff.mod.Callback
import typings.diff.mod.Change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined diff.diff.ArrayOptions<any, any> & std.Partial<diff.diff.CallbackOptions> */
@js.native
trait ArrayOptionsanyanyPartial extends js.Object {
  
  var callback: js.UndefOr[Callback] = js.native
  
  /**
    * Comparator for custom equality checks.
    */
  var comparator: js.UndefOr[js.Function2[/* left */ js.Any, /* right */ js.Any, Boolean]] = js.native
  
  /**
    * `true` to ignore casing difference.
    * @default false
    */
  var ignoreCase: js.UndefOr[Boolean] = js.native
}
object ArrayOptionsanyanyPartial {
  
  @scala.inline
  def apply(): ArrayOptionsanyanyPartial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayOptionsanyanyPartial]
  }
  
  @scala.inline
  implicit class ArrayOptionsanyanyPartialOps[Self <: ArrayOptionsanyanyPartial] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: (/* err */ js.UndefOr[scala.Nothing], /* value */ js.UndefOr[js.Array[Change]]) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setComparator(value: (/* left */ js.Any, /* right */ js.Any) => Boolean): Self = this.set("comparator", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteComparator: Self = this.set("comparator", js.undefined)
    
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = this.set("ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreCase: Self = this.set("ignoreCase", js.undefined)
  }
}
