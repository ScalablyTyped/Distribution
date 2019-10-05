package typings.dojo.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojo.errors")
@js.native
object errors extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/errors/CancelError.html
    *
    * Default error if a promise is canceled without a reason.
    *
    */
  type CancelError = js.Function0[Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/errors/RequestError.html
    *
    * TODOC
    *
    */
  type RequestError = js.Function0[Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/errors/RequestTimeoutError.html
    *
    * TODOC
    *
    */
  type RequestTimeoutError = js.Function0[Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/errors/create.html
    *
    *
    * @param name
    * @param ctor
    * @param base
    * @param props
    */
  type create = js.Function4[/* name */ js.Any, /* ctor */ js.Any, /* base */ js.Any, /* props */ js.Any, Unit]
}

