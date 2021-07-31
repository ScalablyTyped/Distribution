package typings.emberUtils

import typings.emberUtils.emberUtilsStrings.undefined
import typings.emberUtils.typesMod.FunctionArgs
import typings.emberUtils.typesMod.TypeLookup
import typings.emberUtils.typesMod.TypeOf
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ember/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def compare(v: js.Any, w: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(v.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def isBlank(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlank")().asInstanceOf[Boolean]
  @scala.inline
  def isBlank(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlank")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isEmpty(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")().asInstanceOf[Boolean]
  @scala.inline
  def isEmpty(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isEqual(a: js.Any, b: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isNone(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNone")().asInstanceOf[Boolean]
  @scala.inline
  def isNone(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNone")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isPresent(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPresent")().asInstanceOf[Boolean]
  @scala.inline
  def isPresent(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPresent")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def tryInvoke(obj: js.Object, methodName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tryInvoke")(obj.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def tryInvoke(obj: js.Object, methodName: String, args: js.Array[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tryInvoke")(obj.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def tryInvoke[FNAME /* <: /* keyof T */ String */, T /* <: js.Object */](obj: T, methodName: FNAME): js.UndefOr[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: T[FNAME] */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryInvoke")(obj.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: T[FNAME] */ js.Any
    ]
  ]]
  @scala.inline
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
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryInvoke")(obj.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: T[FNAME] */ js.Any
    ]
  ]]
  
  @scala.inline
  def typeOf(): undefined = ^.asInstanceOf[js.Dynamic].applyDynamic("typeOf")().asInstanceOf[undefined]
  @scala.inline
  def typeOf(item: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("typeOf")(item.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def typeOf[T](value: T): TypeOf[TypeLookup, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("typeOf")(value.asInstanceOf[js.Any]).asInstanceOf[TypeOf[TypeLookup, T]]
}
