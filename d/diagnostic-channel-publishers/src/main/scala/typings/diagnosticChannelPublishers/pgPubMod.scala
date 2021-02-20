package typings.diagnosticChannelPublishers

import typings.diagnosticChannel.patchRequireMod.IModulePatcher
import typings.diagnosticChannelPublishers.anon.Plan
import typings.diagnosticChannelPublishers.anon.Port
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pgPubMod {
  
  @JSImport("diagnostic-channel-publishers/dist/src/pg.pub", "enable")
  @js.native
  def enable(): Unit = js.native
  
  @JSImport("diagnostic-channel-publishers/dist/src/pg.pub", "postgres6")
  @js.native
  val postgres6: IModulePatcher = js.native
  
  @JSImport("diagnostic-channel-publishers/dist/src/pg.pub", "postgres7")
  @js.native
  val postgres7: IModulePatcher = js.native
  
  @js.native
  trait IPostgresData extends StObject {
    
    var database: Port = js.native
    
    var duration: Double = js.native
    
    var error: js.UndefOr[Error] = js.native
    
    var query: Plan = js.native
    
    var result: js.UndefOr[IPostgresResult] = js.native
    
    var time: Date = js.native
  }
  object IPostgresData {
    
    @scala.inline
    def apply(database: Port, duration: Double, query: Plan, time: Date): IPostgresData = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPostgresData]
    }
    
    @scala.inline
    implicit class IPostgresDataMutableBuilder[Self <: IPostgresData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatabase(value: Port): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setQuery(value: Plan): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: IPostgresResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      @scala.inline
      def setTime(value: Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPostgresResult extends StObject {
    
    var command: String = js.native
    
    var rowCount: Double = js.native
  }
  object IPostgresResult {
    
    @scala.inline
    def apply(command: String, rowCount: Double): IPostgresResult = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPostgresResult]
    }
    
    @scala.inline
    implicit class IPostgresResultMutableBuilder[Self <: IPostgresResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    }
  }
}
