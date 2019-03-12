package typings
package fluxibleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  /**
    * POST request to the server
    * @param resource name of resourse
    * @param params query string parameters as key-value object
    * @param body json request body
    * @param callback
    */
  def create(
    resource: java.lang.String,
    params: js.Any,
    body: js.Any,
    callback: js.Function2[/* error */ stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit
  /**
    *
    * @param resource name of resourse
    * @param params query string parameters as key-value object
    * @param callback
    */
  def delete(
    resource: java.lang.String,
    params: js.Any,
    callback: js.Function2[/* error */ stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit
  /**
    * GET request to the server
    * @param resource name of resourse
    * @param params query string parameters as key-value object
    * @param callback
    */
  def read(
    resource: java.lang.String,
    params: js.Any,
    callback: js.Function2[/* error */ stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit
  /**
    *
    * @param resource name of resourse
    * @param params query string parameters as key-value object
    * @param body json request body
    * @param callback
    */
  def update(
    resource: java.lang.String,
    params: js.Any,
    body: js.Any,
    callback: js.Function2[/* error */ stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit
}

object Anon_Body {
  @scala.inline
  def apply(
    create: (java.lang.String, js.Any, js.Any, js.Function2[/* error */ stdLib.Error, /* data */ js.Any, scala.Unit]) => scala.Unit,
    delete: (java.lang.String, js.Any, js.Function2[/* error */ stdLib.Error, /* data */ js.Any, scala.Unit]) => scala.Unit,
    read: (java.lang.String, js.Any, js.Function2[/* error */ stdLib.Error, /* data */ js.Any, scala.Unit]) => scala.Unit,
    update: (java.lang.String, js.Any, js.Any, js.Function2[/* error */ stdLib.Error, /* data */ js.Any, scala.Unit]) => scala.Unit
  ): Anon_Body = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction4(create), delete = js.Any.fromFunction3(delete), read = js.Any.fromFunction3(read), update = js.Any.fromFunction4(update))
  
    __obj.asInstanceOf[Anon_Body]
  }
}

