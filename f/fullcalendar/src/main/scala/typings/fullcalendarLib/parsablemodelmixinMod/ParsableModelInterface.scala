package typings
package fullcalendarLib.parsablemodelmixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsableModelInterface extends js.Object {
  def applyManualStandardProps(rawProps: js.Any): js.Any
  def applyMiscProps(rawProps: js.Any): js.Any
  def applyProps(rawProps: js.Any): js.Any
  def isStandardProp(propName: js.Any): js.Any
}

object ParsableModelInterface {
  @scala.inline
  def apply(
    applyManualStandardProps: js.Function1[js.Any, js.Any],
    applyMiscProps: js.Function1[js.Any, js.Any],
    applyProps: js.Function1[js.Any, js.Any],
    isStandardProp: js.Function1[js.Any, js.Any]
  ): ParsableModelInterface = {
    val __obj = js.Dynamic.literal(applyManualStandardProps = applyManualStandardProps, applyMiscProps = applyMiscProps, applyProps = applyProps, isStandardProp = isStandardProp)
  
    __obj.asInstanceOf[ParsableModelInterface]
  }
}

