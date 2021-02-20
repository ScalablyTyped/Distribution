package typings.emberObject

import typings.emberObject.anon.Id
import typings.emberObject.anon.Until
import typings.std.PropertyDecorator
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computedMod {
  
  @JSImport("@ember/object/computed", JSImport.Default)
  @js.native
  class default[Get, Set] () extends ComputedProperty[Get, Set] {
    
    /* CompleteClass */
    override def apply(T0: /* target */ js.Object, T1: /* propertyKey */ String | js.Symbol): Unit = js.native
  }
  
  @JSImport("@ember/object/computed", "alias")
  @js.native
  def alias(dependentKey: String): ComputedProperty[_, _] = js.native
  
  @JSImport("@ember/object/computed", "and")
  @js.native
  def and(dependentKeys: String*): ComputedProperty[Boolean, Boolean] = js.native
  
  @JSImport("@ember/object/computed", "bool")
  @js.native
  def bool(dependentKey: String): ComputedProperty[Boolean, Boolean] = js.native
  
  @JSImport("@ember/object/computed", "collect")
  @js.native
  def collect(dependentKeys: String*): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  @JSImport("@ember/object/computed", "deprecatingAlias")
  @js.native
  def deprecatingAlias(dependentKey: String): ComputedProperty[_, _] = js.native
  @JSImport("@ember/object/computed", "deprecatingAlias")
  @js.native
  def deprecatingAlias(dependentKey: String, options: Id): ComputedProperty[_, _] = js.native
  @JSImport("@ember/object/computed", "deprecatingAlias")
  @js.native
  def deprecatingAlias(dependentKey: String, options: Until): ComputedProperty[_, _] = js.native
  
  @JSImport("@ember/object/computed", "empty")
  @js.native
  def empty(dependentKey: String): ComputedProperty[Boolean, Boolean] = js.native
  
  @JSImport("@ember/object/computed", "equal")
  @js.native
  def equal(dependentKey: String, value: js.Any): ComputedProperty[Boolean, Boolean] = js.native
  
  @JSImport("@ember/object/computed", "expandProperties")
  @js.native
  def expandProperties(pattern: String, callback: js.Function1[/* expanded */ String, Unit]): Unit = js.native
  
  @JSImport("@ember/object/computed", "filter")
  @js.native
  def filter(
    dependentKey: String,
    additionalDependentKeys: js.Array[String],
    callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Boolean]
  ): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  @JSImport("@ember/object/computed", "filter")
  @js.native
  def filter(
    dependentKey: String,
    callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Boolean]
  ): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  @JSImport("@ember/object/computed", "filterBy")
  @js.native
  def filterBy(dependentKey: String, propertyKey: String): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  @JSImport("@ember/object/computed", "filterBy")
  @js.native
  def filterBy(dependentKey: String, propertyKey: String, value: js.Any): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  @JSImport("@ember/object/computed", "gt")
  @js.native
  def gt(dependentKey: String, value: Double): ComputedProperty[Boolean, Boolean] = js.native
  
  @JSImport("@ember/object/computed", "gte")
  @js.native
  def gte(dependentKey: String, value: Double): ComputedProperty[Boolean, Boolean] = js.native
  
  @JSImport("@ember/object/computed", "intersect")
  @js.native
  def intersect(propertyKeys: String*): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  @JSImport("@ember/object/computed", "lt")
  @js.native
  def lt(dependentKey: String, value: Double): ComputedProperty[Boolean, Boolean] = js.native
  
  @JSImport("@ember/object/computed", "lte")
  @js.native
  def lte(dependentKey: String, value: Double): ComputedProperty[Boolean, Boolean] = js.native
  
  @JSImport("@ember/object/computed", "map")
  @js.native
  def map[U](
    dependentKey: String,
    callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], U]
  ): ComputedProperty[js.Array[U], js.Array[U]] = js.native
  
  @JSImport("@ember/object/computed", "mapBy")
  @js.native
  def mapBy(dependentKey: String, propertyKey: String): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  @JSImport("@ember/object/computed", "max")
  @js.native
  def max(dependentKey: String): ComputedProperty[Double, Double] = js.native
  
  @JSImport("@ember/object/computed", "min")
  @js.native
  def min(dependentKey: String): ComputedProperty[Double, Double] = js.native
  
  @JSImport("@ember/object/computed", "none")
  @js.native
  def none(dependentKey: String): ComputedProperty[Boolean, Boolean] = js.native
  
  @JSImport("@ember/object/computed", "not")
  @js.native
  def not(dependentKey: String): ComputedProperty[Boolean, Boolean] = js.native
  
  @JSImport("@ember/object/computed", "notEmpty")
  @js.native
  def notEmpty(dependentKey: String): ComputedProperty[Boolean, Boolean] = js.native
  
  @JSImport("@ember/object/computed", "oneWay")
  @js.native
  def oneWay(dependentKey: String): ComputedProperty[_, _] = js.native
  
  @JSImport("@ember/object/computed", "or")
  @js.native
  def or(dependentKeys: String*): ComputedProperty[Boolean, Boolean] = js.native
  
  @JSImport("@ember/object/computed", "readOnly")
  @js.native
  def readOnly(dependentKey: String): ComputedProperty[_, _] = js.native
  
  @JSImport("@ember/object/computed", "reads")
  @js.native
  def reads(dependentKey: String): ComputedProperty[_, _] = js.native
  
  @JSImport("@ember/object/computed", "setDiff")
  @js.native
  def setDiff(setAProperty: String, setBProperty: String): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  @JSImport("@ember/object/computed", "sort")
  @js.native
  def sort(itemsKey: String, dependentKeys: js.Array[String], sortDefinition: String): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  @JSImport("@ember/object/computed", "sort")
  @js.native
  def sort(
    itemsKey: String,
    dependentKeys: js.Array[String],
    sortDefinition: js.Function2[/* itemA */ js.Any, /* itemB */ js.Any, Double]
  ): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  @JSImport("@ember/object/computed", "sort")
  @js.native
  def sort(itemsKey: String, sortDefinition: String): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  @JSImport("@ember/object/computed", "sort")
  @js.native
  def sort(itemsKey: String, sortDefinition: js.Function2[/* itemA */ js.Any, /* itemB */ js.Any, Double]): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  @JSImport("@ember/object/computed", "sum")
  @js.native
  def sum(dependentKey: String): ComputedProperty[Double, Double] = js.native
  
  @JSImport("@ember/object/computed", "union")
  @js.native
  def union(propertyKeys: String*): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  @JSImport("@ember/object/computed", "uniq")
  @js.native
  def uniq(propertyKey: String): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  @JSImport("@ember/object/computed", "uniqBy")
  @js.native
  def uniqBy(dependentKey: String, propertyKey: String): ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
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
  
  @JSImport("@ember/object/computed", "match")
  @js.native
  def `match`(dependentKey: String, regexp: RegExp): ComputedProperty[Boolean, Boolean] = js.native
}
