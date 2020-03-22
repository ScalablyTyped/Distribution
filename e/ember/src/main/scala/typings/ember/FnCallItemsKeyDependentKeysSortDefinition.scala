package typings.ember

import typings.emberObject.computedMod.ComputedProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallItemsKeyDependentKeysSortDefinition extends js.Object {
  def apply(itemsKey: String, dependentKeys: js.Array[String], sortDefinition: String): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def apply(
    itemsKey: String,
    dependentKeys: js.Array[String],
    sortDefinition: js.Function2[/* itemA */ js.Any, /* itemB */ js.Any, Double]
  ): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def apply(itemsKey: String, sortDefinition: String): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def apply(itemsKey: String, sortDefinition: js.Function2[/* itemA */ js.Any, /* itemB */ js.Any, Double]): ComputedProperty[js.Array[_], js.Array[_]] = js.native
}

