package typings.finalForm.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.finalForm.anon.Notified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscribers[T /* <: js.Object */] extends js.Object {
  
  var entries: NumberDictionary[Notified[T]] = js.native
  
  var index: Double = js.native
}
object Subscribers {
  
  @scala.inline
  def apply[T /* <: js.Object */](entries: NumberDictionary[Notified[T]], index: Double): Subscribers[T] = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscribers[T]]
  }
  
  @scala.inline
  implicit class SubscribersOps[Self <: Subscribers[_], T /* <: js.Object */] (val x: Self with Subscribers[T]) extends AnyVal {
    
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
    def setEntries(value: NumberDictionary[Notified[T]]): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
  }
}
