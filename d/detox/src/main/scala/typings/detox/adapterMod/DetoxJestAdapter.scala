package typings.detox.adapterMod

import typings.detox.mod.global.Detox_.CircusTestEventListenerBase
import typings.detox.mod.global.Detox_.Detox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetoxJestAdapter extends CircusTestEventListenerBase {
  var detox: Detox = js.native
  def afterAll(): js.Promise[Unit] = js.native
  def beforeEach(): js.Promise[Unit] = js.native
  // These are not publicly used, but are defined in order to overlap with the jasmine.CustomReporter interface (which is a weak interface)
  def specDone(): Unit = js.native
  def specStarted(): Unit = js.native
}

object DetoxJestAdapter {
  @scala.inline
  def apply(
    afterAll: () => js.Promise[Unit],
    beforeEach: () => js.Promise[Unit],
    detox: Detox,
    handleTestEvent: (js.Any, js.Any) => js.Promise[Unit],
    specDone: () => Unit,
    specStarted: () => Unit
  ): DetoxJestAdapter = {
    val __obj = js.Dynamic.literal(afterAll = js.Any.fromFunction0(afterAll), beforeEach = js.Any.fromFunction0(beforeEach), detox = detox.asInstanceOf[js.Any], handleTestEvent = js.Any.fromFunction2(handleTestEvent), specDone = js.Any.fromFunction0(specDone), specStarted = js.Any.fromFunction0(specStarted))
    __obj.asInstanceOf[DetoxJestAdapter]
  }
  @scala.inline
  implicit class DetoxJestAdapterOps[Self <: DetoxJestAdapter] (val x: Self) extends AnyVal {
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
    def setAfterAll(value: () => js.Promise[Unit]): Self = this.set("afterAll", js.Any.fromFunction0(value))
    @scala.inline
    def setBeforeEach(value: () => js.Promise[Unit]): Self = this.set("beforeEach", js.Any.fromFunction0(value))
    @scala.inline
    def setDetox(value: Detox): Self = this.set("detox", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpecDone(value: () => Unit): Self = this.set("specDone", js.Any.fromFunction0(value))
    @scala.inline
    def setSpecStarted(value: () => Unit): Self = this.set("specStarted", js.Any.fromFunction0(value))
  }
  
}

