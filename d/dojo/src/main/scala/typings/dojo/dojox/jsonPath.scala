package typings.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/jsonPath.html
  *
  * Deprecated.  Should require dojox/jsonPath modules directly rather than trying to access them through
  * this module.
  *
  */
trait jsonPath extends js.Object

@JSGlobal("dojox.jsonPath")
@js.native
object jsonPath extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/jsonPath/query.html
    *
    * Perform jsonPath query expr on javascript object or json string obj
    *
    * @param obj object || json string to perform query on
    * @param expr jsonPath expression (string) to be evaluated
    * @param arg {} special arguments.resultType: "VALUE"||"BOTH"||"PATH"} (defaults to value)evalType: "RESULT"||"ITEM"} (defaults to ?)
    */
  type query = js.Function3[/* obj */ js.Object, /* expr */ String, /* arg */ js.Object, Unit]
}

