package typings.atEmberUtils

import typings.atEmberUtils.atEmberUtilsStrings.undefined
import typings.atEmberUtils.dashPrivateTypesMod.FunctionArgs
import typings.atEmberUtils.dashPrivateTypesMod.KeysOfType
import typings.atEmberUtils.dashPrivateTypesMod.TypeLookup
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/utils", JSImport.Namespace)
@js.native
object atEmberUtilsMod extends js.Object {
  def compare(v: js.Any, w: js.Any): Double = js.native
  def isBlank(): Boolean = js.native
  def isBlank(obj: js.Any): Boolean = js.native
  def isEmpty(): Boolean = js.native
  def isEmpty(obj: js.Any): Boolean = js.native
  def isEqual(a: js.Any, b: js.Any): Boolean = js.native
  def isNone(): Boolean = js.native
  def isNone(obj: js.Any): Boolean = js.native
  def isPresent(): Boolean = js.native
  def isPresent(obj: js.Any): Boolean = js.native
  def tryInvoke(obj: js.Object, methodName: String): js.UndefOr[scala.Nothing] = js.native
  def tryInvoke(obj: js.Object, methodName: String, args: js.Array[_]): js.UndefOr[scala.Nothing] = js.native
  def tryInvoke[FNAME /* <: String */, T /* <: js.Object */](obj: T, methodName: FNAME): js.UndefOr[
    ReturnType[/* import warning: ImportType.apply Failed type conversion: T[FNAME] */ js.Any]
  ] = js.native
  def tryInvoke[FNAME /* <: String */, T /* <: js.Object */](
    obj: T,
    methodName: FNAME,
    args: FunctionArgs[/* import warning: ImportType.apply Failed type conversion: T[FNAME] */ js.Any]
  ): js.UndefOr[
    ReturnType[/* import warning: ImportType.apply Failed type conversion: T[FNAME] */ js.Any]
  ] = js.native
  def typeOf(): undefined = js.native
  def typeOf(item: js.Any): String = js.native
  def typeOf[T](value: T): KeysOfType[TypeLookup, T] = js.native
}

