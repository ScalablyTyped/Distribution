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
    analyzer: js.Function1[java.lang.String, SuggestContextMixin],
    field: js.Function1[java.lang.String, SuggestContextMixin],
    shardSize: js.Function1[scala.Double, SuggestContextMixin],
    size: js.Function1[scala.Double, SuggestContextMixin]
  ): SuggestContextMixin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("analyzer")(analyzer)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("shardSize")(shardSize)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[SuggestContextMixin]
  }
}

