package typings
package fpDashTsLib.libShowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Show", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val showBoolean: Show[scala.Boolean] = js.native
  val showNumber: Show[scala.Double] = js.native
  val showString: Show[java.lang.String] = js.native
  def getStructShow[O /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    shows: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/lib/Show.Show<O[K]>}
    */ fpDashTsLib.fpDashTsLibStrings.getStructShow with O
  ): Show[O] = js.native
  def getTupleShow[T /* <: fpDashTsLib.libArrayMod.Global.Array[Show[_]] */](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param shows because its type T is not an array type */ shows: T
  ): Show[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/lib/Show.Show<infer A>? any : never}
    */ fpDashTsLib.fpDashTsLibStrings.getTupleShow with T
  ] = js.native
}

