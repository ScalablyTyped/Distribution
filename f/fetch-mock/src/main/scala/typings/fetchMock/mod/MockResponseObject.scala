package typings.fetchMock.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mock response object
  */
@js.native
trait MockResponseObject extends js.Object {
  /**
    * Set the response body
    */
  var body: js.UndefOr[String | js.Object] = js.native
  /**
    * Set the response headers.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The URL the response should be from (to imitate followed redirects
    *  - will set redirected: true on the response)
    */
  var redirectUrl: js.UndefOr[String] = js.native
  /**
    * Set the response status
    * @default 200
    */
  var status: js.UndefOr[Double] = js.native
  /**
    * If this property is present then a Promise rejected with the value
    * of throws is returned
    */
  var throws: js.UndefOr[Error] = js.native
}

object MockResponseObject {
  @scala.inline
  def apply(): MockResponseObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockResponseObject]
  }
  @scala.inline
  implicit class MockResponseObjectOps[Self <: MockResponseObject] (val x: Self) extends AnyVal {
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
    def setBody(value: String | js.Object): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setRedirectUrl(value: String): Self = this.set("redirectUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectUrl: Self = this.set("redirectUrl", js.undefined)
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setThrows(value: Error): Self = this.set("throws", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrows: Self = this.set("throws", js.undefined)
  }
  
}

