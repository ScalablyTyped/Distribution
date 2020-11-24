package typings.easyXHeaders.readlineMod

import typings.easyXHeaders.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadLine extends EventEmitter {
  
  def close(): Unit = js.native
  
  def pause(): Unit = js.native
  
  def prompt(): Unit = js.native
  def prompt(preserveCursor: Boolean): Unit = js.native
  
  def question(query: String, callback: js.Function): Unit = js.native
  
  def resume(): Unit = js.native
  
  def setPrompt(prompt: String, length: Double): Unit = js.native
  
  def write(data: js.Any): Unit = js.native
  def write(data: js.Any, key: js.Any): Unit = js.native
}
