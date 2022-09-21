package typings.googleapis.anon

import typings.execa.mod.ExecaChildProcess
import typings.execa.mod.ExecaSyncReturnValue
import typings.execa.mod.NodeOptions
import typings.execa.mod.Options
import typings.execa.mod.SyncOptions
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends StObject {
  
  def apply(file: String): ExecaChildProcess[String] = js.native
  def apply(file: String, arguments: js.Array[String]): ExecaChildProcess[String] = js.native
  def apply(file: String, arguments: js.Array[String], options: Options[Null | String]): ExecaChildProcess[String] = js.native
  def apply(file: String, arguments: scala.Unit, options: Options[Null | String]): ExecaChildProcess[String] = js.native
  def apply(file: String, options: Options[Null | String]): ExecaChildProcess[String] = js.native
  
  def command(command: String): ExecaChildProcess[String] = js.native
  def command(command: String, options: Options[Null | String]): ExecaChildProcess[String] = js.native
  
  def commandSync(command: String): ExecaSyncReturnValue[String] = js.native
  def commandSync(command: String, options: SyncOptions[Null | String]): ExecaSyncReturnValue[String] = js.native
  
  def node(scriptPath: String): ExecaChildProcess[String] = js.native
  def node(scriptPath: String, arguments: js.Array[String]): ExecaChildProcess[String] = js.native
  def node(scriptPath: String, arguments: js.Array[String], options: NodeOptions[String]): ExecaChildProcess[String] = js.native
  def node(scriptPath: String, arguments: js.Array[String], options: Options[Null]): ExecaChildProcess[Buffer] = js.native
  def node(scriptPath: String, arguments: scala.Unit, options: NodeOptions[String]): ExecaChildProcess[String] = js.native
  def node(scriptPath: String, arguments: scala.Unit, options: Options[Null]): ExecaChildProcess[Buffer] = js.native
  def node(scriptPath: String, options: Options[Null | String]): ExecaChildProcess[String] = js.native
  
  def sync(file: String): ExecaSyncReturnValue[String] = js.native
  def sync(file: String, arguments: js.Array[String]): ExecaSyncReturnValue[String] = js.native
  def sync(file: String, arguments: js.Array[String], options: SyncOptions[Null | String]): ExecaSyncReturnValue[String] = js.native
  def sync(file: String, arguments: scala.Unit, options: SyncOptions[Null | String]): ExecaSyncReturnValue[String] = js.native
  def sync(file: String, options: SyncOptions[Null | String]): ExecaSyncReturnValue[String] = js.native
}
