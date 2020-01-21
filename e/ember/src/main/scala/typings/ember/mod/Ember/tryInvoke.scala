package typings.ember.mod.Ember

import typings.emberUtils.typesMod.FunctionArgs
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "Ember.tryInvoke")
@js.native
object tryInvoke extends js.Object {
  def apply(obj: js.Object, methodName: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def apply(obj: js.Object, methodName: java.lang.String, args: js.Array[_]): js.UndefOr[scala.Nothing] = js.native
  def apply[FNAME /* <: java.lang.String */, T /* <: js.Object */](obj: T, methodName: FNAME): js.UndefOr[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: T[FNAME] */ js.Any
    ]
  ] = js.native
  def apply[FNAME /* <: java.lang.String */, T /* <: js.Object */](
    obj: T,
    methodName: FNAME,
    args: FunctionArgs[
      /* import warning: importer.ImportType#apply Failed type conversion: T[FNAME] */ js.Any
    ]
  ): js.UndefOr[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: T[FNAME] */ js.Any
    ]
  ] = js.native
}

