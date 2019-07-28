package typings.doctrine.doctrineMod

import typings.doctrine.Anon_Midstream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("doctrine", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val parseParamType: js.Function2[/* src */ String, /* options */ js.UndefOr[Anon_Midstream], Type] = js.native
  val parseType: js.Function2[/* src */ String, /* options */ js.UndefOr[Anon_Midstream], Type] = js.native
  val version: String = js.native
  def parse(content: String): Annotation = js.native
  def parse(content: String, options: Options): Annotation = js.native
  def unwrapComment(doc: String): String = js.native
}

