package typings.factoryGirl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[T] extends js.Object {
  
  var afterBuild: js.UndefOr[Hook[T]] = js.native
  
  var afterCreate: js.UndefOr[Hook[T]] = js.native
}
object Options {
  
  @scala.inline
  def apply[T](): Options[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[T]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], T] (val x: Self with Options[T]) extends AnyVal {
    
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
    def setAfterBuild(value: (/* model */ js.Any, /* attrs */ js.Array[T], /* options */ js.Any) => Unit): Self = this.set("afterBuild", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAfterBuild: Self = this.set("afterBuild", js.undefined)
    
    @scala.inline
    def setAfterCreate(value: (/* model */ js.Any, /* attrs */ js.Array[T], /* options */ js.Any) => Unit): Self = this.set("afterCreate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAfterCreate: Self = this.set("afterCreate", js.undefined)
  }
}
