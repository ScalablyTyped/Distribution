package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "ExtendedStatsAggregation")
@js.native
class ExtendedStatsAggregation protected () extends Aggregation {
  /*
    Aggregation that computes extra stats over numeric values extracted from
    the aggregated documents.
    */
  def this(name: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Sets the field to operate on.
    */
  def field(field: String): ExtendedStatsAggregation = js.native
  
  /*
    The script language being used.
    */
  def lang(language: String): ExtendedStatsAggregation = js.native
  
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): ExtendedStatsAggregation = js.native
  
  /*
    Allows you generate or modify the terms/values using a script.
    */
  def script(scriptCode: String): ExtendedStatsAggregation = js.native
  
  /*
    Set to true to assume script values are sorted.
    */
  def scriptValuesSorted(trueFalse: Boolean): ExtendedStatsAggregation = js.native
  
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}
