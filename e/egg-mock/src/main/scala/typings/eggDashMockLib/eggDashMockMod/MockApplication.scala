package typings
package eggDashMockLib.eggDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockApplication
  extends eggLib.eggMod.Application {
  /**
    * mock Context
    */
  def mockContext(): eggLib.eggMod.Context = js.native
  def mockContext(data: js.Any): eggLib.eggMod.Context = js.native
  def mockCookies(cookies: js.Any): MockApplication = js.native
  def mockHeaders(headers: js.Any): MockApplication = js.native
  def mockHttpclient(mockUrl: java.lang.String, mockMethod: java.lang.String, mockResult: eggDashMockLib.Anon_Data): MockApplication = js.native
  def mockHttpclient(
    mockUrl: java.lang.String,
    mockMethod: js.Array[java.lang.String],
    mockResult: eggDashMockLib.Anon_Data
  ): MockApplication = js.native
  /**
    * Mock service
    */
  def mockService(service: java.lang.String, methodName: java.lang.String, fn: js.Any): MockApplication = js.native
  /**
    * mock service that return error
    */
  def mockServiceError(service: java.lang.String, methodName: java.lang.String): MockApplication = js.native
  def mockServiceError(service: java.lang.String, methodName: java.lang.String, err: stdLib.Error): MockApplication = js.native
  /**
    * mock cookie session
    */
  def mockSession(data: js.Any): MockApplication = js.native
  // tslint:disble-line
  def ready(): js.Promise[scala.Unit] = js.native
}

