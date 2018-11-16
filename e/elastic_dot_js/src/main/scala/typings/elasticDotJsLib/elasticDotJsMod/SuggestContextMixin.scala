package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "SuggestContextMixin")
@js.native
class SuggestContextMixin ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.SuggestContextMixin {
  /*
       Sets analyzer used to analyze the suggest text.
       */
  /* CompleteClass */
  override def analyzer(analyzer: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.SuggestContextMixin = js.native
  /*
       Sets the field used to generate suggestions from.
       */
  /* CompleteClass */
  override def field(field: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.SuggestContextMixin = js.native
  /*
       Sets the maximum number of suggestions to be retrieved from
       each individual shard.
       */
  /* CompleteClass */
  override def shardSize(s: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.SuggestContextMixin = js.native
  /*
       Sets the number of suggestions returned for each token.
       */
  /* CompleteClass */
  override def size(s: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.SuggestContextMixin = js.native
}

