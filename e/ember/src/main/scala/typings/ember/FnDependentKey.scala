package typings.ember

import typings.emberObject.AnonId
import typings.emberObject.AnonIdUntil
import typings.emberObject.computedMod.ComputedProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnDependentKey extends js.Object {
  def apply(dependentKey: String): ComputedProperty[_, _] = js.native
  def apply(dependentKey: String, options: AnonId): ComputedProperty[_, _] = js.native
  def apply(dependentKey: String, options: AnonIdUntil): ComputedProperty[_, _] = js.native
}

