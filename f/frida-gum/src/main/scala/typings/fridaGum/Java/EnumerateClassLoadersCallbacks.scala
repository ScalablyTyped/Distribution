package typings.fridaGum.Java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumerateClassLoadersCallbacks extends js.Object {
  
  /**
    * Called when all class loaders have been enumerated.
    */
  def onComplete(): Unit = js.native
  
  /**
    * Called with a `java.lang.ClassLoader` wrapper for each class loader
    * found in the VM.
    */
  def onMatch(loader: typings.fridaGum.anon.Wrapper): Unit = js.native
}
object EnumerateClassLoadersCallbacks {
  
  @scala.inline
  def apply(onComplete: () => Unit, onMatch: typings.fridaGum.anon.Wrapper => Unit): EnumerateClassLoadersCallbacks = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onMatch = js.Any.fromFunction1(onMatch))
    __obj.asInstanceOf[EnumerateClassLoadersCallbacks]
  }
  
  @scala.inline
  implicit class EnumerateClassLoadersCallbacksOps[Self <: EnumerateClassLoadersCallbacks] (val x: Self) extends AnyVal {
    
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
    def setOnComplete(value: () => Unit): Self = this.set("onComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMatch(value: typings.fridaGum.anon.Wrapper => Unit): Self = this.set("onMatch", js.Any.fromFunction1(value))
  }
}
