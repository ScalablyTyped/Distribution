package typings.fullcalendar.parsableModelMixinMod

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
    applyManualStandardProps: js.Any => js.Any,
    applyMiscProps: js.Any => js.Any,
    applyProps: js.Any => js.Any,
    isStandardProp: js.Any => js.Any
  ): ParsableModelInterface = {
    val __obj = js.Dynamic.literal(applyManualStandardProps = js.Any.fromFunction1(applyManualStandardProps), applyMiscProps = js.Any.fromFunction1(applyMiscProps), applyProps = js.Any.fromFunction1(applyProps), isStandardProp = js.Any.fromFunction1(isStandardProp))
    __obj.asInstanceOf[ParsableModelInterface]
  }
}

