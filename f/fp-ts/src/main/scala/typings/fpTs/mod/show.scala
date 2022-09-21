package typings.fpTs.mod

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.readonlyRecordMod.ReadonlyRecord_
import typings.fpTs.showMod.Show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object show {
  
  @JSImport("fp-ts", "show")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStructShow[O /* <: ReadonlyRecord_[String, Any] */](
    shows: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/lib/Show.Show<O[K]>}
    */ typings.fpTs.fpTsStrings.getStructShow & TopLevel[O]
  ): Show[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStructShow")(shows.asInstanceOf[js.Any]).asInstanceOf[Show[O]]
  
  inline def getTupleShow[T /* <: js.Array[Show[Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param shows because its type T is not an array type */ shows: T
  ): Show[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/lib/Show.Show<infer A>? any : never}
    */ typings.fpTs.fpTsStrings.getTupleShow & TopLevel[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTupleShow")(shows.asInstanceOf[js.Any]).asInstanceOf[Show[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/lib/Show.Show<infer A>? any : never}
    */ typings.fpTs.fpTsStrings.getTupleShow & TopLevel[T]
  ]]
  
  @JSImport("fp-ts", "show.showBoolean")
  @js.native
  val showBoolean: Show[Boolean] = js.native
  
  @JSImport("fp-ts", "show.showNumber")
  @js.native
  val showNumber: Show[Double] = js.native
  
  @JSImport("fp-ts", "show.showString")
  @js.native
  val showString: Show[String] = js.native
  
  inline def struct[A](
    shows: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: fp-ts.fp-ts/lib/Show.Show<A[K]>}
    */ typings.fpTs.fpTsStrings.struct & TopLevel[A]
  ): Show[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K_1 in keyof A ]: A[K_1]}
    */ typings.fpTs.fpTsStrings.struct & TopLevel[A]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("struct")(shows.asInstanceOf[js.Any]).asInstanceOf[Show[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K_1 in keyof A ]: A[K_1]}
    */ typings.fpTs.fpTsStrings.struct & TopLevel[A]
  ]]
  
  inline def tuple[A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param shows because its type {[ K in keyof A ]: Show<A[K]>} is not an array type */ shows: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: fp-ts.fp-ts/lib/Show.Show<A[K]>}
    */ typings.fpTs.fpTsStrings.tuple & TopLevel[A]
  ): Show[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(shows.asInstanceOf[js.Any]).asInstanceOf[Show[A]]
}
