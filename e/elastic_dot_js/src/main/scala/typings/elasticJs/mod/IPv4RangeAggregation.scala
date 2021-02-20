package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "IPv4RangeAggregation")
@js.native
class IPv4RangeAggregation protected () extends Aggregation {
  /*
    A dedicated range aggregation for IPv4 typed fields.
    */
  def this(name: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.  Alias for the
    aggregation method.
    */
  def agg(agg: Aggregation): IPv4RangeAggregation = js.native
  
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.
    */
  def aggregation(agg: Aggregation): IPv4RangeAggregation = js.native
  
  /*
    Sets the field to gather terms from.
    */
  def field(field: String): IPv4RangeAggregation = js.native
  
  /*
    Enable the response to be returned as a keyed object where the key is the
    bucket interval.
    */
  def keyed(trueFalse: Boolean): IPv4RangeAggregation = js.native
  
  /*
    The script language being used.
    */
  def lang(language: String): IPv4RangeAggregation = js.native
  
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): IPv4RangeAggregation = js.native
  
  /*
    Adds a range to the list of exsiting range expressions.
    */
  def range(from: String, to: String, key: String): IPv4RangeAggregation = js.native
  
  /*
    Allows you generate or modify the terms using a script.
    */
  def script(scriptCode: String): IPv4RangeAggregation = js.native
  
  /*
    Set to true to assume script values are sorted.
    */
  def scriptValuesSorted(trueFalse: Boolean): IPv4RangeAggregation = js.native
  
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}
