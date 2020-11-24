package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "MatchAllFilter")
@js.native
/*
  A filter that matches on all documents
  */
class MatchAllFilter () extends Filter {
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): MatchAllFilter = js.native
  
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): MatchAllFilter = js.native
  
  /*
    Sets the filter name.
    */
  def name(name: String): MatchAllFilter = js.native
  
  /*
    Returns the filter object.
    */
  def toJSON(): MatchAllFilter = js.native
}
