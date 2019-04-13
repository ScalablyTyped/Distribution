package typings
package doctrineLib.doctrineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("doctrine", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val parseParamType: js.Function2[
    /* src */ java.lang.String, 
    /* options */ js.UndefOr[doctrineLib.Anon_Midstream], 
    Type
  ] = js.native
  val parseType: js.Function2[
    /* src */ java.lang.String, 
    /* options */ js.UndefOr[doctrineLib.Anon_Midstream], 
    Type
  ] = js.native
  val version: java.lang.String = js.native
  def parse(content: java.lang.String): Annotation = js.native
  def parse(content: java.lang.String, options: Options): Annotation = js.native
  def unwrapComment(doc: java.lang.String): java.lang.String = js.native
}

