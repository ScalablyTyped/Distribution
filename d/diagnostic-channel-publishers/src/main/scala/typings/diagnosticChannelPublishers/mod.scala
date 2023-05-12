package typings.diagnosticChannelPublishers

import typings.diagnosticChannel.distSrcPatchRequireMod.IModulePatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("diagnostic-channel-publishers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object azuresdk {
    
    @JSImport("diagnostic-channel-publishers", "azuresdk")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("diagnostic-channel-publishers", "azuresdk.AzureMonitorSymbol")
    @js.native
    val AzureMonitorSymbol: /* "Azure_Monitor_Tracer" */ String = js.native
    
    @JSImport("diagnostic-channel-publishers", "azuresdk.azureCoreTracing")
    @js.native
    val azureCoreTracing: IModulePatcher = js.native
    
    inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  }
  
  object bunyan {
    
    @JSImport("diagnostic-channel-publishers", "bunyan")
    @js.native
    val ^ : js.Any = js.native
    @JSImport("diagnostic-channel-publishers", "bunyan.bunyan")
    @js.native
    val bunyan: IModulePatcher = js.native
    
    inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  }
  
  object console {
    
    @JSImport("diagnostic-channel-publishers", "console")
    @js.native
    val ^ : js.Any = js.native
    @JSImport("diagnostic-channel-publishers", "console.console")
    @js.native
    val console: IModulePatcher = js.native
    
    inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  }
  
  inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  
  object mongodb {
    
    @JSImport("diagnostic-channel-publishers", "mongodb")
    @js.native
    val ^ : js.Any = js.native
    
    inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
    
    @JSImport("diagnostic-channel-publishers", "mongodb.mongo2")
    @js.native
    val mongo2: IModulePatcher = js.native
    
    @JSImport("diagnostic-channel-publishers", "mongodb.mongo3")
    @js.native
    val mongo3: IModulePatcher = js.native
    
    @JSImport("diagnostic-channel-publishers", "mongodb.mongo330")
    @js.native
    val mongo330: IModulePatcher = js.native
  }
  
  object mongodbCore {
    
    @JSImport("diagnostic-channel-publishers", "mongodbCore")
    @js.native
    val ^ : js.Any = js.native
    
    inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
    
    @JSImport("diagnostic-channel-publishers", "mongodbCore.mongoCore")
    @js.native
    val mongoCore: IModulePatcher = js.native
  }
  
  object mysql {
    
    @JSImport("diagnostic-channel-publishers", "mysql")
    @js.native
    val ^ : js.Any = js.native
    
    inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
    
    @JSImport("diagnostic-channel-publishers", "mysql.mysql")
    @js.native
    val mysql: IModulePatcher = js.native
  }
  
  object pg {
    
    @JSImport("diagnostic-channel-publishers", "pg")
    @js.native
    val ^ : js.Any = js.native
    
    inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
    
    @JSImport("diagnostic-channel-publishers", "pg.postgres")
    @js.native
    val postgres: IModulePatcher = js.native
    
    @JSImport("diagnostic-channel-publishers", "pg.postgres6")
    @js.native
    val postgres6: IModulePatcher = js.native
  }
  
  object pgPool {
    
    @JSImport("diagnostic-channel-publishers", "pgPool")
    @js.native
    val ^ : js.Any = js.native
    
    inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
    
    @JSImport("diagnostic-channel-publishers", "pgPool.postgresPool1")
    @js.native
    val postgresPool1: IModulePatcher = js.native
  }
  
  object redis {
    
    @JSImport("diagnostic-channel-publishers", "redis")
    @js.native
    val ^ : js.Any = js.native
    
    inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
    
    @JSImport("diagnostic-channel-publishers", "redis.redis")
    @js.native
    val redis: IModulePatcher = js.native
  }
  
  object tedious {
    
    @JSImport("diagnostic-channel-publishers", "tedious")
    @js.native
    val ^ : js.Any = js.native
    
    inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
    
    @JSImport("diagnostic-channel-publishers", "tedious.tedious")
    @js.native
    val tedious: IModulePatcher = js.native
  }
  
  object winston {
    
    @JSImport("diagnostic-channel-publishers", "winston")
    @js.native
    val ^ : js.Any = js.native
    
    inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
    
    @JSImport("diagnostic-channel-publishers", "winston.winston2")
    @js.native
    val winston2: IModulePatcher = js.native
    
    @JSImport("diagnostic-channel-publishers", "winston.winston3")
    @js.native
    val winston3: IModulePatcher = js.native
  }
}
