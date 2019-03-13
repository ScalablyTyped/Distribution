package typings
package eggLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Messenger
  extends nodeLib.eventsMod.EventEmitter {
  /**
    * broadcast to all agent/app processes including itself
    */
  def broadcast(action: java.lang.String, data: js.Any): scala.Unit = js.native
  /**
    * send to agent from the app,
    * send to an random app from the agent
    */
  def sendRandom(action: java.lang.String, data: js.Any): scala.Unit = js.native
  /**
    * send to specified process
    */
  def sendTo(pid: scala.Double, action: java.lang.String, data: js.Any): scala.Unit = js.native
  /**
    * send to agent from the app,
    * send to itself from the agent
    */
  def sendToAgent(action: java.lang.String, data: js.Any): scala.Unit = js.native
  /**
    * send to all app including itself from the app,
    * send to all app from the agent
    */
  def sendToApp(action: java.lang.String, data: js.Any): scala.Unit = js.native
}

