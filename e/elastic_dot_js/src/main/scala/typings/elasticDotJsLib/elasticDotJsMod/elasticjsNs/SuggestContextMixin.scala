package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestContextMixin extends js.Object {
  /*
    Sets analyzer used to analyze the suggest text.
    */
  def analyzer(analyzer: java.lang.String): SuggestContextMixin
  /*
    Sets the field used to generate suggestions from.
    */
  def field(field: java.lang.String): SuggestContextMixin
  /*
    Sets the maximum number of suggestions to be retrieved from
    each individual shard.
    */
  def shardSize(s: scala.Double): SuggestContextMixin
  /*
    Sets the number of suggestions returned for each token.
    */
  def size(s: scala.Double): SuggestContextMixin
}

object SuggestContextMixin {
  @scala.inline
  def apply(
    analyzer: java.lang.String => SuggestContextMixin,
    field: java.lang.String => SuggestContextMixin,
    shardSize: scala.Double => SuggestContextMixin,
    size: scala.Double => SuggestContextMixin
  ): SuggestContextMixin = {
    val __obj = js.Dynamic.literal(analyzer = js.Any.fromFunction1(analyzer), field = js.Any.fromFunction1(field), shardSize = js.Any.fromFunction1(shardSize), size = js.Any.fromFunction1(size))
  
    __obj.asInstanceOf[SuggestContextMixin]
  }
}

