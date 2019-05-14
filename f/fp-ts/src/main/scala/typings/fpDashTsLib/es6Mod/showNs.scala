package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "show")
@js.native
object showNs extends js.Object {
  val showBoolean: fpDashTsLib.es6ShowMod.Show[scala.Boolean] = js.native
  val showNumber: fpDashTsLib.es6ShowMod.Show[scala.Double] = js.native
  val showString: fpDashTsLib.es6ShowMod.Show[java.lang.String] = js.native
  def getStructShow[O /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    shows: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/es6/Show.Show<O[K]>}
    */ fpDashTsLib.fpDashTsLibStrings.getStructShow with O
  ): fpDashTsLib.es6ShowMod.Show[O] = js.native
  def getTupleShow[T /* <: fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.es6ShowMod.Show[_]] */](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param shows because its type T is not an array type */ shows: T
  ): fpDashTsLib.es6ShowMod.Show[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/es6/Show.Show<infer A>? any : never}
    */ fpDashTsLib.fpDashTsLibStrings.getTupleShow with T
  ] = js.native
}

