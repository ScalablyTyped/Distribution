package typings.diagnosticChannelPublishers

import typings.diagnosticChannel.patchRequireMod.IModulePatcher
import typings.diagnosticChannelPublishers.anon.Plan
import typings.diagnosticChannelPublishers.anon.Port
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tediousPubMod {
  
  @JSImport("diagnostic-channel-publishers/dist/src/tedious.pub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  
  @JSImport("diagnostic-channel-publishers/dist/src/tedious.pub", "tedious")
  @js.native
  val tedious: IModulePatcher = js.native
  
  trait ITediousData extends StObject {
    
    var database: Port
    
    var duration: Double
    
    var error: js.UndefOr[Error] = js.undefined
    
    var query: Plan
    
    var result: js.UndefOr[ITediousResult] = js.undefined
  }
  object ITediousData {
    
    @scala.inline
    def apply(database: Port, duration: Double, query: Plan): ITediousData = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITediousData]
    }
    
    @scala.inline
    implicit class ITediousDataMutableBuilder[Self <: ITediousData] (val x: Self) extends AnyVal {
      
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
      def setResult(value: ITediousResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
  
  trait ITediousResult extends StObject {
    
    var rowCount: Double
    
    var rows: js.Any
  }
  object ITediousResult {
    
    @scala.inline
    def apply(rowCount: Double, rows: js.Any): ITediousResult = {
      val __obj = js.Dynamic.literal(rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITediousResult]
    }
    
    @scala.inline
    implicit class ITediousResultMutableBuilder[Self <: ITediousResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRows(value: js.Any): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    }
  }
}
