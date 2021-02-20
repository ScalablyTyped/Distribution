package typings.emberObject

import typings.emberObject.anon.TypeofCoreObject
import typings.emberObject.typesMod.EmberClassArguments
import typings.emberObject.typesMod.EmberClassConstructor
import typings.emberObject.typesMod.EmberInstanceArguments
import typings.emberObject.typesMod.Fix
import typings.emberObject.typesMod.MixinOrLiteral
import typings.emberObject.typesMod.Objectify
import typings.emberObject.typesMod.UnwrapComputedPropertySetters
import typings.std.InstanceType
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("@ember/object/core", JSImport.Default)
  @js.native
  /**
    * As of Ember 3.1, CoreObject constructor takes initial object properties as an argument.
    * See: https://github.com/emberjs/ember.js/commit/4709935854d4c29b0d2c054614d53fa2c55309b1
    */
  class default () extends CoreObject {
    def this(properties: js.Object) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ember/object/core", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ember/object/core", "default.create")
    @js.native
    def create[Class /* <: TypeofCoreObject */](): InstanceType[Class] = js.native
    @JSImport("@ember/object/core", "default.create")
    @js.native
    def create[Class /* <: TypeofCoreObject */, T1 /* <: EmberInstanceArguments[UnwrapComputedPropertySetters[InstanceType[Class]]] */](arg1: T1 with (ThisType[T1 with InstanceType[Class]])): InstanceType[Class] with T1 = js.native
    @JSImport("@ember/object/core", "default.create")
    @js.native
    def create[Class /* <: TypeofCoreObject */, T1 /* <: EmberInstanceArguments[UnwrapComputedPropertySetters[InstanceType[Class]]] */, T2 /* <: EmberInstanceArguments[UnwrapComputedPropertySetters[InstanceType[Class]]] */](
      arg1: T1 with (ThisType[T1 with InstanceType[Class]]),
      arg2: T2 with (ThisType[T2 with InstanceType[Class]])
    ): InstanceType[Class] with T1 with T2 = js.native
    @JSImport("@ember/object/core", "default.create")
    @js.native
    def create[Class /* <: TypeofCoreObject */, T1 /* <: EmberInstanceArguments[UnwrapComputedPropertySetters[InstanceType[Class]]] */, T2 /* <: EmberInstanceArguments[UnwrapComputedPropertySetters[InstanceType[Class]]] */, T3 /* <: EmberInstanceArguments[UnwrapComputedPropertySetters[InstanceType[Class]]] */](
      arg1: T1 with (ThisType[T1 with InstanceType[Class]]),
      arg2: T2 with (ThisType[T2 with InstanceType[Class]]),
      arg3: T3 with (ThisType[T3 with InstanceType[Class]])
    ): InstanceType[Class] with T1 with T2 with T3 = js.native
    
    @JSImport("@ember/object/core", "default.detect")
    @js.native
    def detect[Statics, Instance](obj: js.Any): Boolean = js.native
    
    @JSImport("@ember/object/core", "default.detectInstance")
    @js.native
    def detectInstance[Instance](obj: js.Any): /* is Instance */ Boolean = js.native
    
    /**
      * Iterate over each computed property for the class, passing its name and any
      * associated metadata (see metaForProperty) to the callback.
      */
    @JSImport("@ember/object/core", "default.eachComputedProperty")
    @js.native
    def eachComputedProperty(callback: js.Function1[/* repeated */ js.Any, _], binding: js.Object): Unit = js.native
    
    @JSImport("@ember/object/core", "default.extend")
    @js.native
    def extend[Statics, Instance](): Objectify[Statics] with EmberClassConstructor[Instance] = js.native
    @JSImport("@ember/object/core", "default.extend")
    @js.native
    def extend[Statics, Instance /* <: B1 */, T1 /* <: EmberClassArguments */, B1](arg1: (MixinOrLiteral[T1, B1]) with (ThisType[Fix[Instance with T1]])): Objectify[Statics] with (EmberClassConstructor[T1 with Instance]) = js.native
    @JSImport("@ember/object/core", "default.extend")
    @js.native
    def extend[Statics, Instance /* <: B1 with B2 */, T1 /* <: EmberClassArguments */, B1, T2 /* <: EmberClassArguments */, B2](
      arg1: (MixinOrLiteral[T1, B1]) with (ThisType[Fix[Instance with T1]]),
      arg2: (MixinOrLiteral[T2, B2]) with (ThisType[Fix[Instance with T1 with T2]])
    ): Objectify[Statics] with (EmberClassConstructor[T1 with T2 with Instance]) = js.native
    @JSImport("@ember/object/core", "default.extend")
    @js.native
    def extend[Statics, Instance /* <: B1 with B2 with B3 */, T1 /* <: EmberClassArguments */, B1, T2 /* <: EmberClassArguments */, B2, T3 /* <: EmberClassArguments */, B3](
      arg1: (MixinOrLiteral[T1, B1]) with (ThisType[Fix[Instance with T1]]),
      arg2: (MixinOrLiteral[T2, B2]) with (ThisType[Fix[Instance with T1 with T2]]),
      arg3: (MixinOrLiteral[T3, B3]) with (ThisType[Fix[Instance with T1 with T2 with T3]])
    ): Objectify[Statics] with (EmberClassConstructor[T1 with T2 with T3 with Instance]) = js.native
    @JSImport("@ember/object/core", "default.extend")
    @js.native
    def extend[Statics, Instance /* <: B1 with B2 with B3 with B4 */, T1 /* <: EmberClassArguments */, B1, T2 /* <: EmberClassArguments */, B2, T3 /* <: EmberClassArguments */, B3, T4 /* <: EmberClassArguments */, B4](
      arg1: (MixinOrLiteral[T1, B1]) with (ThisType[Fix[Instance with T1]]),
      arg2: (MixinOrLiteral[T2, B2]) with (ThisType[Fix[Instance with T1 with T2]]),
      arg3: (MixinOrLiteral[T3, B3]) with (ThisType[Fix[Instance with T1 with T2 with T3]]),
      arg4: (MixinOrLiteral[T4, B4]) with (ThisType[Fix[Instance with T1 with T2 with T3 with T4]])
    ): Objectify[Statics] with (EmberClassConstructor[T1 with T2 with T3 with T4 with Instance]) = js.native
    
    @JSImport("@ember/object/core", "default.isClass")
    @js.native
    def isClass: Boolean = js.native
    @scala.inline
    def isClass_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isClass")(x.asInstanceOf[js.Any])
    
    @JSImport("@ember/object/core", "default.isMethod")
    @js.native
    def isMethod: Boolean = js.native
    @scala.inline
    def isMethod_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMethod")(x.asInstanceOf[js.Any])
    
    /**
      * Returns the original hash that was passed to meta().
      * @param key property name
      */
    @JSImport("@ember/object/core", "default.metaForProperty")
    @js.native
    def metaForProperty(key: String): js.Object = js.native
    
    @JSImport("@ember/object/core", "default.reopen")
    @js.native
    def reopen[Statics, Instance](): Objectify[Statics] with EmberClassConstructor[Instance] = js.native
    @JSImport("@ember/object/core", "default.reopen")
    @js.native
    def reopen[Statics, Instance /* <: B1 */, T1 /* <: EmberClassArguments */, B1](arg1: (MixinOrLiteral[T1, B1]) with (ThisType[Fix[Instance with T1]])): Objectify[Statics] with (EmberClassConstructor[Instance with T1]) = js.native
    @JSImport("@ember/object/core", "default.reopen")
    @js.native
    def reopen[Statics, Instance /* <: B1 with B2 */, T1 /* <: EmberClassArguments */, B1, T2 /* <: EmberClassArguments */, B2](
      arg1: (MixinOrLiteral[T1, B1]) with (ThisType[Fix[Instance with T1]]),
      arg2: (MixinOrLiteral[T2, B2]) with (ThisType[Fix[Instance with T1 with T2]])
    ): Objectify[Statics] with (EmberClassConstructor[Instance with T1 with T2]) = js.native
    @JSImport("@ember/object/core", "default.reopen")
    @js.native
    def reopen[Statics, Instance /* <: B1 with B2 with B3 */, T1 /* <: EmberClassArguments */, B1, T2 /* <: EmberClassArguments */, B2, T3 /* <: EmberClassArguments */, B3](
      arg1: (MixinOrLiteral[T1, B1]) with (ThisType[Fix[Instance with T1]]),
      arg2: (MixinOrLiteral[T2, B2]) with (ThisType[Fix[Instance with T1 with T2]]),
      arg3: (MixinOrLiteral[T3, B3]) with (ThisType[Fix[Instance with T1 with T2 with T3]])
    ): Objectify[Statics] with (EmberClassConstructor[Instance with T1 with T2 with T3]) = js.native
    
    @JSImport("@ember/object/core", "default.reopenClass")
    @js.native
    def reopenClass[Statics](): Statics = js.native
    @JSImport("@ember/object/core", "default.reopenClass")
    @js.native
    def reopenClass[Statics, T1 /* <: EmberClassArguments */](arg1: T1): Statics with T1 = js.native
    @JSImport("@ember/object/core", "default.reopenClass")
    @js.native
    def reopenClass[Statics, T1 /* <: EmberClassArguments */, T2 /* <: EmberClassArguments */](arg1: T1, arg2: T2): Statics with T1 with T2 = js.native
    @JSImport("@ember/object/core", "default.reopenClass")
    @js.native
    def reopenClass[Statics, T1 /* <: EmberClassArguments */, T2 /* <: EmberClassArguments */, T3 /* <: EmberClassArguments */](arg1: T1, arg2: T2, arg3: T3): Statics with T1 with T2 with T3 = js.native
  }
  
  @js.native
  trait CoreObject extends StObject {
    
    def _super(args: js.Any*): js.Any = js.native
    
    /**
      * Defines the properties that will be concatenated from the superclass (instead of overridden).
      * @default null
      */
    var concatenatedProperties: js.Array[_] = js.native
    
    /**
      * Destroys an object by setting the `isDestroyed` flag and removing its
      * metadata, which effectively destroys observers and bindings.
      * If you try to set a property on a destroyed object, an exception will be
      * raised.
      * Note that destruction is scheduled for the end of the run loop and does not
      * happen immediately.  It will set an isDestroying flag immediately.
      * @return receiver
      */
    def destroy(): CoreObject = js.native
    
    /**
      * An overridable method called when objects are instantiated. By default,
      * does nothing unless it is overridden during class definition.
      */
    def init(): Unit = js.native
    
    /**
      * Destroyed object property flag. If this property is true the observers and bindings were
      * already removed by the effect of calling the destroy() method.
      * @default false
      */
    var isDestroyed: Boolean = js.native
    
    /**
      * Destruction scheduled flag. The destroy() method has been called. The object stays intact
      * until the end of the run loop at which point the isDestroyed flag is set.
      * @default false
      */
    var isDestroying: Boolean = js.native
    
    /**
      * Override to implement teardown.
      */
    def willDestroy(): Unit = js.native
  }
  object CoreObject {
    
    @scala.inline
    def apply(
      _super: /* repeated */ js.Any => js.Any,
      concatenatedProperties: js.Array[_],
      destroy: () => CoreObject,
      init: () => Unit,
      isDestroyed: Boolean,
      isDestroying: Boolean,
      willDestroy: () => Unit
    ): CoreObject = {
      val __obj = js.Dynamic.literal(_super = js.Any.fromFunction1(_super), concatenatedProperties = concatenatedProperties.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction0(init), isDestroyed = isDestroyed.asInstanceOf[js.Any], isDestroying = isDestroying.asInstanceOf[js.Any], willDestroy = js.Any.fromFunction0(willDestroy))
      __obj.asInstanceOf[CoreObject]
    }
    
    @scala.inline
    implicit class CoreObjectMutableBuilder[Self <: CoreObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcatenatedProperties(value: js.Array[_]): Self = StObject.set(x, "concatenatedProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcatenatedPropertiesVarargs(value: js.Any*): Self = StObject.set(x, "concatenatedProperties", js.Array(value :_*))
      
      @scala.inline
      def setDestroy(value: () => CoreObject): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDestroyed(value: Boolean): Self = StObject.set(x, "isDestroyed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDestroying(value: Boolean): Self = StObject.set(x, "isDestroying", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWillDestroy(value: () => Unit): Self = StObject.set(x, "willDestroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_super(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "_super", js.Any.fromFunction1(value))
    }
  }
}
