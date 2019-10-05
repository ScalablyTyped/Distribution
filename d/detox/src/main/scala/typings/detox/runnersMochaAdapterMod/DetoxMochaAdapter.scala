package typings.detox.runnersMochaAdapterMod

import typings.detox.detoxMod.Global.Detox.Detox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetoxMochaAdapter extends js.Object {
  var detox: Detox
  def afterEach(context: js.Any): js.Promise[Unit]
  def beforeEach(context: js.Any): js.Promise[Unit]
}

object DetoxMochaAdapter {
  @scala.inline
  def apply(afterEach: js.Any => js.Promise[Unit], beforeEach: js.Any => js.Promise[Unit], detox: Detox): DetoxMochaAdapter = {
    val __obj = js.Dynamic.literal(afterEach = js.Any.fromFunction1(afterEach), beforeEach = js.Any.fromFunction1(beforeEach), detox = detox)
  
    __obj.asInstanceOf[DetoxMochaAdapter]
  }
}

