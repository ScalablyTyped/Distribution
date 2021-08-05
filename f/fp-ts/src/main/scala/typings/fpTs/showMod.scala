package typings.fpTs

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.readonlyRecordMod.ReadonlyRecord_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object showMod {
  
  @JSImport("fp-ts/lib/Show", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStructShow[O /* <: ReadonlyRecord_[String, js.Any] */](
    shows: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/lib/Show.Show<O[K]>}
    */ typings.fpTs.fpTsStrings.getStructShow & TopLevel[O]
  ): Show[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStructShow")(shows.asInstanceOf[js.Any]).asInstanceOf[Show[O]]
  
  inline def getTupleShow[T /* <: js.Array[Show[js.Any]] */](
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
  
  @JSImport("fp-ts/lib/Show", "showBoolean")
  @js.native
  val showBoolean: Show[Boolean] = js.native
  
  @JSImport("fp-ts/lib/Show", "showNumber")
  @js.native
  val showNumber: Show[Double] = js.native
  
  @JSImport("fp-ts/lib/Show", "showString")
  @js.native
  val showString: Show[String] = js.native
  
  trait Show[A] extends StObject {
    
    def show(a: A): String
  }
  object Show {
    
    inline def apply[A](show: A => String): Show[A] = {
      val __obj = js.Dynamic.literal(show = js.Any.fromFunction1(show))
      __obj.asInstanceOf[Show[A]]
    }
    
    extension [Self <: Show[?], A](x: Self & Show[A]) {
      
      inline def setShow(value: A => String): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
    }
  }
}
