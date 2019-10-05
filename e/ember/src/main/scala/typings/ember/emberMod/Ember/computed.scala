package typings.ember.emberMod.Ember

import typings.atEmberObject.Anon_Id
import typings.atEmberObject.Anon_IdUntil
import typings.atEmberObject.dashPrivateTypesMod.ComputedPropertyCallback
import typings.std.MethodDecorator
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "Ember.computed")
@js.native
object computed extends js.Object {
  def apply(deps: String*): MethodDecorator = js.native
  def apply(k1: String, k2: String, k3: String, k4: String, k5: String, k6: String, k7: String, rest: js.Any*): typings.atEmberObject.computedMod.ComputedProperty[_, _] = js.native
  def apply[T](cb: ComputedPropertyCallback[T]): typings.atEmberObject.computedMod.ComputedProperty[T, T] = js.native
  def apply[T](k1: String, cb: ComputedPropertyCallback[T]): typings.atEmberObject.computedMod.ComputedProperty[T, T] = js.native
  def apply[T](k1: String, k2: String, cb: ComputedPropertyCallback[T]): typings.atEmberObject.computedMod.ComputedProperty[T, T] = js.native
  def apply[T](k1: String, k2: String, k3: String, cb: ComputedPropertyCallback[T]): typings.atEmberObject.computedMod.ComputedProperty[T, T] = js.native
  def apply[T](k1: String, k2: String, k3: String, k4: String, cb: ComputedPropertyCallback[T]): typings.atEmberObject.computedMod.ComputedProperty[T, T] = js.native
  def apply[T](k1: String, k2: String, k3: String, k4: String, k5: String, cb: ComputedPropertyCallback[T]): typings.atEmberObject.computedMod.ComputedProperty[T, T] = js.native
  def apply[T](
    k1: String,
    k2: String,
    k3: String,
    k4: String,
    k5: String,
    k6: String,
    cb: ComputedPropertyCallback[T]
  ): typings.atEmberObject.computedMod.ComputedProperty[T, T] = js.native
  def alias(dependentKey: String): typings.atEmberObject.computedMod.ComputedProperty[_, _] = js.native
  def and(dependentKeys: String*): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def bool(dependentKey: String): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def collect(dependentKeys: String*): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def deprecatingAlias(dependentKey: String): typings.atEmberObject.computedMod.ComputedProperty[_, _] = js.native
  def deprecatingAlias(dependentKey: String, options: Anon_Id): typings.atEmberObject.computedMod.ComputedProperty[_, _] = js.native
  def deprecatingAlias(dependentKey: String, options: Anon_IdUntil): typings.atEmberObject.computedMod.ComputedProperty[_, _] = js.native
  def empty(dependentKey: String): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def equal(dependentKey: String, value: js.Any): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def filter(
    dependentKey: String,
    callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Boolean]
  ): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def filterBy(dependentKey: String, propertyKey: String): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def filterBy(dependentKey: String, propertyKey: String, value: js.Any): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def gt(dependentKey: String, value: Double): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def gte(dependentKey: String, value: Double): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def intersect(propertyKeys: String*): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def lt(dependentKey: String, value: Double): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def lte(dependentKey: String, value: Double): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def map[U](
    dependentKey: String,
    callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], U]
  ): typings.atEmberObject.computedMod.ComputedProperty[js.Array[U], js.Array[U]] = js.native
  def mapBy(dependentKey: String, propertyKey: String): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def `match`(dependentKey: String, regexp: RegExp): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def max(dependentKey: String): typings.atEmberObject.computedMod.ComputedProperty[Double, Double] = js.native
  def min(dependentKey: String): typings.atEmberObject.computedMod.ComputedProperty[Double, Double] = js.native
  def none(dependentKey: String): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def not(dependentKey: String): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def notEmpty(dependentKey: String): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def oneWay(dependentKey: String): typings.atEmberObject.computedMod.ComputedProperty[_, _] = js.native
  def or(dependentKeys: String*): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def readOnly(dependentKey: String): typings.atEmberObject.computedMod.ComputedProperty[_, _] = js.native
  def reads(dependentKey: String): typings.atEmberObject.computedMod.ComputedProperty[_, _] = js.native
  def setDiff(setAProperty: String, setBProperty: String): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def sort(itemsKey: String, sortDefinition: String): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def sort(itemsKey: String, sortDefinition: js.Function2[/* itemA */ js.Any, /* itemB */ js.Any, Double]): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def sum(dependentKey: String): typings.atEmberObject.computedMod.ComputedProperty[Double, Double] = js.native
  def union(propertyKeys: String*): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def uniq(propertyKey: String): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def uniqBy(dependentKey: String, propertyKey: String): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
}

