package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "FunctionScoreQuery")
@js.native
/*
  A query that allows you to modify the score of matching documents.
  */
open class FunctionScoreQuery ()
  extends StObject
     with Query {
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: Double): FunctionScoreQuery = js.native
  
  /*
    Set the setermines how the new calculated score is combined with the
    score from the original query. Valid values are: multiply, replace, sum,
    avg, max, and min.
    */
  def boostMode(mode: String): FunctionScoreQuery = js.native
  
  /*
    Set the source filter.
    */
  def filter(oFilter: Filter): FunctionScoreQuery = js.native
  
  /*
    Add a single score function to the list of existing functions.
    */
  //function (func: ScoreFunction): FunctionScoreQuery;
  /*
    Sets the score functions.  Replaces any existing score functions.
    */
  def functions(funcs: js.Array[ScoreFunction]): FunctionScoreQuery = js.native
  
  /*
    Set the source query.
    */
  def query(oQuery: Query): FunctionScoreQuery = js.native
  
  /*
    Set the scoring mode which specifies how the computed scores are combined.
    Valid values are: avg, max, min, sum, multiply, and first.
    */
  def scoreMode(mode: String): FunctionScoreQuery = js.native
  
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): Any = js.native
}
