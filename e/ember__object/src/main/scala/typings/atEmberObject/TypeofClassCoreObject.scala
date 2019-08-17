package typings.atEmberObject

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.atEmberObject.coreMod.CoreObject
import typings.atEmberObject.dashPrivateTypesMod.EmberClassArguments
import typings.atEmberObject.dashPrivateTypesMod.EmberClassConstructor
import typings.atEmberObject.dashPrivateTypesMod.EmberInstanceArguments
import typings.atEmberObject.dashPrivateTypesMod.Fix
import typings.atEmberObject.dashPrivateTypesMod.MixinOrLiteral
import typings.atEmberObject.dashPrivateTypesMod.Objectify
import typings.atEmberObject.dashPrivateTypesMod.UnwrapComputedPropertySetters
import typings.std.InstanceType
import typings.std.ThisType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassCoreObject
  extends Instantiable0[CoreObject]
     with Instantiable1[/* properties */ js.Object, CoreObject] {
  var isClass: Boolean = js.native
  var isMethod: Boolean = js.native
  def create[Class /* <: /* import warning: ImportType.apply Failed type conversion: typeof CoreObject */ js.Any */](`this`: Class): InstanceType[Class] = js.native
  def create[Class /* <: /* import warning: ImportType.apply Failed type conversion: typeof CoreObject */ js.Any */, T1 /* <: EmberInstanceArguments[UnwrapComputedPropertySetters[InstanceType[Class]]] */](`this`: Class, arg1: T1 with (ThisType[T1 with InstanceType[Class]])): InstanceType[Class] with T1 = js.native
  def create[Class /* <: /* import warning: ImportType.apply Failed type conversion: typeof CoreObject */ js.Any */, T1 /* <: EmberInstanceArguments[UnwrapComputedPropertySetters[InstanceType[Class]]] */, T2 /* <: EmberInstanceArguments[UnwrapComputedPropertySetters[InstanceType[Class]]] */](
    `this`: Class,
    arg1: T1 with (ThisType[T1 with InstanceType[Class]]),
    arg2: T2 with (ThisType[T2 with InstanceType[Class]])
  ): InstanceType[Class] with T1 with T2 = js.native
  def create[Class /* <: /* import warning: ImportType.apply Failed type conversion: typeof CoreObject */ js.Any */, T1 /* <: EmberInstanceArguments[UnwrapComputedPropertySetters[InstanceType[Class]]] */, T2 /* <: EmberInstanceArguments[UnwrapComputedPropertySetters[InstanceType[Class]]] */, T3 /* <: EmberInstanceArguments[UnwrapComputedPropertySetters[InstanceType[Class]]] */](
    `this`: Class,
    arg1: T1 with (ThisType[T1 with InstanceType[Class]]),
    arg2: T2 with (ThisType[T2 with InstanceType[Class]]),
    arg3: T3 with (ThisType[T3 with InstanceType[Class]])
  ): InstanceType[Class] with T1 with T2 with T3 = js.native
  def detect[Statics, Instance](`this`: Statics with EmberClassConstructor[Instance], obj: js.Any): Boolean = js.native
  def detectInstance[Instance](`this`: EmberClassConstructor[Instance], obj: js.Any): /* is Instance */ Boolean = js.native
  /**
    * Iterate over each computed property for the class, passing its name and any
    * associated metadata (see metaForProperty) to the callback.
    */
  def eachComputedProperty(callback: js.Function1[/* repeated */ js.Any, _], binding: js.Object): Unit = js.native
  def extend[Statics, Instance](`this`: Statics with EmberClassConstructor[Instance]): Objectify[Statics] with EmberClassConstructor[Instance] = js.native
  def extend[Statics, Instance /* <: B1 */, T1 /* <: EmberClassArguments */, B1](
    `this`: Statics with EmberClassConstructor[Instance],
    arg1: (MixinOrLiteral[T1, B1]) with (ThisType[Fix[Instance with T1]])
  ): Objectify[Statics] with (EmberClassConstructor[T1 with Instance]) = js.native
  def extend[Statics, Instance /* <: B1 with B2 */, T1 /* <: EmberClassArguments */, B1, T2 /* <: EmberClassArguments */, B2](
    `this`: Statics with EmberClassConstructor[Instance],
    arg1: (MixinOrLiteral[T1, B1]) with (ThisType[Fix[Instance with T1]]),
    arg2: (MixinOrLiteral[T2, B2]) with (ThisType[Fix[Instance with T1 with T2]])
  ): Objectify[Statics] with (EmberClassConstructor[T1 with T2 with Instance]) = js.native
  def extend[Statics, Instance /* <: B1 with B2 with B3 */, T1 /* <: EmberClassArguments */, B1, T2 /* <: EmberClassArguments */, B2, T3 /* <: EmberClassArguments */, B3](
    `this`: Statics with EmberClassConstructor[Instance],
    arg1: (MixinOrLiteral[T1, B1]) with (ThisType[Fix[Instance with T1]]),
    arg2: (MixinOrLiteral[T2, B2]) with (ThisType[Fix[Instance with T1 with T2]]),
    arg3: (MixinOrLiteral[T3, B3]) with (ThisType[Fix[Instance with T1 with T2 with T3]])
  ): Objectify[Statics] with (EmberClassConstructor[T1 with T2 with T3 with Instance]) = js.native
  def extend[Statics, Instance /* <: B1 with B2 with B3 with B4 */, T1 /* <: EmberClassArguments */, B1, T2 /* <: EmberClassArguments */, B2, T3 /* <: EmberClassArguments */, B3, T4 /* <: EmberClassArguments */, B4](
    `this`: Statics with EmberClassConstructor[Instance],
    arg1: (MixinOrLiteral[T1, B1]) with (ThisType[Fix[Instance with T1]]),
    arg2: (MixinOrLiteral[T2, B2]) with (ThisType[Fix[Instance with T1 with T2]]),
    arg3: (MixinOrLiteral[T3, B3]) with (ThisType[Fix[Instance with T1 with T2 with T3]]),
    arg4: (MixinOrLiteral[T4, B4]) with (ThisType[Fix[Instance with T1 with T2 with T3 with T4]])
  ): Objectify[Statics] with (EmberClassConstructor[T1 with T2 with T3 with T4 with Instance]) = js.native
  /**
    * Returns the original hash that was passed to meta().
    * @param key property name
    */
  def metaForProperty(key: String): js.Object = js.native
  def reopen[Statics, Instance](`this`: Statics with EmberClassConstructor[Instance]): Objectify[Statics] with EmberClassConstructor[Instance] = js.native
  def reopen[Statics, Instance /* <: B1 */, T1 /* <: EmberClassArguments */, B1](
    `this`: Statics with EmberClassConstructor[Instance],
    arg1: (MixinOrLiteral[T1, B1]) with (ThisType[Fix[Instance with T1]])
  ): Objectify[Statics] with (EmberClassConstructor[Instance with T1]) = js.native
  def reopen[Statics, Instance /* <: B1 with B2 */, T1 /* <: EmberClassArguments */, B1, T2 /* <: EmberClassArguments */, B2](
    `this`: Statics with EmberClassConstructor[Instance],
    arg1: (MixinOrLiteral[T1, B1]) with (ThisType[Fix[Instance with T1]]),
    arg2: (MixinOrLiteral[T2, B2]) with (ThisType[Fix[Instance with T1 with T2]])
  ): Objectify[Statics] with (EmberClassConstructor[Instance with T1 with T2]) = js.native
  def reopen[Statics, Instance /* <: B1 with B2 with B3 */, T1 /* <: EmberClassArguments */, B1, T2 /* <: EmberClassArguments */, B2, T3 /* <: EmberClassArguments */, B3](
    `this`: Statics with EmberClassConstructor[Instance],
    arg1: (MixinOrLiteral[T1, B1]) with (ThisType[Fix[Instance with T1]]),
    arg2: (MixinOrLiteral[T2, B2]) with (ThisType[Fix[Instance with T1 with T2]]),
    arg3: (MixinOrLiteral[T3, B3]) with (ThisType[Fix[Instance with T1 with T2 with T3]])
  ): Objectify[Statics] with (EmberClassConstructor[Instance with T1 with T2 with T3]) = js.native
  def reopenClass[Statics](`this`: Statics): Statics = js.native
  def reopenClass[Statics, T1 /* <: EmberClassArguments */](`this`: Statics, arg1: T1): Statics with T1 = js.native
  def reopenClass[Statics, T1 /* <: EmberClassArguments */, T2 /* <: EmberClassArguments */](`this`: Statics, arg1: T1, arg2: T2): Statics with T1 with T2 = js.native
  def reopenClass[Statics, T1 /* <: EmberClassArguments */, T2 /* <: EmberClassArguments */, T3 /* <: EmberClassArguments */](`this`: Statics, arg1: T1, arg2: T2, arg3: T3): Statics with T1 with T2 with T3 = js.native
}

