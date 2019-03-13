package typings
package eggDashMockLib.eggDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EggMock extends js.Object {
  /**
    * Create a egg mocked application
    */
  def app(): MockApplication = js.native
  def app(option: MockOption): MockApplication = js.native
  /**
    * mock console level
    */
  def consoleLevel(level: java.lang.String): scala.Unit = js.native
  /**
    * mock the serverEnv of Egg
    */
  def env(env: eggDashMockLib.EnvType): scala.Unit = js.native
  /**
    * set EGG_HOME path
    */
  def home(homePath: java.lang.String): scala.Unit = js.native
  /**
    * restore mock
    */
  def restore(): scala.Unit = js.native
}

