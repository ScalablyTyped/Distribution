package typings.ganacheCore.mod.Ganache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Web3Provider * / any */ trait Provider extends js.Object {
  def close(callback: js.Function): Unit
}

object Provider {
  @scala.inline
  def apply(close: js.Function => Unit): Provider = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close))
    __obj.asInstanceOf[Provider]
  }
}

