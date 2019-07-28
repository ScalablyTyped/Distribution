package typings.eggDashMock.eggDashMockMod

import typings.egg.eggMod.Application
import typings.egg.eggMod.Context
import typings.eggDashMock.Anon_Data
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockApplication extends Application {
  /**
    * mock Context
    */
  def mockContext(): Context = js.native
  def mockContext(data: js.Any): Context = js.native
  def mockCookies(cookies: js.Any): MockApplication = js.native
  def mockHeaders(headers: js.Any): MockApplication = js.native
  def mockHttpclient(mockUrl: String, mockMethod: String, mockResult: Anon_Data): MockApplication = js.native
  def mockHttpclient(mockUrl: String, mockMethod: js.Array[String], mockResult: Anon_Data): MockApplication = js.native
  /**
    * Mock service
    */
  def mockService(service: String, methodName: String, fn: js.Any): MockApplication = js.native
  /**
    * mock service that return error
    */
  def mockServiceError(service: String, methodName: String): MockApplication = js.native
  def mockServiceError(service: String, methodName: String, err: Error): MockApplication = js.native
  /**
    * mock cookie session
    */
  def mockSession(data: js.Any): MockApplication = js.native
}

