package typings.diagnosticChannelPublishers

import typings.diagnosticChannel.patchRequireMod.IModulePatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diagnostic-channel-publishers", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def enable(): Unit = js.native
  @js.native
  object bunyan extends js.Object {
    val bunyan: IModulePatcher = js.native
    def enable(): Unit = js.native
  }
  
  @js.native
  object console extends js.Object {
    val console: IModulePatcher = js.native
    def enable(): Unit = js.native
  }
  
  @js.native
  object mongodb extends js.Object {
    val mongo2: IModulePatcher = js.native
    val mongo3: IModulePatcher = js.native
    val mongo330: IModulePatcher = js.native
    def enable(): Unit = js.native
  }
  
  @js.native
  object mongodbCore extends js.Object {
    val mongoCore: IModulePatcher = js.native
    def enable(): Unit = js.native
  }
  
  @js.native
  object mysql extends js.Object {
    val mysql: IModulePatcher = js.native
    def enable(): Unit = js.native
  }
  
  @js.native
  object pg extends js.Object {
    val postgres6: IModulePatcher = js.native
    val postgres7: IModulePatcher = js.native
    def enable(): Unit = js.native
  }
  
  @js.native
  object pgPool extends js.Object {
    val postgresPool1: IModulePatcher = js.native
    def enable(): Unit = js.native
  }
  
  @js.native
  object redis extends js.Object {
    val redis: IModulePatcher = js.native
    def enable(): Unit = js.native
  }
  
  @js.native
  object winston extends js.Object {
    val winston2: IModulePatcher = js.native
    val winston3: IModulePatcher = js.native
    def enable(): Unit = js.native
  }
  
}

