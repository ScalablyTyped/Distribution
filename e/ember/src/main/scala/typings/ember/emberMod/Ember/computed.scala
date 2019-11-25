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
  def apply(deps: java.lang.String*): MethodDecorator = js.native
  def apply(
    k1: java.lang.String,
    k2: java.lang.String,
    k3: java.lang.String,
    k4: java.lang.String,
    k5: java.lang.String,
    k6: java.lang.String,
    k7: java.lang.String,
    rest: js.Any*
  ): typings.atEmberObject.computedMod.ComputedProperty[_, _] = js.native
  def apply[T](cb: ComputedPropertyCallback[T]): typings.atEmberObject.computedMod.ComputedProperty[T, T] = js.native
  def apply[T](k1: java.lang.String, cb: ComputedPropertyCallback[T]): typings.atEmberObject.computedMod.ComputedProperty[T, T] = js.native
  def apply[T](k1: java.lang.String, k2: java.lang.String, cb: ComputedPropertyCallback[T]): typings.atEmberObject.computedMod.ComputedProperty[T, T] = js.native
  def apply[T](k1: java.lang.String, k2: java.lang.String, k3: java.lang.String, cb: ComputedPropertyCallback[T]): typings.atEmberObject.computedMod.ComputedProperty[T, T] = js.native
  def apply[T](
    k1: java.lang.String,
    k2: java.lang.String,
    k3: java.lang.String,
    k4: java.lang.String,
    cb: ComputedPropertyCallback[T]
  ): typings.atEmberObject.computedMod.ComputedProperty[T, T] = js.native
  def apply[T](
    k1: java.lang.String,
    k2: java.lang.String,
    k3: java.lang.String,
    k4: java.lang.String,
    k5: java.lang.String,
    cb: ComputedPropertyCallback[T]
  ): typings.atEmberObject.computedMod.ComputedProperty[T, T] = js.native
  def apply[T](
    k1: java.lang.String,
    k2: java.lang.String,
    k3: java.lang.String,
    k4: java.lang.String,
    k5: java.lang.String,
    k6: java.lang.String,
    cb: ComputedPropertyCallback[T]
  ): typings.atEmberObject.computedMod.ComputedProperty[T, T] = js.native
  def alias(dependentKey: java.lang.String): typings.atEmberObject.computedMod.ComputedProperty[_, _] = js.native
  def and(dependentKeys: java.lang.String*): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def bool(dependentKey: java.lang.String): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def collect(dependentKeys: java.lang.String*): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def deprecatingAlias(dependentKey: java.lang.String): typings.atEmberObject.computedMod.ComputedProperty[_, _] = js.native
  def deprecatingAlias(dependentKey: java.lang.String, options: Anon_Id): typings.atEmberObject.computedMod.ComputedProperty[_, _] = js.native
  def deprecatingAlias(dependentKey: java.lang.String, options: Anon_IdUntil): typings.atEmberObject.computedMod.ComputedProperty[_, _] = js.native
  def empty(dependentKey: java.lang.String): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def equal(dependentKey: java.lang.String, value: js.Any): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def filter(
    dependentKey: java.lang.String,
    callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Boolean]
  ): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def filterBy(dependentKey: java.lang.String, propertyKey: java.lang.String): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def filterBy(dependentKey: java.lang.String, propertyKey: java.lang.String, value: js.Any): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def gt(dependentKey: java.lang.String, value: Double): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def gte(dependentKey: java.lang.String, value: Double): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def intersect(propertyKeys: java.lang.String*): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def lt(dependentKey: java.lang.String, value: Double): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def lte(dependentKey: java.lang.String, value: Double): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def map[U](
    dependentKey: java.lang.String,
    callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], U]
  ): typings.atEmberObject.computedMod.ComputedProperty[js.Array[U], js.Array[U]] = js.native
  def mapBy(dependentKey: java.lang.String, propertyKey: java.lang.String): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def `match`(dependentKey: java.lang.String, regexp: RegExp): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def max(dependentKey: java.lang.String): typings.atEmberObject.computedMod.ComputedProperty[Double, Double] = js.native
  def min(dependentKey: java.lang.String): typings.atEmberObject.computedMod.ComputedProperty[Double, Double] = js.native
  def none(dependentKey: java.lang.String): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def not(dependentKey: java.lang.String): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def notEmpty(dependentKey: java.lang.String): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def oneWay(dependentKey: java.lang.String): typings.atEmberObject.computedMod.ComputedProperty[_, _] = js.native
  def or(dependentKeys: java.lang.String*): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  def readOnly(dependentKey: java.lang.String): typings.atEmberObject.computedMod.ComputedProperty[_, _] = js.native
  def reads(dependentKey: java.lang.String): typings.atEmberObject.computedMod.ComputedProperty[_, _] = js.native
  def setDiff(setAProperty: java.lang.String, setBProperty: java.lang.String): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def sort(itemsKey: java.lang.String, sortDefinition: java.lang.String): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def sort(
    itemsKey: java.lang.String,
    sortDefinition: js.Function2[/* itemA */ js.Any, /* itemB */ js.Any, Double]
  ): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def sum(dependentKey: java.lang.String): typings.atEmberObject.computedMod.ComputedProperty[Double, Double] = js.native
  def union(propertyKeys: java.lang.String*): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def uniq(propertyKey: java.lang.String): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def uniqBy(dependentKey: java.lang.String, propertyKey: java.lang.String): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
}

