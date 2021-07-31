package typings.egg.mod

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Messenger extends EventEmitter {
  
  /**
    * broadcast to all agent/app processes including itself
    */
  def broadcast(action: String, data: js.Any): Unit = js.native
  
  /**
    * send to agent from the app,
    * send to an random app from the agent
    */
  def sendRandom(action: String, data: js.Any): Unit = js.native
  
  /**
    * send to specified process
    */
  def sendTo(pid: Double, action: String, data: js.Any): Unit = js.native
  
  /**
    * send to agent from the app,
    * send to itself from the agent
    */
  def sendToAgent(action: String, data: js.Any): Unit = js.native
  
  /**
    * send to all app including itself from the app,
    * send to all app from the agent
    */
  def sendToApp(action: String, data: js.Any): Unit = js.native
}
