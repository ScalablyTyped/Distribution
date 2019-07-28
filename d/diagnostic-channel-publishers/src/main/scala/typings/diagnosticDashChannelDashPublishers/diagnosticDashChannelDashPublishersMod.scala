package typings.diagnosticDashChannelDashPublishers

import typings.diagnosticDashChannel.distSrcPatchRequireMod.IModulePatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diagnostic-channel-publishers", JSImport.Namespace)
@js.native
object diagnosticDashChannelDashPublishersMod extends js.Object {
  def enable(): Unit = js.native
  @JSName("bunyan")
  @js.native
  object bunyanNs extends js.Object {
    val bunyan: IModulePatcher = js.native
    def enable(): Unit = js.native
  }
  
  @JSName("console")
  @js.native
  object consoleNs extends js.Object {
    val console: IModulePatcher = js.native
    def enable(): Unit = js.native
  }
  
  @JSName("mongodbCore")
  @js.native
  object mongodbCoreNs extends js.Object {
    val mongoCore: IModulePatcher = js.native
    def enable(): Unit = js.native
  }
  
  @JSName("mongodb")
  @js.native
  object mongodbNs extends js.Object {
    val mongo2: IModulePatcher = js.native
    val mongo3: IModulePatcher = js.native
    def enable(): Unit = js.native
  }
  
  @JSName("mysql")
  @js.native
  object mysqlNs extends js.Object {
    val mysql: IModulePatcher = js.native
    def enable(): Unit = js.native
  }
  
  @JSName("pg")
  @js.native
  object pgNs extends js.Object {
    val postgres6: IModulePatcher = js.native
    val postgres7: IModulePatcher = js.native
    def enable(): Unit = js.native
  }
  
  @JSName("pgPool")
  @js.native
  object pgPoolNs extends js.Object {
    val postgresPool1: IModulePatcher = js.native
    def enable(): Unit = js.native
  }
  
  @JSName("redis")
  @js.native
  object redisNs extends js.Object {
    val redis: IModulePatcher = js.native
    def enable(): Unit = js.native
  }
  
  @JSName("winston")
  @js.native
  object winstonNs extends js.Object {
    val winston2: IModulePatcher = js.native
    val winston3: IModulePatcher = js.native
    def enable(): Unit = js.native
  }
  
}

