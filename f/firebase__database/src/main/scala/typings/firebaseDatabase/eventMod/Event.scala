package typings.firebaseDatabase.eventMod

import typings.firebaseDatabase.pathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends js.Object {
  
  /**
    * @return {!function()}
    */
  def getEventRunner(): js.Function0[Unit] = js.native
  
  /**
    * @return {!string}
    */
  def getEventType(): String = js.native
  
  /**
    * @return {!Path}
    */
  def getPath(): Path = js.native
}
object Event {
  
  @scala.inline
  def apply(getEventRunner: () => js.Function0[Unit], getEventType: () => String, getPath: () => Path): Event = {
    val __obj = js.Dynamic.literal(getEventRunner = js.Any.fromFunction0(getEventRunner), getEventType = js.Any.fromFunction0(getEventType), getPath = js.Any.fromFunction0(getPath))
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    
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
    def setGetEventRunner(value: () => js.Function0[Unit]): Self = this.set("getEventRunner", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEventType(value: () => String): Self = this.set("getEventType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPath(value: () => Path): Self = this.set("getPath", js.Any.fromFunction0(value))
  }
}
