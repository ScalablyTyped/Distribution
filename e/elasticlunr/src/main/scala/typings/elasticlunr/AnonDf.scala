package typings.elasticlunr

import typings.elasticlunr.mod.InvertedIndexDocs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDf extends js.Object {
  var df: Double
  var docs: InvertedIndexDocs
}

object AnonDf {
  @scala.inline
  def apply(df: Double, docs: InvertedIndexDocs): AnonDf = {
    val __obj = js.Dynamic.literal(df = df.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDf]
  }
}

