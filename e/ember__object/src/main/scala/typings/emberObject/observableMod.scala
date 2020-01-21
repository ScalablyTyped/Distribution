package typings.emberObject

import typings.emberObject.typesMod.ObserverMethod
import typings.emberObject.typesMod.UnwrapComputedPropertyGetter
import typings.emberObject.typesMod.UnwrapComputedPropertyGetters
import typings.emberObject.typesMod.UnwrapComputedPropertySetters
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/object/observable", JSImport.Namespace)
@js.native
object observableMod extends js.Object {
  /**
    * This mixin provides properties and property observing functionality, core features of the Ember object model.
    */
  @js.native
  trait Observable extends js.Object {
    def addObserver(key: String, method: ObserverMethod[this.type, this.type]): this.type = js.native
    /**
      * Adds an observer on a property.
      */
    def addObserver[Target](key: String, target: Target, method: ObserverMethod[Target, this.type]): this.type = js.native
    /**
      * Returns the cached value of a computed property, if it exists.
      * This allows you to inspect the value of a computed property
      * without accidentally invoking it if it is intended to be
      * generated lazily.
      */
    def cacheFor[K /* <: String */](key: K): js.UndefOr[
        UnwrapComputedPropertyGetter[
          /* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any
        ]
      ] = js.native
    /**
      * Set the value of a property to the current value minus some amount.
      */
    def decrementProperty(keyName: String): Double = js.native
    def decrementProperty(keyName: String, decrement: Double): Double = js.native
    /**
      * Retrieves the value of a property from the object.
      */
    def get[K /* <: String */](key: K): UnwrapComputedPropertyGetter[
        /* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any
      ] = js.native
    def getProperties[K /* <: String */](list: K*): Pick[UnwrapComputedPropertyGetters[this.type], K] = js.native
    /**
      * To get the values of multiple properties at once, call `getProperties`
      * with a list of strings or an array:
      */
    def getProperties[K /* <: String */](list: js.Array[K]): Pick[UnwrapComputedPropertyGetters[this.type], K] = js.native
    /**
      * Retrieves the value of a property, or a default value in the case that the
      * property returns `undefined`.
      */
    def getWithDefault[K /* <: String */](
      key: K,
      defaultValue: UnwrapComputedPropertyGetter[
          /* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any
        ]
    ): UnwrapComputedPropertyGetter[
        /* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any
      ] = js.native
    /**
      * Set the value of a property to the current value plus some amount.
      */
    def incrementProperty(keyName: String): Double = js.native
    def incrementProperty(keyName: String, increment: Double): Double = js.native
    /**
      * Convenience method to call `propertyWillChange` and `propertyDidChange` in
      * succession.
      */
    def notifyPropertyChange(keyName: String): this.type = js.native
    def removeObserver(key: String, method: ObserverMethod[this.type, this.type]): this.type = js.native
    /**
      * Remove an observer you have previously registered on this object. Pass
      * the same key, target, and method you passed to `addObserver()` and your
      * target will no longer receive notifications.
      */
    def removeObserver[Target](key: String, target: Target, method: ObserverMethod[Target, this.type]): this.type = js.native
    /**
      * Sets the provided key or path to the value.
      */
    def set[K /* <: String */](
      key: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any
    ): /* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any = js.native
    def set[T](key: String, value: T): T = js.native
    def setProperties[K /* <: String */](
      // tslint:disable-next-line:unified-signatures
    hash: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ KK in K ]: any}
      */ typings.emberObject.emberObjectStrings.Observable with js.Any
    ): Pick[UnwrapComputedPropertySetters[this.type], K] = js.native
    /**
      * Sets a list of properties at once. These properties are set inside
      * a single `beginPropertyChanges` and `endPropertyChanges` batch, so
      * observers will be buffered.
      */
    def setProperties[K /* <: String */](hash: Pick[this.type, K]): Pick[UnwrapComputedPropertySetters[this.type], K] = js.native
    /**
      * Set the value of a boolean property to the opposite of its
      * current value.
      */
    def toggleProperty(keyName: String): Boolean = js.native
  }
  
  val default: typings.emberObject.mixinMod.default[Observable, typings.emberObject.coreMod.default] = js.native
}

