package typings.egg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request
  extends typings.koa.mod.Request {
  
  // tslint:disable-line
  /**
    * detect if response should be json
    * 1. url path ends with `.json`
    * 2. response type is set to json
    * 3. detect by request accept header
    *
    * @member {Boolean} Request#acceptJSON
    * @since 1.0.0
    */
  var acceptJSON: Boolean = js.native
  
  var body: js.Any = js.native
  
  /**
    * get params pass by querystring, all value are Array type. {@link Request#query}
    * @member {Array} Request#queries
    * @example
    * ```js
    * GET http://127.0.0.1:7001?a=b&a=c&o[foo]=bar&b[]=1&b[]=2&e=val
    * this.queries
    * =>
    * {
    *   "a": ["b", "c"],
    *   "o[foo]": ["bar"],
    *   "b[]": ["1", "2"],
    *   "e": ["val"]
    * }
    * ```
    */
  var queries: PlainObject[js.Array[String]] = js.native
}
