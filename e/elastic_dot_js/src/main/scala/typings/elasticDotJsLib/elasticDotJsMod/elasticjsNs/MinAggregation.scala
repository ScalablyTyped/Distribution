package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MinAggregation extends Aggregation {
  /*
       The type of ejs object.  For internal use only.
       */
  def _type(): java.lang.String
  /*
       Sets the field to operate on.
       */
  def field(field: java.lang.String): MinAggregation
  /*
       The script language being used.
       */
  def lang(language: java.lang.String): MinAggregation
  /*
       Sets parameters that will be applied to the script.  Overwrites
       any existing params.
       */
  def params(p: js.Object): MinAggregation
  /*
       Allows you generate or modify the terms/values using a script.
       */
  def script(scriptCode: java.lang.String): MinAggregation
  /*
       Set to true to assume script values are sorted.
       */
  def scriptValuesSorted(trueFalse: scala.Boolean): MinAggregation
  /*
       Retrieves the internal agg object. This is typically used by
       internal API functions so use with caution.
       */
  def toJSON(): js.Any
}

