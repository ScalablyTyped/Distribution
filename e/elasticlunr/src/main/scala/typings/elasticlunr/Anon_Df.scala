package typings.elasticlunr

import typings.elasticlunr.elasticlunrMod.InvertedIndexDocs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Df extends js.Object {
  var df: Double
  var docs: InvertedIndexDocs
}

object Anon_Df {
  @scala.inline
  def apply(df: Double, docs: InvertedIndexDocs): Anon_Df = {
    val __obj = js.Dynamic.literal(df = df, docs = docs)
  
    __obj.asInstanceOf[Anon_Df]
  }
}

