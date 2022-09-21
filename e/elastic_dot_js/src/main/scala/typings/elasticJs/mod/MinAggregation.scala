package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "MinAggregation")
@js.native
open class MinAggregation protected ()
  extends StObject
     with Aggregation {
  /*
    Aggregation that keeps track and returns the minimum value among numeric
    values extracted from the aggregated documents.
    */
  def this(name: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Sets the field to operate on.
    */
  def field(field: String): MinAggregation = js.native
  
  /*
    The script language being used.
    */
  def lang(language: String): MinAggregation = js.native
  
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): MinAggregation = js.native
  
  /*
    Allows you generate or modify the terms/values using a script.
    */
  def script(scriptCode: String): MinAggregation = js.native
  
  /*
    Set to true to assume script values are sorted.
    */
  def scriptValuesSorted(trueFalse: Boolean): MinAggregation = js.native
  
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): Any = js.native
}
