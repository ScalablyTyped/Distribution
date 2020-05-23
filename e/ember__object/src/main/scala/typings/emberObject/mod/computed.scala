package typings.emberObject.mod

import typings.emberObject.anon.Id
import typings.emberObject.anon.Until
import typings.emberObject.computedMod.ComputedProperty
import typings.emberObject.typesMod.ComputedPropertyCallback
import typings.std.MethodDecorator
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/object", "computed")
@js.native
object computed extends js.Object {
  val alias: js.Function1[/* dependentKey */ String, ComputedProperty[js.Any, js.Any]] = js.native
  val and: js.Function1[/* repeated */ String, ComputedProperty[Boolean, Boolean]] = js.native
  val bool: js.Function1[/* dependentKey */ String, ComputedProperty[Boolean, Boolean]] = js.native
  val collect: js.Function1[/* repeated */ String, ComputedProperty[js.Array[js.Any], js.Array[js.Any]]] = js.native
  val empty: js.Function1[/* dependentKey */ String, ComputedProperty[Boolean, Boolean]] = js.native
  val equal: js.Function2[/* dependentKey */ String, /* value */ js.Any, ComputedProperty[Boolean, Boolean]] = js.native
  val filterBy: js.Function3[
    /* dependentKey */ String, 
    /* propertyKey */ String, 
    /* value */ js.UndefOr[js.Any], 
    ComputedProperty[js.Array[js.Any], js.Array[js.Any]]
  ] = js.native
  val gt: js.Function2[/* dependentKey */ String, /* value */ Double, ComputedProperty[Boolean, Boolean]] = js.native
  val gte: js.Function2[/* dependentKey */ String, /* value */ Double, ComputedProperty[Boolean, Boolean]] = js.native
  val intersect: js.Function1[/* repeated */ String, ComputedProperty[js.Array[js.Any], js.Array[js.Any]]] = js.native
  val lt: js.Function2[/* dependentKey */ String, /* value */ Double, ComputedProperty[Boolean, Boolean]] = js.native
  val lte: js.Function2[/* dependentKey */ String, /* value */ Double, ComputedProperty[Boolean, Boolean]] = js.native
  val mapBy: js.Function2[
    /* dependentKey */ String, 
    /* propertyKey */ String, 
    ComputedProperty[js.Array[js.Any], js.Array[js.Any]]
  ] = js.native
  val `match`: js.Function2[/* dependentKey */ String, /* regexp */ RegExp, ComputedProperty[Boolean, Boolean]] = js.native
  val max: js.Function1[/* dependentKey */ String, ComputedProperty[Double, Double]] = js.native
  val min: js.Function1[/* dependentKey */ String, ComputedProperty[Double, Double]] = js.native
  val none: js.Function1[/* dependentKey */ String, ComputedProperty[Boolean, Boolean]] = js.native
  val not: js.Function1[/* dependentKey */ String, ComputedProperty[Boolean, Boolean]] = js.native
  val notEmpty: js.Function1[/* dependentKey */ String, ComputedProperty[Boolean, Boolean]] = js.native
  val oneWay: js.Function1[/* dependentKey */ String, ComputedProperty[js.Any, js.Any]] = js.native
  val or: js.Function1[/* repeated */ String, ComputedProperty[Boolean, Boolean]] = js.native
  val readOnly: js.Function1[/* dependentKey */ String, ComputedProperty[js.Any, js.Any]] = js.native
  val reads: js.Function1[/* dependentKey */ String, ComputedProperty[js.Any, js.Any]] = js.native
  val setDiff: js.Function2[
    /* setAProperty */ String, 
    /* setBProperty */ String, 
    ComputedProperty[js.Array[js.Any], js.Array[js.Any]]
  ] = js.native
  val sum: js.Function1[/* dependentKey */ String, ComputedProperty[Double, Double]] = js.native
  val union: js.Function1[/* repeated */ String, ComputedProperty[js.Array[js.Any], js.Array[js.Any]]] = js.native
  val uniq: js.Function1[/* propertyKey */ String, ComputedProperty[js.Array[js.Any], js.Array[js.Any]]] = js.native
  val uniqBy: js.Function2[
    /* dependentKey */ String, 
    /* propertyKey */ String, 
    ComputedProperty[js.Array[js.Any], js.Array[js.Any]]
  ] = js.native
  def apply(deps: String*): MethodDecorator = js.native
  def apply(k1: String, k2: String, k3: String, k4: String, k5: String, k6: String, k7: String, rest: js.Any*): ComputedProperty[_, _] = js.native
  def apply[T](cb: ComputedPropertyCallback[T]): ComputedProperty[T, T] = js.native
  def apply[T](k1: String, cb: ComputedPropertyCallback[T]): ComputedProperty[T, T] = js.native
  def apply[T](k1: String, k2: String, cb: ComputedPropertyCallback[T]): ComputedProperty[T, T] = js.native
  def apply[T](k1: String, k2: String, k3: String, cb: ComputedPropertyCallback[T]): ComputedProperty[T, T] = js.native
  def apply[T](k1: String, k2: String, k3: String, k4: String, cb: ComputedPropertyCallback[T]): ComputedProperty[T, T] = js.native
  def apply[T](k1: String, k2: String, k3: String, k4: String, k5: String, cb: ComputedPropertyCallback[T]): ComputedProperty[T, T] = js.native
  def apply[T](
    k1: String,
    k2: String,
    k3: String,
    k4: String,
    k5: String,
    k6: String,
    cb: ComputedPropertyCallback[T]
  ): ComputedProperty[T, T] = js.native
  @js.native
  object deprecatingAlias extends js.Object {
    def apply(dependentKey: String): ComputedProperty[_, _] = js.native
    def apply(dependentKey: String, options: Id): ComputedProperty[_, _] = js.native
    def apply(dependentKey: String, options: Until): ComputedProperty[_, _] = js.native
  }
  
  @js.native
  object filter extends js.Object {
    def apply(
      dependentKey: String,
      additionalDependentKeys: js.Array[String],
      callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Boolean]
    ): ComputedProperty[js.Array[_], js.Array[_]] = js.native
    def apply(
      dependentKey: String,
      callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Boolean]
    ): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  }
  
  @js.native
  object map extends js.Object {
    def apply[U](
      dependentKey: String,
      callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], U]
    ): ComputedProperty[js.Array[U], js.Array[U]] = js.native
  }
  
  @js.native
  object sort extends js.Object {
    def apply(itemsKey: String, dependentKeys: js.Array[String], sortDefinition: String): ComputedProperty[js.Array[_], js.Array[_]] = js.native
    def apply(
      itemsKey: String,
      dependentKeys: js.Array[String],
      sortDefinition: js.Function2[/* itemA */ js.Any, /* itemB */ js.Any, Double]
    ): ComputedProperty[js.Array[_], js.Array[_]] = js.native
    def apply(itemsKey: String, sortDefinition: String): ComputedProperty[js.Array[_], js.Array[_]] = js.native
    def apply(itemsKey: String, sortDefinition: js.Function2[/* itemA */ js.Any, /* itemB */ js.Any, Double]): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  }
  
}

