package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "show")
@js.native
object showNs extends js.Object {
  val showBoolean: fpDashTsLib.libShowMod.Show[scala.Boolean] = js.native
  val showNumber: fpDashTsLib.libShowMod.Show[scala.Double] = js.native
  val showString: fpDashTsLib.libShowMod.Show[java.lang.String] = js.native
  def getStructShow[O /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    shows: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/lib/Show.Show<O[K]>}
    */ fpDashTsLib.fpDashTsLibStrings.getStructShow with O
  ): fpDashTsLib.libShowMod.Show[O] = js.native
  def getTupleShow[T /* <: fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libShowMod.Show[_]] */](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param shows because its type T is not an array type */ shows: T
  ): fpDashTsLib.libShowMod.Show[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/lib/Show.Show<infer A>? any : never}
    */ fpDashTsLib.fpDashTsLibStrings.getTupleShow with T
  ] = js.native
}

