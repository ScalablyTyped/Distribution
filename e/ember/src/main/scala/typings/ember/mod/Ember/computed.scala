package typings.ember.mod.Ember

import typings.emberObject.anon.Id
import typings.emberObject.anon.Until
import typings.emberObject.typesMod.ComputedPropertyCallback
import typings.std.MethodDecorator
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof EmberObjectNs.computed` */
object computed {
  
  @JSImport("ember", "Ember.computed")
  @js.native
  def apply(deps: java.lang.String*): MethodDecorator = js.native
  @JSImport("ember", "Ember.computed")
  @js.native
  def apply(
    k1: java.lang.String,
    k2: java.lang.String,
    k3: java.lang.String,
    k4: java.lang.String,
    k5: java.lang.String,
    k6: java.lang.String,
    k7: java.lang.String,
    rest: js.Any*
  ): typings.emberObject.computedMod.ComputedProperty[_, _] = js.native
  @JSImport("ember", "Ember.computed")
  @js.native
  def apply[T](cb: ComputedPropertyCallback[T]): typings.emberObject.computedMod.ComputedProperty[T, T] = js.native
  @JSImport("ember", "Ember.computed")
  @js.native
  def apply[T](k1: java.lang.String, cb: ComputedPropertyCallback[T]): typings.emberObject.computedMod.ComputedProperty[T, T] = js.native
  @JSImport("ember", "Ember.computed")
  @js.native
  def apply[T](k1: java.lang.String, k2: java.lang.String, cb: ComputedPropertyCallback[T]): typings.emberObject.computedMod.ComputedProperty[T, T] = js.native
  @JSImport("ember", "Ember.computed")
  @js.native
  def apply[T](k1: java.lang.String, k2: java.lang.String, k3: java.lang.String, cb: ComputedPropertyCallback[T]): typings.emberObject.computedMod.ComputedProperty[T, T] = js.native
  @JSImport("ember", "Ember.computed")
  @js.native
  def apply[T](
    k1: java.lang.String,
    k2: java.lang.String,
    k3: java.lang.String,
    k4: java.lang.String,
    cb: ComputedPropertyCallback[T]
  ): typings.emberObject.computedMod.ComputedProperty[T, T] = js.native
  @JSImport("ember", "Ember.computed")
  @js.native
  def apply[T](
    k1: java.lang.String,
    k2: java.lang.String,
    k3: java.lang.String,
    k4: java.lang.String,
    k5: java.lang.String,
    cb: ComputedPropertyCallback[T]
  ): typings.emberObject.computedMod.ComputedProperty[T, T] = js.native
  @JSImport("ember", "Ember.computed")
  @js.native
  def apply[T](
    k1: java.lang.String,
    k2: java.lang.String,
    k3: java.lang.String,
    k4: java.lang.String,
    k5: java.lang.String,
    k6: java.lang.String,
    cb: ComputedPropertyCallback[T]
  ): typings.emberObject.computedMod.ComputedProperty[T, T] = js.native
  
  /* was `typeof ComputedNamespace.alias` */
  @JSImport("ember", "Ember.computed.alias")
  @js.native
  def alias(dependentKey: java.lang.String): typings.emberObject.computedMod.ComputedProperty[_, _] = js.native
  
  /* was `typeof ComputedNamespace.and` */
  @JSImport("ember", "Ember.computed.and")
  @js.native
  def and(dependentKeys: java.lang.String*): typings.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  
  /* was `typeof ComputedNamespace.bool` */
  @JSImport("ember", "Ember.computed.bool")
  @js.native
  def bool(dependentKey: java.lang.String): typings.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  
  /* was `typeof ComputedNamespace.collect` */
  @JSImport("ember", "Ember.computed.collect")
  @js.native
  def collect(dependentKeys: java.lang.String*): typings.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  /* was `typeof ComputedNamespace.deprecatingAlias` */
  @JSImport("ember", "Ember.computed.deprecatingAlias")
  @js.native
  def deprecatingAlias(dependentKey: java.lang.String): typings.emberObject.computedMod.ComputedProperty[_, _] = js.native
  /* was `typeof ComputedNamespace.deprecatingAlias` */
  @JSImport("ember", "Ember.computed.deprecatingAlias")
  @js.native
  def deprecatingAlias(dependentKey: java.lang.String, options: Id): typings.emberObject.computedMod.ComputedProperty[_, _] = js.native
  @JSImport("ember", "Ember.computed.deprecatingAlias")
  @js.native
  def deprecatingAlias(dependentKey: java.lang.String, options: Until): typings.emberObject.computedMod.ComputedProperty[_, _] = js.native
  
  /* was `typeof ComputedNamespace.empty` */
  @JSImport("ember", "Ember.computed.empty")
  @js.native
  def empty(dependentKey: java.lang.String): typings.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  
  /* was `typeof ComputedNamespace.equal` */
  @JSImport("ember", "Ember.computed.equal")
  @js.native
  def equal(dependentKey: java.lang.String, value: js.Any): typings.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  
  /* was `typeof ComputedNamespace.filter` */
  @JSImport("ember", "Ember.computed.filter")
  @js.native
  def filter(
    dependentKey: java.lang.String,
    additionalDependentKeys: js.Array[java.lang.String],
    callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Boolean]
  ): typings.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  /* was `typeof ComputedNamespace.filter` */
  @JSImport("ember", "Ember.computed.filter")
  @js.native
  def filter(
    dependentKey: java.lang.String,
    callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Boolean]
  ): typings.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  /* was `typeof ComputedNamespace.filterBy` */
  @JSImport("ember", "Ember.computed.filterBy")
  @js.native
  def filterBy(dependentKey: java.lang.String, propertyKey: java.lang.String): typings.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  @JSImport("ember", "Ember.computed.filterBy")
  @js.native
  def filterBy(dependentKey: java.lang.String, propertyKey: java.lang.String, value: js.Any): typings.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  /* was `typeof ComputedNamespace.gt` */
  @JSImport("ember", "Ember.computed.gt")
  @js.native
  def gt(dependentKey: java.lang.String, value: Double): typings.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  
  /* was `typeof ComputedNamespace.gte` */
  @JSImport("ember", "Ember.computed.gte")
  @js.native
  def gte(dependentKey: java.lang.String, value: Double): typings.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  
  /* was `typeof ComputedNamespace.intersect` */
  @JSImport("ember", "Ember.computed.intersect")
  @js.native
  def intersect(propertyKeys: java.lang.String*): typings.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  /* was `typeof ComputedNamespace.lt` */
  @JSImport("ember", "Ember.computed.lt")
  @js.native
  def lt(dependentKey: java.lang.String, value: Double): typings.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  
  /* was `typeof ComputedNamespace.lte` */
  @JSImport("ember", "Ember.computed.lte")
  @js.native
  def lte(dependentKey: java.lang.String, value: Double): typings.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  
  /* was `typeof ComputedNamespace.map` */
  @JSImport("ember", "Ember.computed.map")
  @js.native
  def map[U](
    dependentKey: java.lang.String,
    callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], U]
  ): typings.emberObject.computedMod.ComputedProperty[js.Array[U], js.Array[U]] = js.native
  
  /* was `typeof ComputedNamespace.mapBy` */
  @JSImport("ember", "Ember.computed.mapBy")
  @js.native
  def mapBy(dependentKey: java.lang.String, propertyKey: java.lang.String): typings.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  /* was `typeof ComputedNamespace.max` */
  @JSImport("ember", "Ember.computed.max")
  @js.native
  def max(dependentKey: java.lang.String): typings.emberObject.computedMod.ComputedProperty[Double, Double] = js.native
  
  /* was `typeof ComputedNamespace.min` */
  @JSImport("ember", "Ember.computed.min")
  @js.native
  def min(dependentKey: java.lang.String): typings.emberObject.computedMod.ComputedProperty[Double, Double] = js.native
  
  /* was `typeof ComputedNamespace.none` */
  @JSImport("ember", "Ember.computed.none")
  @js.native
  def none(dependentKey: java.lang.String): typings.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  
  /* was `typeof ComputedNamespace.not` */
  @JSImport("ember", "Ember.computed.not")
  @js.native
  def not(dependentKey: java.lang.String): typings.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  
  /* was `typeof ComputedNamespace.notEmpty` */
  @JSImport("ember", "Ember.computed.notEmpty")
  @js.native
  def notEmpty(dependentKey: java.lang.String): typings.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  
  /* was `typeof ComputedNamespace.oneWay` */
  @JSImport("ember", "Ember.computed.oneWay")
  @js.native
  def oneWay(dependentKey: java.lang.String): typings.emberObject.computedMod.ComputedProperty[_, _] = js.native
  
  /* was `typeof ComputedNamespace.or` */
  @JSImport("ember", "Ember.computed.or")
  @js.native
  def or(dependentKeys: java.lang.String*): typings.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  
  /* was `typeof ComputedNamespace.readOnly` */
  @JSImport("ember", "Ember.computed.readOnly")
  @js.native
  def readOnly(dependentKey: java.lang.String): typings.emberObject.computedMod.ComputedProperty[_, _] = js.native
  
  /* was `typeof ComputedNamespace.reads` */
  @JSImport("ember", "Ember.computed.reads")
  @js.native
  def reads(dependentKey: java.lang.String): typings.emberObject.computedMod.ComputedProperty[_, _] = js.native
  
  /* was `typeof ComputedNamespace.setDiff` */
  @JSImport("ember", "Ember.computed.setDiff")
  @js.native
  def setDiff(setAProperty: java.lang.String, setBProperty: java.lang.String): typings.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  /* was `typeof ComputedNamespace.sort` */
  @JSImport("ember", "Ember.computed.sort")
  @js.native
  def sort(
    itemsKey: java.lang.String,
    dependentKeys: js.Array[java.lang.String],
    sortDefinition: java.lang.String
  ): typings.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  @JSImport("ember", "Ember.computed.sort")
  @js.native
  def sort(
    itemsKey: java.lang.String,
    dependentKeys: js.Array[java.lang.String],
    sortDefinition: js.Function2[/* itemA */ js.Any, /* itemB */ js.Any, Double]
  ): typings.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  /* was `typeof ComputedNamespace.sort` */
  @JSImport("ember", "Ember.computed.sort")
  @js.native
  def sort(itemsKey: java.lang.String, sortDefinition: java.lang.String): typings.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  @JSImport("ember", "Ember.computed.sort")
  @js.native
  def sort(
    itemsKey: java.lang.String,
    sortDefinition: js.Function2[/* itemA */ js.Any, /* itemB */ js.Any, Double]
  ): typings.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  /* was `typeof ComputedNamespace.sum` */
  @JSImport("ember", "Ember.computed.sum")
  @js.native
  def sum(dependentKey: java.lang.String): typings.emberObject.computedMod.ComputedProperty[Double, Double] = js.native
  
  /* was `typeof ComputedNamespace.union` */
  @JSImport("ember", "Ember.computed.union")
  @js.native
  def union(propertyKeys: java.lang.String*): typings.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  /* was `typeof ComputedNamespace.uniq` */
  @JSImport("ember", "Ember.computed.uniq")
  @js.native
  def uniq(propertyKey: java.lang.String): typings.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  /* was `typeof ComputedNamespace.uniqBy` */
  @JSImport("ember", "Ember.computed.uniqBy")
  @js.native
  def uniqBy(dependentKey: java.lang.String, propertyKey: java.lang.String): typings.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  /* was `typeof ComputedNamespace.match` */
  @JSImport("ember", "Ember.computed.match")
  @js.native
  def `match`(dependentKey: java.lang.String, regexp: RegExp): typings.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
}
