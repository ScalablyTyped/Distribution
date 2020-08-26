package typings.fluxible.anon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Create extends js.Object {
  /**
    * POST request to the server
    * @param resource name of resourse
    * @param params query string parameters as key-value object
    * @param body json request body
    * @param callback
    */
  def create(
    resource: String,
    params: js.Any,
    body: js.Any,
    callback: js.Function2[/* error */ Error, /* data */ js.Any, Unit]
  ): Unit = js.native
  /**
    *
    * @param resource name of resourse
    * @param params query string parameters as key-value object
    * @param callback
    */
  def delete(
    resource: String,
    params: js.Any,
    callback: js.Function2[/* error */ Error, /* data */ js.Any, Unit]
  ): Unit = js.native
  /**
    * GET request to the server
    * @param resource name of resourse
    * @param params query string parameters as key-value object
    * @param callback
    */
  def read(
    resource: String,
    params: js.Any,
    callback: js.Function2[/* error */ Error, /* data */ js.Any, Unit]
  ): Unit = js.native
  /**
    *
    * @param resource name of resourse
    * @param params query string parameters as key-value object
    * @param body json request body
    * @param callback
    */
  def update(
    resource: String,
    params: js.Any,
    body: js.Any,
    callback: js.Function2[/* error */ Error, /* data */ js.Any, Unit]
  ): Unit = js.native
}

object Create {
  @scala.inline
  def apply(
    create: (String, js.Any, js.Any, js.Function2[/* error */ Error, /* data */ js.Any, Unit]) => Unit,
    delete: (String, js.Any, js.Function2[/* error */ Error, /* data */ js.Any, Unit]) => Unit,
    read: (String, js.Any, js.Function2[/* error */ Error, /* data */ js.Any, Unit]) => Unit,
    update: (String, js.Any, js.Any, js.Function2[/* error */ Error, /* data */ js.Any, Unit]) => Unit
  ): Create = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction4(create), delete = js.Any.fromFunction3(delete), read = js.Any.fromFunction3(read), update = js.Any.fromFunction4(update))
    __obj.asInstanceOf[Create]
  }
  @scala.inline
  implicit class CreateOps[Self <: Create] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: (String, js.Any, js.Any, js.Function2[/* error */ Error, /* data */ js.Any, Unit]) => Unit): Self = this.set("create", js.Any.fromFunction4(value))
    @scala.inline
    def setDelete(value: (String, js.Any, js.Function2[/* error */ Error, /* data */ js.Any, Unit]) => Unit): Self = this.set("delete", js.Any.fromFunction3(value))
    @scala.inline
    def setRead(value: (String, js.Any, js.Function2[/* error */ Error, /* data */ js.Any, Unit]) => Unit): Self = this.set("read", js.Any.fromFunction3(value))
    @scala.inline
    def setUpdate(value: (String, js.Any, js.Any, js.Function2[/* error */ Error, /* data */ js.Any, Unit]) => Unit): Self = this.set("update", js.Any.fromFunction4(value))
  }
  
}

