package typings.elasticElasticsearch.helpersMod

import typings.elasticElasticsearch.anon.Causedby
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDropDocument[TDocument] extends js.Object {
  var document: TDocument
  var error: Causedby
  var retried: Boolean
  var status: Double
}

object OnDropDocument {
  @scala.inline
  def apply[TDocument](document: TDocument, error: Causedby, retried: Boolean, status: Double): OnDropDocument[TDocument] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], retried = retried.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDropDocument[TDocument]]
  }
}

