package typings.emberObject

import typings.std.PropertyDecorator
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/object/computed", JSImport.Namespace)
@js.native
object computedMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.emberObject.typesMod.ComputedPropertyMarker because Inheritance from two classes. Inlined ______getType, ______setType */ @js.native
  trait ComputedProperty[Get, Set] extends PropertyDecorator {
    // Necessary in order to avoid losing type information
    //    see: https://github.com/typed-ember/ember-cli-typescript/issues/246#issuecomment-414812013
    var ______getType: Get = js.native
    var ______setType: Set = js.native
    def meta(): js.Object = js.native
    /**
      * In some cases, you may want to annotate computed properties with additional
      * metadata about how they function or what values they operate on. For example,
      * computed property functions may close over variables that are then no longer
      * available for introspection.
      */
    def meta(meta: js.Object): this.type = js.native
    /**
      * Sets the dependent keys on this computed property. Pass any number of
      * arguments containing key paths that this computed property depends on.
      */
    def property(path: String*): this.type = js.native
    /**
      * Call on a computed property to set it into read-only mode. When in this
      * mode the computed property will throw an error when set.
      */
    def readOnly(): this.type = js.native
    /**
      * Call on a computed property to set it into non-cached mode. When in this
      * mode the computed property will not automatically cache the return value.
      */
    def volatile(): this.type = js.native
  }
  
  @js.native
  class default[Get, Set] () extends ComputedProperty[Get, Set] {
    /* CompleteClass */
    override def apply(T0: /* target */ js.Object, T1: /* propertyKey */ String | js.Symbol): Unit = js.native
  }
  
  def alias(dependentKey: String): ComputedProperty[_, _] = js.native
  def and(dependentKeys: String*): ComputedProperty[Boolean, Boolean] = js.native
  def bool(dependentKey: String): ComputedProperty[Boolean, Boolean] = js.native
  def collect(dependentKeys: String*): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def deprecatingAlias(dependentKey: String): ComputedProperty[_, _] = js.native
  def deprecatingAlias(dependentKey: String, options: AnonId): ComputedProperty[_, _] = js.native
  def deprecatingAlias(dependentKey: String, options: AnonIdUntil): ComputedProperty[_, _] = js.native
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

