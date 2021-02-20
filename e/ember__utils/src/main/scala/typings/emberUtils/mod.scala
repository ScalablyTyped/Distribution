package typings.emberUtils

import typings.emberUtils.emberUtilsStrings.undefined
import typings.emberUtils.typesMod.FunctionArgs
import typings.emberUtils.typesMod.TypeLookup
import typings.emberUtils.typesMod.TypeOf
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ember/utils", "compare")
  @js.native
  def compare(v: js.Any, w: js.Any): Double = js.native
  
  @JSImport("@ember/utils", "isBlank")
  @js.native
  def isBlank(): Boolean = js.native
  @JSImport("@ember/utils", "isBlank")
  @js.native
  def isBlank(obj: js.Any): Boolean = js.native
  
  @JSImport("@ember/utils", "isEmpty")
  @js.native
  def isEmpty(): Boolean = js.native
  @JSImport("@ember/utils", "isEmpty")
  @js.native
  def isEmpty(obj: js.Any): Boolean = js.native
  
  @JSImport("@ember/utils", "isEqual")
  @js.native
  def isEqual(a: js.Any, b: js.Any): Boolean = js.native
  
  @JSImport("@ember/utils", "isNone")
  @js.native
  def isNone(): Boolean = js.native
  @JSImport("@ember/utils", "isNone")
  @js.native
  def isNone(obj: js.Any): Boolean = js.native
  
  @JSImport("@ember/utils", "isPresent")
  @js.native
  def isPresent(): Boolean = js.native
  @JSImport("@ember/utils", "isPresent")
  @js.native
  def isPresent(obj: js.Any): Boolean = js.native
  
  @JSImport("@ember/utils", "tryInvoke")
  @js.native
  def tryInvoke(obj: js.Object, methodName: String): js.UndefOr[scala.Nothing] = js.native
  @JSImport("@ember/utils", "tryInvoke")
  @js.native
  def tryInvoke(obj: js.Object, methodName: String, args: js.Array[_]): js.UndefOr[scala.Nothing] = js.native
  @JSImport("@ember/utils", "tryInvoke")
  @js.native
  def tryInvoke[FNAME /* <: /* keyof T */ String */, T /* <: js.Object */](obj: T, methodName: FNAME): js.UndefOr[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: T[FNAME] */ js.Any
    ]
  ] = js.native
  @JSImport("@ember/utils", "tryInvoke")
  @js.native
  def tryInvoke[FNAME /* <: /* keyof T */ String */, T /* <: js.Object */](
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
  
  @JSImport("@ember/utils", "typeOf")
  @js.native
  def typeOf(): undefined = js.native
  @JSImport("@ember/utils", "typeOf")
  @js.native
  def typeOf(item: js.Any): String = js.native
  @JSImport("@ember/utils", "typeOf")
  @js.native
  def typeOf[T](value: T): TypeOf[TypeLookup, T] = js.native
}
