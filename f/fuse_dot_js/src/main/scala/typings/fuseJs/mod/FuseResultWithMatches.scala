package typings.fuseJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FuseResultWithMatches[T] extends js.Object {
  
  var item: T = js.native
  
  var matches: js.Any = js.native
}
object FuseResultWithMatches {
  
  @scala.inline
  def apply[T](item: T, matches: js.Any): FuseResultWithMatches[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[FuseResultWithMatches[T]]
  }
  
  @scala.inline
  implicit class FuseResultWithMatchesOps[Self <: FuseResultWithMatches[_], T] (val x: Self with FuseResultWithMatches[T]) extends AnyVal {
    
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
    def setItem(value: T): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatches(value: js.Any): Self = this.set("matches", value.asInstanceOf[js.Any])
  }
}
