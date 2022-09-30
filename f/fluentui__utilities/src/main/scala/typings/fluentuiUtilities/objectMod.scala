package typings.fluentuiUtilities

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectMod {
  
  @JSImport("@fluentui/utilities/lib/object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assign(target: Any, args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(scala.List(target.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def filteredAssign(isAllowed: js.Function1[/* propName */ String, Boolean], target: Any, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("filteredAssign")((scala.List(isAllowed.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  inline def mapEnumByName[T](
    theEnum: Any,
    callback: js.Function2[
      /* name */ js.UndefOr[String], 
      /* value */ js.UndefOr[String | Double], 
      js.UndefOr[T]
    ]
  ): js.UndefOr[js.Array[js.UndefOr[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapEnumByName")(theEnum.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[js.UndefOr[T]]]]
  
  inline def omit[TObj /* <: Record[String, Any] */](obj: TObj, exclusions: js.Array[/* keyof TObj */ String]): TObj = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(obj.asInstanceOf[js.Any], exclusions.asInstanceOf[js.Any])).asInstanceOf[TObj]
  
  inline def shallowCompare[TA /* <: Any */, TB /* <: Any */](a: TA, b: TB): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def values[T](obj: Any): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
