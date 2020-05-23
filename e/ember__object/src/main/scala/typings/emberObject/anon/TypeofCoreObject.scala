package typings.emberObject.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.emberObject.coreMod.CoreObject
import typings.emberObject.typesMod.EmberClassArguments
import typings.emberObject.typesMod.EmberClassConstructor
import typings.emberObject.typesMod.EmberInstanceArguments
import typings.emberObject.typesMod.Fix
import typings.emberObject.typesMod.MixinOrLiteral
import typings.emberObject.typesMod.Objectify
import typings.emberObject.typesMod.UnwrapComputedPropertySetters
import typings.std.InstanceType
import typings.std.ThisType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofCoreObject
  extends Instantiable0[CoreObject]
     with Instantiable1[/* properties */ js.Object, CoreObject] {
  var isClass: Boolean = js.native
  var isMethod: Boolean = js.native
  def create[Class /* <: /* import warning: importer.ImportType#apply Failed type conversion: typeof CoreObject */ js.Any */](): InstanceType[Class] = js.native
  def create[Class /* <: /* import warning: importer.ImportType#apply Failed type conversion: typeof CoreObject */ js.Any */, T1 /* <: EmberInstanceArguments[UnwrapComputedPropertySetters[InstanceType[Class]]] */](arg1: T1 with (ThisType[T1 with InstanceType[Class]])): InstanceType[Class] with T1 = js.native
  def create[Class /* <: /* import warning: importer.ImportType#apply Failed type conversion: typeof CoreObject */ js.Any */, T1 /* <: EmberInstanceArguments[UnwrapComputedPropertySetters[InstanceType[Class]]] */, T2 /* <: EmberInstanceArguments[UnwrapComputedPropertySetters[InstanceType[Class]]] */](
    arg1: T1 with (ThisType[T1 with InstanceType[Class]]),
    arg2: T2 with (ThisType[T2 with InstanceType[Class]])
  ): InstanceType[Class] with T1 with T2 = js.native
  def create[Class /* <: /* import warning: importer.ImportType#apply Failed type conversion: typeof CoreObject */ js.Any */, T1 /* <: EmberInstanceArguments[UnwrapComputedPropertySetters[InstanceType[Class]]] */, T2 /* <: EmberInstanceArguments[UnwrapComputedPropertySetters[InstanceType[Class]]] */, T3 /* <: EmberInstanceArguments[UnwrapComputedPropertySetters[InstanceType[Class]]] */](
    arg1: T1 with (ThisType[T1 with InstanceType[Class]]),
    arg2: T2 with (ThisType[T2 with InstanceType[Class]]),
    arg3: T3 with (ThisType[T3 with InstanceType[Class]])
  ): InstanceType[Class] with T1 with T2 with T3 = js.native
  def detect[Statics, Instance](obj: js.Any): Boolean = js.native
  def detectInstance[Instance](obj: js.Any): /* is Instance */ Boolean = js.native
  /**
    * Iterate over each computed property for the class, passing its name and any
    * associated metadata (see metaForProperty) to the callback.
    */
  def eachComputedProperty(callback: js.Function1[/* repeated */ js.Any, _], binding: js.Object): Unit = js.native
  def extend[Statics, Instance](): Objectify[Statics] with EmberClassConstructor[Instance] = js.native
  def extend[Statics, Instance /* <: B1 */, T1 /* <: EmberClassArguments */, B1](arg1: (MixinOrLiteral[T1, B1]) with (ThisType[Fix[Instance with T1]])): Objectify[Statics] with (EmberClassConstructor[T1 with Instance]) = js.native
  def extend[Statics, Instance /* <: B1 with B2 */, T1 /* <: EmberClassArguments */, B1, T2 /* <: EmberClassArguments */, B2](
    arg1: (MixinOrLiteral[T1, B1]) with (ThisType[Fix[Instance with T1]]),
    arg2: (MixinOrLiteral[T2, B2]) with (ThisType[Fix[Instance with T1 with T2]])
  ): Objectify[Statics] with (EmberClassConstructor[T1 with T2 with Instance]) = js.native
  def extend[Statics, Instance /* <: B1 with B2 with B3 */, T1 /* <: EmberClassArguments */, B1, T2 /* <: EmberClassArguments */, B2, T3 /* <: EmberClassArguments */, B3](
    arg1: (MixinOrLiteral[T1, B1]) with (ThisType[Fix[Instance with T1]]),
    arg2: (MixinOrLiteral[T2, B2]) with (ThisType[Fix[Instance with T1 with T2]]),
    arg3: (MixinOrLiteral[T3, B3]) with (ThisType[Fix[Instance with T1 with T2 with T3]])
  ): Objectify[Statics] with (EmberClassConstructor[T1 with T2 with T3 with Instance]) = js.native
  def extend[Statics, Instance /* <: B1 with B2 with B3 with B4 */, T1 /* <: EmberClassArguments */, B1, T2 /* <: EmberClassArguments */, B2, T3 /* <: EmberClassArguments */, B3, T4 /* <: EmberClassArguments */, B4](
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
  def reopen[Statics, Instance](): Objectify[Statics] with EmberClassConstructor[Instance] = js.native
  def reopen[Statics, Instance /* <: B1 */, T1 /* <: EmberClassArguments */, B1](arg1: (MixinOrLiteral[T1, B1]) with (ThisType[Fix[Instance with T1]])): Objectify[Statics] with (EmberClassConstructor[Instance with T1]) = js.native
  def reopen[Statics, Instance /* <: B1 with B2 */, T1 /* <: EmberClassArguments */, B1, T2 /* <: EmberClassArguments */, B2](
    arg1: (MixinOrLiteral[T1, B1]) with (ThisType[Fix[Instance with T1]]),
    arg2: (MixinOrLiteral[T2, B2]) with (ThisType[Fix[Instance with T1 with T2]])
  ): Objectify[Statics] with (EmberClassConstructor[Instance with T1 with T2]) = js.native
  def reopen[Statics, Instance /* <: B1 with B2 with B3 */, T1 /* <: EmberClassArguments */, B1, T2 /* <: EmberClassArguments */, B2, T3 /* <: EmberClassArguments */, B3](
    arg1: (MixinOrLiteral[T1, B1]) with (ThisType[Fix[Instance with T1]]),
    arg2: (MixinOrLiteral[T2, B2]) with (ThisType[Fix[Instance with T1 with T2]]),
    arg3: (MixinOrLiteral[T3, B3]) with (ThisType[Fix[Instance with T1 with T2 with T3]])
  ): Objectify[Statics] with (EmberClassConstructor[Instance with T1 with T2 with T3]) = js.native
  def reopenClass[Statics](): Statics = js.native
  def reopenClass[Statics, T1 /* <: EmberClassArguments */](arg1: T1): Statics with T1 = js.native
  def reopenClass[Statics, T1 /* <: EmberClassArguments */, T2 /* <: EmberClassArguments */](arg1: T1, arg2: T2): Statics with T1 with T2 = js.native
  def reopenClass[Statics, T1 /* <: EmberClassArguments */, T2 /* <: EmberClassArguments */, T3 /* <: EmberClassArguments */](arg1: T1, arg2: T2, arg3: T3): Statics with T1 with T2 with T3 = js.native
}

