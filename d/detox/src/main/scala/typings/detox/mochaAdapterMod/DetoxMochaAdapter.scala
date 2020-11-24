package typings.detox.mochaAdapterMod

import typings.detox.mod.global.Detox_.Detox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetoxMochaAdapter extends js.Object {
  
  def afterEach(context: js.Any): js.Promise[Unit] = js.native
  
  def beforeEach(context: js.Any): js.Promise[Unit] = js.native
  
  var detox: Detox = js.native
}
object DetoxMochaAdapter {
  
  @scala.inline
  def apply(afterEach: js.Any => js.Promise[Unit], beforeEach: js.Any => js.Promise[Unit], detox: Detox): DetoxMochaAdapter = {
    val __obj = js.Dynamic.literal(afterEach = js.Any.fromFunction1(afterEach), beforeEach = js.Any.fromFunction1(beforeEach), detox = detox.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetoxMochaAdapter]
  }
  
  @scala.inline
  implicit class DetoxMochaAdapterOps[Self <: DetoxMochaAdapter] (val x: Self) extends AnyVal {
    
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
    def setAfterEach(value: js.Any => js.Promise[Unit]): Self = this.set("afterEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeEach(value: js.Any => js.Promise[Unit]): Self = this.set("beforeEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDetox(value: Detox): Self = this.set("detox", value.asInstanceOf[js.Any])
  }
}
