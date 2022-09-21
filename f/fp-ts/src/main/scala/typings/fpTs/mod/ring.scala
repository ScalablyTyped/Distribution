package typings.fpTs.mod

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.ringMod.Ring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ring {
  
  @JSImport("fp-ts", "ring")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFunctionRing[A, B](R: Ring[B]): Ring[js.Function1[/* a */ A, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionRing")(R.asInstanceOf[js.Any]).asInstanceOf[Ring[js.Function1[/* a */ A, B]]]
  
  inline def getTupleRing[T /* <: js.Array[Ring[Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rings because its type T is not an array type */ rings: T
  ): Ring[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/lib/Ring.Ring<infer A>? any : never}
    */ typings.fpTs.fpTsStrings.getTupleRing & TopLevel[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTupleRing")(rings.asInstanceOf[js.Any]).asInstanceOf[Ring[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/lib/Ring.Ring<infer A>? any : never}
    */ typings.fpTs.fpTsStrings.getTupleRing & TopLevel[T]
  ]]
  
  inline def negate[A](R: Ring[A]): js.Function1[/* a */ A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("negate")(R.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, A]]
  
  inline def tuple[A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rings because its type {[ K in keyof A ]: Ring<A[K]>} is not an array type */ rings: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: fp-ts.fp-ts/lib/Ring.Ring<A[K]>}
    */ typings.fpTs.fpTsStrings.tuple & TopLevel[A]
  ): Ring[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(rings.asInstanceOf[js.Any]).asInstanceOf[Ring[A]]
}
