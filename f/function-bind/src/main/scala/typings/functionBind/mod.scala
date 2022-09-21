package typings.functionBind

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import typings.std.OmitThisParameter
import typings.std.ThisParameterType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  //#region bind():
  /**
    * For a given function, creates a bound function that has the same body as the original function.
    * The this object of the bound function is associated with the specified object, and has the specified initial parameters.
    * @param thisArg The object to be used as the this object.
    * @param args Arguments to bind to the parameters of the function.
    */
  inline def apply[T](thisArg: ThisParameterType[T]): OmitThisParameter[T] = ^.asInstanceOf[js.Dynamic].apply(thisArg.asInstanceOf[js.Any]).asInstanceOf[OmitThisParameter[T]]
  // NewableFunction:
  inline def apply[AX /* <: js.Array[Any] */, A /* <: js.Array[Any] */, R](
    thisArg: Any,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param bound because its type AX is not an array type */ bound: AX
  ): Instantiable1[/* args */ A, R] = (^.asInstanceOf[js.Dynamic].apply(thisArg.asInstanceOf[js.Any], bound.asInstanceOf[js.Any])).asInstanceOf[Instantiable1[/* args */ A, R]]
  
  @JSImport("function-bind", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // NewableFunction:
  // TODO: Figure out why this is necessary:
  inline def apply[A /* <: js.Array[Any] */, R](func: Instantiable1[/* args */ A, R], args: js.Array[/* thisArg */ Any]): Instantiable1[/* args */ A, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(func.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Instantiable1[/* args */ A, R]]
  inline def apply[A0, A /* <: js.Array[Any] */, R](
    func: Instantiable2[/* bound_0 */ A0, /* args */ A, R],
    args: js.Tuple2[/* thisArg */ Any, /* bound_0 */ A0]
  ): Instantiable1[/* args */ A, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(func.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Instantiable1[/* args */ A, R]]
  //#endregion
  //#region bind.apply():
  // CallableFunction:
  inline def apply[T, AX /* <: js.Array[Any] */, A /* <: js.Array[Any] */, R](
    func: js.ThisFunction1[
      /* this */ T, 
      /* import warning: importer.ImportType#apply c repeated non-array type: AX */ /* bound */ /* args */ js.Array[AX], 
      R
    ],
    args: /* import warning: importer.ImportType#apply c repeated non-array type: AX */ /* bound */ js.Array[AX]
  ): js.Function1[/* args */ A, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(func.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ A, R]]
  inline def apply[A0, A1, A /* <: js.Array[Any] */, R](
    func: Instantiable3[/* bound_0 */ A0, /* bound_1 */ A1, /* args */ A, R],
    args: js.Tuple3[/* thisArg */ Any, /* bound_0 */ A0, /* bound_1 */ A1]
  ): Instantiable1[/* args */ A, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(func.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Instantiable1[/* args */ A, R]]
  inline def apply[A0, A1, A2, A /* <: js.Array[Any] */, R](
    func: Instantiable4[/* bound_0 */ A0, /* bound_1 */ A1, /* bound_2 */ A2, /* args */ A, R],
    args: js.Tuple4[/* thisArg */ Any, /* bound_0 */ A0, /* bound_1 */ A1, /* bound_2 */ A2]
  ): Instantiable1[/* args */ A, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(func.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Instantiable1[/* args */ A, R]]
  inline def apply[A0, A1, A2, A3, A /* <: js.Array[Any] */, R](
    func: Instantiable5[/* bound_0 */ A0, /* bound_1 */ A1, /* bound_2 */ A2, /* bound_3 */ A3, /* args */ A, R],
    args: js.Tuple5[
      /* thisArg */ Any, 
      /* bound_0 */ A0, 
      /* bound_1 */ A1, 
      /* bound_2 */ A2, 
      /* bound_3 */ A3
    ]
  ): Instantiable1[/* args */ A, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(func.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Instantiable1[/* args */ A, R]]
  
  inline def apply_AX_ArrayAnyA_ArrayAnyR[AX /* <: js.Array[Any] */, A /* <: js.Array[Any] */, R](
    func: Instantiable1[
      /* import warning: importer.ImportType#apply c repeated non-array type: AX */ /* bound */ /* args */ js.Array[AX], 
      R
    ],
    args: /* import warning: importer.ImportType#apply c repeated non-array type: AX */ /* bound */ js.Array[AX]
  ): Instantiable1[/* args */ A, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(func.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Instantiable1[/* args */ A, R]]
  
  // NewableFunction:
  inline def call[AX /* <: js.Array[Any] */, A /* <: js.Array[Any] */, R](
    func: Instantiable1[
      /* import warning: importer.ImportType#apply c repeated non-array type: AX */ /* bound */ /* args */ js.Array[AX], 
      R
    ],
    thisArg: Any,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param bound because its type AX is not an array type */ bound: AX
  ): Instantiable1[/* args */ A, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(func.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], bound.asInstanceOf[js.Any])).asInstanceOf[Instantiable1[/* args */ A, R]]
  //#region bind.call():
  // CallableFunction:
  inline def call[T, AX /* <: js.Array[Any] */, A /* <: js.Array[Any] */, R](
    func: js.ThisFunction1[
      /* this */ T, 
      /* import warning: importer.ImportType#apply c repeated non-array type: AX */ /* bound */ /* args */ js.Array[AX], 
      R
    ],
    thisArg: T,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param bound because its type AX is not an array type */ bound: AX
  ): js.Function1[/* args */ A, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(func.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], bound.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ A, R]]
}
