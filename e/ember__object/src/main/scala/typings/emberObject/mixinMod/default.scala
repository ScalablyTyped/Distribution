package typings.emberObject.mixinMod

import typings.emberObject.typesMod.Fix
import typings.emberObject.typesMod.MixinOrLiteral
import typings.std.ThisType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/object/mixin", JSImport.Default)
@js.native
class default[T, Base] () extends Mixin[T, Base]

/* static members */
@JSImport("@ember/object/mixin", JSImport.Default)
@js.native
object default extends js.Object {
  def create[T, Base](): Mixin[T, Base] = js.native
  def create[T, Base](args: (MixinOrLiteral[T, Base]) with (ThisType[Fix[T with Base]])): Mixin[T, Base] = js.native
  def create[T1, T2, Base](
    arg1: (MixinOrLiteral[T1, Base]) with (ThisType[Fix[T1 with Base]]),
    arg2: (MixinOrLiteral[T2, Base]) with (ThisType[Fix[T2 with Base]])
  ): Mixin[T1 with T2, Base] = js.native
  def create[T1, T2, T3, Base](
    arg1: (MixinOrLiteral[T1, Base]) with (ThisType[Fix[T1 with Base]]),
    arg2: (MixinOrLiteral[T2, Base]) with (ThisType[Fix[T2 with Base]]),
    arg3: (MixinOrLiteral[T3, Base]) with (ThisType[Fix[T3 with Base]])
  ): Mixin[T1 with T2 with T3, Base] = js.native
  def create[T1, T2, T3, T4, Base](
    arg1: (MixinOrLiteral[T1, Base]) with (ThisType[Fix[T1 with Base]]),
    arg2: (MixinOrLiteral[T2, Base]) with (ThisType[Fix[T2 with Base]]),
    arg3: (MixinOrLiteral[T3, Base]) with (ThisType[Fix[T3 with Base]]),
    arg4: (MixinOrLiteral[T4, Base]) with (ThisType[Fix[T4 with Base]])
  ): Mixin[T1 with T2 with T3 with T4, Base] = js.native
}

