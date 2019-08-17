package typings.atEmberObject.computedMod

import typings.atEmberObject.Anon_Id
import typings.atEmberObject.Anon_IdUntil
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/object/computed", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def alias(dependentKey: String): ComputedProperty[_, _] = js.native
  def and(dependentKeys: String*): ComputedProperty[Boolean, Boolean] = js.native
  def bool(dependentKey: String): ComputedProperty[Boolean, Boolean] = js.native
  def collect(dependentKeys: String*): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def deprecatingAlias(dependentKey: String): ComputedProperty[_, _] = js.native
  def deprecatingAlias(dependentKey: String, options: Anon_Id): ComputedProperty[_, _] = js.native
  def deprecatingAlias(dependentKey: String, options: Anon_IdUntil): ComputedProperty[_, _] = js.native
  def empty(dependentKey: String): ComputedProperty[Boolean, Boolean] = js.native
  def equal(dependentKey: String, value: js.Any): ComputedProperty[Boolean, Boolean] = js.native
  def expandProperties(pattern: String, callback: js.Function1[/* expanded */ String, Unit]): Unit = js.native
  def filter(
    dependentKey: String,
    callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Boolean]
  ): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def filterBy(dependentKey: String, propertyKey: String): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def filterBy(dependentKey: String, propertyKey: String, value: js.Any): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def gt(dependentKey: String, value: Double): ComputedProperty[Boolean, Boolean] = js.native
  def gte(dependentKey: String, value: Double): ComputedProperty[Boolean, Boolean] = js.native
  def intersect(propertyKeys: String*): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def lt(dependentKey: String, value: Double): ComputedProperty[Boolean, Boolean] = js.native
  def lte(dependentKey: String, value: Double): ComputedProperty[Boolean, Boolean] = js.native
  def map[U](
    dependentKey: String,
    callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], U]
  ): ComputedProperty[js.Array[U], js.Array[U]] = js.native
  def mapBy(dependentKey: String, propertyKey: String): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def `match`(dependentKey: String, regexp: RegExp): ComputedProperty[Boolean, Boolean] = js.native
  def max(dependentKey: String): ComputedProperty[Double, Double] = js.native
  def min(dependentKey: String): ComputedProperty[Double, Double] = js.native
  def none(dependentKey: String): ComputedProperty[Boolean, Boolean] = js.native
  def not(dependentKey: String): ComputedProperty[Boolean, Boolean] = js.native
  def notEmpty(dependentKey: String): ComputedProperty[Boolean, Boolean] = js.native
  def oneWay(dependentKey: String): ComputedProperty[_, _] = js.native
  def or(dependentKeys: String*): ComputedProperty[Boolean, Boolean] = js.native
  def readOnly(dependentKey: String): ComputedProperty[_, _] = js.native
  def reads(dependentKey: String): ComputedProperty[_, _] = js.native
  def setDiff(setAProperty: String, setBProperty: String): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def sort(itemsKey: String, sortDefinition: String): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def sort(itemsKey: String, sortDefinition: js.Function2[/* itemA */ js.Any, /* itemB */ js.Any, Double]): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def sum(dependentKey: String): ComputedProperty[Double, Double] = js.native
  def union(propertyKeys: String*): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def uniq(propertyKey: String): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def uniqBy(dependentKey: String, propertyKey: String): ComputedProperty[js.Array[_], js.Array[_]] = js.native
}

