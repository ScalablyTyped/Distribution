package typings.forgeDi.inspectorMod

import typings.forgeDi.constructorMod.Constructor
import typings.forgeDi.dependencyMod.Dependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inspector extends js.Object {
  def findConstructor(func: Constructor): Constructor
  def getDependencies(func: js.Function): js.Array[Dependency]
}

object Inspector {
  @scala.inline
  def apply(findConstructor: Constructor => Constructor, getDependencies: js.Function => js.Array[Dependency]): Inspector = {
    val __obj = js.Dynamic.literal(findConstructor = js.Any.fromFunction1(findConstructor), getDependencies = js.Any.fromFunction1(getDependencies))
    __obj.asInstanceOf[Inspector]
  }
}

