package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "AvgAggregation")
@js.native
open class AvgAggregation protected ()
  extends StObject
     with Aggregation {
  /*
    Aggregation that computes the average of numeric values that are extracted
    from the aggregated documents.
    */
  def this(name: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Sets the field to operate on.
    */
  def field(field: String): AvgAggregation = js.native
  
  /*
    The script language being used.
    */
  def lang(language: String): AvgAggregation = js.native
  
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): AvgAggregation = js.native
  
  /*
    Allows you generate or modify the terms/values using a script.
    */
  def script(scriptCode: String): AvgAggregation = js.native
  
  /*
    Set to true to assume script values are sorted.
    */
  def scriptValuesSorted(trueFalse: Boolean): AvgAggregation = js.native
  
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): Any = js.native
}
