package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "SuggestContextMixin")
@js.native
open class SuggestContextMixin () extends StObject {
  
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
