package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "SuggestContextMixin")
@js.native
class SuggestContextMixin () extends js.Object {
  /*
    Sets analyzer used to analyze the suggest text.
    */
  def analyzer(analyzer: String): SuggestContextMixin = js.native
  /*
    Sets the field used to generate suggestions from.
    */
  def field(field: String): SuggestContextMixin = js.native
  /*
    Sets the maximum number of suggestions to be retrieved from
    each individual shard.
    */
  def shardSize(s: Double): SuggestContextMixin = js.native
  /*
    Sets the number of suggestions returned for each token.
    */
  def size(s: Double): SuggestContextMixin = js.native
}

