package typings.diagnosticChannelPublishers

import typings.diagnosticChannel.distSrcPatchRequireMod.IModulePatcher
import typings.diagnosticChannelPublishers.anon.Plan
import typings.diagnosticChannelPublishers.anon.Port
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPgDotpubMod {
  
  @JSImport("diagnostic-channel-publishers/dist/src/pg.pub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  
  @JSImport("diagnostic-channel-publishers/dist/src/pg.pub", "postgres6")
  @js.native
  val postgres6: IModulePatcher = js.native
  
  @JSImport("diagnostic-channel-publishers/dist/src/pg.pub", "postgres7")
  @js.native
  val postgres7: IModulePatcher = js.native
  
  trait IPostgresData extends StObject {
    
    var database: Port
    
    var duration: Double
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var query: Plan
    
    var result: js.UndefOr[IPostgresResult] = js.undefined
    
    var time: js.Date
  }
  object IPostgresData {
    
    inline def apply(database: Port, duration: Double, query: Plan, time: js.Date): IPostgresData = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPostgresData]
    }
    
    extension [Self <: IPostgresData](x: Self) {
      
      inline def setDatabase(value: Port): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setQuery(value: Plan): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setResult(value: IPostgresResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setTime(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPostgresResult extends StObject {
    
    var command: String
    
    var rowCount: Double
  }
  object IPostgresResult {
    
    inline def apply(command: String, rowCount: Double): IPostgresResult = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPostgresResult]
    }
    
    extension [Self <: IPostgresResult](x: Self) {
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    }
  }
}
