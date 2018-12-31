package typings
package atEmberUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def compare(v: js.Any, w: js.Any): scala.Double = js.native
  def isBlank(): scala.Boolean = js.native
  def isBlank(obj: js.Any): scala.Boolean = js.native
  def isEmpty(): scala.Boolean = js.native
  def isEmpty(obj: js.Any): scala.Boolean = js.native
  def isEqual(a: js.Any, b: js.Any): scala.Boolean = js.native
  def isNone(): scala.Boolean = js.native
  def isNone(obj: js.Any): scala.Boolean = js.native
  def isPresent(): scala.Boolean = js.native
  def isPresent(obj: js.Any): scala.Boolean = js.native
  def tryInvoke(obj: js.Object, methodName: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def tryInvoke(obj: js.Object, methodName: java.lang.String, args: js.Array[_]): js.UndefOr[scala.Nothing] = js.native
  def tryInvoke[FNAME /* <: java.lang.String */, T /* <: js.Object */](obj: T, methodName: FNAME): js.UndefOr[
    stdLib.ReturnType[/* import warning: ImportType.apply Failed type conversion: T[FNAME] */ js.Any]
  ] = js.native
  def tryInvoke[FNAME /* <: java.lang.String */, T /* <: js.Object */](
    obj: T,
    methodName: FNAME,
    args: atEmberUtilsLib.dashPrivateTypesMod.FunctionArgs[/* import warning: ImportType.apply Failed type conversion: T[FNAME] */ js.Any]
  ): js.UndefOr[
    stdLib.ReturnType[/* import warning: ImportType.apply Failed type conversion: T[FNAME] */ js.Any]
  ] = js.native
  def typeOf(): atEmberUtilsLib.atEmberUtilsLibStrings.undefined = js.native
  def typeOf(item: js.Any): java.lang.String = js.native
  def typeOf[T](value: T): atEmberUtilsLib.dashPrivateTypesMod.KeysOfType[atEmberUtilsLib.dashPrivateTypesMod.TypeLookup, T] = js.native
}

