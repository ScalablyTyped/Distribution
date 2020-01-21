package typings.fetchIo.mod

import org.scalablytyped.runtime.StringDictionary
import typings.fetchIo.fetchIoStrings.form
import typings.fetchIo.fetchIoStrings.json
import typings.fetchIo.fetchIoStrings.urlencoded
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fetch.io", "Request")
@js.native
class Request protected () extends js.Object {
  def this(method: TMethod, url: TUrl, options: Options) = this()
  /**
    * append formData
    */
  def append(key: String, value: js.Any): this.type = js.native
  def append(`object`: StringDictionary[js.Any]): this.type = js.native
  /**
    * Set Options
    */
  def config(key: String, value: js.Any): this.type = js.native
  def config(opts: StringDictionary[js.Any]): this.type = js.native
  /**
    * HTTP delete method
    */
  def delete(url: TUrl): this.type = js.native
  /**
    * HTTP get method
    */
  def get(url: TUrl): this.type = js.native
  /**
    * HTTP head method
    */
  def head(url: TUrl): this.type = js.native
  /**
    * Make Response to JSON
    */
  def json(): js.Promise[_] = js.native
  def json(strict: Boolean): js.Promise[_] = js.native
  /**
    * HTTP options method
    */
  def options(url: TUrl): this.type = js.native
  /**
    * HTTP patch method
    */
  def patch(url: TUrl): this.type = js.native
  /**
    * HTTP post method
    */
  def post(url: TUrl): this.type = js.native
  /**
    * HTTP put method
    */
  def put(url: TUrl): this.type = js.native
  /**
    * Add query string
    */
  def query(`object`: StringDictionary[js.Any]): this.type = js.native
  /**
    * Send data
    */
  def send(data: StringDictionary[js.Any]): this.type = js.native
  /**
    * Set Header
    */
  def set(key: String, value: js.Any): this.type = js.native
  def set(opts: StringDictionary[js.Any]): this.type = js.native
  /**
    * Make Response to string
    */
  def text(): js.Promise[String] = js.native
  /**
    * Get Response directly
    */
  def `then`(resolve: js.Function1[/* value */ js.UndefOr[Response], Unit]): js.Promise[_] = js.native
  def `then`(
    resolve: js.Function1[/* value */ js.UndefOr[Response], Unit],
    reject: js.Function1[/* reason */ js.UndefOr[js.Any], Unit]
  ): js.Promise[_] = js.native
  @JSName("type")
  def type_form(`type`: form): this.type = js.native
  /**
    * Set Content-Type
    */
  @JSName("type")
  def type_json(`type`: json): this.type = js.native
  @JSName("type")
  def type_urlencoded(`type`: urlencoded): this.type = js.native
}

